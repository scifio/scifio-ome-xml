/*
 * #%L
 * SCIFIO support for the OME data model, including OME-XML and OME-TIFF.
 * %%
 * Copyright (C) 2013 - 2016 Board of Regents of the University of
 * Wisconsin-Madison
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

package io.scif.ome.services;

import io.scif.FormatException;
import io.scif.ImageMetadata;
import io.scif.Metadata;
import io.scif.Reader;
import io.scif.io.Location;
import io.scif.services.FormatService;
import io.scif.util.FormatTools;

import java.util.Arrays;
import java.util.List;

import net.imagej.axis.Axes;
import net.imagej.axis.AxisType;
import net.imagej.axis.CalibratedAxis;
import net.imagej.axis.DefaultLinearAxis;

import org.scijava.log.LogService;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.service.AbstractService;
import org.scijava.service.Service;

import loci.common.services.ServiceException;
import loci.formats.MetadataTools;
import loci.formats.meta.MetadataRetrieve;
import loci.formats.meta.MetadataStore;
import loci.formats.ome.OMEXMLMetadata;
import ome.units.UNITS;
import ome.units.quantity.Length;
import ome.units.quantity.Time;
import ome.xml.model.enums.Binning;
import ome.xml.model.enums.Correction;
import ome.xml.model.enums.DetectorType;
import ome.xml.model.enums.EnumerationException;
import ome.xml.model.enums.ExperimentType;
import ome.xml.model.enums.Immersion;
import ome.xml.model.enums.LaserMedium;
import ome.xml.model.enums.LaserType;
import ome.xml.model.enums.handlers.BinningEnumHandler;
import ome.xml.model.enums.handlers.CorrectionEnumHandler;
import ome.xml.model.enums.handlers.DetectorTypeEnumHandler;
import ome.xml.model.enums.handlers.ExperimentTypeEnumHandler;
import ome.xml.model.enums.handlers.ImmersionEnumHandler;
import ome.xml.model.enums.handlers.LaserMediumEnumHandler;
import ome.xml.model.enums.handlers.LaserTypeEnumHandler;
import ome.xml.model.primitives.NonNegativeInteger;
import ome.xml.model.primitives.PositiveInteger;

/** Default implementation of {@link OMEMetadataService}. */
@Plugin(type = Service.class)
public class DefaultOMEMetadataService extends AbstractService implements
	OMEMetadataService
{

	// -- Parameters --

	@Parameter
	private FormatService formatService;

	@Parameter
	private OMEXMLService omexmlService;

	@Parameter
	private LogService logService;

	// -- Utility methods - OME-XML --

	@Override
	public void populatePixels(final MetadataStore store, final Metadata meta) {
		populatePixels(store, meta, false, true);
	}

	@Override
	public void populatePixels(final MetadataStore store, final Metadata meta,
		final boolean doPlane)
	{
		populatePixels(store, meta, doPlane, true);
	}

	@Override
	public void populatePixels(final MetadataStore store, final Metadata meta,
		final boolean doPlane, final boolean doImageName)
	{
		populatePixels(store, meta.getAll(), doPlane, doImageName ? meta
			.getDatasetName() : null);
	}

	@Override
	public void populatePixels(final MetadataStore store,
		final List<ImageMetadata> imageMeta, final boolean doPlane,
		String imageName)
	{
		if (store == null || imageMeta == null) return;
		for (int i = 0; i < imageMeta.size(); i++) {

			if (imageName != null) {
				final Location f = new Location(getContext(), imageName);
				imageName = f.getName();
			}
			final String pixelType = //
				FormatTools.getPixelTypeString(imageMeta.get(i).getPixelType());
			final String order = findDimensionOrder(imageMeta.get(i));

			final int xSize = (int) imageMeta.get(i).getAxisLength(Axes.X);
			int ySize = (int) imageMeta.get(i).getAxisLength(Axes.Y);
			final int zSize = (int) imageMeta.get(i).getAxisLength(Axes.Z);
			final int cSize = (int) imageMeta.get(i).getAxisLength(Axes.CHANNEL);
			int tSize = (int) imageMeta.get(i).getAxisLength(Axes.TIME);
			final double calX = FormatTools.getScale(imageMeta.get(i), Axes.X);
			final double calY = FormatTools.getScale(imageMeta.get(i), Axes.Y);
			final double calZ = FormatTools.getScale(imageMeta.get(i), Axes.Z);
			final double calC = FormatTools.getScale(imageMeta.get(i), Axes.CHANNEL);
			final double calT = FormatTools.getScale(imageMeta.get(i), Axes.TIME);
			int rgbCCount = 1;

			if (imageMeta.get(i).isMultichannel()) {
				rgbCCount = cSize;
			}

			// Compress planar axes to Y
			for (final CalibratedAxis axis : imageMeta.get(i).getAxesPlanar()) {
				final AxisType type = axis.type();
				if (type != Axes.X && type != Axes.Y && type != Axes.CHANNEL) {
					ySize *= imageMeta.get(i).getAxisLength(type);
				}
			}
			// Compress non-planar axes to Time
			for (final CalibratedAxis axis : imageMeta.get(i).getAxesNonPlanar()) {
				final AxisType type = axis.type();
				if (type != Axes.Z && type != Axes.TIME && type != Axes.CHANNEL) {
					tSize *= imageMeta.get(i).getAxisLength(type);
				}
			}

			populateMetadata(store, imageName, i, imageName, imageMeta.get(i)
				.isLittleEndian(), order, pixelType, xSize, ySize, zSize, cSize, tSize,
				calX, calY, calZ, calC, calT, rgbCCount);

			if (omexmlService.isOMEXMLRoot(store.getRoot())) {
				// TODO any way or reason to access a base store?
				if (omexmlService.isOMEXMLMetadata(store)) {
					OMEXMLMetadata omeMeta;
					try {
						omeMeta = //
							omexmlService.getOMEMetadata(omexmlService.asRetrieve(store));
						omeMeta.resolveReferences();
					}
					catch (final ServiceException e) {
						logService.warn("Failed to resolve references", e);
					}
				}
			}

			if (doPlane) {
				for (int q = 0; q < imageMeta.get(i).getPlaneCount(); q++) {
					final long[] coords = FormatTools.rasterToPosition(//
						imageMeta.get(i).getAxesLengthsNonPlanar(), q);
					store.setPlaneTheZ(new NonNegativeInteger((int) coords[0]), i, q);
					store.setPlaneTheC(new NonNegativeInteger((int) coords[1]), i, q);
					store.setPlaneTheT(new NonNegativeInteger((int) coords[2]), i, q);
				}
			}
		}
	}

	@Override
	public void populateMetadata(final MetadataStore store, final int imageIndex,
		final String imageName, final boolean littleEndian,
		final String dimensionOrder, final String pixelType, final int sizeX,
		final int sizeY, final int sizeZ, final int sizeC, final int sizeT,
		final double calX, final double calY, final double calZ, final double calC,
		final double calT, final int samplesPerPixel)
	{
		populateMetadata(store, null, imageIndex, imageName, littleEndian,
			dimensionOrder, pixelType, sizeX, sizeY, sizeZ, sizeC, sizeT, calX, calY,
			calZ, calC, calT, samplesPerPixel);
	}

	@Override
	public void populateMetadata(final MetadataStore store, final int imageIndex,
		final String imageName, final Metadata meta)
	{
		populateMetadata(store, imageIndex, imageName, meta.get(imageIndex));
	}

	@Override
	public void populateMetadata(final MetadataStore store, final int imageIndex,
		final String imageName, final ImageMetadata iMeta)
	{
		final int sizeX = (int) iMeta.getAxisLength(Axes.X);
		int sizeY = (int) iMeta.getAxisLength(Axes.Y);
		final int sizeZ = (int) iMeta.getAxisLength(Axes.Z);
		final int sizeC = (int) iMeta.getAxisLength(Axes.CHANNEL);
		int sizeT = (int) iMeta.getAxisLength(Axes.TIME);
		final double calX = FormatTools.getScale(iMeta, Axes.X);
		final double calY = FormatTools.getScale(iMeta, Axes.Y);
		final double calZ = FormatTools.getScale(iMeta, Axes.Z);
		final double calC = FormatTools.getScale(iMeta, Axes.CHANNEL);
		final double calT = FormatTools.getScale(iMeta, Axes.TIME);

		// Compress planar axes to Y
		for (final CalibratedAxis axis : iMeta.getAxesPlanar()) {
			final AxisType type = axis.type();
			if (type != Axes.X && type != Axes.Y && type != Axes.CHANNEL) {
				sizeY *= iMeta.getAxisLength(type);
			}
		}
		// Compress non-planar axes to Time
		for (final CalibratedAxis axis : iMeta.getAxesNonPlanar()) {
			final AxisType type = axis.type();
			if (type != Axes.Z && type != Axes.TIME && type != Axes.CHANNEL) {
				sizeT *= iMeta.getAxisLength(type);
			}
		}

		final String pixelType = //
			FormatTools.getPixelTypeString(iMeta.getPixelType());
		final int effSizeC = (int) (iMeta.getPlaneCount() / sizeZ / sizeT);
		final int samplesPerPixel = sizeC / effSizeC;
		populateMetadata(store, null, imageIndex, imageName, iMeta.isLittleEndian(),
			findDimensionOrder(iMeta), pixelType, sizeX, sizeY, sizeZ, sizeC, sizeT,
			calX, calY, calZ, calC, calT, samplesPerPixel);
	}

	@Override
	public void populateMetadata(final MetadataStore store, final String file,
		final int imageIndex, final String imageName, final boolean littleEndian,
		final String dimensionOrder, final String pixelType, final int sizeX,
		final int sizeY, final int sizeZ, final int sizeC, final int sizeT,
		final double calX, final double calY, final double calZ, final double calC,
		final double calT, final int samplesPerPixel)
	{
		MetadataTools.populateMetadata(store, imageIndex, imageName, littleEndian,
			dimensionOrder, pixelType, sizeX, sizeY, sizeZ, sizeC, sizeT,
			samplesPerPixel);
		populateCalibrations(store, imageIndex, calX, calY, calZ, calC, calT);
	}

	@Override
	public void populatePixelsOnly(final MetadataStore store, final Reader r) {
		final Metadata meta = r.getMetadata();

		for (int imageIndex = 0; imageIndex < r.getImageCount(); imageIndex++) {
			final ImageMetadata imageMeta = meta.get(imageIndex);

			final String pixelType = //
				FormatTools.getPixelTypeString(imageMeta.getPixelType());
			final int xSize = (int) imageMeta.getAxisLength(Axes.X);
			int ySize = (int) imageMeta.getAxisLength(Axes.Y);
			final int zSize = (int) imageMeta.getAxisLength(Axes.Z);
			final int cSize = (int) imageMeta.getAxisLength(Axes.CHANNEL);
			int tSize = (int) imageMeta.getAxisLength(Axes.TIME);
			final double calX = FormatTools.getScale(meta, imageIndex, Axes.X);
			final double calY = FormatTools.getScale(meta, imageIndex, Axes.Y);
			final double calZ = FormatTools.getScale(meta, imageIndex, Axes.Z);
			final double calC = FormatTools.getScale(meta, imageIndex, Axes.CHANNEL);
			final double calT = FormatTools.getScale(meta, imageIndex, Axes.TIME);
			int rgbCCount = 1;

			if (imageMeta.isMultichannel()) rgbCCount = cSize;

			// Compress planar axes to Y
			for (final CalibratedAxis axis : imageMeta.getAxesPlanar()) {
				final AxisType type = axis.type();
				if (type != Axes.X && type != Axes.Y && type != Axes.CHANNEL) {
					ySize *= imageMeta.getAxisLength(type);
				}
			}
			// Compress non-planar axes to Time
			for (final CalibratedAxis axis : imageMeta.getAxesNonPlanar()) {
				final AxisType type = axis.type();
				if (type != Axes.Z && type != Axes.TIME && type != Axes.CHANNEL) {
					tSize *= imageMeta.getAxisLength(type);
				}
			}
			populatePixelsOnly(store, imageIndex, imageMeta.isLittleEndian(),
				findDimensionOrder(meta, imageIndex), pixelType, xSize, ySize, zSize,
				cSize, tSize, calX, calY, calZ, calC, calT, rgbCCount);
		}
	}

	@Override
	public void populatePixelsOnly(final MetadataStore store,
		final int imageIndex, final boolean littleEndian,
		final String dimensionOrder, final String pixelType, final int sizeX,
		final int sizeY, final int sizeZ, final int sizeC, final int sizeT,
		final double calX, final double calY, final double calZ, final double calC,
		final double calT, final int samplesPerPixel)
	{
		MetadataTools.populatePixelsOnly(store, imageIndex, littleEndian,
			dimensionOrder, pixelType, sizeX, sizeY, sizeZ, sizeC, sizeT,
			samplesPerPixel);
		populateCalibrations(store, imageIndex, calX, calY, calZ, calC, calT);
	}

	@Override
	public void setDefaultDateEnabled(final boolean enabled) {
		MetadataTools.setDefaultDateEnabled(enabled);
	}

	@Override
	public void setDefaultCreationDate(final MetadataStore store, final String id,
		final int imageIndex)
	{
		MetadataTools.setDefaultCreationDate(store, id, imageIndex);
	}

	@Override
	public void verifyMinimumPopulated(final MetadataRetrieve src)
		throws FormatException
	{
		try {
			MetadataTools.verifyMinimumPopulated(src);
		}
		catch (final loci.formats.FormatException exc) {
			throw new FormatException(exc);
		}
	}

	@Override
	public void verifyMinimumPopulated(final MetadataRetrieve src, final int n)
		throws FormatException
	{
		try {
			MetadataTools.verifyMinimumPopulated(src, n);
		}
		catch (final loci.formats.FormatException exc) {
			throw new FormatException(exc);
		}
	}

	@Override
	public String findDimensionOrder(final Metadata meta, final int imageIndex) {
		return findDimensionOrder(meta.get(imageIndex));
	}

	@Override
	public String findDimensionOrder(final ImageMetadata imageMeta) {
		String dimOrder = "";

		for (final CalibratedAxis axis : imageMeta.getAxes()) {
			dimOrder += axis.type().getLabel().charAt(0);
		}

		return makeSaneDimensionOrder(dimOrder);
	}

	@Override
	public AxisType[] findDimensionList(final String dimensionOrder) {
		final AxisType[] axes = new AxisType[dimensionOrder.length()];

		int index = 0;
		for (final char d : dimensionOrder.toUpperCase().toCharArray()) {
			switch (d) {
				case 'X':
					axes[index] = Axes.X;
					break;
				case 'Y':
					axes[index] = Axes.Y;
					break;
				case 'Z':
					axes[index] = Axes.Z;
					break;
				case 'C':
					axes[index] = Axes.CHANNEL;
					break;
				case 'T':
					axes[index] = Axes.TIME;
					break;
				default:
					axes[index] = Axes.unknown();
			}
			index++;
		}
		return axes;
	}

	@Override
	public long[] zctToArray(final String order, final int z, final int c,
		final int t)
	{
		final long[] zct = new long[3];
		int index = 0;
		for (final char dim : order.toUpperCase().toCharArray()) {
			switch (dim) {
				case 'C':
					zct[index] = c;
					index++;
					break;
				case 'Z':
					zct[index] = z;
					index++;
					break;
				case 'T':
					zct[index] = t;
					index++;
					break;
			}
		}
		return zct;
	}

	@Override
	public String makeSaneDimensionOrder(final String dimensionOrder) {
		return MetadataTools.makeSaneDimensionOrder(dimensionOrder);
	}

	@Override
	public String createLSID(final String type, final int... indices) {
		return MetadataTools.createLSID(type, indices);
	}

	@Override
	public ExperimentType getExperimentType(final String value)
		throws FormatException
	{
		final ExperimentTypeEnumHandler handler = new ExperimentTypeEnumHandler();
		try {
			return (ExperimentType) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("ExperimentType creation failed", e);
		}
	}

	@Override
	public LaserType getLaserType(final String value) throws FormatException {
		final LaserTypeEnumHandler handler = new LaserTypeEnumHandler();
		try {
			return (LaserType) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("LaserType creation failed", e);
		}
	}

	@Override
	public LaserMedium getLaserMedium(final String value) throws FormatException {
		final LaserMediumEnumHandler handler = new LaserMediumEnumHandler();
		try {
			return (LaserMedium) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("LaserMedium creation failed", e);
		}
	}

	@Override
	public Immersion getImmersion(final String value) throws FormatException {
		final ImmersionEnumHandler handler = new ImmersionEnumHandler();
		try {
			return (Immersion) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("Immersion creation failed", e);
		}
	}

	@Override
	public Correction getCorrection(final String value) throws FormatException {
		final CorrectionEnumHandler handler = new CorrectionEnumHandler();
		try {
			return (Correction) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("Correction creation failed", e);
		}
	}

	@Override
	public DetectorType getDetectorType(final String value)
		throws FormatException
	{
		final DetectorTypeEnumHandler handler = new DetectorTypeEnumHandler();
		try {
			return (DetectorType) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("DetectorType creation failed", e);
		}
	}

	@Override
	public Binning getBinning(final String value) throws FormatException {
		final BinningEnumHandler handler = new BinningEnumHandler();
		try {
			return (Binning) handler.getEnumeration(value);
		}
		catch (final EnumerationException e) {
			throw new FormatException("Binning creation failed", e);
		}
	}

	@Override
	public void populateMetadata(final MetadataRetrieve retrieve,
		final Metadata meta)
	{

		final int numImages = retrieve.getImageCount();

		if (numImages > 0) meta.setDatasetName(retrieve.getImageName(0));

		meta.createImageMetadata(numImages);

		for (int i = 0; i < numImages; i++) {
			populateImageMetadata(retrieve, i, meta.get(i));
		}
	}

	@Override
	public void populateImageMetadata(final MetadataRetrieve retrieve,
		final int imageIndex, final ImageMetadata iMeta)
	{
		// Get axis information from the MetadataRetrieve
		final int sizeX = retrieve.getPixelsSizeX(imageIndex).getValue();
		final int sizeY = retrieve.getPixelsSizeY(imageIndex).getValue();
		final int sizeZ = retrieve.getPixelsSizeZ(imageIndex).getValue();
		int sizeC = retrieve.getPixelsSizeC(imageIndex).getValue();
		final int sizeT = retrieve.getPixelsSizeT(imageIndex).getValue();
		final Length physX = retrieve.getPixelsPhysicalSizeX(imageIndex);
		final Length physY = retrieve.getPixelsPhysicalSizeY(imageIndex);
		final Length physZ = retrieve.getPixelsPhysicalSizeZ(imageIndex);
		final Time physT = retrieve.getPixelsTimeIncrement(imageIndex);
		final double calX = physX == null ? 1.0 : physX.value().doubleValue();
		final double calY = physY == null ? 1.0 : physY.value().doubleValue();
		final double calZ = physZ == null ? 1.0 : physZ.value().doubleValue();
		final double calT = physT == null ? 1.0 : physT.value().doubleValue();

		final String dimensionOrder = //
			retrieve.getPixelsDimensionOrder(imageIndex).getValue();
		final PositiveInteger spp = retrieve.getChannelCount(imageIndex) <= 0 ? //
			null : retrieve.getChannelSamplesPerPixel(imageIndex, 0);

		final boolean little = !retrieve.getPixelsBigEndian(imageIndex);
		final int pType = FormatTools.pixelTypeFromString(//
			retrieve.getPixelsType(imageIndex).getValue());
		final int rgbCCount = spp == null ? 1 : spp.getValue();
		// if we have RGB planes, there are really two "channel" axes
		final int axisCount = rgbCCount == 1 ? 5 : 6;

		final long[] lengths = new long[axisCount];
		final CalibratedAxis[] axes = new CalibratedAxis[axisCount];
		iMeta.setPlanarAxisCount(2);

		// populate the axis information in dimension order
		int i = 0;
		for (final char d : dimensionOrder.toUpperCase().toCharArray()) {
			// Check for RGB channel position
			if (axisCount == 6 && i > 0 && axes[i - 1].type() == Axes.Y) {
				sizeC /= rgbCCount;
				lengths[i] = rgbCCount;
				axes[i] = new DefaultLinearAxis(Axes.CHANNEL, "um", 1.0);
				i++;
				iMeta.setPlanarAxisCount(i);
			}
			switch (d) {
				case 'X':
					lengths[i] = sizeX;
					axes[i] = new DefaultLinearAxis(Axes.X, "um", calX);
					break;
				case 'Y':
					lengths[i] = sizeY;
					axes[i] = new DefaultLinearAxis(Axes.Y, "um", calY);
					break;
				case 'Z':
					lengths[i] = sizeZ;
					axes[i] = new DefaultLinearAxis(Axes.Z, "um", calZ);
					break;
				case 'C':
					lengths[i] = sizeC;
					if (rgbCCount == 1) {
						axes[i] = new DefaultLinearAxis(Axes.CHANNEL, "um", 1.0);
					}
					else {
						axes[i] = new DefaultLinearAxis(Axes.get("cPlanes"), "um", 1.0);
					}
					break;
				case 'T':
					lengths[i] = sizeT;
					axes[i] = new DefaultLinearAxis(Axes.TIME, "um", calT);
					break;
			}
			i++;
		}

		// populate the metadata
		iMeta.populate(iMeta.getName(), Arrays.asList(axes), lengths, pType,
			FormatTools.getBitsPerPixel(pType), true, little, false, false, true);
	}

	// -- Helper methods --

	private void populateCalibrations(final MetadataStore store,
		final int imageIndex, final double calX, final double calY,
		final double calZ, final double calC, final double calT)
	{
		store.setPixelsPhysicalSizeX(new Length(calX, UNITS.MICROM), imageIndex);
		store.setPixelsPhysicalSizeY(new Length(calY, UNITS.MICROM), imageIndex);
		store.setPixelsPhysicalSizeZ(new Length(calZ, UNITS.MICROM), imageIndex);
		store.setPixelsTimeIncrement(new Time(calT, UNITS.SECOND), imageIndex);
	}

}
