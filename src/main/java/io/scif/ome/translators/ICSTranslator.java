/*
 * #%L
 * SCIFIO support for the OME data model, including OME-XML and OME-TIFF.
 * %%
 * Copyright (C) 2013 - 2022 SCIFIO developers.
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

package io.scif.ome.translators;

import io.scif.FormatException;
import io.scif.Metadata;
import io.scif.formats.ICSFormat;
import io.scif.ome.OMEMetadata;
import io.scif.ome.services.OMEMetadataService;
import io.scif.util.FormatTools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.imagej.axis.Axes;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

import loci.formats.meta.FilterMetadata;
import loci.formats.meta.MetadataRetrieve;
import loci.formats.ome.OMEXMLMetadata;
import ome.units.UNITS;
import ome.units.quantity.Frequency;
import ome.units.quantity.Length;
import ome.units.quantity.Power;
import ome.units.quantity.Time;
import ome.xml.model.primitives.Timestamp;

/**
 * Container class for to and from ICS/OME formats
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class ICSTranslator {

	/**
	 * Translator class from {@link io.scif.formats.ICSFormat.Metadata} to
	 * {@link OMEMetadata}.
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = FromOMETranslator.class, priority = Priority.HIGH)
	public static class OMEICSTranslator extends
		FromOMETranslator<ICSFormat.Metadata>
	{

		@Override
		public Class<? extends Metadata> source() {
			return OMEMetadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return ICSFormat.Metadata.class;
		}

		@Override
		protected void translateFormatMetadata(final OMEMetadata source,
			final ICSFormat.Metadata dest)
		{
			final MetadataRetrieve retrieve = source.getRoot();

			final Timestamp ts = retrieve.getImageAcquisitionDate(0);

			if (ts != null) dest.putDate(ts.getValue());

			dest.putDescription(retrieve.getImageDescription(0));

			if (retrieve.getInstrumentCount() > 0) {
				dest.putMicroscopeModel(retrieve.getMicroscopeModel(0));
				dest.putMicroscopeManufacturer(retrieve.getMicroscopeManufacturer(0));
				final Map<Integer, Integer> laserWaves = new HashMap<>();

				for (int i = 0; i < retrieve.getLightSourceCount(0); i++) {
					laserWaves.put(i, //
						retrieve.getLaserWavelength(0, i).value().intValue());
				}

				dest.putWavelengths(laserWaves);
				dest.putLaserManufacturer(retrieve.getLaserManufacturer(0, 0));
				dest.putLaserModel(retrieve.getLaserModel(0, 0));
				dest.putLaserPower(retrieve.getLaserPower(0, 0).value().doubleValue());
				dest.putLaserRepetitionRate(//
					retrieve.getLaserRepetitionRate(0, 0).value().doubleValue());

				dest.putFilterSetModel(retrieve.getFilterSetModel(0, 0));
				dest.putDichroicModel(retrieve.getDichroicModel(0, 0));
				dest.putExcitationModel(retrieve.getFilterModel(0, 0));
				dest.putEmissionModel(retrieve.getFilterModel(0, 1));

				dest.putObjectiveModel(retrieve.getObjectiveModel(0, 0));
				dest.putImmersion(retrieve.getObjectiveImmersion(0, 0).getValue());
				dest.putLensNA(retrieve.getObjectiveLensNA(0, 0));
				dest.putWorkingDistance(//
					retrieve.getObjectiveWorkingDistance(0, 0).value().doubleValue());
				dest.putMagnification(//
					retrieve.getObjectiveCalibratedMagnification(0, 0));

				dest.putDetectorManufacturer(retrieve.getDetectorManufacturer(0, 0));
				dest.putDetectorModel(retrieve.getDetectorModel(0, 0));
			}

			if (retrieve.getExperimentCount() > 0) {
				dest.putExperimentType(retrieve.getExperimentType(0).getValue());
				dest.putAuthorLastName(retrieve.getExperimenterLastName(0));
			}

			final Double[] pixelSizes = new Double[5];
			final String[] units = new String[5];

			final String order = retrieve.getPixelsDimensionOrder(0).getValue();
			final Length sizex = retrieve.getPixelsPhysicalSizeX(0);
			final Length sizey = retrieve.getPixelsPhysicalSizeY(0);
			final Length sizez = retrieve.getPixelsPhysicalSizeZ(0);
			final Time sizet = retrieve.getPixelsTimeIncrement(0);

			for (int i = 0; i < order.length(); i++) {
				switch (order.toUpperCase().charAt(i)) {
					case 'X':
						pixelSizes[i] = sizex == null ? 1.0 : sizex.value().doubleValue();
						units[i] = "um";
						break;
					case 'Y':
						pixelSizes[i] = sizey == null ? 1.0 : sizey.value().doubleValue();
						units[i] = "um";
						break;
					case 'Z':
						pixelSizes[i] = sizez == null ? 1.0 : sizez.value().doubleValue();
						units[i] = "um";
						break;
					case 'T':
						pixelSizes[i] = sizet == null ? 1.0 : sizet.value().doubleValue();
						units[i] = "s";
						break;
					case 'C':
						pixelSizes[i] = 1.0;
						units[i] = "um";
						break;
					default:
						pixelSizes[i] = 1.0;
						units[i] = "um";
				}
			}

			dest.putPixelSizes(pixelSizes);
			dest.putUnits(units);

			if (retrieve.getPlaneCount(0) > 0) {
				final Double[] timestamps = //
					new Double[(int) source.get(0).getAxisLength(Axes.TIME)];

				for (int t = 0; t < timestamps.length; t++) {
					timestamps[t] = retrieve.getPlaneDeltaT(0, t).value().doubleValue();
				}

				dest.putTimestamps(timestamps);
				dest.putExposureTime(//
					retrieve.getPlaneExposureTime(0, 0).value().doubleValue());
			}

			final Map<Integer, String> channelNames = new HashMap<>();
			final Map<Integer, Double> pinholes = new HashMap<>();
			final Map<Integer, Double> gains = new HashMap<>();
			final List<Integer> emWaves = new ArrayList<>();
			final List<Integer> exWaves = new ArrayList<>();
			final long planeCount = source.get(0).getPlaneCount();
			final long tLen = source.get(0).getAxisLength(Axes.TIME);
			final long zLen = source.get(0).getAxisLength(Axes.Z);
			final long effSizeC = planeCount / (tLen * zLen);
			for (int i = 0; i < effSizeC; i++) {
				final String cName = retrieve.getChannelName(0, i);
				if (cName != null) channelNames.put(i, cName);

				final Length pinSize = retrieve.getChannelPinholeSize(0, i);
				if (pinSize != null) pinholes.put(i, pinSize.value().doubleValue());

				final Length emWave = retrieve.getChannelEmissionWavelength(0, i);
				if (emWave != null) emWaves.add(emWave.value().intValue());

				final Length exWave = retrieve.getChannelExcitationWavelength(0, i);
				if (exWave != null) exWaves.add(exWave.value().intValue());

				if (retrieve.getInstrumentCount() > 0 && //
					retrieve.getDetectorCount(0) > 0)
				{
					final Double chGain = retrieve.getDetectorSettingsGain(0, i);
					if (chGain != null) gains.put(i, chGain);
				}
			}

			dest.putChannelNames(channelNames);
			dest.putPinholes(pinholes);
			dest.putEXWaves(exWaves.toArray(new Integer[exWaves.size()]));
			dest.putEMWaves(emWaves.toArray(new Integer[emWaves.size()]));
			dest.putGains(gains);
		}
	}

	/**
	 * Translator class from {@link io.scif.formats.ICSFormat.Metadata} to
	 * {@link OMEMetadata}.
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = ToOMETranslator.class, priority = Priority.HIGH)
	public static class ICSOMETranslator extends
		ToOMETranslator<ICSFormat.Metadata>
	{

		// -- Translator API --

		@Override
		public Class<? extends Metadata> source() {
			return ICSFormat.Metadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMEMetadata.class;
		}

		@Override
		protected void translateFormatMetadata(final ICSFormat.Metadata source,
			final OMEMetadata dest)
		{
			final OMEXMLMetadata store = dest.getRoot();
			final int imageIndex = 0; // TODO correct index?
			Double[] pixelSizes = null, timestamps = null, stagePos = null;
			Double laserPower = null, laserRepetitionRate = null, lensNA = null;
			Double workingDistance = null, magnification = null, exposureTime = null;
			Integer[] emWaves = null, exWaves = null;
			double[] sizes = null;
			String[] units = null, axes = null;
			final String imageName = source.getSourceLocation().getName();
			String date = null, description = null, microscopeModel = null,
					microscopeManufacturer = null, experimentType = null,
					laserManufacturer = null, laserModel = null, filterSetModel = null,
					dichroicModel = null, excitationModel = null, emissionModel = null,
					objectiveModel = null, immersion = null, detectorManufacturer = null,
					detectorModel = null, lastName = null;

			Map<Integer, Double> gains = new HashMap<>();
			Map<Integer, String> channelNames = new HashMap<>();
			Map<Integer, Double> pinholes = new HashMap<>();
			Map<Integer, Integer> wavelengths = new HashMap<>();

			final FilterMetadata filter = //
				new FilterMetadata(store, source.isFiltered());
			filter.createRoot();

			// FIXME: no more datasetmetadata

			final OMEMetadataService omeMetaService = //
				getContext().service(OMEMetadataService.class);

			omeMetaService.populatePixels(filter, source, true);

			store.setImageName(imageName, 0);

			// populate date data

			date = source.getDate();

			if (date != null) store.setImageAcquisitionDate(new Timestamp(date), 0);

			description = source.getDescription();
			store.setImageDescription(description, 0);

			// link Instrument and Image
			final String instrumentID = omeMetaService.createLSID("Instrument", 0);
			store.setInstrumentID(instrumentID, 0);

			microscopeModel = source.getMicroscopeModel();
			store.setMicroscopeModel(microscopeModel, 0);

			microscopeManufacturer = source.getMicroscopeManufacturer();
			store.setMicroscopeManufacturer(microscopeManufacturer, 0);

			store.setImageInstrumentRef(instrumentID, 0);

			store.setExperimentID(omeMetaService.createLSID("Experiment", 0), 0);

			experimentType = source.getExperimentType();

			try {
				store.setExperimentType(//
					omeMetaService.getExperimentType(experimentType), 0);
			}
			catch (final FormatException e) {
				log().debug("Could not set experiment type", e);
			}

			// populate Dimensions data

			pixelSizes = source.getPixelSizes();

			units = source.getUnits();

			axes = source.getAxes();

			sizes = source.getAxesSizes();

			if (pixelSizes != null) {
				if (units != null && units.length == pixelSizes.length - 1) {
					// correct for missing units
					// sometimes, the units for the C axis are missing entirely
					final ArrayList<String> realUnits = new ArrayList<>();
					int unitIndex = 0;
					for (int i = 0; i < axes.length; i++) {
						if (axes[i].equalsIgnoreCase("ch")) {
							realUnits.add("nm");
						}
						else {
							realUnits.add(units[unitIndex++]);
						}
					}
					units = realUnits.toArray(new String[realUnits.size()]);
				}

				for (int i = 0; i < pixelSizes.length; i++) {
					final Double pixelSize = pixelSizes[i];

					if (pixelSize == null) continue;

					final String axis = axes != null && axes.length > i ? axes[i] : "";
					final String unit = units != null && units.length > i ? units[i] : "";
					if (axis.equals("x")) {
						if (pixelSize > 0 && checkUnit(unit, "um", "microns",
							"micrometers"))
						{
							store.setPixelsPhysicalSizeX(//
								new Length(pixelSize, UNITS.MICROMETER), 0);
						}
						else {
							log().warn("Expected positive value for PhysicalSizeX; got " +
								pixelSize);
						}
					}
					else if (axis.equals("y")) {
						if (pixelSize > 0 && checkUnit(unit, "um", "microns",
							"micrometers"))
						{
							store.setPixelsPhysicalSizeY(//
								new Length(pixelSize, UNITS.MICROMETER), 0);
						}
						else {
							log().warn("Expected positive value for PhysicalSizeY; got " +
								pixelSize);
						}
					}
					else if (axis.equals("z")) {
						if (pixelSize > 0 && checkUnit(unit, "um", "microns",
							"micrometers"))
						{
							store.setPixelsPhysicalSizeZ(//
								new Length(pixelSize, UNITS.MICROMETER), 0);
						}
						else {
							log().warn("Expected positive value for PhysicalSizeZ; got " +
								pixelSize);
						}
					}
					else if (axis.equals("t")) {
						// FIXME: Use the OME units API here, instead of hardcoding.
						if (checkUnit(unit, "ms")) {
							store.setPixelsTimeIncrement(//
								new Time(1000 * pixelSize, UNITS.SECOND), 0);
						}
						else if (checkUnit(unit, "seconds") || checkUnit(unit, "s")) {
							store.setPixelsTimeIncrement(//
								new Time(pixelSize, UNITS.SECOND), 0);
						}
					}
				}
			}
			else if (sizes != null) {
				if (sizes.length > 0 && sizes[0] > 0) {
					store.setPixelsPhysicalSizeX(//
						new Length(sizes[0], UNITS.MICROMETER), 0);
				}
				else {
					log().warn("Expected positive value for PhysicalSizeX; got " +
						sizes[0]);
				}
				if (sizes.length > 1) {
					sizes[1] /= source.get(imageIndex).getAxisLength(Axes.Y);
					if (sizes[1] > 0) {
						store.setPixelsPhysicalSizeY(//
							new Length(sizes[1], UNITS.MICROMETER), 0);
					}
					else {
						log().warn("Expected positive value for PhysicalSizeY; got " +
							sizes[1]);
					}
				}
			}

			// populate Plane data

			timestamps = source.getTimestamps();

			if (timestamps != null) {
				for (int t = 0; t < timestamps.length; t++) {
					if (t >= source.get(imageIndex).getAxisLength(Axes.TIME)) break; // ignore
					// superfluous
					// timestamps
					if (timestamps[t] == null) continue; // ignore missing timestamp
					final double deltaT = timestamps[t];
					if (Double.isNaN(deltaT)) continue; // ignore invalid timestamp
					final long planeCount = source.get(imageIndex).getPlaneCount();
					final long tLen = source.get(imageIndex).getAxisLength(Axes.TIME);
					final long zLen = source.get(imageIndex).getAxisLength(Axes.Z);
					final long effSizeC = planeCount / (tLen * zLen);
					// assign timestamp to all relevant planes
					final String dimOrder = //
						omeMetaService.findDimensionOrder(source, imageIndex);
					for (int z = 0; z < zLen; z++) {
						for (int c = 0; c < effSizeC; c++) {
							final long[] lengths = omeMetaService.zctToArray(dimOrder,
								(int) zLen, (int) effSizeC, (int) tLen);
							final int index = (int) FormatTools.positionToRaster(//
								lengths, omeMetaService.zctToArray(dimOrder, z, c, t));

							store.setPlaneDeltaT(new Time(deltaT, UNITS.SECOND), 0, index);
						}
					}
				}
			}

			// populate LogicalChannel data

			channelNames = source.getChannelNames();
			source.addStepChannel(channelNames);
			source.addCubeChannel(channelNames);

			pinholes = source.getPinholes();

			emWaves = source.getEMWaves();

			if (emWaves == null) {
				emWaves = source.getEMSingleton();
			}

			exWaves = source.getEXWaves();

			if (exWaves == null) {
				exWaves = source.getEXSingleton();
			}
			final long planeCount = source.get(imageIndex).getPlaneCount();
			final long tLen = source.get(imageIndex).getAxisLength(Axes.TIME);
			final long zLen = source.get(imageIndex).getAxisLength(Axes.Z);
			final long effSizeC = planeCount / (tLen * zLen);
			for (int i = 0; i < effSizeC; i++) {
				if (channelNames.containsKey(i)) {
					store.setChannelName(channelNames.get(i), 0, i);
				}
				if (pinholes.containsKey(i)) {
					store.setChannelPinholeSize(//
						new Length(pinholes.get(i), UNITS.MICROMETER), 0, i);
				}
				if (emWaves != null && i < emWaves.length) {
					if (emWaves[i].intValue() > 0) {
						store.setChannelEmissionWavelength(//
							new Length(emWaves[i], UNITS.MICROMETER), 0, i);
					}
					else {
						log().warn("Expected positive value for EmissionWavelength; got " +
							emWaves[i]);
					}
				}
				if (exWaves != null && i < exWaves.length) {
					if (exWaves[i].intValue() > 0) {
						store.setChannelExcitationWavelength(//
							new Length(exWaves[i], UNITS.MICROMETER), 0, i);
					}
					else {
						log().warn(
							"Expected positive value for ExcitationWavelength; got " +
								exWaves[i]);
					}
				}
			}

			// populate Laser data

			wavelengths = source.getWavelengths();
			source.addLaserWavelength(wavelengths);

			laserManufacturer = source.getLaserManufacturer();

			laserModel = source.getLaserModel();

			laserPower = source.getLaserPower();

			laserRepetitionRate = source.getLaserRepetitionRate();

			final Integer[] lasers = wavelengths.keySet().toArray(new Integer[0]);
			Arrays.sort(lasers);
			for (int i = 0; i < lasers.length; i++) {
				store.setLaserID(omeMetaService.createLSID("LightSource", 0, i), 0, i);
				if (wavelengths.get(lasers[i]) > 0) {
					store.setLaserWavelength(//
						new Length(wavelengths.get(lasers[i]), UNITS.MICROMETER), 0, i);
				}
				else {
					log().warn("Expected positive value for wavelength; got " +
						wavelengths.get(lasers[i]));
				}

				try {
					store.setLaserType(omeMetaService.getLaserType("Other"), 0, i);
				}
				catch (final FormatException e) {
					log().warn("Failed to set laser type", e);
				}

				try {
					store.setLaserLaserMedium(//
						omeMetaService.getLaserMedium("Other"), 0, i);
				}
				catch (final FormatException e) {
					log().warn("Failed to set laser medium", e);
				}

				store.setLaserManufacturer(laserManufacturer, 0, i);
				store.setLaserModel(laserModel, 0, i);
				store.setLaserPower(//
					new Power(laserPower, UNITS.MICROWATT), 0, i);
				store.setLaserRepetitionRate(//
					new Frequency(laserRepetitionRate, UNITS.MEGAHERTZ), 0, i);
			}

			if (lasers.length == 0 && laserManufacturer != null) {
				store.setLaserID(omeMetaService.createLSID("LightSource", 0, 0), 0, 0);

				try {
					store.setLaserType(omeMetaService.getLaserType("Other"), 0, 0);
				}
				catch (final FormatException e) {
					log().warn("Failed to set laser type", e);
				}
				try {
					store.setLaserLaserMedium(//
						omeMetaService.getLaserMedium("Other"), 0, 0);
				}
				catch (final FormatException e) {
					log().warn("Failed to set laser medium", e);
				}
				store.setLaserManufacturer(laserManufacturer, 0, 0);
				store.setLaserModel(laserModel, 0, 0);
				store.setLaserPower(new Power(laserPower, UNITS.WATT), 0, 0);
				store.setLaserRepetitionRate(//
					new Frequency(laserRepetitionRate, UNITS.MEGAHERTZ), 0, 0);
			}

			// populate FilterSet data

			filterSetModel = source.getFilterSetModel();

			dichroicModel = source.getDichroicModel();

			excitationModel = source.getExcitationModel();

			emissionModel = source.getEmissionModel();

			if (filterSetModel != null) {
				store.setFilterSetID(//
					omeMetaService.createLSID("FilterSet", 0, 0), 0, 0);
				store.setFilterSetModel(filterSetModel, 0, 0);

				final String dichroicID = omeMetaService.createLSID("Dichroic", 0, 0);
				final String emFilterID = omeMetaService.createLSID("Filter", 0, 0);
				final String exFilterID = omeMetaService.createLSID("Filter", 0, 1);

				store.setDichroicID(dichroicID, 0, 0);
				store.setDichroicModel(dichroicModel, 0, 0);
				store.setFilterSetDichroicRef(dichroicID, 0, 0);

				store.setFilterID(emFilterID, 0, 0);
				store.setFilterModel(emissionModel, 0, 0);
				store.setFilterSetEmissionFilterRef(emFilterID, 0, 0, 0);

				store.setFilterID(exFilterID, 0, 1);
				store.setFilterModel(excitationModel, 0, 1);
				store.setFilterSetExcitationFilterRef(exFilterID, 0, 0, 0);
			}

			// populate Objective data

			objectiveModel = source.getObjectiveModel();

			immersion = source.getImmersion();

			lensNA = source.getLensNA();

			workingDistance = source.getWorkingDistance();

			magnification = source.getMagnification();

			if (objectiveModel != null) store.setObjectiveModel(objectiveModel, 0, 0);
			if (immersion == null) immersion = "Other";
			try {
				store.setObjectiveImmersion(//
					omeMetaService.getImmersion(immersion), 0, 0);
			}
			catch (final FormatException e) {
				log().warn("failed to set objective immersion", e);
			}
			if (lensNA != null) store.setObjectiveLensNA(lensNA, 0, 0);
			if (workingDistance != null) {
				store.setObjectiveWorkingDistance(//
					new Length(workingDistance, UNITS.MICROMETER), 0, 0);
			}
			if (magnification != null) {
				store.setObjectiveCalibratedMagnification(magnification, 0, 0);
			}
			try {
				store.setObjectiveCorrection(//
					omeMetaService.getCorrection("Other"), 0, 0);
			}
			catch (final FormatException e) {
				log().warn("Failed to store objective correction", e);
			}

			// link Objective to Image
			final String objectiveID = omeMetaService.createLSID("Objective", 0, 0);
			store.setObjectiveID(objectiveID, 0, 0);
			store.setObjectiveSettingsID(objectiveID, 0);

			// populate Detector data

			detectorManufacturer = source.getDetectorManufacturer();

			detectorModel = source.getDetectorModel();

			final String detectorID = omeMetaService.createLSID("Detector", 0, 0);
			store.setDetectorID(detectorID, 0, 0);
			store.setDetectorManufacturer(detectorManufacturer, 0, 0);
			store.setDetectorModel(detectorModel, 0, 0);
			try {
				store.setDetectorType(omeMetaService.getDetectorType("Other"), 0, 0);
			}
			catch (final FormatException e) {
				log().warn("Failed to store detector type", e);
			}

			gains = source.getGains();

			gains.forEach((key, value) -> {
				final int index = key.intValue();
				if (index < effSizeC) {
					store.setDetectorSettingsGain(value, 0, index);
					store.setDetectorSettingsID(detectorID, 0, index);
				}
			});

			// populate Experimenter data

			lastName = source.getAuthorLastName();

			if (lastName != null) {
				final String experimenterID = //
					omeMetaService.createLSID("Experimenter", 0);
				store.setExperimenterID(experimenterID, 0);
				store.setExperimenterLastName(lastName, 0);
			}

			// populate StagePosition data

			stagePos = source.getStagePositions();

			if (stagePos == null) {
				stagePos = new Double[3];
			}

			stagePos[0] = source.getStageX();

			stagePos[1] = source.getStageY();

			stagePos[2] = source.getStageZ();

			// TODO set global meta - x, y, z positions?

			exposureTime = source.getExposureTime();

			if (exposureTime != null) {
				for (int i = 0; i < source.getImageCount(); i++) {
					store.setPlaneExposureTime(//
						new Time(exposureTime, UNITS.SECOND), 0, i);
				}
			}

			dest.setRoot(store);
		}

		// -- Helper methods --

		/** Verifies that a unit matches the expected value. */
		private boolean checkUnit(final String actual, final String... expected) {
			if (actual == null || actual.equals("")) return true; // undefined is OK
			for (final String exp : expected) {
				if (actual.equals(exp)) return true; // unit matches expected value
			}
			log().debug("Unexpected unit '" + actual + //
				"'; expected '" + expected + "'");
			return false;
		}
	}
}
