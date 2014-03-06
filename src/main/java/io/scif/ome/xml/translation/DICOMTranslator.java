/*
 * #%L
 * SCIFIO support for the OME data model (OME-XML and OME-TIFF).
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
 * #L%
 */

package io.scif.ome.xml.translation;

import io.scif.Metadata;
import io.scif.common.DateTools;
import io.scif.formats.DICOMFormat;
import io.scif.ome.OMEMetadata;
import loci.formats.ome.OMEXMLMetadata;
import ome.xml.model.primitives.PositiveFloat;
import ome.xml.model.primitives.Timestamp;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

/**
 * Container class for translators between OME and DICOM formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class DICOMTranslator {

	/**
	 * Translator class from {@link io.scif.formats.DICOMFormat.Metadata} to
	 * {@link OMEMetadata}
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = ToOMETranslator.class, priority = Priority.HIGH_PRIORITY)
	public static class DICOMOMETranslator extends
		ToOMETranslator<DICOMFormat.Metadata>
	{

		// -- Translator API Methods --

		@Override
		public Class<? extends Metadata> source() {
			return DICOMFormat.Metadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMEMetadata.class;
		}

		@Override
		protected void translateOMEXML(final DICOMFormat.Metadata source,
			final OMEMetadata dest)
		{
			// The metadata store we're working with.

			String stamp = null;

			final OMEXMLMetadata store = dest.getRoot();

			final String date = source.getDate();
			final String time = source.getTime();
			final String imageType = source.getImageType();
			final String pixelSizeX = source.getPixelSizeX();
			final String pixelSizeY = source.getPixelSizeY();
			final Double pixelSizeZ = source.getPixelSizeZ();

			if (date != null && time != null) {
				stamp = date + " " + time;
				stamp = DateTools.formatDate(stamp, "yyyy.MM.dd HH:mm:ss.SSSSSS");
			}

			if (stamp == null || stamp.trim().equals("")) stamp = null;

			for (int i = 0; i < source.getImageCount(); i++) {
				if (stamp != null) store.setImageAcquisitionDate(new Timestamp(stamp),
					i);
				store.setImageName("Series " + i, i);
			}

			for (int i = 0; i < source.getImageCount(); i++) {
				store.setImageDescription(imageType, i);

				if (pixelSizeX != null) {
					final Double sizeX = new Double(pixelSizeX);
					if (sizeX > 0) {
						store.setPixelsPhysicalSizeX(new PositiveFloat(sizeX), i);
					}
					else {
						log().warn(
							"Expected positive value for PhysicalSizeX; got " + sizeX);
					}
				}
				if (pixelSizeY != null) {
					final Double sizeY = new Double(pixelSizeY);
					if (sizeY > 0) {
						store.setPixelsPhysicalSizeY(new PositiveFloat(sizeY), i);
					}
					else {
						log().warn(
							"Expected positive value for PhysicalSizeY; got " + sizeY);
					}
				}
				if (pixelSizeZ != null && pixelSizeZ > 0) {
					store.setPixelsPhysicalSizeZ(new PositiveFloat(pixelSizeZ), i);
				}
				else {
					log().warn(
						"Expected positive value for PhysicalSizeZ; got " + pixelSizeZ);
				}
			}
		}
	}
}
