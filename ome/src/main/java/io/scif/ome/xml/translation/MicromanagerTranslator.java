/*
 * #%L
 * SCIFIO OME-XML Formats.
 * %%
 * Copyright (C) 2013 - 2014 Open Microscopy Environment:
 *   - Massachusetts Institute of Technology
 *   - National Institutes of Health
 *   - University of Dundee
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are
 * those of the authors and should not be interpreted as representing official
 * policies, either expressed or implied, of any organization.
 * #L%
 */

package io.scif.ome.xml.translation;

import io.scif.FormatException;
import io.scif.MetadataLevel;
import io.scif.common.DateTools;
import io.scif.formats.MicromanagerFormat;
import io.scif.formats.MicromanagerFormat.Metadata;
import io.scif.formats.MicromanagerFormat.Position;
import io.scif.io.Location;
import io.scif.ome.xml.meta.OMEMetadata;
import io.scif.ome.xml.meta.OMEXMLMetadata;
import io.scif.ome.xml.services.OMEXMLMetadataService;

import java.util.Vector;

import ome.xml.model.primitives.PositiveFloat;
import ome.xml.model.primitives.Timestamp;

import org.scijava.Priority;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

/**
 * Container class for translators between OME and Micromanager formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class MicromanagerTranslator {

	/**
	 * Translator class from {@link OMEMetadata} to
	 * {@link io.scif.formats.MicromanagerFormat.Metadata}.
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = FromOMETranslator.class, priority = Priority.HIGH_PRIORITY)
	public static class MicromanagerOMETranslator extends
		ToOMETranslator<MicromanagerFormat.Metadata>
	{

		// -- Fields --

		@Parameter
		private OMEXMLMetadataService omexmlMetadataService;

		// -- Translator API --

		@Override
		public Class<? extends io.scif.Metadata> source() {
			return MicromanagerFormat.Metadata.class;
		}

		@Override
		public Class<? extends io.scif.Metadata> dest() {
			return OMEMetadata.class;
		}

		@Override
		protected void typedTranslate(final MicromanagerFormat.Metadata source,
			final OMEMetadata dest)
		{
			super.typedTranslate(source, dest);

			try {
				populateMetadata(source, dest.getRoot());
			}
			catch (final FormatException e) {
				log().error(
					"Error populating Metadata store with Micromanager metadata", e);
			}
		}

		private void populateMetadata(final Metadata meta,
			final OMEXMLMetadata store) throws FormatException
		{
			final String instrumentID = omexmlMetadataService.createLSID("Instrument", 0);
			store.setInstrumentID(instrumentID, 0);
			final Vector<Position> positions = meta.getPositions();

			for (int i = 0; i < positions.size(); i++) {
				final Position p = positions.get(i);
				if (p.time != null) {
					final String date =
						DateTools.formatDate(p.time, MicromanagerFormat.Parser.DATE_FORMAT);
					if (date != null) {
						store.setImageAcquisitionDate(new Timestamp(date), i);
					}
				}

				if (positions.size() > 1) {
					final Location parent =
						new Location(getContext(), p.metadataFile).getParentFile();
					store.setImageName(parent.getName(), i);
				}

				if (meta.getMetadataOptions().getMetadataLevel() != MetadataLevel.MINIMUM)
				{
					store.setImageDescription(p.comment, i);

					// link Instrument and Image
					store.setImageInstrumentRef(instrumentID, i);

					for (int c = 0; c < p.channels.length; c++) {
						store.setChannelName(p.channels[c], i, c);
					}

					if (p.pixelSize != null && p.pixelSize > 0) {
						store.setPixelsPhysicalSizeX(new PositiveFloat(p.pixelSize), i);
						store.setPixelsPhysicalSizeY(new PositiveFloat(p.pixelSize), i);
					}
					else {
						log().warn(
							"Expected positive value for PhysicalSizeX; got " + p.pixelSize);
					}
					if (p.sliceThickness != null && p.sliceThickness > 0) {
						store
							.setPixelsPhysicalSizeZ(new PositiveFloat(p.sliceThickness), i);
					}
					else {
						log().warn(
							"Expected positive value for PhysicalSizeZ; got " +
								p.sliceThickness);
					}

					int nextStamp = 0;
					for (int q = 0; q < meta.get(i).getPlaneCount(); q++) {
						store.setPlaneExposureTime(p.exposureTime, i, q);
						final String tiff = positions.get(i).getFile(meta, i, q);
						if (tiff != null && new Location(getContext(), tiff).exists() &&
							nextStamp < p.timestamps.length)
						{
							store.setPlaneDeltaT(p.timestamps[nextStamp++], i, q);
						}
					}

					final String serialNumber = p.detectorID;
					p.detectorID = omexmlMetadataService.createLSID("Detector", 0, i);

					for (int c = 0; c < p.channels.length; c++) {
						store.setDetectorSettingsBinning(omexmlMetadataService
							.getBinning(p.binning), i, c);
						store.setDetectorSettingsGain(new Double(p.gain), i, c);
						if (c < p.voltage.size()) {
							store.setDetectorSettingsVoltage(p.voltage.get(c), i, c);
						}
						store.setDetectorSettingsID(p.detectorID, i, c);
					}

					store.setDetectorID(p.detectorID, 0, i);
					if (p.detectorModel != null) {
						store.setDetectorModel(p.detectorModel, 0, i);
					}

					if (serialNumber != null) {
						store.setDetectorSerialNumber(serialNumber, 0, i);
					}

					if (p.detectorManufacturer != null) {
						store.setDetectorManufacturer(p.detectorManufacturer, 0, i);
					}

					if (p.cameraMode == null) p.cameraMode = "Other";
					store.setDetectorType(omexmlMetadataService.getDetectorType(p.cameraMode), 0, i);
					store.setImagingEnvironmentTemperature(p.temperature, i);
				}
			}
		}

	}
}
