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
//
// OMEXMLMetadataImpl.java
//

/*
 * loci.formats.ome.OMEXMLMetadataImpl
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2005-@year@ Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by temp via xsd-fu on 2012-09-20 09:15:49.524853
 *
 *-----------------------------------------------------------------------------
 */

package io.scif.ome.xml.meta;

import ome.xml.model.AffineTransform;
import ome.xml.model.AnnotationRef;
import ome.xml.model.Arc;
import ome.xml.model.BinData;
import ome.xml.model.BinaryFile;
import ome.xml.model.BinaryOnly;
import ome.xml.model.BooleanAnnotation;
import ome.xml.model.Channel;
import ome.xml.model.CommentAnnotation;
import ome.xml.model.Dataset;
import ome.xml.model.DatasetRef;
import ome.xml.model.Detector;
import ome.xml.model.DetectorSettings;
import ome.xml.model.Dichroic;
import ome.xml.model.DichroicRef;
import ome.xml.model.DoubleAnnotation;
import ome.xml.model.Ellipse;
import ome.xml.model.EmissionFilterRef;
import ome.xml.model.ExcitationFilterRef;
import ome.xml.model.Experiment;
import ome.xml.model.ExperimentRef;
import ome.xml.model.Experimenter;
import ome.xml.model.ExperimenterGroup;
import ome.xml.model.ExperimenterGroupRef;
import ome.xml.model.ExperimenterRef;
import ome.xml.model.Filament;
import ome.xml.model.FileAnnotation;
import ome.xml.model.Filter;
import ome.xml.model.FilterSet;
import ome.xml.model.FilterSetRef;
import ome.xml.model.Image;
import ome.xml.model.ImageRef;
import ome.xml.model.ImagingEnvironment;
import ome.xml.model.Instrument;
import ome.xml.model.InstrumentRef;
import ome.xml.model.Label;
import ome.xml.model.Laser;
import ome.xml.model.Leader;
import ome.xml.model.LightEmittingDiode;
import ome.xml.model.LightPath;
import ome.xml.model.LightSource;
import ome.xml.model.LightSourceSettings;
import ome.xml.model.Line;
import ome.xml.model.ListAnnotation;
import ome.xml.model.LongAnnotation;
import ome.xml.model.Mask;
import ome.xml.model.MicrobeamManipulation;
import ome.xml.model.MicrobeamManipulationRef;
import ome.xml.model.Microscope;
import ome.xml.model.OME;
import ome.xml.model.OMEModel;
import ome.xml.model.OMEModelImpl;
import ome.xml.model.Objective;
import ome.xml.model.ObjectiveSettings;
import ome.xml.model.Pixels;
import ome.xml.model.Plane;
import ome.xml.model.Plate;
import ome.xml.model.PlateAcquisition;
import ome.xml.model.PlateRef;
import ome.xml.model.Point;
import ome.xml.model.Polygon;
import ome.xml.model.Polyline;
import ome.xml.model.Project;
import ome.xml.model.Pump;
import ome.xml.model.ROI;
import ome.xml.model.ROIRef;
import ome.xml.model.Reagent;
import ome.xml.model.ReagentRef;
import ome.xml.model.Rectangle;
import ome.xml.model.Screen;
import ome.xml.model.Shape;
import ome.xml.model.StageLabel;
import ome.xml.model.StructuredAnnotations;
import ome.xml.model.TagAnnotation;
import ome.xml.model.TermAnnotation;
import ome.xml.model.TiffData;
import ome.xml.model.TimestampAnnotation;
import ome.xml.model.TransmittanceRange;
import ome.xml.model.UUID;
import ome.xml.model.Union;
import ome.xml.model.Well;
import ome.xml.model.WellSample;
import ome.xml.model.WellSampleRef;
import ome.xml.model.XMLAnnotation;
import ome.xml.model.enums.AcquisitionMode;
import ome.xml.model.enums.ArcType;
import ome.xml.model.enums.Binning;
import ome.xml.model.enums.ContrastMethod;
import ome.xml.model.enums.Correction;
import ome.xml.model.enums.DetectorType;
import ome.xml.model.enums.DimensionOrder;
import ome.xml.model.enums.ExperimentType;
import ome.xml.model.enums.FilamentType;
import ome.xml.model.enums.FillRule;
import ome.xml.model.enums.FilterType;
import ome.xml.model.enums.FontFamily;
import ome.xml.model.enums.FontStyle;
import ome.xml.model.enums.IlluminationType;
import ome.xml.model.enums.Immersion;
import ome.xml.model.enums.LaserMedium;
import ome.xml.model.enums.LaserType;
import ome.xml.model.enums.LineCap;
import ome.xml.model.enums.Marker;
import ome.xml.model.enums.Medium;
import ome.xml.model.enums.MicrobeamManipulationType;
import ome.xml.model.enums.MicroscopeType;
import ome.xml.model.enums.NamingConvention;
import ome.xml.model.enums.PixelType;
import ome.xml.model.enums.Pulse;
import ome.xml.model.primitives.Color;
import ome.xml.model.primitives.NonNegativeInteger;
import ome.xml.model.primitives.NonNegativeLong;
import ome.xml.model.primitives.PercentFraction;
import ome.xml.model.primitives.PositiveFloat;
import ome.xml.model.primitives.PositiveInteger;
import ome.xml.model.primitives.Timestamp;

/**
 * A metadata store implementation for constructing and manipulating OME-XML
 * DOMs for the current version of OME-XML. It requires the ome.xml.model
 * package to compile (part of ome-xml.jar).
 * <dl>
 * <dt><b>Source code:</b></dt>
 * <dd><a href=
 * "http://trac.openmicroscopy.org.uk/ome/browser/bioformats.git/components/bio-formats/src/loci/formats/ome/OMEXMLMetadataImpl.java"
 * >Trac</a>, <a href=
 * "http://git.openmicroscopy.org/?p=bioformats.git;a=blob;f=components/bio-formats/src/loci/formats/ome/OMEXMLMetadataImpl.java;hb=HEAD"
 * >Gitweb</a></dd>
 * </dl>
 * 
 * @author Curtis Rueden ctrueden at wisc.edu
 * @author Melissa Linkert linkert at wisc.edu
 */
public class OMEXMLMetadataImpl extends AbstractOMEXMLMetadata {

	private OME root;

	private OMEModel model;

	public OMEXMLMetadataImpl() {
		createRoot();
	}

	@Override
	public void createRoot() {
		root = new OME();
		model = new OMEModelImpl();
	}

	@Override
	public Object getRoot() {
		return root;
	}

	@Override
	public void setRoot(final Object root) {
		if (!(root instanceof OME)) {
			throw new IllegalArgumentException("Expecting OME class or subclass.");
		}
		this.root = (OME) root;
		model = new OMEModelImpl();
	}

	@Override
	public String dumpXML() {
		resolveReferences();
		return super.dumpXML();
	}

	@Override
	public int resolveReferences() {
		return model.resolveReferences();
	}

	// -- Entity counting (manual definitions) --

	@Override
	public int getPixelsBinDataCount(final int imageIndex) {
		return root.getImage(imageIndex).getPixels().sizeOfBinDataList();
	}

	@Override
	public int getBooleanAnnotationAnnotationCount(
		final int booleanAnnotationIndex)
	{
		return root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getCommentAnnotationAnnotationCount(
		final int commentAnnotationIndex)
	{
		return root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int
		getDoubleAnnotationAnnotationCount(final int doubleAnnotationIndex)
	{
		return root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getFileAnnotationAnnotationCount(final int fileAnnotationIndex) {
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getListAnnotationAnnotationCount(final int listAnnotationIndex) {
		return root.getStructuredAnnotations().getListAnnotation(
			listAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getLongAnnotationAnnotationCount(final int longAnnotationIndex) {
		return root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getTagAnnotationAnnotationCount(final int tagAnnotationIndex) {
		return root.getStructuredAnnotations().getTagAnnotation(tagAnnotationIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public int getTermAnnotationAnnotationCount(final int termAnnotationIndex) {
		return root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getTimestampAnnotationAnnotationCount(
		final int timestampAnnotationIndex)
	{
		return root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getXMLAnnotationAnnotationCount(final int xmlAnnotationIndex) {
		return root.getStructuredAnnotations().getXMLAnnotation(xmlAnnotationIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public String getLightSourceType(final int instrumentIndex,
		final int lightSourceIndex)
	{
		final LightSource o =
			root.getInstrument(instrumentIndex).getLightSource(lightSourceIndex);
		final String className = o.getClass().getName();
		return className.substring(className.lastIndexOf('.') + 1, className
			.length());
	}

	@Override
	public String getShapeType(final int roiIndex, final int shapeIndex) {
		final Shape o = root.getROI(roiIndex).getUnion().getShape(shapeIndex);
		final String className = o.getClass().getName();
		return className.substring(className.lastIndexOf('.') + 1, className
			.length());
	}

	// -- Entity counting (code generated definitions) --

	// AnnotationRef entity counting
	@Override
	public int getROIAnnotationRefCount(final int ROIIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getROI(ROIIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getPlateAcquisitionAnnotationRefCount(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public int getPlateAnnotationRefCount(final int plateIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getPlate(plateIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getExperimenterGroupAnnotationRefCount(
		final int experimenterGroupIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getExperimenterGroup(experimenterGroupIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public int getImageAnnotationRefCount(final int imageIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getImage(imageIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getScreenAnnotationRefCount(final int screenIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getScreen(screenIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int
		getWellAnnotationRefCount(final int plateIndex, final int wellIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getPlate(plateIndex).getWell(wellIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public int getDatasetAnnotationRefCount(final int datasetIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getDataset(datasetIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getProjectAnnotationRefCount(final int projectIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getProject(projectIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getReagentAnnotationRefCount(final int screenIndex,
		final int reagentIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getScreen(screenIndex).getReagent(reagentIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public int getPlaneAnnotationRefCount(final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.sizeOfLinkedAnnotationList();
	}

	@Override
	public int getExperimenterAnnotationRefCount(final int experimenterIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getExperimenter(experimenterIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getWellSampleAnnotationRefCount(final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).sizeOfLinkedAnnotationList();
	}

	@Override
	public int getPixelsAnnotationRefCount(final int imageIndex) {
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getImage(imageIndex).getPixels().sizeOfLinkedAnnotationList();
	}

	@Override
	public int getChannelAnnotationRefCount(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate':
		// {u'OME': None}}, u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME':
		// None}, u'Image': {u'OME': None}, u'Screen': {u'OME': None}, u'Well':
		// {u'Plate': {u'OME': None}}, u'Dataset': {u'OME': None}, u'Project':
		// {u'OME': None}, u'Reagent': {u'Screen': {u'OME': None}}, u'Plane':
		// {u'Pixels': {u'Image': {u'OME': None}}}, u'Experimenter': {u'OME': None},
		// u'Annotation': None, u'WellSample': {u'Well': {u'Plate': {u'OME':
		// None}}}, u'Pixels': {u'Image': {u'OME': None}}, u'Channel': {u'Pixels':
		// {u'Image': {u'OME': None}}}}
		// AnnotationRef is a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.sizeOfLinkedAnnotationList();
	}

	// Arc entity counting
	// BinaryFile entity counting
	// BinaryOnly entity counting
	// BooleanAnnotation entity counting
	@Override
	public int getBooleanAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// BooleanAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfBooleanAnnotationList();
	}

	// Channel entity counting
	@Override
	public int getChannelCount(final int imageIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Channel is not a reference
		return root.getImage(imageIndex).getPixels().sizeOfChannelList();
	}

	// CommentAnnotation entity counting
	@Override
	public int getCommentAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// CommentAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfCommentAnnotationList();
	}

	// Dataset entity counting
	@Override
	public int getDatasetCount() {
		// Parents: {u'OME': None}
		// Dataset is not a reference
		return root.sizeOfDatasetList();
	}

	// DatasetRef entity counting
	@Override
	public int getDatasetRefCount(final int projectIndex) {
		// Parents: {u'Project': {u'OME': None}}
		// DatasetRef is a reference
		return root.getProject(projectIndex).sizeOfLinkedDatasetList();
	}

	// Detector entity counting
	@Override
	public int getDetectorCount(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Detector is not a reference
		return root.getInstrument(instrumentIndex).sizeOfDetectorList();
	}

	// DetectorSettings entity counting
	// Dichroic entity counting
	@Override
	public int getDichroicCount(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Dichroic is not a reference
		return root.getInstrument(instrumentIndex).sizeOfDichroicList();
	}

	// DichroicRef entity counting
	// DoubleAnnotation entity counting
	@Override
	public int getDoubleAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// DoubleAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfDoubleAnnotationList();
	}

	// Ellipse entity counting
	// EmissionFilterRef entity counting
	@Override
	public int getLightPathEmissionFilterRefCount(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME':
		// None}}}}, u'FilterSet': {u'Instrument': {u'OME': None}}}
		// EmissionFilterRef is a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightPath().sizeOfLinkedEmissionFilterList();
	}

	@Override
	public int getFilterSetEmissionFilterRefCount(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME':
		// None}}}}, u'FilterSet': {u'Instrument': {u'OME': None}}}
		// EmissionFilterRef is a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.sizeOfLinkedEmissionFilterList();
	}

	// ExcitationFilterRef entity counting
	@Override
	public int getLightPathExcitationFilterRefCount(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME':
		// None}}}}, u'FilterSet': {u'Instrument': {u'OME': None}}}
		// ExcitationFilterRef is a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightPath().sizeOfLinkedExcitationFilterList();
	}

	@Override
	public int getFilterSetExcitationFilterRefCount(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME':
		// None}}}}, u'FilterSet': {u'Instrument': {u'OME': None}}}
		// ExcitationFilterRef is a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.sizeOfLinkedExcitationFilterList();
	}

	// Experiment entity counting
	@Override
	public int getExperimentCount() {
		// Parents: {u'OME': None}
		// Experiment is not a reference
		return root.sizeOfExperimentList();
	}

	// ExperimentRef entity counting
	// Experimenter entity counting
	@Override
	public int getExperimenterCount() {
		// Parents: {u'OME': None}
		// Experimenter is not a reference
		return root.sizeOfExperimenterList();
	}

	// ExperimenterGroup entity counting
	@Override
	public int getExperimenterGroupCount() {
		// Parents: {u'OME': None}
		// ExperimenterGroup is not a reference
		return root.sizeOfExperimenterGroupList();
	}

	// ExperimenterGroupRef entity counting
	// ExperimenterRef entity counting
	@Override
	public int getExperimenterGroupExperimenterRefCount(
		final int experimenterGroupIndex)
	{
		// Parents: {u'ExperimenterGroup': {u'OME': None}, u'Image': {u'OME': None},
		// u'Dataset': {u'OME': None}, u'Project': {u'OME': None}, u'Experiment':
		// {u'OME': None}, u'MicrobeamManipulation': {u'Experiment': {u'OME':
		// None}}}
		// ExperimenterRef is a reference
		return root.getExperimenterGroup(experimenterGroupIndex)
			.sizeOfLinkedExperimenterList();
	}

	// Filament entity counting
	// FileAnnotation entity counting
	@Override
	public int getFileAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// FileAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfFileAnnotationList();
	}

	// Filter entity counting
	@Override
	public int getFilterCount(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Filter is not a reference
		return root.getInstrument(instrumentIndex).sizeOfFilterList();
	}

	// FilterSet entity counting
	@Override
	public int getFilterSetCount(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// FilterSet is not a reference
		return root.getInstrument(instrumentIndex).sizeOfFilterSetList();
	}

	// FilterSetRef entity counting
	// Image entity counting
	@Override
	public int getImageCount() {
		// Parents: {u'OME': None}
		// Image is not a reference
		return root.sizeOfImageList();
	}

	// ImageRef entity counting
	@Override
	public int getDatasetImageRefCount(final int datasetIndex) {
		// Parents: {u'WellSample': {u'Well': {u'Plate': {u'OME': None}}},
		// u'Dataset': {u'OME': None}}
		// ImageRef is a reference
		return root.getDataset(datasetIndex).sizeOfLinkedImageList();
	}

	// ImagingEnvironment entity counting
	// Instrument entity counting
	@Override
	public int getInstrumentCount() {
		// Parents: {u'OME': None}
		// Instrument is not a reference
		return root.sizeOfInstrumentList();
	}

	// InstrumentRef entity counting
	// Label entity counting
	// Laser entity counting
	// Leader entity counting
	@Override
	public int getLeaderCount(final int experimenterGroupIndex) {
		// Parents: {u'ExperimenterGroup': {u'OME': None}}
		// Leader is a reference
		return root.getExperimenterGroup(experimenterGroupIndex)
			.sizeOfLinkedLeaderList();
	}

	// LightEmittingDiode entity counting
	// LightPath entity counting
	// LightSource entity counting
	@Override
	public int getLightSourceCount(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// LightSource is not a reference
		return root.getInstrument(instrumentIndex).sizeOfLightSourceList();
	}

	// LightSourceSettings entity counting
	@Override
	public int getMicrobeamManipulationLightSourceSettingsCount(
		final int experimentIndex, final int microbeamManipulationIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// LightSourceSettings is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).sizeOfLightSourceSettingsList();
	}

	// Line entity counting
	// ListAnnotation entity counting
	@Override
	public int getListAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ListAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfListAnnotationList();
	}

	// LongAnnotation entity counting
	@Override
	public int getLongAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// LongAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfLongAnnotationList();
	}

	// Mask entity counting
	// MetadataOnly entity counting
	// MicrobeamManipulation entity counting
	@Override
	public int getMicrobeamManipulationCount(final int experimentIndex) {
		// Parents: {u'Experiment': {u'OME': None}}
		// MicrobeamManipulation is not a reference
		return root.getExperiment(experimentIndex)
			.sizeOfMicrobeamManipulationList();
	}

	// MicrobeamManipulationRef entity counting
	@Override
	public int getMicrobeamManipulationRefCount(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// MicrobeamManipulationRef is a reference
		return root.getImage(imageIndex).sizeOfLinkedMicrobeamManipulationList();
	}

	// Microscope entity counting
	// Objective entity counting
	@Override
	public int getObjectiveCount(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Objective is not a reference
		return root.getInstrument(instrumentIndex).sizeOfObjectiveList();
	}

	// ObjectiveSettings entity counting
	// Pixels entity counting
	// Plane entity counting
	@Override
	public int getPlaneCount(final int imageIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Plane is not a reference
		return root.getImage(imageIndex).getPixels().sizeOfPlaneList();
	}

	// Plate entity counting
	@Override
	public int getPlateCount() {
		// Parents: {u'OME': None}
		// Plate is not a reference
		return root.sizeOfPlateList();
	}

	// PlateAcquisition entity counting
	@Override
	public int getPlateAcquisitionCount(final int plateIndex) {
		// Parents: {u'Plate': {u'OME': None}}
		// PlateAcquisition is not a reference
		return root.getPlate(plateIndex).sizeOfPlateAcquisitionList();
	}

	// PlateRef entity counting
	@Override
	public int getPlateRefCount(final int screenIndex) {
		// Parents: {u'Screen': {u'OME': None}}
		// PlateRef is a reference
		return root.getScreen(screenIndex).sizeOfLinkedPlateList();
	}

	// Point entity counting
	// Polygon entity counting
	// Polyline entity counting
	// Project entity counting
	@Override
	public int getProjectCount() {
		// Parents: {u'OME': None}
		// Project is not a reference
		return root.sizeOfProjectList();
	}

	// Pump entity counting
	// ROI entity counting
	@Override
	public int getROICount() {
		// Parents: {u'OME': None}
		// ROI is not a reference
		return root.sizeOfROIList();
	}

	// ROIRef entity counting
	@Override
	public int getImageROIRefCount(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}, u'MicrobeamManipulation':
		// {u'Experiment': {u'OME': None}}}
		// ROIRef is a reference
		return root.getImage(imageIndex).sizeOfLinkedROIList();
	}

	@Override
	public int getMicrobeamManipulationROIRefCount(final int experimentIndex,
		final int microbeamManipulationIndex)
	{
		// Parents: {u'Image': {u'OME': None}, u'MicrobeamManipulation':
		// {u'Experiment': {u'OME': None}}}
		// ROIRef is a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).sizeOfLinkedROIList();
	}

	// Reagent entity counting
	@Override
	public int getReagentCount(final int screenIndex) {
		// Parents: {u'Screen': {u'OME': None}}
		// Reagent is not a reference
		return root.getScreen(screenIndex).sizeOfReagentList();
	}

	// ReagentRef entity counting
	// Rectangle entity counting
	// Screen entity counting
	@Override
	public int getScreenCount() {
		// Parents: {u'OME': None}
		// Screen is not a reference
		return root.sizeOfScreenList();
	}

	// Shape entity counting
	@Override
	public int getShapeCount(final int ROIIndex) {
		// Parents: {u'Union': {u'ROI': {u'OME': None}}}
		// Shape is not a reference
		return root.getROI(ROIIndex).getUnion().sizeOfShapeList();
	}

	// StageLabel entity counting
	// StructuredAnnotations entity counting
	// TagAnnotation entity counting
	@Override
	public int getTagAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// TagAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfTagAnnotationList();
	}

	// TermAnnotation entity counting
	@Override
	public int getTermAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// TermAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfTermAnnotationList();
	}

	// TiffData entity counting
	@Override
	public int getTiffDataCount(final int imageIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TiffData is not a reference
		return root.getImage(imageIndex).getPixels().sizeOfTiffDataList();
	}

	// TimestampAnnotation entity counting
	@Override
	public int getTimestampAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// TimestampAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfTimestampAnnotationList();
	}

	// TransmittanceRange entity counting
	// Element's text data
	// {u'TiffData': [u'int imageIndex', u'int tiffDataIndex']}
	@Override
	public void setUUIDValue(final String value, final int imageIndex,
		final int tiffDataIndex)
	{
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		if (o3.getUUID() == null) {
			o3.setUUID(new UUID());
		}
		final UUID o4 = o3.getUUID();
		o4.setValue(value);
	}

	@Override
	public String getUUIDValue(final int imageIndex, final int tiffDataIndex) {
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getUUID().getValue();
	}

	// UUID entity counting
	// Union entity counting
	// Well entity counting
	@Override
	public int getWellCount(final int plateIndex) {
		// Parents: {u'Plate': {u'OME': None}}
		// Well is not a reference
		return root.getPlate(plateIndex).sizeOfWellList();
	}

	// WellSample entity counting
	@Override
	public int getWellSampleCount(final int plateIndex, final int wellIndex) {
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// WellSample is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).sizeOfWellSampleList();
	}

	// WellSampleRef entity counting
	@Override
	public int getWellSampleRefCount(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'PlateAcquisition': {u'Plate': {u'OME': None}}}
		// WellSampleRef is a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.sizeOfLinkedWellSampleList();
	}

	// XMLAnnotation entity counting
	@Override
	public int getXMLAnnotationCount() {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// XMLAnnotation is not a reference
		return root.getStructuredAnnotations().sizeOfXMLAnnotationList();
	}

	// -- Entity retrieval (manual definitions) --

	@Override
	public Boolean getPixelsBinDataBigEndian(final int imageIndex,
		final int binDataIndex)
	{
		return root.getImage(imageIndex).getPixels().getBinData(binDataIndex)
			.getBigEndian();
	}

	// -- Entity retrieval (code generated definitions) --

	/** Gets the UUID associated with this collection of metadata. */
	@Override
	public String getUUID() {
		return root.getUUID();
	}

	//
	// AnnotationRef property storage
	//
	// Indexes: {u'ROI': [u'int ROIIndex', u'int annotationRefIndex'], u'Reagent':
	// [u'int screenIndex', u'int reagentIndex', u'int annotationRefIndex'],
	// u'Plate': [u'int plateIndex', u'int annotationRefIndex'],
	// u'ExperimenterGroup': [u'int experimenterGroupIndex', u'int
	// annotationRefIndex'], u'Image': [u'int imageIndex', u'int
	// annotationRefIndex'], u'Well': [u'int plateIndex', u'int wellIndex', u'int
	// annotationRefIndex'], u'Pixels': [u'int imageIndex', u'int
	// annotationRefIndex'], u'Dataset': [u'int datasetIndex', u'int
	// annotationRefIndex'], u'Project': [u'int projectIndex', u'int
	// annotationRefIndex'], u'PlateAcquisition': [u'int plateIndex', u'int
	// plateAcquisitionIndex', u'int annotationRefIndex'], u'Plane': [u'int
	// imageIndex', u'int planeIndex', u'int annotationRefIndex'],
	// u'Experimenter': [u'int experimenterIndex', u'int annotationRefIndex'],
	// u'Annotation': [u'int annotationRefIndex'], u'WellSample': [u'int
	// plateIndex', u'int wellIndex', u'int wellSampleIndex', u'int
	// annotationRefIndex'], u'Screen': [u'int screenIndex', u'int
	// annotationRefIndex'], u'Channel': [u'int imageIndex', u'int channelIndex',
	// u'int annotationRefIndex']}
	// {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate': {u'OME': None}},
	// u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME': None}, u'Image':
	// {u'OME': None}, u'Screen': {u'OME': None}, u'Well': {u'Plate': {u'OME':
	// None}}, u'Dataset': {u'OME': None}, u'Project': {u'OME': None}, u'Reagent':
	// {u'Screen': {u'OME': None}}, u'Plane': {u'Pixels': {u'Image': {u'OME':
	// None}}}, u'Experimenter': {u'OME': None}, u'Annotation': None,
	// u'WellSample': {u'Well': {u'Plate': {u'OME': None}}}, u'Pixels': {u'Image':
	// {u'OME': None}}, u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference AnnotationRef

	//
	// Arc property storage
	//
	// Indexes: {u'LightSource': [u'int instrumentIndex', u'int
	// lightSourceIndex']}
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public String getArcID(final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getID();
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public String getArcLotNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getLotNumber();
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public String getArcManufacturer(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getManufacturer();
	}

	// Model accessor from parent LightSource
	@Override
	public String getArcModel(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getModel();
	}

	// Power accessor from parent LightSource
	@Override
	public Double getArcPower(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getPower();
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public String getArcSerialNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getSerialNumber();
	}

	@Override
	public ArcType getArcType(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Arc o =
			(Arc) root.getInstrument(instrumentIndex)
				.getLightSource(lightSourceIndex);
		return o.getType();
	}

	//
	// BinaryFile property storage
	//
	// Indexes: {u'FileAnnotation': [u'int fileAnnotationIndex']}
	// {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
	// Is multi path? False

	// Ignoring BinData element, complex property
	// Ignoring External element, complex property
	@Override
	public String getBinaryFileFileName(final int fileAnnotationIndex) {
		// Parents: {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
		// FileName is not a reference
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getBinaryFile().getFileName();
	}

	@Override
	public String getBinaryFileMIMEType(final int fileAnnotationIndex) {
		// Parents: {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
		// MIMEType is not a reference
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getBinaryFile().getMIMEType();
	}

	@Override
	public NonNegativeLong getBinaryFileSize(final int fileAnnotationIndex) {
		// Parents: {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
		// Size is not a reference
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getBinaryFile().getSize();
	}

	//
	// BinaryOnly property storage
	//
	// Indexes: {u'OME': []}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getBinaryOnlyMetadataFile(final int metadataFileIndex) {
		// Parents: {u'OME': None}
		// MetadataFile is not a reference
		return root.getBinaryOnly().getMetadataFile();
	}

	@Override
	public String getBinaryOnlyUUID(final int UUIDIndex) {
		// Parents: {u'OME': None}
		// UUID is not a reference
		return root.getBinaryOnly().getUUID();
	}

	//
	// BooleanAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int booleanAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getBooleanAnnotationAnnotationRef(
		final int booleanAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String
		getBooleanAnnotationDescription(final int booleanAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getBooleanAnnotationID(final int booleanAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getBooleanAnnotationNamespace(final int booleanAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public Boolean getBooleanAnnotationValue(final int booleanAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex).getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Channel property storage
	//
	// Indexes: {u'Pixels': [u'int imageIndex', u'int channelIndex']}
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	@Override
	public AcquisitionMode getChannelAcquisitionMode(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// AcquisitionMode is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getAcquisitionMode();
	}

	@Override
	public String getChannelAnnotationRef(final int imageIndex,
		final int channelIndex, final int annotationRefIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// AnnotationRef is reference and occurs more than once
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public Color getChannelColor(final int imageIndex, final int channelIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Color is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getColor();
	}

	@Override
	public ContrastMethod getChannelContrastMethod(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ContrastMethod is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getContrastMethod();
	}

	// Ignoring DetectorSettings element, complex property
	@Override
	public PositiveInteger getChannelEmissionWavelength(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// EmissionWavelength is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getEmissionWavelength();
	}

	@Override
	public PositiveInteger getChannelExcitationWavelength(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ExcitationWavelength is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getExcitationWavelength();
	}

	@Override
	public String getChannelFilterSetRef(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FilterSetRef is reference and occurs only once
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLinkedFilterSet().getID();
	}

	@Override
	public String getChannelFluor(final int imageIndex, final int channelIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Fluor is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getFluor();
	}

	@Override
	public String getChannelID(final int imageIndex, final int channelIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ID is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getID();
	}

	@Override
	public IlluminationType getChannelIlluminationType(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// IlluminationType is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getIlluminationType();
	}

	// Ignoring LightPath element, complex property
	// Ignoring LightSourceSettings element, complex property
	@Override
	public Double
		getChannelNDFilter(final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// NDFilter is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getNDFilter();
	}

	@Override
	public String getChannelName(final int imageIndex, final int channelIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Name is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getName();
	}

	@Override
	public Double getChannelPinholeSize(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PinholeSize is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getPinholeSize();
	}

	// Ignoring Pixels_BackReference back reference
	@Override
	public Integer getChannelPockelCellSetting(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PockelCellSetting is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getPockelCellSetting();
	}

	@Override
	public PositiveInteger getChannelSamplesPerPixel(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// SamplesPerPixel is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getSamplesPerPixel();
	}

	//
	// CommentAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int commentAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getCommentAnnotationAnnotationRef(
		final int commentAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String
		getCommentAnnotationDescription(final int commentAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getCommentAnnotationID(final int commentAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getCommentAnnotationNamespace(final int commentAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public String getCommentAnnotationValue(final int commentAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex).getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Dataset property storage
	//
	// Indexes: {u'OME': [u'int datasetIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getDatasetAnnotationRef(final int datasetIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getDataset(datasetIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public String getDatasetDescription(final int datasetIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getDataset(datasetIndex).getDescription();
	}

	@Override
	public String getDatasetExperimenterGroupRef(final int datasetIndex) {
		// Parents: {u'OME': None}
		// ExperimenterGroupRef is reference and occurs only once
		return root.getDataset(datasetIndex).getLinkedExperimenterGroup().getID();
	}

	@Override
	public String getDatasetExperimenterRef(final int datasetIndex) {
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs only once
		return root.getDataset(datasetIndex).getLinkedExperimenter().getID();
	}

	@Override
	public String getDatasetID(final int datasetIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getDataset(datasetIndex).getID();
	}

	@Override
	public String getDatasetImageRef(final int datasetIndex,
		final int imageRefIndex)
	{
		// Parents: {u'OME': None}
		// ImageRef is reference and occurs more than once
		return root.getDataset(datasetIndex).getLinkedImage(imageRefIndex).getID();
	}

	@Override
	public String getDatasetName(final int datasetIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getDataset(datasetIndex).getName();
	}

	// Ignoring Project_BackReference back reference
	//
	// DatasetRef property storage
	//
	// Indexes: {u'Project': [u'int projectIndex', u'int datasetRefIndex']}
	// {u'Project': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference DatasetRef

	//
	// Detector property storage
	//
	// Indexes: {u'Instrument': [u'int instrumentIndex', u'int detectorIndex']}
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	@Override
	public Double getDetectorAmplificationGain(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// AmplificationGain is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getAmplificationGain();
	}

	@Override
	public Double getDetectorGain(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Gain is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getGain();
	}

	@Override
	public String
		getDetectorID(final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getID();
	}

	// Ignoring Instrument_BackReference back reference
	@Override
	public String getDetectorLotNumber(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getLotNumber();
	}

	@Override
	public String getDetectorManufacturer(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getManufacturer();
	}

	@Override
	public String getDetectorModel(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getModel();
	}

	@Override
	public Double getDetectorOffset(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Offset is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getOffset();
	}

	@Override
	public String getDetectorSerialNumber(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getSerialNumber();
	}

	@Override
	public DetectorType getDetectorType(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Type is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getType();
	}

	@Override
	public Double getDetectorVoltage(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Voltage is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getVoltage();
	}

	@Override
	public Double getDetectorZoom(final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Zoom is not a reference
		return root.getInstrument(instrumentIndex).getDetector(detectorIndex)
			.getZoom();
	}

	//
	// DetectorSettings property storage
	//
	// Indexes: {u'Channel': [u'int imageIndex', u'int channelIndex']}
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	@Override
	public Binning getDetectorSettingsBinning(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Binning is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getDetectorSettings().getBinning();
	}

	// Ignoring DetectorRef back reference
	@Override
	public Double getDetectorSettingsGain(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Gain is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getDetectorSettings().getGain();
	}

	@Override
	public String getDetectorSettingsID(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// ID is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getDetectorSettings().getID();
	}

	@Override
	public Double getDetectorSettingsOffset(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Offset is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getDetectorSettings().getOffset();
	}

	@Override
	public Double getDetectorSettingsReadOutRate(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// ReadOutRate is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getDetectorSettings().getReadOutRate();
	}

	@Override
	public Double getDetectorSettingsVoltage(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Voltage is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getDetectorSettings().getVoltage();
	}

	//
	// Dichroic property storage
	//
	// Indexes: {u'Instrument': [u'int instrumentIndex', u'int dichroicIndex']}
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	// Ignoring FilterSet_BackReference back reference
	@Override
	public String
		getDichroicID(final int instrumentIndex, final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		return root.getInstrument(instrumentIndex).getDichroic(dichroicIndex)
			.getID();
	}

	// Ignoring Instrument_BackReference back reference
	// Ignoring LightPath_BackReference back reference
	@Override
	public String getDichroicLotNumber(final int instrumentIndex,
		final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		return root.getInstrument(instrumentIndex).getDichroic(dichroicIndex)
			.getLotNumber();
	}

	@Override
	public String getDichroicManufacturer(final int instrumentIndex,
		final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		return root.getInstrument(instrumentIndex).getDichroic(dichroicIndex)
			.getManufacturer();
	}

	@Override
	public String getDichroicModel(final int instrumentIndex,
		final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		return root.getInstrument(instrumentIndex).getDichroic(dichroicIndex)
			.getModel();
	}

	@Override
	public String getDichroicSerialNumber(final int instrumentIndex,
		final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		return root.getInstrument(instrumentIndex).getDichroic(dichroicIndex)
			.getSerialNumber();
	}

	//
	// DichroicRef property storage
	//
	// Indexes: {u'LightPath': [u'int imageIndex', u'int channelIndex'],
	// u'FilterSet': [u'int instrumentIndex', u'int filterSetIndex']}
	// {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}},
	// u'FilterSet': {u'Instrument': {u'OME': None}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference DichroicRef

	//
	// DoubleAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int doubleAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getDoubleAnnotationAnnotationRef(
		final int doubleAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getDoubleAnnotationDescription(final int doubleAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getDoubleAnnotationID(final int doubleAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getDoubleAnnotationNamespace(final int doubleAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public Double getDoubleAnnotationValue(final int doubleAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex).getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Ellipse property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getEllipseFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getEllipseFillRule(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily getEllipseFontFamily(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getEllipseFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle
		getEllipseFontStyle(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getEllipseID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getEllipseLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getEllipseLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getEllipseStrokeColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String getEllipseStrokeDashArray(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double getEllipseStrokeWidth(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getEllipseText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger getEllipseTheC(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger getEllipseTheT(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger getEllipseTheZ(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getEllipseTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getEllipseVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public Double getEllipseRadiusX(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getRadiusX();
	}

	@Override
	public Double getEllipseRadiusY(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getRadiusY();
	}

	@Override
	public Double getEllipseX(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX();
	}

	@Override
	public Double getEllipseY(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Ellipse o =
			(Ellipse) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY();
	}

	//
	// EmissionFilterRef property storage
	//
	// Indexes: {u'LightPath': [u'int imageIndex', u'int channelIndex', u'int
	// emissionFilterRefIndex'], u'FilterSet': [u'int instrumentIndex', u'int
	// filterSetIndex', u'int emissionFilterRefIndex']}
	// {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}},
	// u'FilterSet': {u'Instrument': {u'OME': None}}}
	// Is multi path? True

	//
	// ExcitationFilterRef property storage
	//
	// Indexes: {u'LightPath': [u'int imageIndex', u'int channelIndex', u'int
	// excitationFilterRefIndex'], u'FilterSet': [u'int instrumentIndex', u'int
	// filterSetIndex', u'int excitationFilterRefIndex']}
	// {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}},
	// u'FilterSet': {u'Instrument': {u'OME': None}}}
	// Is multi path? True

	//
	// Experiment property storage
	//
	// Indexes: {u'OME': [u'int experimentIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getExperimentDescription(final int experimentIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getExperiment(experimentIndex).getDescription();
	}

	@Override
	public String getExperimentExperimenterRef(final int experimentIndex) {
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs only once
		return root.getExperiment(experimentIndex).getLinkedExperimenter().getID();
	}

	@Override
	public String getExperimentID(final int experimentIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getExperiment(experimentIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	// Ignoring MicrobeamManipulation element, complex property
	@Override
	public ExperimentType getExperimentType(final int experimentIndex) {
		// Parents: {u'OME': None}
		// Type is not a reference
		return root.getExperiment(experimentIndex).getType();
	}

	//
	// ExperimentRef property storage
	//
	// Indexes: {u'Image': [u'int imageIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference ExperimentRef

	//
	// Experimenter property storage
	//
	// Indexes: {u'OME': [u'int experimenterIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getExperimenterAnnotationRef(final int experimenterIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getExperimenter(experimenterIndex).getLinkedAnnotation(
			annotationRefIndex).getID();
	}

	// Ignoring Dataset_BackReference back reference
	@Override
	public String getExperimenterEmail(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// Email is not a reference
		return root.getExperimenter(experimenterIndex).getEmail();
	}

	// Ignoring Experiment_BackReference back reference
	// Ignoring ExperimenterGroup_BackReference back reference
	@Override
	public String getExperimenterFirstName(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// FirstName is not a reference
		return root.getExperimenter(experimenterIndex).getFirstName();
	}

	@Override
	public String getExperimenterID(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getExperimenter(experimenterIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getExperimenterInstitution(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// Institution is not a reference
		return root.getExperimenter(experimenterIndex).getInstitution();
	}

	@Override
	public String getExperimenterLastName(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// LastName is not a reference
		return root.getExperimenter(experimenterIndex).getLastName();
	}

	// Ignoring MicrobeamManipulation_BackReference back reference
	@Override
	public String getExperimenterMiddleName(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// MiddleName is not a reference
		return root.getExperimenter(experimenterIndex).getMiddleName();
	}

	// Ignoring Project_BackReference back reference
	@Override
	public String getExperimenterUserName(final int experimenterIndex) {
		// Parents: {u'OME': None}
		// UserName is not a reference
		return root.getExperimenter(experimenterIndex).getUserName();
	}

	//
	// ExperimenterGroup property storage
	//
	// Indexes: {u'OME': [u'int experimenterGroupIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getExperimenterGroupAnnotationRef(
		final int experimenterGroupIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getExperimenterGroup(experimenterGroupIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Dataset_BackReference back reference
	@Override
	public String
		getExperimenterGroupDescription(final int experimenterGroupIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getExperimenterGroup(experimenterGroupIndex).getDescription();
	}

	@Override
	public String getExperimenterGroupExperimenterRef(
		final int experimenterGroupIndex, final int experimenterRefIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs more than once
		return root.getExperimenterGroup(experimenterGroupIndex)
			.getLinkedExperimenter(experimenterRefIndex).getID();
	}

	@Override
	public String getExperimenterGroupID(final int experimenterGroupIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getExperimenterGroup(experimenterGroupIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getExperimenterGroupLeader(final int experimenterGroupIndex,
		final int leaderIndex)
	{
		// Parents: {u'OME': None}
		// Leader is reference and occurs more than once
		return root.getExperimenterGroup(experimenterGroupIndex).getLinkedLeader(
			leaderIndex).getID();
	}

	@Override
	public String getExperimenterGroupName(final int experimenterGroupIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getExperimenterGroup(experimenterGroupIndex).getName();
	}

	// Ignoring Project_BackReference back reference
	//
	// ExperimenterGroupRef property storage
	//
	// Indexes: {u'Project': [u'int projectIndex'], u'Image': [u'int imageIndex'],
	// u'Dataset': [u'int datasetIndex']}
	// {u'Project': {u'OME': None}, u'Image': {u'OME': None}, u'Dataset': {u'OME':
	// None}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ExperimenterGroupRef

	//
	// ExperimenterRef property storage
	//
	// Indexes: {u'ExperimenterGroup': [u'int experimenterGroupIndex', u'int
	// experimenterRefIndex'], u'Image': [u'int imageIndex'], u'Dataset': [u'int
	// datasetIndex'], u'Project': [u'int projectIndex'], u'Experiment': [u'int
	// experimentIndex'], u'MicrobeamManipulation': [u'int experimentIndex', u'int
	// microbeamManipulationIndex']}
	// {u'ExperimenterGroup': {u'OME': None}, u'Image': {u'OME': None},
	// u'Dataset': {u'OME': None}, u'Project': {u'OME': None}, u'Experiment':
	// {u'OME': None}, u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ExperimenterRef

	//
	// Filament property storage
	//
	// Indexes: {u'LightSource': [u'int instrumentIndex', u'int
	// lightSourceIndex']}
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public String getFilamentID(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getID();
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public String getFilamentLotNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getLotNumber();
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public String getFilamentManufacturer(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getManufacturer();
	}

	// Model accessor from parent LightSource
	@Override
	public String getFilamentModel(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getModel();
	}

	// Power accessor from parent LightSource
	@Override
	public Double getFilamentPower(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getPower();
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public String getFilamentSerialNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getSerialNumber();
	}

	@Override
	public FilamentType getFilamentType(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Filament o =
			(Filament) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getType();
	}

	//
	// FileAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int fileAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getFileAnnotationAnnotationRef(final int fileAnnotationIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring BinaryFile element, complex property
	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getFileAnnotationDescription(final int fileAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getFileAnnotationID(final int fileAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getFileAnnotationNamespace(final int fileAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Filter property storage
	//
	// Indexes: {u'Instrument': [u'int instrumentIndex', u'int filterIndex']}
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	// Ignoring FilterSet_BackReference back reference
	// Ignoring FilterSet_BackReference back reference
	@Override
	public String getFilterFilterWheel(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// FilterWheel is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getFilterWheel();
	}

	@Override
	public String getFilterID(final int instrumentIndex, final int filterIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex).getID();
	}

	// Ignoring Instrument_BackReference back reference
	// Ignoring LightPath_BackReference back reference
	// Ignoring LightPath_BackReference back reference
	@Override
	public String getFilterLotNumber(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getLotNumber();
	}

	@Override
	public String getFilterManufacturer(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getManufacturer();
	}

	@Override
	public String
		getFilterModel(final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getModel();
	}

	@Override
	public String getFilterSerialNumber(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getSerialNumber();
	}

	// Ignoring TransmittanceRange element, complex property
	@Override
	public FilterType getFilterType(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Type is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex).getType();
	}

	//
	// FilterSet property storage
	//
	// Indexes: {u'Instrument': [u'int instrumentIndex', u'int filterSetIndex']}
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	// Ignoring Channel_BackReference back reference
	@Override
	public String getFilterSetDichroicRef(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// DichroicRef is reference and occurs only once
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getLinkedDichroic().getID();
	}

	@Override
	public String getFilterSetEmissionFilterRef(final int instrumentIndex,
		final int filterSetIndex, final int emissionFilterRefIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// EmissionFilterRef is reference and occurs more than once
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getLinkedEmissionFilter(emissionFilterRefIndex).getID();
	}

	@Override
	public String getFilterSetExcitationFilterRef(final int instrumentIndex,
		final int filterSetIndex, final int excitationFilterRefIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ExcitationFilterRef is reference and occurs more than once
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getLinkedExcitationFilter(excitationFilterRefIndex).getID();
	}

	@Override
	public String getFilterSetID(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getID();
	}

	// Ignoring Instrument_BackReference back reference
	@Override
	public String getFilterSetLotNumber(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getLotNumber();
	}

	@Override
	public String getFilterSetManufacturer(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getManufacturer();
	}

	@Override
	public String getFilterSetModel(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getModel();
	}

	@Override
	public String getFilterSetSerialNumber(final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		return root.getInstrument(instrumentIndex).getFilterSet(filterSetIndex)
			.getSerialNumber();
	}

	//
	// FilterSetRef property storage
	//
	// Indexes: {u'Channel': [u'int imageIndex', u'int channelIndex']}
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference FilterSetRef

	//
	// Image property storage
	//
	// Indexes: {u'OME': [u'int imageIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public Timestamp getImageAcquisitionDate(final int imageIndex) {
		// Parents: {u'OME': None}
		// AcquisitionDate is not a reference
		return root.getImage(imageIndex).getAcquisitionDate();
	}

	@Override
	public String getImageAnnotationRef(final int imageIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getImage(imageIndex).getLinkedAnnotation(annotationRefIndex)
			.getID();
	}

	// Ignoring Dataset_BackReference back reference
	@Override
	public String getImageDescription(final int imageIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getImage(imageIndex).getDescription();
	}

	@Override
	public String getImageExperimentRef(final int imageIndex) {
		// Parents: {u'OME': None}
		// ExperimentRef is reference and occurs only once
		return root.getImage(imageIndex).getLinkedExperiment().getID();
	}

	@Override
	public String getImageExperimenterGroupRef(final int imageIndex) {
		// Parents: {u'OME': None}
		// ExperimenterGroupRef is reference and occurs only once
		return root.getImage(imageIndex).getLinkedExperimenterGroup().getID();
	}

	@Override
	public String getImageExperimenterRef(final int imageIndex) {
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs only once
		return root.getImage(imageIndex).getLinkedExperimenter().getID();
	}

	@Override
	public String getImageID(final int imageIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getImage(imageIndex).getID();
	}

	// Ignoring ImagingEnvironment element, complex property
	@Override
	public String getImageInstrumentRef(final int imageIndex) {
		// Parents: {u'OME': None}
		// InstrumentRef is reference and occurs only once
		return root.getImage(imageIndex).getLinkedInstrument().getID();
	}

	@Override
	public String getImageMicrobeamManipulationRef(final int imageIndex,
		final int microbeamManipulationRefIndex)
	{
		// Parents: {u'OME': None}
		// MicrobeamManipulationRef is reference and occurs more than once
		return root.getImage(imageIndex).getLinkedMicrobeamManipulation(
			microbeamManipulationRefIndex).getID();
	}

	@Override
	public String getImageName(final int imageIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getImage(imageIndex).getName();
	}

	// Ignoring ObjectiveSettings element, complex property
	// Ignoring Pixels element, complex property
	@Override
	public String getImageROIRef(final int imageIndex, final int ROIRefIndex) {
		// Parents: {u'OME': None}
		// ROIRef is reference and occurs more than once
		return root.getImage(imageIndex).getLinkedROI(ROIRefIndex).getID();
	}

	// Ignoring StageLabel element, complex property
	// Ignoring WellSample_BackReference back reference
	//
	// ImageRef property storage
	//
	// Indexes: {u'WellSample': [u'int plateIndex', u'int wellIndex', u'int
	// wellSampleIndex'], u'Dataset': [u'int datasetIndex', u'int imageRefIndex']}
	// {u'WellSample': {u'Well': {u'Plate': {u'OME': None}}}, u'Dataset': {u'OME':
	// None}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ImageRef

	//
	// ImagingEnvironment property storage
	//
	// Indexes: {u'Image': [u'int imageIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public Double getImagingEnvironmentAirPressure(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// AirPressure is not a reference
		return root.getImage(imageIndex).getImagingEnvironment().getAirPressure();
	}

	@Override
	public PercentFraction getImagingEnvironmentCO2Percent(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// CO2Percent is not a reference
		return root.getImage(imageIndex).getImagingEnvironment().getCO2Percent();
	}

	@Override
	public PercentFraction getImagingEnvironmentHumidity(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Humidity is not a reference
		return root.getImage(imageIndex).getImagingEnvironment().getHumidity();
	}

	@Override
	public Double getImagingEnvironmentTemperature(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Temperature is not a reference
		return root.getImage(imageIndex).getImagingEnvironment().getTemperature();
	}

	//
	// Instrument property storage
	//
	// Indexes: {u'OME': [u'int instrumentIndex']}
	// {u'OME': None}
	// Is multi path? False

	// Ignoring Detector element, complex property
	// Ignoring Dichroic element, complex property
	// Ignoring Filter element, complex property
	// Ignoring FilterSet element, complex property
	@Override
	public String getInstrumentID(final int instrumentIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getInstrument(instrumentIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	// Ignoring LightSource element, complex property
	// Ignoring Microscope element, complex property
	// Ignoring Objective element, complex property
	//
	// InstrumentRef property storage
	//
	// Indexes: {u'Image': [u'int imageIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference InstrumentRef

	//
	// Label property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getLabelFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getLabelFillRule(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily
		getLabelFontFamily(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getLabelFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle getLabelFontStyle(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getLabelID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getLabelLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getLabelLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getLabelStrokeColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String
		getLabelStrokeDashArray(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double getLabelStrokeWidth(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getLabelText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger getLabelTheC(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger getLabelTheT(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger getLabelTheZ(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getLabelTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getLabelVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public Double getLabelX(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX();
	}

	@Override
	public Double getLabelY(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Label o =
			(Label) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY();
	}

	//
	// Laser property storage
	//
	// Indexes: {u'LightSource': [u'int instrumentIndex', u'int
	// lightSourceIndex']}
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public String
		getLaserID(final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getID();
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public String getLaserLotNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getLotNumber();
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public String getLaserManufacturer(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getManufacturer();
	}

	// Model accessor from parent LightSource
	@Override
	public String getLaserModel(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getModel();
	}

	// Power accessor from parent LightSource
	@Override
	public Double getLaserPower(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getPower();
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public String getLaserSerialNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getSerialNumber();
	}

	@Override
	public PositiveInteger getLaserFrequencyMultiplication(
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getFrequencyMultiplication();
	}

	@Override
	public LaserMedium getLaserLaserMedium(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getLaserMedium();
	}

	@Override
	public Boolean getLaserPockelCell(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getPockelCell();
	}

	@Override
	public Pulse getLaserPulse(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getPulse();
	}

	@Override
	public String getLaserPump(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getLinkedPump().getID();
	}

	@Override
	public Double getLaserRepetitionRate(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getRepetitionRate();
	}

	@Override
	public Boolean getLaserTuneable(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getTuneable();
	}

	@Override
	public LaserType getLaserType(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getType();
	}

	@Override
	public PositiveInteger getLaserWavelength(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final Laser o =
			(Laser) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getWavelength();
	}

	//
	// Leader property storage
	//
	// Indexes: {u'ExperimenterGroup': [u'int experimenterGroupIndex', u'int
	// leaderIndex']}
	// {u'ExperimenterGroup': {u'OME': None}}
	// Is multi path? False

	// 0:9999
	// Is multi path? False
	// Ignoring ExperimenterGroup_BackReference property of reference Leader

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference Leader

	//
	// LightEmittingDiode property storage
	//
	// Indexes: {u'LightSource': [u'int instrumentIndex', u'int
	// lightSourceIndex']}
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public String getLightEmittingDiodeID(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final LightEmittingDiode o =
			(LightEmittingDiode) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getID();
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public String getLightEmittingDiodeLotNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final LightEmittingDiode o =
			(LightEmittingDiode) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getLotNumber();
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public String getLightEmittingDiodeManufacturer(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final LightEmittingDiode o =
			(LightEmittingDiode) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getManufacturer();
	}

	// Model accessor from parent LightSource
	@Override
	public String getLightEmittingDiodeModel(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final LightEmittingDiode o =
			(LightEmittingDiode) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getModel();
	}

	// Power accessor from parent LightSource
	@Override
	public Double getLightEmittingDiodePower(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final LightEmittingDiode o =
			(LightEmittingDiode) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getPower();
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public String getLightEmittingDiodeSerialNumber(final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final LightEmittingDiode o =
			(LightEmittingDiode) root.getInstrument(instrumentIndex).getLightSource(
				lightSourceIndex);
		return o.getSerialNumber();
	}

	//
	// LightPath property storage
	//
	// Indexes: {u'Channel': [u'int imageIndex', u'int channelIndex']}
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	@Override
	public String getLightPathDichroicRef(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// DichroicRef is reference and occurs only once
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightPath().getLinkedDichroic().getID();
	}

	@Override
	public String getLightPathEmissionFilterRef(final int imageIndex,
		final int channelIndex, final int emissionFilterRefIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// EmissionFilterRef is reference and occurs more than once
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightPath().getLinkedEmissionFilter(emissionFilterRefIndex).getID();
	}

	@Override
	public String getLightPathExcitationFilterRef(final int imageIndex,
		final int channelIndex, final int excitationFilterRefIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// ExcitationFilterRef is reference and occurs more than once
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightPath().getLinkedExcitationFilter(excitationFilterRefIndex)
			.getID();
	}

	//
	// LightSourceSettings property storage
	//
	// Indexes: {u'Channel': [u'int imageIndex', u'int channelIndex'],
	// u'MicrobeamManipulation': [u'int experimentIndex', u'int
	// microbeamManipulationIndex', u'int lightSourceSettingsIndex']}
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
	// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
	// Is multi path? True

	@Override
	public PercentFraction getChannelLightSourceSettingsAttenuation(
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Attenuation is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightSourceSettings().getAttenuation();
	}

	@Override
	public PercentFraction
		getMicrobeamManipulationLightSourceSettingsAttenuation(
			final int experimentIndex, final int microbeamManipulationIndex,
			final int lightSourceSettingsIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Attenuation is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getLightSourceSettings(
			lightSourceSettingsIndex).getAttenuation();
	}

	@Override
	public String getChannelLightSourceSettingsID(final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// ID is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightSourceSettings().getID();
	}

	@Override
	public String getMicrobeamManipulationLightSourceSettingsID(
		final int experimentIndex, final int microbeamManipulationIndex,
		final int lightSourceSettingsIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// ID is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getLightSourceSettings(
			lightSourceSettingsIndex).getID();
	}

	// Ignoring LightSourceRef back reference
	// Ignoring MicrobeamManipulation_BackReference back reference
	@Override
	public PositiveInteger getChannelLightSourceSettingsWavelength(
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Wavelength is not a reference
		return root.getImage(imageIndex).getPixels().getChannel(channelIndex)
			.getLightSourceSettings().getWavelength();
	}

	@Override
	public PositiveInteger getMicrobeamManipulationLightSourceSettingsWavelength(
		final int experimentIndex, final int microbeamManipulationIndex,
		final int lightSourceSettingsIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Wavelength is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getLightSourceSettings(
			lightSourceSettingsIndex).getWavelength();
	}

	//
	// Line property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getLineFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getLineFillRule(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily getLineFontFamily(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getLineFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle getLineFontStyle(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getLineID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getLineLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getLineLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getLineStrokeColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String
		getLineStrokeDashArray(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double getLineStrokeWidth(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getLineText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger
		getLineTheC(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger
		getLineTheT(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger
		getLineTheZ(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getLineTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getLineVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public Marker getLineMarkerEnd(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getMarkerEnd();
	}

	@Override
	public Marker getLineMarkerStart(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getMarkerStart();
	}

	@Override
	public Double getLineX1(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX1();
	}

	@Override
	public Double getLineX2(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX2();
	}

	@Override
	public Double getLineY1(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY1();
	}

	@Override
	public Double getLineY2(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Line o = (Line) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY2();
	}

	//
	// ListAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int listAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getListAnnotationAnnotationRef(final int listAnnotationIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getListAnnotation(
			listAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getListAnnotationDescription(final int listAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getListAnnotation(
			listAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getListAnnotationID(final int listAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getListAnnotation(
			listAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getListAnnotationNamespace(final int listAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getListAnnotation(
			listAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// LongAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int longAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getLongAnnotationAnnotationRef(final int longAnnotationIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getLongAnnotationDescription(final int longAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getLongAnnotationID(final int longAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getLongAnnotationNamespace(final int longAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public Long getLongAnnotationValue(final int longAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex).getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Mask property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getMaskFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getMaskFillRule(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily getMaskFontFamily(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getMaskFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle getMaskFontStyle(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getMaskID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getMaskLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getMaskLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getMaskStrokeColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String
		getMaskStrokeDashArray(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double getMaskStrokeWidth(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getMaskText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger
		getMaskTheC(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger
		getMaskTheT(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger
		getMaskTheZ(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getMaskTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getMaskVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	// Ignoring BinData element, complex property
	@Override
	public Double getMaskHeight(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getHeight();
	}

	@Override
	public Double getMaskWidth(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getWidth();
	}

	@Override
	public Double getMaskX(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX();
	}

	@Override
	public Double getMaskY(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Mask o = (Mask) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY();
	}

	//
	// MetadataOnly property storage
	//
	// Indexes: {u'Pixels': [u'int imageIndex']}
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	//
	// MicrobeamManipulation property storage
	//
	// Indexes: {u'Experiment': [u'int experimentIndex', u'int
	// microbeamManipulationIndex']}
	// {u'Experiment': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getMicrobeamManipulationDescription(final int experimentIndex,
		final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// Description is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getDescription();
	}

	// Ignoring Experiment_BackReference back reference
	@Override
	public String getMicrobeamManipulationExperimenterRef(
		final int experimentIndex, final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// ExperimenterRef is reference and occurs only once
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getLinkedExperimenter().getID();
	}

	@Override
	public String getMicrobeamManipulationID(final int experimentIndex,
		final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// ID is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	// Ignoring LightSourceSettings element, complex property
	@Override
	public String getMicrobeamManipulationROIRef(final int experimentIndex,
		final int microbeamManipulationIndex, final int ROIRefIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// ROIRef is reference and occurs more than once
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getLinkedROI(ROIRefIndex).getID();
	}

	@Override
	public MicrobeamManipulationType getMicrobeamManipulationType(
		final int experimentIndex, final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// Type is not a reference
		return root.getExperiment(experimentIndex).getMicrobeamManipulation(
			microbeamManipulationIndex).getType();
	}

	//
	// MicrobeamManipulationRef property storage
	//
	// Indexes: {u'Image': [u'int imageIndex', u'int
	// microbeamManipulationRefIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference MicrobeamManipulationRef

	//
	// Microscope property storage
	//
	// Indexes: {u'Instrument': [u'int instrumentIndex']}
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getMicroscopeLotNumber(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		return root.getInstrument(instrumentIndex).getMicroscope().getLotNumber();
	}

	@Override
	public String getMicroscopeManufacturer(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		return root.getInstrument(instrumentIndex).getMicroscope()
			.getManufacturer();
	}

	@Override
	public String getMicroscopeModel(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		return root.getInstrument(instrumentIndex).getMicroscope().getModel();
	}

	@Override
	public String getMicroscopeSerialNumber(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		return root.getInstrument(instrumentIndex).getMicroscope()
			.getSerialNumber();
	}

	@Override
	public MicroscopeType getMicroscopeType(final int instrumentIndex) {
		// Parents: {u'Instrument': {u'OME': None}}
		// Type is not a reference
		return root.getInstrument(instrumentIndex).getMicroscope().getType();
	}

	//
	// Objective property storage
	//
	// Indexes: {u'Instrument': [u'int instrumentIndex', u'int objectiveIndex']}
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	@Override
	public Double getObjectiveCalibratedMagnification(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// CalibratedMagnification is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getCalibratedMagnification();
	}

	@Override
	public Correction getObjectiveCorrection(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Correction is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getCorrection();
	}

	@Override
	public String getObjectiveID(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getID();
	}

	@Override
	public Immersion getObjectiveImmersion(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Immersion is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getImmersion();
	}

	// Ignoring Instrument_BackReference back reference
	@Override
	public Boolean getObjectiveIris(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Iris is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getIris();
	}

	@Override
	public Double getObjectiveLensNA(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LensNA is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getLensNA();
	}

	@Override
	public String getObjectiveLotNumber(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getLotNumber();
	}

	@Override
	public String getObjectiveManufacturer(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getManufacturer();
	}

	@Override
	public String getObjectiveModel(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getModel();
	}

	@Override
	public PositiveInteger getObjectiveNominalMagnification(
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// NominalMagnification is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getNominalMagnification();
	}

	@Override
	public String getObjectiveSerialNumber(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getSerialNumber();
	}

	@Override
	public Double getObjectiveWorkingDistance(final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// WorkingDistance is not a reference
		return root.getInstrument(instrumentIndex).getObjective(objectiveIndex)
			.getWorkingDistance();
	}

	//
	// ObjectiveSettings property storage
	//
	// Indexes: {u'Image': [u'int imageIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public Double getObjectiveSettingsCorrectionCollar(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// CorrectionCollar is not a reference
		return root.getImage(imageIndex).getObjectiveSettings()
			.getCorrectionCollar();
	}

	@Override
	public String getObjectiveSettingsID(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// ID is not a reference
		return root.getImage(imageIndex).getObjectiveSettings().getID();
	}

	@Override
	public Medium getObjectiveSettingsMedium(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Medium is not a reference
		return root.getImage(imageIndex).getObjectiveSettings().getMedium();
	}

	// Ignoring ObjectiveRef back reference
	@Override
	public Double getObjectiveSettingsRefractiveIndex(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// RefractiveIndex is not a reference
		return root.getImage(imageIndex).getObjectiveSettings()
			.getRefractiveIndex();
	}

	//
	// Pixels property storage
	//
	// Indexes: {u'Image': [u'int imageIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getPixelsAnnotationRef(final int imageIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getImage(imageIndex).getPixels().getLinkedAnnotation(
			annotationRefIndex).getID();
	}

	// Ignoring BinData element, complex property
	// Ignoring Channel element, complex property
	@Override
	public DimensionOrder getPixelsDimensionOrder(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// DimensionOrder is not a reference
		return root.getImage(imageIndex).getPixels().getDimensionOrder();
	}

	@Override
	public String getPixelsID(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// ID is not a reference
		return root.getImage(imageIndex).getPixels().getID();
	}

	// Ignoring MetadataOnly element, complex property
	@Override
	public PositiveFloat getPixelsPhysicalSizeX(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// PhysicalSizeX is not a reference
		return root.getImage(imageIndex).getPixels().getPhysicalSizeX();
	}

	@Override
	public PositiveFloat getPixelsPhysicalSizeY(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// PhysicalSizeY is not a reference
		return root.getImage(imageIndex).getPixels().getPhysicalSizeY();
	}

	@Override
	public PositiveFloat getPixelsPhysicalSizeZ(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// PhysicalSizeZ is not a reference
		return root.getImage(imageIndex).getPixels().getPhysicalSizeZ();
	}

	// Ignoring Plane element, complex property
	@Override
	public PositiveInteger getPixelsSizeC(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// SizeC is not a reference
		return root.getImage(imageIndex).getPixels().getSizeC();
	}

	@Override
	public PositiveInteger getPixelsSizeT(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// SizeT is not a reference
		return root.getImage(imageIndex).getPixels().getSizeT();
	}

	@Override
	public PositiveInteger getPixelsSizeX(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// SizeX is not a reference
		return root.getImage(imageIndex).getPixels().getSizeX();
	}

	@Override
	public PositiveInteger getPixelsSizeY(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// SizeY is not a reference
		return root.getImage(imageIndex).getPixels().getSizeY();
	}

	@Override
	public PositiveInteger getPixelsSizeZ(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// SizeZ is not a reference
		return root.getImage(imageIndex).getPixels().getSizeZ();
	}

	// Ignoring TiffData element, complex property
	@Override
	public Double getPixelsTimeIncrement(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// TimeIncrement is not a reference
		return root.getImage(imageIndex).getPixels().getTimeIncrement();
	}

	@Override
	public PixelType getPixelsType(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Type is not a reference
		return root.getImage(imageIndex).getPixels().getType();
	}

	//
	// Plane property storage
	//
	// Indexes: {u'Pixels': [u'int imageIndex', u'int planeIndex']}
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	@Override
	public String getPlaneAnnotationRef(final int imageIndex,
		final int planeIndex, final int annotationRefIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// AnnotationRef is reference and occurs more than once
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public Double getPlaneDeltaT(final int imageIndex, final int planeIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// DeltaT is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getDeltaT();
	}

	@Override
	public Double
		getPlaneExposureTime(final int imageIndex, final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ExposureTime is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getExposureTime();
	}

	@Override
	public String getPlaneHashSHA1(final int imageIndex, final int planeIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// HashSHA1 is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getHashSHA1();
	}

	// Ignoring Pixels_BackReference back reference
	@Override
	public Double getPlanePositionX(final int imageIndex, final int planeIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PositionX is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getPositionX();
	}

	@Override
	public Double getPlanePositionY(final int imageIndex, final int planeIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PositionY is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getPositionY();
	}

	@Override
	public Double getPlanePositionZ(final int imageIndex, final int planeIndex) {
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PositionZ is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex)
			.getPositionZ();
	}

	@Override
	public NonNegativeInteger getPlaneTheC(final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TheC is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex).getTheC();
	}

	@Override
	public NonNegativeInteger getPlaneTheT(final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TheT is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex).getTheT();
	}

	@Override
	public NonNegativeInteger getPlaneTheZ(final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TheZ is not a reference
		return root.getImage(imageIndex).getPixels().getPlane(planeIndex).getTheZ();
	}

	//
	// Plate property storage
	//
	// Indexes: {u'OME': [u'int plateIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getPlateAnnotationRef(final int plateIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getPlate(plateIndex).getLinkedAnnotation(annotationRefIndex)
			.getID();
	}

	@Override
	public NamingConvention getPlateColumnNamingConvention(final int plateIndex) {
		// Parents: {u'OME': None}
		// ColumnNamingConvention is not a reference
		return root.getPlate(plateIndex).getColumnNamingConvention();
	}

	@Override
	public PositiveInteger getPlateColumns(final int plateIndex) {
		// Parents: {u'OME': None}
		// Columns is not a reference
		return root.getPlate(plateIndex).getColumns();
	}

	@Override
	public String getPlateDescription(final int plateIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getPlate(plateIndex).getDescription();
	}

	@Override
	public String getPlateExternalIdentifier(final int plateIndex) {
		// Parents: {u'OME': None}
		// ExternalIdentifier is not a reference
		return root.getPlate(plateIndex).getExternalIdentifier();
	}

	@Override
	public NonNegativeInteger getPlateFieldIndex(final int plateIndex) {
		// Parents: {u'OME': None}
		// FieldIndex is not a reference
		return root.getPlate(plateIndex).getFieldIndex();
	}

	@Override
	public String getPlateID(final int plateIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getPlate(plateIndex).getID();
	}

	@Override
	public String getPlateName(final int plateIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getPlate(plateIndex).getName();
	}

	// Ignoring PlateAcquisition element, complex property
	@Override
	public NamingConvention getPlateRowNamingConvention(final int plateIndex) {
		// Parents: {u'OME': None}
		// RowNamingConvention is not a reference
		return root.getPlate(plateIndex).getRowNamingConvention();
	}

	@Override
	public PositiveInteger getPlateRows(final int plateIndex) {
		// Parents: {u'OME': None}
		// Rows is not a reference
		return root.getPlate(plateIndex).getRows();
	}

	// Ignoring Screen_BackReference back reference
	@Override
	public String getPlateStatus(final int plateIndex) {
		// Parents: {u'OME': None}
		// Status is not a reference
		return root.getPlate(plateIndex).getStatus();
	}

	// Ignoring Well element, complex property
	@Override
	public Double getPlateWellOriginX(final int plateIndex) {
		// Parents: {u'OME': None}
		// WellOriginX is not a reference
		return root.getPlate(plateIndex).getWellOriginX();
	}

	@Override
	public Double getPlateWellOriginY(final int plateIndex) {
		// Parents: {u'OME': None}
		// WellOriginY is not a reference
		return root.getPlate(plateIndex).getWellOriginY();
	}

	//
	// PlateAcquisition property storage
	//
	// Indexes: {u'Plate': [u'int plateIndex', u'int plateAcquisitionIndex']}
	// {u'Plate': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getPlateAcquisitionAnnotationRef(final int plateIndex,
		final int plateAcquisitionIndex, final int annotationRefIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public String getPlateAcquisitionDescription(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Description is not a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getDescription();
	}

	@Override
	public Timestamp getPlateAcquisitionEndTime(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// EndTime is not a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getEndTime();
	}

	@Override
	public String getPlateAcquisitionID(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ID is not a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getID();
	}

	@Override
	public PositiveInteger getPlateAcquisitionMaximumFieldCount(
		final int plateIndex, final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// MaximumFieldCount is not a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getMaximumFieldCount();
	}

	@Override
	public String getPlateAcquisitionName(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Name is not a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getName();
	}

	// Ignoring Plate_BackReference back reference
	@Override
	public Timestamp getPlateAcquisitionStartTime(final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// StartTime is not a reference
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getStartTime();
	}

	@Override
	public String getPlateAcquisitionWellSampleRef(final int plateIndex,
		final int plateAcquisitionIndex, final int wellSampleRefIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// WellSampleRef is reference and occurs more than once
		return root.getPlate(plateIndex).getPlateAcquisition(plateAcquisitionIndex)
			.getLinkedWellSample(wellSampleRefIndex).getID();
	}

	//
	// PlateRef property storage
	//
	// Indexes: {u'Screen': [u'int screenIndex', u'int plateRefIndex']}
	// {u'Screen': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference PlateRef

	//
	// Point property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getPointFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getPointFillRule(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily
		getPointFontFamily(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getPointFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle getPointFontStyle(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getPointID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getPointLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getPointLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getPointStrokeColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String
		getPointStrokeDashArray(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double getPointStrokeWidth(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getPointText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger getPointTheC(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger getPointTheT(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger getPointTheZ(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getPointTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getPointVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public Double getPointX(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX();
	}

	@Override
	public Double getPointY(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Point o =
			(Point) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY();
	}

	//
	// Polygon property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getPolygonFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getPolygonFillRule(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily getPolygonFontFamily(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getPolygonFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle
		getPolygonFontStyle(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getPolygonID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getPolygonLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getPolygonLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getPolygonStrokeColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String getPolygonStrokeDashArray(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double getPolygonStrokeWidth(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getPolygonText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger getPolygonTheC(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger getPolygonTheT(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger getPolygonTheZ(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getPolygonTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getPolygonVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public String getPolygonPoints(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polygon o =
			(Polygon) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getPoints();
	}

	//
	// Polyline property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getPolylineFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule getPolylineFillRule(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily getPolylineFontFamily(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getPolylineFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle
		getPolylineFontStyle(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getPolylineID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getPolylineLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getPolylineLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color getPolylineStrokeColor(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String getPolylineStrokeDashArray(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double
		getPolylineStrokeWidth(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getPolylineText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger getPolylineTheC(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger getPolylineTheT(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger getPolylineTheZ(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getPolylineTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getPolylineVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public Marker getPolylineMarkerEnd(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getMarkerEnd();
	}

	@Override
	public Marker
		getPolylineMarkerStart(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getMarkerStart();
	}

	@Override
	public String getPolylinePoints(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Polyline o =
			(Polyline) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getPoints();
	}

	//
	// Project property storage
	//
	// Indexes: {u'OME': [u'int projectIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getProjectAnnotationRef(final int projectIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getProject(projectIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public String getProjectDatasetRef(final int projectIndex,
		final int datasetRefIndex)
	{
		// Parents: {u'OME': None}
		// DatasetRef is reference and occurs more than once
		return root.getProject(projectIndex).getLinkedDataset(datasetRefIndex)
			.getID();
	}

	@Override
	public String getProjectDescription(final int projectIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getProject(projectIndex).getDescription();
	}

	@Override
	public String getProjectExperimenterGroupRef(final int projectIndex) {
		// Parents: {u'OME': None}
		// ExperimenterGroupRef is reference and occurs only once
		return root.getProject(projectIndex).getLinkedExperimenterGroup().getID();
	}

	@Override
	public String getProjectExperimenterRef(final int projectIndex) {
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs only once
		return root.getProject(projectIndex).getLinkedExperimenter().getID();
	}

	@Override
	public String getProjectID(final int projectIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getProject(projectIndex).getID();
	}

	@Override
	public String getProjectName(final int projectIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getProject(projectIndex).getName();
	}

	//
	// Pump property storage
	//
	// Indexes: {u'Laser': [u'int instrumentIndex', u'int lightSourceIndex']}
	// {u'Laser': {u'LightSource': {u'Instrument': {u'OME': None}}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference Pump

	// 0:9999
	// Is multi path? False
	// Ignoring Laser_BackReference property of reference Pump

	//
	// ROI property storage
	//
	// Indexes: {u'OME': [u'int ROIIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getROIAnnotationRef(final int ROIIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getROI(ROIIndex).getLinkedAnnotation(annotationRefIndex)
			.getID();
	}

	@Override
	public String getROIDescription(final int ROIIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getROI(ROIIndex).getDescription();
	}

	@Override
	public String getROIID(final int ROIIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getROI(ROIIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	// Ignoring MicrobeamManipulation_BackReference back reference
	@Override
	public String getROIName(final int ROIIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getROI(ROIIndex).getName();
	}

	@Override
	public String getROINamespace(final int ROIIndex) {
		// Parents: {u'OME': None}
		// Namespace is not a reference
		return root.getROI(ROIIndex).getNamespace();
	}

	// Ignoring Union element, complex property
	//
	// ROIRef property storage
	//
	// Indexes: {u'Image': [u'int imageIndex', u'int ROIRefIndex'],
	// u'MicrobeamManipulation': [u'int experimentIndex', u'int
	// microbeamManipulationIndex', u'int ROIRefIndex']}
	// {u'Image': {u'OME': None}, u'MicrobeamManipulation': {u'Experiment':
	// {u'OME': None}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ROIRef

	//
	// Reagent property storage
	//
	// Indexes: {u'Screen': [u'int screenIndex', u'int reagentIndex']}
	// {u'Screen': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getReagentAnnotationRef(final int screenIndex,
		final int reagentIndex, final int annotationRefIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getScreen(screenIndex).getReagent(reagentIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public String getReagentDescription(final int screenIndex,
		final int reagentIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// Description is not a reference
		return root.getScreen(screenIndex).getReagent(reagentIndex)
			.getDescription();
	}

	@Override
	public String getReagentID(final int screenIndex, final int reagentIndex) {
		// Parents: {u'Screen': {u'OME': None}}
		// ID is not a reference
		return root.getScreen(screenIndex).getReagent(reagentIndex).getID();
	}

	@Override
	public String getReagentName(final int screenIndex, final int reagentIndex) {
		// Parents: {u'Screen': {u'OME': None}}
		// Name is not a reference
		return root.getScreen(screenIndex).getReagent(reagentIndex).getName();
	}

	@Override
	public String getReagentReagentIdentifier(final int screenIndex,
		final int reagentIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// ReagentIdentifier is not a reference
		return root.getScreen(screenIndex).getReagent(reagentIndex)
			.getReagentIdentifier();
	}

	// Ignoring Screen_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// ReagentRef property storage
	//
	// Indexes: {u'Well': [u'int plateIndex', u'int wellIndex']}
	// {u'Well': {u'Plate': {u'OME': None}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference ReagentRef

	//
	// Rectangle property storage
	//
	// Indexes: {u'Shape': [u'int ROIIndex', u'int shapeIndex']}
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public Color getRectangleFillColor(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillColor();
	}

	// FillRule accessor from parent Shape
	@Override
	public FillRule
		getRectangleFillRule(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFillRule();
	}

	// FontFamily accessor from parent Shape
	@Override
	public FontFamily getRectangleFontFamily(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontFamily();
	}

	// FontSize accessor from parent Shape
	@Override
	public NonNegativeInteger getRectangleFontSize(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontSize();
	}

	// FontStyle accessor from parent Shape
	@Override
	public FontStyle getRectangleFontStyle(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getFontStyle();
	}

	// ID accessor from parent Shape
	@Override
	public String getRectangleID(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getID();
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public LineCap getRectangleLineCap(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLineCap();
	}

	// Locked accessor from parent Shape
	@Override
	public Boolean getRectangleLocked(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getLocked();
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public Color
		getRectangleStrokeColor(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeColor();
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public String getRectangleStrokeDashArray(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeDashArray();
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public Double
		getRectangleStrokeWidth(final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getStrokeWidth();
	}

	// Text accessor from parent Shape
	@Override
	public String getRectangleText(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getText();
	}

	// TheC accessor from parent Shape
	@Override
	public NonNegativeInteger getRectangleTheC(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheC();
	}

	// TheT accessor from parent Shape
	@Override
	public NonNegativeInteger getRectangleTheT(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheT();
	}

	// TheZ accessor from parent Shape
	@Override
	public NonNegativeInteger getRectangleTheZ(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTheZ();
	}

	// Transform accessor from parent Shape
	@Override
	public AffineTransform getRectangleTransform(final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getTransform();
	}

	// Visible accessor from parent Shape
	@Override
	public Boolean getRectangleVisible(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getVisible();
	}

	@Override
	public Double getRectangleHeight(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getHeight();
	}

	@Override
	public Double getRectangleWidth(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getWidth();
	}

	@Override
	public Double getRectangleX(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getX();
	}

	@Override
	public Double getRectangleY(final int ROIIndex, final int shapeIndex) {
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final Rectangle o =
			(Rectangle) root.getROI(ROIIndex).getUnion().getShape(shapeIndex);
		return o.getY();
	}

	//
	// Screen property storage
	//
	// Indexes: {u'OME': [u'int screenIndex']}
	// {u'OME': None}
	// Is multi path? False

	@Override
	public String getScreenAnnotationRef(final int screenIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		return root.getScreen(screenIndex).getLinkedAnnotation(annotationRefIndex)
			.getID();
	}

	@Override
	public String getScreenDescription(final int screenIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		return root.getScreen(screenIndex).getDescription();
	}

	@Override
	public String getScreenID(final int screenIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		return root.getScreen(screenIndex).getID();
	}

	@Override
	public String getScreenName(final int screenIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		return root.getScreen(screenIndex).getName();
	}

	@Override
	public String
		getScreenPlateRef(final int screenIndex, final int plateRefIndex)
	{
		// Parents: {u'OME': None}
		// PlateRef is reference and occurs more than once
		return root.getScreen(screenIndex).getLinkedPlate(plateRefIndex).getID();
	}

	@Override
	public String getScreenProtocolDescription(final int screenIndex) {
		// Parents: {u'OME': None}
		// ProtocolDescription is not a reference
		return root.getScreen(screenIndex).getProtocolDescription();
	}

	@Override
	public String getScreenProtocolIdentifier(final int screenIndex) {
		// Parents: {u'OME': None}
		// ProtocolIdentifier is not a reference
		return root.getScreen(screenIndex).getProtocolIdentifier();
	}

	// Ignoring Reagent element, complex property
	@Override
	public String getScreenReagentSetDescription(final int screenIndex) {
		// Parents: {u'OME': None}
		// ReagentSetDescription is not a reference
		return root.getScreen(screenIndex).getReagentSetDescription();
	}

	@Override
	public String getScreenReagentSetIdentifier(final int screenIndex) {
		// Parents: {u'OME': None}
		// ReagentSetIdentifier is not a reference
		return root.getScreen(screenIndex).getReagentSetIdentifier();
	}

	@Override
	public String getScreenType(final int screenIndex) {
		// Parents: {u'OME': None}
		// Type is not a reference
		return root.getScreen(screenIndex).getType();
	}

	//
	// StageLabel property storage
	//
	// Indexes: {u'Image': [u'int imageIndex']}
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getStageLabelName(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Name is not a reference
		return root.getImage(imageIndex).getStageLabel().getName();
	}

	@Override
	public Double getStageLabelX(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// X is not a reference
		return root.getImage(imageIndex).getStageLabel().getX();
	}

	@Override
	public Double getStageLabelY(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Y is not a reference
		return root.getImage(imageIndex).getStageLabel().getY();
	}

	@Override
	public Double getStageLabelZ(final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Z is not a reference
		return root.getImage(imageIndex).getStageLabel().getZ();
	}

	//
	// StructuredAnnotations property storage
	//
	// Indexes: {u'OME': []}
	// {u'OME': None}
	// Is multi path? False

	// Ignoring BooleanAnnotation element, complex property
	// Ignoring CommentAnnotation element, complex property
	// Ignoring DoubleAnnotation element, complex property
	// Ignoring FileAnnotation element, complex property
	// Ignoring ListAnnotation element, complex property
	// Ignoring LongAnnotation element, complex property
	// Ignoring TagAnnotation element, complex property
	// Ignoring TermAnnotation element, complex property
	// Ignoring TimestampAnnotation element, complex property
	// Ignoring XMLAnnotation element, complex property
	//
	// TagAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int tagAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getTagAnnotationAnnotationRef(final int tagAnnotationIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getTagAnnotation(tagAnnotationIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getTagAnnotationDescription(final int tagAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getTagAnnotation(tagAnnotationIndex)
			.getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getTagAnnotationID(final int tagAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getTagAnnotation(tagAnnotationIndex)
			.getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getTagAnnotationNamespace(final int tagAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getTagAnnotation(tagAnnotationIndex)
			.getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public String getTagAnnotationValue(final int tagAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getTagAnnotation(tagAnnotationIndex)
			.getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// TermAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int termAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getTermAnnotationAnnotationRef(final int termAnnotationIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getTermAnnotationDescription(final int termAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getTermAnnotationID(final int termAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getTermAnnotationNamespace(final int termAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public String getTermAnnotationValue(final int termAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex).getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// TiffData property storage
	//
	// Indexes: {u'Pixels': [u'int imageIndex', u'int tiffDataIndex']}
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	@Override
	public NonNegativeInteger getTiffDataFirstC(final int imageIndex,
		final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FirstC is not a reference
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getFirstC();
	}

	@Override
	public NonNegativeInteger getTiffDataFirstT(final int imageIndex,
		final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FirstT is not a reference
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getFirstT();
	}

	@Override
	public NonNegativeInteger getTiffDataFirstZ(final int imageIndex,
		final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FirstZ is not a reference
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getFirstZ();
	}

	@Override
	public NonNegativeInteger getTiffDataIFD(final int imageIndex,
		final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// IFD is not a reference
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getIFD();
	}

	// Ignoring Pixels_BackReference back reference
	@Override
	public NonNegativeInteger getTiffDataPlaneCount(final int imageIndex,
		final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PlaneCount is not a reference
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getPlaneCount();
	}

	// Ignoring UUID element, complex property
	//
	// TimestampAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int timestampAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getTimestampAnnotationAnnotationRef(
		final int timestampAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getTimestampAnnotationDescription(
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex).getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getTimestampAnnotationID(final int timestampAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex).getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getTimestampAnnotationNamespace(
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex).getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public Timestamp getTimestampAnnotationValue(
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex).getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// TransmittanceRange property storage
	//
	// Indexes: {u'Filter': [u'int instrumentIndex', u'int filterIndex']}
	// {u'Filter': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	@Override
	public PositiveInteger getTransmittanceRangeCutIn(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutIn is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getTransmittanceRange().getCutIn();
	}

	@Override
	public NonNegativeInteger getTransmittanceRangeCutInTolerance(
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutInTolerance is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getTransmittanceRange().getCutInTolerance();
	}

	@Override
	public PositiveInteger getTransmittanceRangeCutOut(final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutOut is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getTransmittanceRange().getCutOut();
	}

	@Override
	public NonNegativeInteger getTransmittanceRangeCutOutTolerance(
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutOutTolerance is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getTransmittanceRange().getCutOutTolerance();
	}

	@Override
	public PercentFraction getTransmittanceRangeTransmittance(
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// Transmittance is not a reference
		return root.getInstrument(instrumentIndex).getFilter(filterIndex)
			.getTransmittanceRange().getTransmittance();
	}

	//
	// UUID property storage
	//
	// Indexes: {u'TiffData': [u'int imageIndex', u'int tiffDataIndex']}
	// {u'TiffData': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	@Override
	public String getUUIDFileName(final int imageIndex, final int tiffDataIndex) {
		// Parents: {u'TiffData': {u'Pixels': {u'Image': {u'OME': None}}}}
		// FileName is not a reference
		return root.getImage(imageIndex).getPixels().getTiffData(tiffDataIndex)
			.getUUID().getFileName();
	}

	//
	// Union property storage
	//
	// Indexes: {u'ROI': [u'int ROIIndex']}
	// {u'ROI': {u'OME': None}}
	// Is multi path? False

	// Ignoring Shape element, complex property
	//
	// Well property storage
	//
	// Indexes: {u'Plate': [u'int plateIndex', u'int wellIndex']}
	// {u'Plate': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getWellAnnotationRef(final int plateIndex, final int wellIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getPlate(plateIndex).getWell(wellIndex).getLinkedAnnotation(
			annotationRefIndex).getID();
	}

	@Override
	public Color getWellColor(final int plateIndex, final int wellIndex) {
		// Parents: {u'Plate': {u'OME': None}}
		// Color is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getColor();
	}

	@Override
	public NonNegativeInteger getWellColumn(final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Column is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getColumn();
	}

	@Override
	public String getWellExternalDescription(final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ExternalDescription is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex)
			.getExternalDescription();
	}

	@Override
	public String getWellExternalIdentifier(final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ExternalIdentifier is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getExternalIdentifier();
	}

	@Override
	public String getWellID(final int plateIndex, final int wellIndex) {
		// Parents: {u'Plate': {u'OME': None}}
		// ID is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getID();
	}

	// Ignoring Plate_BackReference back reference
	@Override
	public String getWellReagentRef(final int plateIndex, final int wellIndex) {
		// Parents: {u'Plate': {u'OME': None}}
		// ReagentRef is reference and occurs only once
		return root.getPlate(plateIndex).getWell(wellIndex).getLinkedReagent()
			.getID();
	}

	@Override
	public NonNegativeInteger
		getWellRow(final int plateIndex, final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Row is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getRow();
	}

	@Override
	public String getWellType(final int plateIndex, final int wellIndex) {
		// Parents: {u'Plate': {u'OME': None}}
		// Type is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getType();
	}

	// Ignoring WellSample element, complex property
	//
	// WellSample property storage
	//
	// Indexes: {u'Well': [u'int plateIndex', u'int wellIndex', u'int
	// wellSampleIndex']}
	// {u'Well': {u'Plate': {u'OME': None}}}
	// Is multi path? False

	@Override
	public String
		getWellSampleAnnotationRef(final int plateIndex, final int wellIndex,
			final int wellSampleIndex, final int annotationRefIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// AnnotationRef is reference and occurs more than once
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getLinkedAnnotation(annotationRefIndex).getID();
	}

	@Override
	public String getWellSampleID(final int plateIndex, final int wellIndex,
		final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// ID is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getID();
	}

	@Override
	public String getWellSampleImageRef(final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// ImageRef is reference and occurs only once
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getLinkedImage().getID();
	}

	@Override
	public NonNegativeInteger getWellSampleIndex(final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// Index is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getIndex();
	}

	// Ignoring PlateAcquisition_BackReference back reference
	@Override
	public Double getWellSamplePositionX(final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// PositionX is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getPositionX();
	}

	@Override
	public Double getWellSamplePositionY(final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// PositionY is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getPositionY();
	}

	@Override
	public Timestamp getWellSampleTimepoint(final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// Timepoint is not a reference
		return root.getPlate(plateIndex).getWell(wellIndex).getWellSample(
			wellSampleIndex).getTimepoint();
	}

	// Ignoring Well_BackReference back reference
	//
	// WellSampleRef property storage
	//
	// Indexes: {u'PlateAcquisition': [u'int plateIndex', u'int
	// plateAcquisitionIndex', u'int wellSampleRefIndex']}
	// {u'PlateAcquisition': {u'Plate': {u'OME': None}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference WellSampleRef

	//
	// XMLAnnotation property storage
	//
	// Indexes: {u'StructuredAnnotations': [u'int XMLAnnotationIndex']}
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public String getXMLAnnotationAnnotationRef(final int XMLAnnotationIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		return root.getStructuredAnnotations().getXMLAnnotation(XMLAnnotationIndex)
			.getLinkedAnnotation(annotationRefIndex).getID();
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public String getXMLAnnotationDescription(final int XMLAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		return root.getStructuredAnnotations().getXMLAnnotation(XMLAnnotationIndex)
			.getDescription();
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public String getXMLAnnotationID(final int XMLAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		return root.getStructuredAnnotations().getXMLAnnotation(XMLAnnotationIndex)
			.getID();
	}

	// Ignoring Image_BackReference back reference
	@Override
	public String getXMLAnnotationNamespace(final int XMLAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		return root.getStructuredAnnotations().getXMLAnnotation(XMLAnnotationIndex)
			.getNamespace();
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public String getXMLAnnotationValue(final int XMLAnnotationIndex) {
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		return root.getStructuredAnnotations().getXMLAnnotation(XMLAnnotationIndex)
			.getValue();
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference

	// -- Entity storage (manual definitions) --

	@Override
	public void setPixelsBinDataBigEndian(final Boolean bigEndian,
		final int imageIndex, final int binDataIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfBinDataList() == binDataIndex) {
			o2.addBinData(new BinData());
		}
		final BinData o3 = o2.getBinData(binDataIndex);
		o3.setBigEndian(bigEndian);
	}

	@Override
	public void setMaskBinData(final byte[] binData, final int ROIIndex,
		final int shapeIndex)
	{
		// TODO: To implement
	}

	// -- Entity storage (code generated definitions) --

	/** Sets the UUID associated with this collection of metadata. */
	@Override
	public void setUUID(final String uuid) {
		root.setUUID(uuid);
	}

	//
	// AnnotationRef property storage
	//
	// {u'ROI': {u'OME': None}, u'PlateAcquisition': {u'Plate': {u'OME': None}},
	// u'Plate': {u'OME': None}, u'ExperimenterGroup': {u'OME': None}, u'Image':
	// {u'OME': None}, u'Screen': {u'OME': None}, u'Well': {u'Plate': {u'OME':
	// None}}, u'Dataset': {u'OME': None}, u'Project': {u'OME': None}, u'Reagent':
	// {u'Screen': {u'OME': None}}, u'Plane': {u'Pixels': {u'Image': {u'OME':
	// None}}}, u'Experimenter': {u'OME': None}, u'Annotation': None,
	// u'WellSample': {u'Well': {u'Plate': {u'OME': None}}}, u'Pixels': {u'Image':
	// {u'OME': None}}, u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference AnnotationRef

	//
	// Arc property storage
	//
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public void setArcID(final String id, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		model.addModelObject(id, o2);
		((Arc) o2).setID(id);
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public void setArcLotNumber(final String lotNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Arc) o2).setLotNumber(lotNumber);
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public void setArcManufacturer(final String manufacturer,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Arc) o2).setManufacturer(manufacturer);
	}

	// Model accessor from parent LightSource
	@Override
	public void setArcModel(final String model, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Arc) o2).setModel(model);
	}

	// Power accessor from parent LightSource
	@Override
	public void setArcPower(final Double power, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Arc) o2).setPower(power);
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public void setArcSerialNumber(final String serialNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Arc) o2).setSerialNumber(serialNumber);
	}

	@Override
	public void setArcType(final ArcType type, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Arc());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Arc) o2).setType(type);
	}

	//
	// BinaryFile property storage
	//
	// {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
	// Is multi path? False

	// Ignoring BinData element, complex property
	// Ignoring External element, complex property
	@Override
	public void setBinaryFileFileName(final String fileName,
		final int fileAnnotationIndex)
	{
		// Parents: {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
		// FileName is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfFileAnnotationList() == fileAnnotationIndex) {
			o1.addFileAnnotation(new FileAnnotation());
		}
		final FileAnnotation o2 = o1.getFileAnnotation(fileAnnotationIndex);
		if (o2.getBinaryFile() == null) {
			o2.setBinaryFile(new BinaryFile());
		}
		final BinaryFile o3 = o2.getBinaryFile();
		o3.setFileName(fileName);
	}

	@Override
	public void setBinaryFileMIMEType(final String mimeType,
		final int fileAnnotationIndex)
	{
		// Parents: {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
		// MIMEType is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfFileAnnotationList() == fileAnnotationIndex) {
			o1.addFileAnnotation(new FileAnnotation());
		}
		final FileAnnotation o2 = o1.getFileAnnotation(fileAnnotationIndex);
		if (o2.getBinaryFile() == null) {
			o2.setBinaryFile(new BinaryFile());
		}
		final BinaryFile o3 = o2.getBinaryFile();
		o3.setMIMEType(mimeType);
	}

	@Override
	public void setBinaryFileSize(final NonNegativeLong size,
		final int fileAnnotationIndex)
	{
		// Parents: {u'FileAnnotation': {u'StructuredAnnotations': {u'OME': None}}}
		// Size is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfFileAnnotationList() == fileAnnotationIndex) {
			o1.addFileAnnotation(new FileAnnotation());
		}
		final FileAnnotation o2 = o1.getFileAnnotation(fileAnnotationIndex);
		if (o2.getBinaryFile() == null) {
			o2.setBinaryFile(new BinaryFile());
		}
		final BinaryFile o3 = o2.getBinaryFile();
		o3.setSize(size);
	}

	//
	// BinaryOnly property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setBinaryOnlyMetadataFile(final String metadataFile) {
		// Parents: {u'OME': None}
		// MetadataFile is not a reference
		final OME o0 = root;
		if (o0.getBinaryOnly() == null) {
			o0.setBinaryOnly(new BinaryOnly());
		}
		final BinaryOnly o1 = o0.getBinaryOnly();
		o1.setMetadataFile(metadataFile);
	}

	@Override
	public void setBinaryOnlyUUID(final String uuid) {
		// Parents: {u'OME': None}
		// UUID is not a reference
		final OME o0 = root;
		if (o0.getBinaryOnly() == null) {
			o0.setBinaryOnly(new BinaryOnly());
		}
		final BinaryOnly o1 = o0.getBinaryOnly();
		o1.setUUID(uuid);
	}

	//
	// BooleanAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setBooleanAnnotationAnnotationRef(final String annotation,
		final int booleanAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getBooleanAnnotation(
			booleanAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setBooleanAnnotationDescription(final String description,
		final int booleanAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfBooleanAnnotationList() == booleanAnnotationIndex) {
			o1.addBooleanAnnotation(new BooleanAnnotation());
		}
		final BooleanAnnotation o2 =
			o1.getBooleanAnnotation(booleanAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void setBooleanAnnotationID(final String id,
		final int booleanAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfBooleanAnnotationList() == booleanAnnotationIndex) {
			o1.addBooleanAnnotation(new BooleanAnnotation());
		}
		final BooleanAnnotation o2 =
			o1.getBooleanAnnotation(booleanAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setBooleanAnnotationNamespace(final String namespace,
		final int booleanAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfBooleanAnnotationList() == booleanAnnotationIndex) {
			o1.addBooleanAnnotation(new BooleanAnnotation());
		}
		final BooleanAnnotation o2 =
			o1.getBooleanAnnotation(booleanAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setBooleanAnnotationValue(final Boolean value,
		final int booleanAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfBooleanAnnotationList() == booleanAnnotationIndex) {
			o1.addBooleanAnnotation(new BooleanAnnotation());
		}
		final BooleanAnnotation o2 =
			o1.getBooleanAnnotation(booleanAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Channel property storage
	//
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	@Override
	public void setChannelAcquisitionMode(final AcquisitionMode acquisitionMode,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// AcquisitionMode is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setAcquisitionMode(acquisitionMode);
	}

	@Override
	public void setChannelAnnotationRef(final String annotation,
		final int imageIndex, final int channelIndex, final int annotationRefIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getImage(imageIndex).getPixels().getChannel(
			channelIndex), annotationLinks_reference);
	}

	@Override
	public void setChannelColor(final Color color, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Color is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setColor(color);
	}

	@Override
	public void setChannelContrastMethod(final ContrastMethod contrastMethod,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ContrastMethod is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setContrastMethod(contrastMethod);
	}

	// Ignoring DetectorSettings element, complex property
	@Override
	public void setChannelEmissionWavelength(
		final PositiveInteger emissionWavelength, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// EmissionWavelength is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setEmissionWavelength(emissionWavelength);
	}

	@Override
	public void setChannelExcitationWavelength(
		final PositiveInteger excitationWavelength, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ExcitationWavelength is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setExcitationWavelength(excitationWavelength);
	}

	@Override
	public void setChannelFilterSetRef(final String filterSet,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FilterSetRef is reference and occurs more than once
		final FilterSetRef filterSet_reference = new FilterSetRef();
		filterSet_reference.setID(filterSet);
		model.addReference(root.getImage(imageIndex).getPixels().getChannel(
			channelIndex), filterSet_reference);
	}

	@Override
	public void setChannelFluor(final String fluor, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Fluor is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setFluor(fluor);
	}

	@Override
	public void setChannelID(final String id, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		model.addModelObject(id, o3);
		o3.setID(id);
		// Custom content from Channel ID template
		if (o3.getLightPath() == null) {
			o3.setLightPath(new LightPath());
		}
	}

	@Override
	public void setChannelIlluminationType(
		final IlluminationType illuminationType, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// IlluminationType is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setIlluminationType(illuminationType);
	}

	// Ignoring LightPath element, complex property
	// Ignoring LightSourceSettings element, complex property
	@Override
	public void setChannelNDFilter(final Double ndFilter, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// NDFilter is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setNDFilter(ndFilter);
	}

	@Override
	public void setChannelName(final String name, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setName(name);
	}

	@Override
	public void setChannelPinholeSize(final Double pinholeSize,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PinholeSize is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setPinholeSize(pinholeSize);
	}

	// Ignoring Pixels_BackReference back reference
	@Override
	public void setChannelPockelCellSetting(final Integer pockelCellSetting,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PockelCellSetting is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setPockelCellSetting(pockelCellSetting);
	}

	@Override
	public void setChannelSamplesPerPixel(final PositiveInteger samplesPerPixel,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// SamplesPerPixel is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		o3.setSamplesPerPixel(samplesPerPixel);
	}

	//
	// CommentAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setCommentAnnotationAnnotationRef(final String annotation,
		final int commentAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getCommentAnnotation(
			commentAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setCommentAnnotationDescription(final String description,
		final int commentAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfCommentAnnotationList() == commentAnnotationIndex) {
			o1.addCommentAnnotation(new CommentAnnotation());
		}
		final CommentAnnotation o2 =
			o1.getCommentAnnotation(commentAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void setCommentAnnotationID(final String id,
		final int commentAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfCommentAnnotationList() == commentAnnotationIndex) {
			o1.addCommentAnnotation(new CommentAnnotation());
		}
		final CommentAnnotation o2 =
			o1.getCommentAnnotation(commentAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setCommentAnnotationNamespace(final String namespace,
		final int commentAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfCommentAnnotationList() == commentAnnotationIndex) {
			o1.addCommentAnnotation(new CommentAnnotation());
		}
		final CommentAnnotation o2 =
			o1.getCommentAnnotation(commentAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setCommentAnnotationValue(final String value,
		final int commentAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfCommentAnnotationList() == commentAnnotationIndex) {
			o1.addCommentAnnotation(new CommentAnnotation());
		}
		final CommentAnnotation o2 =
			o1.getCommentAnnotation(commentAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Dataset property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setDatasetAnnotationRef(final String annotation,
		final int datasetIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model
			.addReference(root.getDataset(datasetIndex), annotationLinks_reference);
	}

	@Override
	public void setDatasetDescription(final String description,
		final int datasetIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfDatasetList() == datasetIndex) {
			o0.addDataset(new Dataset());
		}
		final Dataset o1 = o0.getDataset(datasetIndex);
		o1.setDescription(description);
	}

	@Override
	public void setDatasetExperimenterGroupRef(final String experimenterGroup,
		final int datasetIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterGroupRef is reference and occurs more than once
		final ExperimenterGroupRef experimenterGroup_reference =
			new ExperimenterGroupRef();
		experimenterGroup_reference.setID(experimenterGroup);
		model.addReference(root.getDataset(datasetIndex),
			experimenterGroup_reference);
	}

	@Override
	public void setDatasetExperimenterRef(final String experimenter,
		final int datasetIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs more than once
		final ExperimenterRef experimenter_reference = new ExperimenterRef();
		experimenter_reference.setID(experimenter);
		model.addReference(root.getDataset(datasetIndex), experimenter_reference);
	}

	@Override
	public void setDatasetID(final String id, final int datasetIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfDatasetList() == datasetIndex) {
			o0.addDataset(new Dataset());
		}
		final Dataset o1 = o0.getDataset(datasetIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	@Override
	public void setDatasetImageRef(final String image, final int datasetIndex,
		final int imageRefIndex)
	{
		// Parents: {u'OME': None}
		// ImageRef is reference and occurs more than once
		final ImageRef imageLinks_reference = new ImageRef();
		imageLinks_reference.setID(image);
		model.addReference(root.getDataset(datasetIndex), imageLinks_reference);
	}

	@Override
	public void setDatasetName(final String name, final int datasetIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfDatasetList() == datasetIndex) {
			o0.addDataset(new Dataset());
		}
		final Dataset o1 = o0.getDataset(datasetIndex);
		o1.setName(name);
	}

	// Ignoring Project_BackReference back reference
	//
	// DatasetRef property storage
	//
	// {u'Project': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference DatasetRef

	//
	// Detector property storage
	//
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setDetectorAmplificationGain(final Double amplificationGain,
		final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// AmplificationGain is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setAmplificationGain(amplificationGain);
	}

	@Override
	public void setDetectorGain(final Double gain, final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Gain is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setGain(gain);
	}

	@Override
	public void setDetectorID(final String id, final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Instrument_BackReference back reference
	@Override
	public void setDetectorLotNumber(final String lotNumber,
		final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setLotNumber(lotNumber);
	}

	@Override
	public void setDetectorManufacturer(final String manufacturer,
		final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setManufacturer(manufacturer);
	}

	@Override
	public void setDetectorModel(final String model, final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setModel(model);
	}

	@Override
	public void setDetectorOffset(final Double offset, final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Offset is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setOffset(offset);
	}

	@Override
	public void setDetectorSerialNumber(final String serialNumber,
		final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setSerialNumber(serialNumber);
	}

	@Override
	public void setDetectorType(final DetectorType type,
		final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setType(type);
	}

	@Override
	public void setDetectorVoltage(final Double voltage,
		final int instrumentIndex, final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Voltage is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setVoltage(voltage);
	}

	@Override
	public void setDetectorZoom(final Double zoom, final int instrumentIndex,
		final int detectorIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Zoom is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDetectorList() == detectorIndex) {
			o1.addDetector(new Detector());
		}
		final Detector o2 = o1.getDetector(detectorIndex);
		o2.setZoom(zoom);
	}

	//
	// DetectorSettings property storage
	//
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	@Override
	public void setDetectorSettingsBinning(final Binning binning,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Binning is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getDetectorSettings() == null) {
			o3.setDetectorSettings(new DetectorSettings());
		}
		final DetectorSettings o4 = o3.getDetectorSettings();
		o4.setBinning(binning);
	}

	// Ignoring DetectorRef back reference
	@Override
	public void setDetectorSettingsGain(final Double gain, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Gain is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getDetectorSettings() == null) {
			o3.setDetectorSettings(new DetectorSettings());
		}
		final DetectorSettings o4 = o3.getDetectorSettings();
		o4.setGain(gain);
	}

	@Override
	public void setDetectorSettingsID(final String id, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getDetectorSettings() == null) {
			o3.setDetectorSettings(new DetectorSettings());
		}
		final DetectorSettings o4 = o3.getDetectorSettings();
		model.addModelObject(id, o4);
		o4.setID(id);
	}

	@Override
	public void setDetectorSettingsOffset(final Double offset,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Offset is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getDetectorSettings() == null) {
			o3.setDetectorSettings(new DetectorSettings());
		}
		final DetectorSettings o4 = o3.getDetectorSettings();
		o4.setOffset(offset);
	}

	@Override
	public void setDetectorSettingsReadOutRate(final Double readOutRate,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// ReadOutRate is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getDetectorSettings() == null) {
			o3.setDetectorSettings(new DetectorSettings());
		}
		final DetectorSettings o4 = o3.getDetectorSettings();
		o4.setReadOutRate(readOutRate);
	}

	@Override
	public void setDetectorSettingsVoltage(final Double voltage,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// Voltage is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getDetectorSettings() == null) {
			o3.setDetectorSettings(new DetectorSettings());
		}
		final DetectorSettings o4 = o3.getDetectorSettings();
		o4.setVoltage(voltage);
	}

	//
	// Dichroic property storage
	//
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	// Ignoring FilterSet_BackReference back reference
	@Override
	public void setDichroicID(final String id, final int instrumentIndex,
		final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDichroicList() == dichroicIndex) {
			o1.addDichroic(new Dichroic());
		}
		final Dichroic o2 = o1.getDichroic(dichroicIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Instrument_BackReference back reference
	// Ignoring LightPath_BackReference back reference
	@Override
	public void setDichroicLotNumber(final String lotNumber,
		final int instrumentIndex, final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDichroicList() == dichroicIndex) {
			o1.addDichroic(new Dichroic());
		}
		final Dichroic o2 = o1.getDichroic(dichroicIndex);
		o2.setLotNumber(lotNumber);
	}

	@Override
	public void setDichroicManufacturer(final String manufacturer,
		final int instrumentIndex, final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDichroicList() == dichroicIndex) {
			o1.addDichroic(new Dichroic());
		}
		final Dichroic o2 = o1.getDichroic(dichroicIndex);
		o2.setManufacturer(manufacturer);
	}

	@Override
	public void setDichroicModel(final String model, final int instrumentIndex,
		final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDichroicList() == dichroicIndex) {
			o1.addDichroic(new Dichroic());
		}
		final Dichroic o2 = o1.getDichroic(dichroicIndex);
		o2.setModel(model);
	}

	@Override
	public void setDichroicSerialNumber(final String serialNumber,
		final int instrumentIndex, final int dichroicIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfDichroicList() == dichroicIndex) {
			o1.addDichroic(new Dichroic());
		}
		final Dichroic o2 = o1.getDichroic(dichroicIndex);
		o2.setSerialNumber(serialNumber);
	}

	//
	// DichroicRef property storage
	//
	// {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}},
	// u'FilterSet': {u'Instrument': {u'OME': None}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference DichroicRef

	//
	// DoubleAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setDoubleAnnotationAnnotationRef(final String annotation,
		final int doubleAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getDoubleAnnotation(
			doubleAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setDoubleAnnotationDescription(final String description,
		final int doubleAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfDoubleAnnotationList() == doubleAnnotationIndex) {
			o1.addDoubleAnnotation(new DoubleAnnotation());
		}
		final DoubleAnnotation o2 = o1.getDoubleAnnotation(doubleAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void setDoubleAnnotationID(final String id,
		final int doubleAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfDoubleAnnotationList() == doubleAnnotationIndex) {
			o1.addDoubleAnnotation(new DoubleAnnotation());
		}
		final DoubleAnnotation o2 = o1.getDoubleAnnotation(doubleAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setDoubleAnnotationNamespace(final String namespace,
		final int doubleAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfDoubleAnnotationList() == doubleAnnotationIndex) {
			o1.addDoubleAnnotation(new DoubleAnnotation());
		}
		final DoubleAnnotation o2 = o1.getDoubleAnnotation(doubleAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setDoubleAnnotationValue(final Double value,
		final int doubleAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfDoubleAnnotationList() == doubleAnnotationIndex) {
			o1.addDoubleAnnotation(new DoubleAnnotation());
		}
		final DoubleAnnotation o2 = o1.getDoubleAnnotation(doubleAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Ellipse property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setEllipseFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setEllipseFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setEllipseFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setEllipseFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setEllipseFontStyle(final FontStyle fontStyle,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setEllipseID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Ellipse) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setEllipseLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setEllipseLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setEllipseStrokeColor(final Color strokeColor,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setEllipseStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setEllipseStrokeWidth(final Double strokeWidth,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setEllipseText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setEllipseTheC(final NonNegativeInteger theC, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setEllipseTheT(final NonNegativeInteger theT, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setEllipseTheZ(final NonNegativeInteger theZ, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setEllipseTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setEllipseVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setVisible(visible);
	}

	@Override
	public void setEllipseRadiusX(final Double radiusX, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setRadiusX(radiusX);
	}

	@Override
	public void setEllipseRadiusY(final Double radiusY, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setRadiusY(radiusY);
	}

	@Override
	public void setEllipseX(final Double x, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setX(x);
	}

	@Override
	public void setEllipseY(final Double y, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Ellipse());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Ellipse) o3).setY(y);
	}

	//
	// EmissionFilterRef property storage
	//
	// {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}},
	// u'FilterSet': {u'Instrument': {u'OME': None}}}
	// Is multi path? True

	//
	// ExcitationFilterRef property storage
	//
	// {u'LightPath': {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}},
	// u'FilterSet': {u'Instrument': {u'OME': None}}}
	// Is multi path? True

	//
	// Experiment property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setExperimentDescription(final String description,
		final int experimentIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		o1.setDescription(description);
	}

	@Override
	public void setExperimentExperimenterRef(final String experimenter,
		final int experimentIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs more than once
		final ExperimenterRef experimenter_reference = new ExperimenterRef();
		experimenter_reference.setID(experimenter);
		model.addReference(root.getExperiment(experimentIndex),
			experimenter_reference);
	}

	@Override
	public void setExperimentID(final String id, final int experimentIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	// Ignoring Image_BackReference back reference
	// Ignoring MicrobeamManipulation element, complex property
	@Override
	public void setExperimentType(final ExperimentType type,
		final int experimentIndex)
	{
		// Parents: {u'OME': None}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		o1.setType(type);
	}

	//
	// ExperimentRef property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference ExperimentRef

	//
	// Experimenter property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setExperimenterAnnotationRef(final String annotation,
		final int experimenterIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getExperimenter(experimenterIndex),
			annotationLinks_reference);
	}

	// Ignoring Dataset_BackReference back reference
	@Override
	public void setExperimenterEmail(final String email,
		final int experimenterIndex)
	{
		// Parents: {u'OME': None}
		// Email is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		o1.setEmail(email);
	}

	// Ignoring Experiment_BackReference back reference
	// Ignoring ExperimenterGroup_BackReference back reference
	@Override
	public void setExperimenterFirstName(final String firstName,
		final int experimenterIndex)
	{
		// Parents: {u'OME': None}
		// FirstName is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		o1.setFirstName(firstName);
	}

	@Override
	public void setExperimenterID(final String id, final int experimenterIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setExperimenterInstitution(final String institution,
		final int experimenterIndex)
	{
		// Parents: {u'OME': None}
		// Institution is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		o1.setInstitution(institution);
	}

	@Override
	public void setExperimenterLastName(final String lastName,
		final int experimenterIndex)
	{
		// Parents: {u'OME': None}
		// LastName is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		o1.setLastName(lastName);
	}

	// Ignoring MicrobeamManipulation_BackReference back reference
	@Override
	public void setExperimenterMiddleName(final String middleName,
		final int experimenterIndex)
	{
		// Parents: {u'OME': None}
		// MiddleName is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		o1.setMiddleName(middleName);
	}

	// Ignoring Project_BackReference back reference
	@Override
	public void setExperimenterUserName(final String userName,
		final int experimenterIndex)
	{
		// Parents: {u'OME': None}
		// UserName is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterList() == experimenterIndex) {
			o0.addExperimenter(new Experimenter());
		}
		final Experimenter o1 = o0.getExperimenter(experimenterIndex);
		o1.setUserName(userName);
	}

	//
	// ExperimenterGroup property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setExperimenterGroupAnnotationRef(final String annotation,
		final int experimenterGroupIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getExperimenterGroup(experimenterGroupIndex),
			annotationLinks_reference);
	}

	// Ignoring Dataset_BackReference back reference
	@Override
	public void setExperimenterGroupDescription(final String description,
		final int experimenterGroupIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterGroupList() == experimenterGroupIndex) {
			o0.addExperimenterGroup(new ExperimenterGroup());
		}
		final ExperimenterGroup o1 =
			o0.getExperimenterGroup(experimenterGroupIndex);
		o1.setDescription(description);
	}

	@Override
	public void setExperimenterGroupExperimenterRef(final String experimenter,
		final int experimenterGroupIndex, final int experimenterRefIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs more than once
		final ExperimenterRef experimenterLinks_reference = new ExperimenterRef();
		experimenterLinks_reference.setID(experimenter);
		model.addReference(root.getExperimenterGroup(experimenterGroupIndex),
			experimenterLinks_reference);
	}

	@Override
	public void setExperimenterGroupID(final String id,
		final int experimenterGroupIndex)
	{
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterGroupList() == experimenterGroupIndex) {
			o0.addExperimenterGroup(new ExperimenterGroup());
		}
		final ExperimenterGroup o1 =
			o0.getExperimenterGroup(experimenterGroupIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setExperimenterGroupLeader(final String leader,
		final int experimenterGroupIndex, final int leaderIndex)
	{
		// Parents: {u'OME': None}
		// Leader is reference and occurs more than once
		final Leader leaders_reference = new Leader();
		leaders_reference.setID(leader);
		model.addReference(root.getExperimenterGroup(experimenterGroupIndex),
			leaders_reference);
	}

	@Override
	public void setExperimenterGroupName(final String name,
		final int experimenterGroupIndex)
	{
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimenterGroupList() == experimenterGroupIndex) {
			o0.addExperimenterGroup(new ExperimenterGroup());
		}
		final ExperimenterGroup o1 =
			o0.getExperimenterGroup(experimenterGroupIndex);
		o1.setName(name);
	}

	// Ignoring Project_BackReference back reference
	//
	// ExperimenterGroupRef property storage
	//
	// {u'Project': {u'OME': None}, u'Image': {u'OME': None}, u'Dataset': {u'OME':
	// None}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ExperimenterGroupRef

	//
	// ExperimenterRef property storage
	//
	// {u'ExperimenterGroup': {u'OME': None}, u'Image': {u'OME': None},
	// u'Dataset': {u'OME': None}, u'Project': {u'OME': None}, u'Experiment':
	// {u'OME': None}, u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ExperimenterRef

	//
	// Filament property storage
	//
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public void setFilamentID(final String id, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		model.addModelObject(id, o2);
		((Filament) o2).setID(id);
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public void setFilamentLotNumber(final String lotNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Filament) o2).setLotNumber(lotNumber);
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public void setFilamentManufacturer(final String manufacturer,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Filament) o2).setManufacturer(manufacturer);
	}

	// Model accessor from parent LightSource
	@Override
	public void setFilamentModel(final String model, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Filament) o2).setModel(model);
	}

	// Power accessor from parent LightSource
	@Override
	public void setFilamentPower(final Double power, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Filament) o2).setPower(power);
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public void setFilamentSerialNumber(final String serialNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Filament) o2).setSerialNumber(serialNumber);
	}

	@Override
	public void setFilamentType(final FilamentType type,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Filament());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Filament) o2).setType(type);
	}

	//
	// FileAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setFileAnnotationAnnotationRef(final String annotation,
		final int fileAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getFileAnnotation(
			fileAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring BinaryFile element, complex property
	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setFileAnnotationDescription(final String description,
		final int fileAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfFileAnnotationList() == fileAnnotationIndex) {
			o1.addFileAnnotation(new FileAnnotation());
		}
		final FileAnnotation o2 = o1.getFileAnnotation(fileAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void
		setFileAnnotationID(final String id, final int fileAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfFileAnnotationList() == fileAnnotationIndex) {
			o1.addFileAnnotation(new FileAnnotation());
		}
		final FileAnnotation o2 = o1.getFileAnnotation(fileAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setFileAnnotationNamespace(final String namespace,
		final int fileAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfFileAnnotationList() == fileAnnotationIndex) {
			o1.addFileAnnotation(new FileAnnotation());
		}
		final FileAnnotation o2 = o1.getFileAnnotation(fileAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Filter property storage
	//
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	// Ignoring FilterSet_BackReference back reference
	// Ignoring FilterSet_BackReference back reference
	@Override
	public void setFilterFilterWheel(final String filterWheel,
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// FilterWheel is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		o2.setFilterWheel(filterWheel);
	}

	@Override
	public void setFilterID(final String id, final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Instrument_BackReference back reference
	// Ignoring LightPath_BackReference back reference
	// Ignoring LightPath_BackReference back reference
	@Override
	public void setFilterLotNumber(final String lotNumber,
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		o2.setLotNumber(lotNumber);
	}

	@Override
	public void setFilterManufacturer(final String manufacturer,
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		o2.setManufacturer(manufacturer);
	}

	@Override
	public void setFilterModel(final String model, final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		o2.setModel(model);
	}

	@Override
	public void setFilterSerialNumber(final String serialNumber,
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		o2.setSerialNumber(serialNumber);
	}

	// Ignoring TransmittanceRange element, complex property
	@Override
	public void setFilterType(final FilterType type, final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		o2.setType(type);
	}

	//
	// FilterSet property storage
	//
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	// Ignoring Channel_BackReference back reference
	@Override
	public void setFilterSetDichroicRef(final String dichroic,
		final int instrumentIndex, final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// DichroicRef is reference and occurs more than once
		final DichroicRef dichroic_reference = new DichroicRef();
		dichroic_reference.setID(dichroic);
		model.addReference(root.getInstrument(instrumentIndex).getFilterSet(
			filterSetIndex), dichroic_reference);
	}

	@Override
	public void setFilterSetEmissionFilterRef(final String emissionFilter,
		final int instrumentIndex, final int filterSetIndex,
		final int emissionFilterRefIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// EmissionFilterRef is reference and occurs more than once
		final EmissionFilterRef emissionFilterLinks_reference =
			new EmissionFilterRef();
		emissionFilterLinks_reference.setID(emissionFilter);
		model.addReference(root.getInstrument(instrumentIndex).getFilterSet(
			filterSetIndex), emissionFilterLinks_reference);
	}

	@Override
	public void setFilterSetExcitationFilterRef(final String excitationFilter,
		final int instrumentIndex, final int filterSetIndex,
		final int excitationFilterRefIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ExcitationFilterRef is reference and occurs more than once
		final ExcitationFilterRef excitationFilterLinks_reference =
			new ExcitationFilterRef();
		excitationFilterLinks_reference.setID(excitationFilter);
		model.addReference(root.getInstrument(instrumentIndex).getFilterSet(
			filterSetIndex), excitationFilterLinks_reference);
	}

	@Override
	public void setFilterSetID(final String id, final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterSetList() == filterSetIndex) {
			o1.addFilterSet(new FilterSet());
		}
		final FilterSet o2 = o1.getFilterSet(filterSetIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Instrument_BackReference back reference
	@Override
	public void setFilterSetLotNumber(final String lotNumber,
		final int instrumentIndex, final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterSetList() == filterSetIndex) {
			o1.addFilterSet(new FilterSet());
		}
		final FilterSet o2 = o1.getFilterSet(filterSetIndex);
		o2.setLotNumber(lotNumber);
	}

	@Override
	public void setFilterSetManufacturer(final String manufacturer,
		final int instrumentIndex, final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterSetList() == filterSetIndex) {
			o1.addFilterSet(new FilterSet());
		}
		final FilterSet o2 = o1.getFilterSet(filterSetIndex);
		o2.setManufacturer(manufacturer);
	}

	@Override
	public void setFilterSetModel(final String model, final int instrumentIndex,
		final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterSetList() == filterSetIndex) {
			o1.addFilterSet(new FilterSet());
		}
		final FilterSet o2 = o1.getFilterSet(filterSetIndex);
		o2.setModel(model);
	}

	@Override
	public void setFilterSetSerialNumber(final String serialNumber,
		final int instrumentIndex, final int filterSetIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterSetList() == filterSetIndex) {
			o1.addFilterSet(new FilterSet());
		}
		final FilterSet o2 = o1.getFilterSet(filterSetIndex);
		o2.setSerialNumber(serialNumber);
	}

	//
	// FilterSetRef property storage
	//
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference FilterSetRef

	//
	// Image property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setImageAcquisitionDate(final Timestamp acquisitionDate,
		final int imageIndex)
	{
		// Parents: {u'OME': None}
		// AcquisitionDate is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		o1.setAcquisitionDate(acquisitionDate);
	}

	@Override
	public void setImageAnnotationRef(final String annotation,
		final int imageIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getImage(imageIndex), annotationLinks_reference);
	}

	// Ignoring Dataset_BackReference back reference
	@Override
	public void
		setImageDescription(final String description, final int imageIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		o1.setDescription(description);
	}

	@Override
	public void setImageExperimentRef(final String experiment,
		final int imageIndex)
	{
		// Parents: {u'OME': None}
		// ExperimentRef is reference and occurs more than once
		final ExperimentRef experiment_reference = new ExperimentRef();
		experiment_reference.setID(experiment);
		model.addReference(root.getImage(imageIndex), experiment_reference);
	}

	@Override
	public void setImageExperimenterGroupRef(final String experimenterGroup,
		final int imageIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterGroupRef is reference and occurs more than once
		final ExperimenterGroupRef experimenterGroup_reference =
			new ExperimenterGroupRef();
		experimenterGroup_reference.setID(experimenterGroup);
		model.addReference(root.getImage(imageIndex), experimenterGroup_reference);
	}

	@Override
	public void setImageExperimenterRef(final String experimenter,
		final int imageIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs more than once
		final ExperimenterRef experimenter_reference = new ExperimenterRef();
		experimenter_reference.setID(experimenter);
		model.addReference(root.getImage(imageIndex), experimenter_reference);
	}

	@Override
	public void setImageID(final String id, final int imageIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	// Ignoring ImagingEnvironment element, complex property
	@Override
	public void setImageInstrumentRef(final String instrument,
		final int imageIndex)
	{
		// Parents: {u'OME': None}
		// InstrumentRef is reference and occurs more than once
		final InstrumentRef instrument_reference = new InstrumentRef();
		instrument_reference.setID(instrument);
		model.addReference(root.getImage(imageIndex), instrument_reference);
	}

	@Override
	public void setImageMicrobeamManipulationRef(
		final String microbeamManipulation, final int imageIndex,
		final int microbeamManipulationRefIndex)
	{
		// Parents: {u'OME': None}
		// MicrobeamManipulationRef is reference and occurs more than once
		final MicrobeamManipulationRef microbeamManipulationLinks_reference =
			new MicrobeamManipulationRef();
		microbeamManipulationLinks_reference.setID(microbeamManipulation);
		model.addReference(root.getImage(imageIndex),
			microbeamManipulationLinks_reference);
	}

	@Override
	public void setImageName(final String name, final int imageIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		o1.setName(name);
	}

	// Ignoring ObjectiveSettings element, complex property
	// Ignoring Pixels element, complex property
	@Override
	public void setImageROIRef(final String roi, final int imageIndex,
		final int ROIRefIndex)
	{
		// Parents: {u'OME': None}
		// ROIRef is reference and occurs more than once
		final ROIRef roiLinks_reference = new ROIRef();
		roiLinks_reference.setID(roi);
		model.addReference(root.getImage(imageIndex), roiLinks_reference);
	}

	// Ignoring StageLabel element, complex property
	// Ignoring WellSample_BackReference back reference
	//
	// ImageRef property storage
	//
	// {u'WellSample': {u'Well': {u'Plate': {u'OME': None}}}, u'Dataset': {u'OME':
	// None}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ImageRef

	//
	// ImagingEnvironment property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setImagingEnvironmentAirPressure(final Double airPressure,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// AirPressure is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getImagingEnvironment() == null) {
			o1.setImagingEnvironment(new ImagingEnvironment());
		}
		final ImagingEnvironment o2 = o1.getImagingEnvironment();
		o2.setAirPressure(airPressure);
	}

	@Override
	public void setImagingEnvironmentCO2Percent(final PercentFraction co2Percent,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// CO2Percent is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getImagingEnvironment() == null) {
			o1.setImagingEnvironment(new ImagingEnvironment());
		}
		final ImagingEnvironment o2 = o1.getImagingEnvironment();
		o2.setCO2Percent(co2Percent);
	}

	@Override
	public void setImagingEnvironmentHumidity(final PercentFraction humidity,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// Humidity is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getImagingEnvironment() == null) {
			o1.setImagingEnvironment(new ImagingEnvironment());
		}
		final ImagingEnvironment o2 = o1.getImagingEnvironment();
		o2.setHumidity(humidity);
	}

	@Override
	public void setImagingEnvironmentTemperature(final Double temperature,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// Temperature is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getImagingEnvironment() == null) {
			o1.setImagingEnvironment(new ImagingEnvironment());
		}
		final ImagingEnvironment o2 = o1.getImagingEnvironment();
		o2.setTemperature(temperature);
	}

	//
	// Instrument property storage
	//
	// {u'OME': None}
	// Is multi path? False

	// Ignoring Detector element, complex property
	// Ignoring Dichroic element, complex property
	// Ignoring Filter element, complex property
	// Ignoring FilterSet element, complex property
	@Override
	public void setInstrumentID(final String id, final int instrumentIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	// Ignoring Image_BackReference back reference
	// Ignoring LightSource element, complex property
	// Ignoring Microscope element, complex property
	// Ignoring Objective element, complex property
	//
	// InstrumentRef property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference InstrumentRef

	//
	// Label property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setLabelFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setLabelFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setLabelFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setLabelFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setLabelFontStyle(final FontStyle fontStyle, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setLabelID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Label) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setLabelLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setLabelLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setLabelStrokeColor(final Color strokeColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setLabelStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setLabelStrokeWidth(final Double strokeWidth, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setLabelText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setLabelTheC(final NonNegativeInteger theC, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setLabelTheT(final NonNegativeInteger theT, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setLabelTheZ(final NonNegativeInteger theZ, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setLabelTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setLabelVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setVisible(visible);
	}

	@Override
	public void
		setLabelX(final Double x, final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setX(x);
	}

	@Override
	public void
		setLabelY(final Double y, final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Label());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Label) o3).setY(y);
	}

	//
	// Laser property storage
	//
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public void setLaserID(final String id, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		model.addModelObject(id, o2);
		((Laser) o2).setID(id);
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public void setLaserLotNumber(final String lotNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setLotNumber(lotNumber);
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public void setLaserManufacturer(final String manufacturer,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setManufacturer(manufacturer);
	}

	// Model accessor from parent LightSource
	@Override
	public void setLaserModel(final String model, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setModel(model);
	}

	// Power accessor from parent LightSource
	@Override
	public void setLaserPower(final Double power, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setPower(power);
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public void setLaserSerialNumber(final String serialNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setSerialNumber(serialNumber);
	}

	@Override
	public void setLaserFrequencyMultiplication(
		final PositiveInteger frequencyMultiplication, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setFrequencyMultiplication(frequencyMultiplication);
	}

	@Override
	public void setLaserLaserMedium(final LaserMedium laserMedium,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setLaserMedium(laserMedium);
	}

	@Override
	public void setLaserPockelCell(final Boolean pockelCell,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setPockelCell(pockelCell);
	}

	@Override
	public void setLaserPulse(final Pulse pulse, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setPulse(pulse);
	}

	@Override
	public void setLaserPump(final String pump, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// Pump is abstract proprietary and is a reference
		final Pump pump_reference = new Pump();
		pump_reference.setID(pump);
		model.addReference(root.getInstrument(instrumentIndex).getLightSource(
			lightSourceIndex), pump_reference);
		// LightSource is abstract proprietary
	}

	@Override
	public void setLaserRepetitionRate(final Double repetitionRate,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setRepetitionRate(repetitionRate);
	}

	@Override
	public void setLaserTuneable(final Boolean tuneable,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setTuneable(tuneable);
	}

	@Override
	public void setLaserType(final LaserType type, final int instrumentIndex,
		final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setType(type);
	}

	@Override
	public void setLaserWavelength(final PositiveInteger wavelength,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new Laser());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((Laser) o2).setWavelength(wavelength);
	}

	//
	// Leader property storage
	//
	// {u'ExperimenterGroup': {u'OME': None}}
	// Is multi path? False

	// 0:9999
	// Is multi path? False
	// Ignoring ExperimenterGroup_BackReference property of reference Leader

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference Leader

	//
	// LightEmittingDiode property storage
	//
	// {u'LightSource': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	// Ignoring Arc of parent abstract type
	// Ignoring Filament of parent abstract type
	// ID accessor from parent LightSource
	@Override
	public void setLightEmittingDiodeID(final String id,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new LightEmittingDiode());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		model.addModelObject(id, o2);
		((LightEmittingDiode) o2).setID(id);
	}

	// Ignoring Laser of parent abstract type
	// Ignoring LightEmittingDiode of parent abstract type
	// LotNumber accessor from parent LightSource
	@Override
	public void setLightEmittingDiodeLotNumber(final String lotNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new LightEmittingDiode());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((LightEmittingDiode) o2).setLotNumber(lotNumber);
	}

	// Manufacturer accessor from parent LightSource
	@Override
	public void setLightEmittingDiodeManufacturer(final String manufacturer,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new LightEmittingDiode());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((LightEmittingDiode) o2).setManufacturer(manufacturer);
	}

	// Model accessor from parent LightSource
	@Override
	public void setLightEmittingDiodeModel(final String model,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new LightEmittingDiode());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((LightEmittingDiode) o2).setModel(model);
	}

	// Power accessor from parent LightSource
	@Override
	public void setLightEmittingDiodePower(final Double power,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new LightEmittingDiode());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((LightEmittingDiode) o2).setPower(power);
	}

	// SerialNumber accessor from parent LightSource
	@Override
	public void setLightEmittingDiodeSerialNumber(final String serialNumber,
		final int instrumentIndex, final int lightSourceIndex)
	{
		// Parents: {u'LightSource': {u'Instrument': {u'OME': None}}}
		// LightSource is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfLightSourceList() == lightSourceIndex) {
			o1.addLightSource(new LightEmittingDiode());
		}
		final LightSource o2 = o1.getLightSource(lightSourceIndex);
		((LightEmittingDiode) o2).setSerialNumber(serialNumber);
	}

	//
	// LightPath property storage
	//
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	@Override
	public void setLightPathDichroicRef(final String dichroic,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// DichroicRef is reference and occurs more than once
		final DichroicRef dichroic_reference = new DichroicRef();
		dichroic_reference.setID(dichroic);
		model.addReference(root.getImage(imageIndex).getPixels().getChannel(
			channelIndex).getLightPath(), dichroic_reference);
	}

	@Override
	public void setLightPathEmissionFilterRef(final String emissionFilter,
		final int imageIndex, final int channelIndex,
		final int emissionFilterRefIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// EmissionFilterRef is reference and occurs more than once
		final EmissionFilterRef emissionFilterLinks_reference =
			new EmissionFilterRef();
		emissionFilterLinks_reference.setID(emissionFilter);
		model.addReference(root.getImage(imageIndex).getPixels().getChannel(
			channelIndex).getLightPath(), emissionFilterLinks_reference);
	}

	@Override
	public void setLightPathExcitationFilterRef(final String excitationFilter,
		final int imageIndex, final int channelIndex,
		final int excitationFilterRefIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}}}
		// ExcitationFilterRef is reference and occurs more than once
		final ExcitationFilterRef excitationFilterLinks_reference =
			new ExcitationFilterRef();
		excitationFilterLinks_reference.setID(excitationFilter);
		model.addReference(root.getImage(imageIndex).getPixels().getChannel(
			channelIndex).getLightPath(), excitationFilterLinks_reference);
	}

	//
	// LightSourceSettings property storage
	//
	// {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
	// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
	// Is multi path? True

	@Override
	public void setChannelLightSourceSettingsAttenuation(
		final PercentFraction attenuation, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Attenuation is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getLightSourceSettings() == null) {
			o3.setLightSourceSettings(new LightSourceSettings());
		}
		final LightSourceSettings o4 = o3.getLightSourceSettings();
		o4.setAttenuation(attenuation);
	}

	@Override
	public void setMicrobeamManipulationLightSourceSettingsAttenuation(
		final PercentFraction attenuation, final int experimentIndex,
		final int microbeamManipulationIndex, final int lightSourceSettingsIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Attenuation is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		if (o1.sizeOfMicrobeamManipulationList() == microbeamManipulationIndex) {
			o1.addMicrobeamManipulation(new MicrobeamManipulation());
		}
		final MicrobeamManipulation o2 =
			o1.getMicrobeamManipulation(microbeamManipulationIndex);
		if (o2.sizeOfLightSourceSettingsList() == lightSourceSettingsIndex) {
			o2.addLightSourceSettings(new LightSourceSettings());
		}
		final LightSourceSettings o3 =
			o2.getLightSourceSettings(lightSourceSettingsIndex);
		o3.setAttenuation(attenuation);
	}

	@Override
	public void setChannelLightSourceSettingsID(final String id,
		final int imageIndex, final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getLightSourceSettings() == null) {
			o3.setLightSourceSettings(new LightSourceSettings());
		}
		final LightSourceSettings o4 = o3.getLightSourceSettings();
		model.addModelObject(id, o4);
		o4.setID(id);
	}

	@Override
	public void setMicrobeamManipulationLightSourceSettingsID(final String id,
		final int experimentIndex, final int microbeamManipulationIndex,
		final int lightSourceSettingsIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		if (o1.sizeOfMicrobeamManipulationList() == microbeamManipulationIndex) {
			o1.addMicrobeamManipulation(new MicrobeamManipulation());
		}
		final MicrobeamManipulation o2 =
			o1.getMicrobeamManipulation(microbeamManipulationIndex);
		if (o2.sizeOfLightSourceSettingsList() == lightSourceSettingsIndex) {
			o2.addLightSourceSettings(new LightSourceSettings());
		}
		final LightSourceSettings o3 =
			o2.getLightSourceSettings(lightSourceSettingsIndex);
		model.addModelObject(id, o3);
		o3.setID(id);
	}

	// Ignoring LightSourceRef back reference
	// Ignoring MicrobeamManipulation_BackReference back reference
	@Override
	public void setChannelLightSourceSettingsWavelength(
		final PositiveInteger wavelength, final int imageIndex,
		final int channelIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Wavelength is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfChannelList() == channelIndex) {
			o2.addChannel(new Channel());
		}
		final Channel o3 = o2.getChannel(channelIndex);
		if (o3.getLightSourceSettings() == null) {
			o3.setLightSourceSettings(new LightSourceSettings());
		}
		final LightSourceSettings o4 = o3.getLightSourceSettings();
		o4.setWavelength(wavelength);
	}

	@Override
	public void setMicrobeamManipulationLightSourceSettingsWavelength(
		final PositiveInteger wavelength, final int experimentIndex,
		final int microbeamManipulationIndex, final int lightSourceSettingsIndex)
	{
		// Parents: {u'Channel': {u'Pixels': {u'Image': {u'OME': None}}},
		// u'MicrobeamManipulation': {u'Experiment': {u'OME': None}}}
		// Wavelength is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		if (o1.sizeOfMicrobeamManipulationList() == microbeamManipulationIndex) {
			o1.addMicrobeamManipulation(new MicrobeamManipulation());
		}
		final MicrobeamManipulation o2 =
			o1.getMicrobeamManipulation(microbeamManipulationIndex);
		if (o2.sizeOfLightSourceSettingsList() == lightSourceSettingsIndex) {
			o2.addLightSourceSettings(new LightSourceSettings());
		}
		final LightSourceSettings o3 =
			o2.getLightSourceSettings(lightSourceSettingsIndex);
		o3.setWavelength(wavelength);
	}

	//
	// Line property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setLineFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setLineFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setLineFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setLineFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setLineFontStyle(final FontStyle fontStyle, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setLineID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Line) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setLineLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setLineLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setLineStrokeColor(final Color strokeColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setLineStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setLineStrokeWidth(final Double strokeWidth, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setLineText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setLineTheC(final NonNegativeInteger theC, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setLineTheT(final NonNegativeInteger theT, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setLineTheZ(final NonNegativeInteger theZ, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setLineTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setLineVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setVisible(visible);
	}

	@Override
	public void setLineMarkerEnd(final Marker markerEnd, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setMarkerEnd(markerEnd);
	}

	@Override
	public void setLineMarkerStart(final Marker markerStart, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setMarkerStart(markerStart);
	}

	@Override
	public void setLineX1(final Double x1, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setX1(x1);
	}

	@Override
	public void setLineX2(final Double x2, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setX2(x2);
	}

	@Override
	public void setLineY1(final Double y1, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setY1(y1);
	}

	@Override
	public void setLineY2(final Double y2, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Line());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Line) o3).setY2(y2);
	}

	//
	// ListAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setListAnnotationAnnotationRef(final String annotation,
		final int listAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getListAnnotation(
			listAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setListAnnotationDescription(final String description,
		final int listAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfListAnnotationList() == listAnnotationIndex) {
			o1.addListAnnotation(new ListAnnotation());
		}
		final ListAnnotation o2 = o1.getListAnnotation(listAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void
		setListAnnotationID(final String id, final int listAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfListAnnotationList() == listAnnotationIndex) {
			o1.addListAnnotation(new ListAnnotation());
		}
		final ListAnnotation o2 = o1.getListAnnotation(listAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setListAnnotationNamespace(final String namespace,
		final int listAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfListAnnotationList() == listAnnotationIndex) {
			o1.addListAnnotation(new ListAnnotation());
		}
		final ListAnnotation o2 = o1.getListAnnotation(listAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// LongAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setLongAnnotationAnnotationRef(final String annotation,
		final int longAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getLongAnnotation(
			longAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setLongAnnotationDescription(final String description,
		final int longAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfLongAnnotationList() == longAnnotationIndex) {
			o1.addLongAnnotation(new LongAnnotation());
		}
		final LongAnnotation o2 = o1.getLongAnnotation(longAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void
		setLongAnnotationID(final String id, final int longAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfLongAnnotationList() == longAnnotationIndex) {
			o1.addLongAnnotation(new LongAnnotation());
		}
		final LongAnnotation o2 = o1.getLongAnnotation(longAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setLongAnnotationNamespace(final String namespace,
		final int longAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfLongAnnotationList() == longAnnotationIndex) {
			o1.addLongAnnotation(new LongAnnotation());
		}
		final LongAnnotation o2 = o1.getLongAnnotation(longAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setLongAnnotationValue(final Long value,
		final int longAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfLongAnnotationList() == longAnnotationIndex) {
			o1.addLongAnnotation(new LongAnnotation());
		}
		final LongAnnotation o2 = o1.getLongAnnotation(longAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// Mask property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setMaskFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setMaskFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setMaskFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setMaskFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setMaskFontStyle(final FontStyle fontStyle, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setMaskID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Mask) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setMaskLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setMaskLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setMaskStrokeColor(final Color strokeColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setMaskStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setMaskStrokeWidth(final Double strokeWidth, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setMaskText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setMaskTheC(final NonNegativeInteger theC, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setMaskTheT(final NonNegativeInteger theT, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setMaskTheZ(final NonNegativeInteger theZ, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setMaskTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setMaskVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setVisible(visible);
	}

	// Ignoring BinData element, complex property
	@Override
	public void setMaskHeight(final Double height, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setHeight(height);
	}

	@Override
	public void setMaskWidth(final Double width, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setWidth(width);
	}

	@Override
	public void
		setMaskX(final Double x, final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setX(x);
	}

	@Override
	public void
		setMaskY(final Double y, final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Mask());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Mask) o3).setY(y);
	}

	//
	// MetadataOnly property storage
	//
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	//
	// MicrobeamManipulation property storage
	//
	// {u'Experiment': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setMicrobeamManipulationDescription(final String description,
		final int experimentIndex, final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		if (o1.sizeOfMicrobeamManipulationList() == microbeamManipulationIndex) {
			o1.addMicrobeamManipulation(new MicrobeamManipulation());
		}
		final MicrobeamManipulation o2 =
			o1.getMicrobeamManipulation(microbeamManipulationIndex);
		o2.setDescription(description);
	}

	// Ignoring Experiment_BackReference back reference
	@Override
	public void setMicrobeamManipulationExperimenterRef(
		final String experimenter, final int experimentIndex,
		final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// ExperimenterRef is reference and occurs more than once
		final ExperimenterRef experimenter_reference = new ExperimenterRef();
		experimenter_reference.setID(experimenter);
		model.addReference(root.getExperiment(experimentIndex)
			.getMicrobeamManipulation(microbeamManipulationIndex),
			experimenter_reference);
	}

	@Override
	public void setMicrobeamManipulationID(final String id,
		final int experimentIndex, final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		if (o1.sizeOfMicrobeamManipulationList() == microbeamManipulationIndex) {
			o1.addMicrobeamManipulation(new MicrobeamManipulation());
		}
		final MicrobeamManipulation o2 =
			o1.getMicrobeamManipulation(microbeamManipulationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	// Ignoring LightSourceSettings element, complex property
	@Override
	public void setMicrobeamManipulationROIRef(final String roi,
		final int experimentIndex, final int microbeamManipulationIndex,
		final int ROIRefIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// ROIRef is reference and occurs more than once
		final ROIRef roiLinks_reference = new ROIRef();
		roiLinks_reference.setID(roi);
		model
			.addReference(root.getExperiment(experimentIndex)
				.getMicrobeamManipulation(microbeamManipulationIndex),
				roiLinks_reference);
	}

	@Override
	public void setMicrobeamManipulationType(
		final MicrobeamManipulationType type, final int experimentIndex,
		final int microbeamManipulationIndex)
	{
		// Parents: {u'Experiment': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfExperimentList() == experimentIndex) {
			o0.addExperiment(new Experiment());
		}
		final Experiment o1 = o0.getExperiment(experimentIndex);
		if (o1.sizeOfMicrobeamManipulationList() == microbeamManipulationIndex) {
			o1.addMicrobeamManipulation(new MicrobeamManipulation());
		}
		final MicrobeamManipulation o2 =
			o1.getMicrobeamManipulation(microbeamManipulationIndex);
		o2.setType(type);
	}

	//
	// MicrobeamManipulationRef property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference MicrobeamManipulationRef

	//
	// Microscope property storage
	//
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setMicroscopeLotNumber(final String lotNumber,
		final int instrumentIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.getMicroscope() == null) {
			o1.setMicroscope(new Microscope());
		}
		final Microscope o2 = o1.getMicroscope();
		o2.setLotNumber(lotNumber);
	}

	@Override
	public void setMicroscopeManufacturer(final String manufacturer,
		final int instrumentIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.getMicroscope() == null) {
			o1.setMicroscope(new Microscope());
		}
		final Microscope o2 = o1.getMicroscope();
		o2.setManufacturer(manufacturer);
	}

	@Override
	public void setMicroscopeModel(final String model, final int instrumentIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.getMicroscope() == null) {
			o1.setMicroscope(new Microscope());
		}
		final Microscope o2 = o1.getMicroscope();
		o2.setModel(model);
	}

	@Override
	public void setMicroscopeSerialNumber(final String serialNumber,
		final int instrumentIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.getMicroscope() == null) {
			o1.setMicroscope(new Microscope());
		}
		final Microscope o2 = o1.getMicroscope();
		o2.setSerialNumber(serialNumber);
	}

	@Override
	public void setMicroscopeType(final MicroscopeType type,
		final int instrumentIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.getMicroscope() == null) {
			o1.setMicroscope(new Microscope());
		}
		final Microscope o2 = o1.getMicroscope();
		o2.setType(type);
	}

	//
	// Objective property storage
	//
	// {u'Instrument': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setObjectiveCalibratedMagnification(
		final Double calibratedMagnification, final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// CalibratedMagnification is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setCalibratedMagnification(calibratedMagnification);
	}

	@Override
	public void setObjectiveCorrection(final Correction correction,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Correction is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setCorrection(correction);
	}

	@Override
	public void setObjectiveID(final String id, final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	@Override
	public void setObjectiveImmersion(final Immersion immersion,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Immersion is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setImmersion(immersion);
	}

	// Ignoring Instrument_BackReference back reference
	@Override
	public void setObjectiveIris(final Boolean iris, final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Iris is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setIris(iris);
	}

	@Override
	public void setObjectiveLensNA(final Double lensNA,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LensNA is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setLensNA(lensNA);
	}

	@Override
	public void setObjectiveLotNumber(final String lotNumber,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// LotNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setLotNumber(lotNumber);
	}

	@Override
	public void setObjectiveManufacturer(final String manufacturer,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Manufacturer is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setManufacturer(manufacturer);
	}

	@Override
	public void setObjectiveModel(final String model, final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// Model is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setModel(model);
	}

	@Override
	public void setObjectiveNominalMagnification(
		final PositiveInteger nominalMagnification, final int instrumentIndex,
		final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// NominalMagnification is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setNominalMagnification(nominalMagnification);
	}

	@Override
	public void setObjectiveSerialNumber(final String serialNumber,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// SerialNumber is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setSerialNumber(serialNumber);
	}

	@Override
	public void setObjectiveWorkingDistance(final Double workingDistance,
		final int instrumentIndex, final int objectiveIndex)
	{
		// Parents: {u'Instrument': {u'OME': None}}
		// WorkingDistance is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfObjectiveList() == objectiveIndex) {
			o1.addObjective(new Objective());
		}
		final Objective o2 = o1.getObjective(objectiveIndex);
		o2.setWorkingDistance(workingDistance);
	}

	//
	// ObjectiveSettings property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setObjectiveSettingsCorrectionCollar(
		final Double correctionCollar, final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// CorrectionCollar is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getObjectiveSettings() == null) {
			o1.setObjectiveSettings(new ObjectiveSettings());
		}
		final ObjectiveSettings o2 = o1.getObjectiveSettings();
		o2.setCorrectionCollar(correctionCollar);
	}

	@Override
	public void setObjectiveSettingsID(final String id, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getObjectiveSettings() == null) {
			o1.setObjectiveSettings(new ObjectiveSettings());
		}
		final ObjectiveSettings o2 = o1.getObjectiveSettings();
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	@Override
	public void setObjectiveSettingsMedium(final Medium medium,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// Medium is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getObjectiveSettings() == null) {
			o1.setObjectiveSettings(new ObjectiveSettings());
		}
		final ObjectiveSettings o2 = o1.getObjectiveSettings();
		o2.setMedium(medium);
	}

	// Ignoring ObjectiveRef back reference
	@Override
	public void setObjectiveSettingsRefractiveIndex(final Double refractiveIndex,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// RefractiveIndex is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getObjectiveSettings() == null) {
			o1.setObjectiveSettings(new ObjectiveSettings());
		}
		final ObjectiveSettings o2 = o1.getObjectiveSettings();
		o2.setRefractiveIndex(refractiveIndex);
	}

	//
	// Pixels property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setPixelsAnnotationRef(final String annotation,
		final int imageIndex, final int annotationRefIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getImage(imageIndex).getPixels(),
			annotationLinks_reference);
	}

	// Ignoring BinData element, complex property
	// Ignoring Channel element, complex property
	@Override
	public void setPixelsDimensionOrder(final DimensionOrder dimensionOrder,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// DimensionOrder is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setDimensionOrder(dimensionOrder);
	}

	@Override
	public void setPixelsID(final String id, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring MetadataOnly element, complex property
	@Override
	public void setPixelsPhysicalSizeX(final PositiveFloat physicalSizeX,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// PhysicalSizeX is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setPhysicalSizeX(physicalSizeX);
	}

	@Override
	public void setPixelsPhysicalSizeY(final PositiveFloat physicalSizeY,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// PhysicalSizeY is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setPhysicalSizeY(physicalSizeY);
	}

	@Override
	public void setPixelsPhysicalSizeZ(final PositiveFloat physicalSizeZ,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// PhysicalSizeZ is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setPhysicalSizeZ(physicalSizeZ);
	}

	// Ignoring Plane element, complex property
	@Override
	public void setPixelsSizeC(final PositiveInteger sizeC, final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// SizeC is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setSizeC(sizeC);
	}

	@Override
	public void setPixelsSizeT(final PositiveInteger sizeT, final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// SizeT is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setSizeT(sizeT);
	}

	@Override
	public void setPixelsSizeX(final PositiveInteger sizeX, final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// SizeX is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setSizeX(sizeX);
	}

	@Override
	public void setPixelsSizeY(final PositiveInteger sizeY, final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// SizeY is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setSizeY(sizeY);
	}

	@Override
	public void setPixelsSizeZ(final PositiveInteger sizeZ, final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// SizeZ is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setSizeZ(sizeZ);
	}

	// Ignoring TiffData element, complex property
	@Override
	public void setPixelsTimeIncrement(final Double timeIncrement,
		final int imageIndex)
	{
		// Parents: {u'Image': {u'OME': None}}
		// TimeIncrement is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setTimeIncrement(timeIncrement);
	}

	@Override
	public void setPixelsType(final PixelType type, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		o2.setType(type);
	}

	//
	// Plane property storage
	//
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	@Override
	public void setPlaneAnnotationRef(final String annotation,
		final int imageIndex, final int planeIndex, final int annotationRefIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getImage(imageIndex).getPixels().getPlane(
			planeIndex), annotationLinks_reference);
	}

	@Override
	public void setPlaneDeltaT(final Double deltaT, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// DeltaT is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setDeltaT(deltaT);
	}

	@Override
	public void setPlaneExposureTime(final Double exposureTime,
		final int imageIndex, final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// ExposureTime is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setExposureTime(exposureTime);
	}

	@Override
	public void setPlaneHashSHA1(final String hashSHA1, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// HashSHA1 is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setHashSHA1(hashSHA1);
	}

	// Ignoring Pixels_BackReference back reference
	@Override
	public void setPlanePositionX(final Double positionX, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PositionX is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setPositionX(positionX);
	}

	@Override
	public void setPlanePositionY(final Double positionY, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PositionY is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setPositionY(positionY);
	}

	@Override
	public void setPlanePositionZ(final Double positionZ, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PositionZ is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setPositionZ(positionZ);
	}

	@Override
	public void setPlaneTheC(final NonNegativeInteger theC, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TheC is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setTheC(theC);
	}

	@Override
	public void setPlaneTheT(final NonNegativeInteger theT, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TheT is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setTheT(theT);
	}

	@Override
	public void setPlaneTheZ(final NonNegativeInteger theZ, final int imageIndex,
		final int planeIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// TheZ is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfPlaneList() == planeIndex) {
			o2.addPlane(new Plane());
		}
		final Plane o3 = o2.getPlane(planeIndex);
		o3.setTheZ(theZ);
	}

	//
	// Plate property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setPlateAnnotationRef(final String annotation,
		final int plateIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getPlate(plateIndex), annotationLinks_reference);
	}

	@Override
	public void setPlateColumnNamingConvention(
		final NamingConvention columnNamingConvention, final int plateIndex)
	{
		// Parents: {u'OME': None}
		// ColumnNamingConvention is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setColumnNamingConvention(columnNamingConvention);
	}

	@Override
	public void setPlateColumns(final PositiveInteger columns,
		final int plateIndex)
	{
		// Parents: {u'OME': None}
		// Columns is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setColumns(columns);
	}

	@Override
	public void
		setPlateDescription(final String description, final int plateIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setDescription(description);
	}

	@Override
	public void setPlateExternalIdentifier(final String externalIdentifier,
		final int plateIndex)
	{
		// Parents: {u'OME': None}
		// ExternalIdentifier is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setExternalIdentifier(externalIdentifier);
	}

	@Override
	public void setPlateFieldIndex(final NonNegativeInteger fieldIndex,
		final int plateIndex)
	{
		// Parents: {u'OME': None}
		// FieldIndex is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setFieldIndex(fieldIndex);
	}

	@Override
	public void setPlateID(final String id, final int plateIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	@Override
	public void setPlateName(final String name, final int plateIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setName(name);
	}

	// Ignoring PlateAcquisition element, complex property
	@Override
	public void setPlateRowNamingConvention(
		final NamingConvention rowNamingConvention, final int plateIndex)
	{
		// Parents: {u'OME': None}
		// RowNamingConvention is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setRowNamingConvention(rowNamingConvention);
	}

	@Override
	public void setPlateRows(final PositiveInteger rows, final int plateIndex) {
		// Parents: {u'OME': None}
		// Rows is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setRows(rows);
	}

	// Ignoring Screen_BackReference back reference
	@Override
	public void setPlateStatus(final String status, final int plateIndex) {
		// Parents: {u'OME': None}
		// Status is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setStatus(status);
	}

	// Ignoring Well element, complex property
	@Override
	public void
		setPlateWellOriginX(final Double wellOriginX, final int plateIndex)
	{
		// Parents: {u'OME': None}
		// WellOriginX is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setWellOriginX(wellOriginX);
	}

	@Override
	public void
		setPlateWellOriginY(final Double wellOriginY, final int plateIndex)
	{
		// Parents: {u'OME': None}
		// WellOriginY is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		o1.setWellOriginY(wellOriginY);
	}

	//
	// PlateAcquisition property storage
	//
	// {u'Plate': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setPlateAcquisitionAnnotationRef(final String annotation,
		final int plateIndex, final int plateAcquisitionIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getPlate(plateIndex).getPlateAcquisition(
			plateAcquisitionIndex), annotationLinks_reference);
	}

	@Override
	public void setPlateAcquisitionDescription(final String description,
		final int plateIndex, final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfPlateAcquisitionList() == plateAcquisitionIndex) {
			o1.addPlateAcquisition(new PlateAcquisition());
		}
		final PlateAcquisition o2 = o1.getPlateAcquisition(plateAcquisitionIndex);
		o2.setDescription(description);
	}

	@Override
	public void setPlateAcquisitionEndTime(final Timestamp endTime,
		final int plateIndex, final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// EndTime is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfPlateAcquisitionList() == plateAcquisitionIndex) {
			o1.addPlateAcquisition(new PlateAcquisition());
		}
		final PlateAcquisition o2 = o1.getPlateAcquisition(plateAcquisitionIndex);
		o2.setEndTime(endTime);
	}

	@Override
	public void setPlateAcquisitionID(final String id, final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfPlateAcquisitionList() == plateAcquisitionIndex) {
			o1.addPlateAcquisition(new PlateAcquisition());
		}
		final PlateAcquisition o2 = o1.getPlateAcquisition(plateAcquisitionIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	@Override
	public void setPlateAcquisitionMaximumFieldCount(
		final PositiveInteger maximumFieldCount, final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// MaximumFieldCount is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfPlateAcquisitionList() == plateAcquisitionIndex) {
			o1.addPlateAcquisition(new PlateAcquisition());
		}
		final PlateAcquisition o2 = o1.getPlateAcquisition(plateAcquisitionIndex);
		o2.setMaximumFieldCount(maximumFieldCount);
	}

	@Override
	public void setPlateAcquisitionName(final String name, final int plateIndex,
		final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfPlateAcquisitionList() == plateAcquisitionIndex) {
			o1.addPlateAcquisition(new PlateAcquisition());
		}
		final PlateAcquisition o2 = o1.getPlateAcquisition(plateAcquisitionIndex);
		o2.setName(name);
	}

	// Ignoring Plate_BackReference back reference
	@Override
	public void setPlateAcquisitionStartTime(final Timestamp startTime,
		final int plateIndex, final int plateAcquisitionIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// StartTime is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfPlateAcquisitionList() == plateAcquisitionIndex) {
			o1.addPlateAcquisition(new PlateAcquisition());
		}
		final PlateAcquisition o2 = o1.getPlateAcquisition(plateAcquisitionIndex);
		o2.setStartTime(startTime);
	}

	@Override
	public void setPlateAcquisitionWellSampleRef(final String wellSample,
		final int plateIndex, final int plateAcquisitionIndex,
		final int wellSampleRefIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// WellSampleRef is reference and occurs more than once
		final WellSampleRef wellSamples_reference = new WellSampleRef();
		wellSamples_reference.setID(wellSample);
		model.addReference(root.getPlate(plateIndex).getPlateAcquisition(
			plateAcquisitionIndex), wellSamples_reference);
	}

	//
	// PlateRef property storage
	//
	// {u'Screen': {u'OME': None}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference PlateRef

	//
	// Point property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setPointFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setPointFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setPointFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setPointFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setPointFontStyle(final FontStyle fontStyle, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setPointID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Point) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setPointLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setPointLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setPointStrokeColor(final Color strokeColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setPointStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setPointStrokeWidth(final Double strokeWidth, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setPointText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setPointTheC(final NonNegativeInteger theC, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setPointTheT(final NonNegativeInteger theT, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setPointTheZ(final NonNegativeInteger theZ, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setPointTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setPointVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setVisible(visible);
	}

	@Override
	public void
		setPointX(final Double x, final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setX(x);
	}

	@Override
	public void
		setPointY(final Double y, final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Point());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Point) o3).setY(y);
	}

	//
	// Polygon property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setPolygonFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setPolygonFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setPolygonFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setPolygonFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setPolygonFontStyle(final FontStyle fontStyle,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setPolygonID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Polygon) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setPolygonLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setPolygonLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setPolygonStrokeColor(final Color strokeColor,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setPolygonStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setPolygonStrokeWidth(final Double strokeWidth,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setPolygonText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setPolygonTheC(final NonNegativeInteger theC, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setPolygonTheT(final NonNegativeInteger theT, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setPolygonTheZ(final NonNegativeInteger theZ, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setPolygonTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setPolygonVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setVisible(visible);
	}

	@Override
	public void setPolygonPoints(final String points, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polygon());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polygon) o3).setPoints(points);
	}

	//
	// Polyline property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setPolylineFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setPolylineFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setPolylineFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setPolylineFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setPolylineFontStyle(final FontStyle fontStyle,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setPolylineID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Polyline) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setPolylineLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setPolylineLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setPolylineStrokeColor(final Color strokeColor,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setPolylineStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setPolylineStrokeWidth(final Double strokeWidth,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setPolylineText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setPolylineTheC(final NonNegativeInteger theC,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setPolylineTheT(final NonNegativeInteger theT,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setPolylineTheZ(final NonNegativeInteger theZ,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setPolylineTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setPolylineVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setVisible(visible);
	}

	@Override
	public void setPolylineMarkerEnd(final Marker markerEnd, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setMarkerEnd(markerEnd);
	}

	@Override
	public void setPolylineMarkerStart(final Marker markerStart,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setMarkerStart(markerStart);
	}

	@Override
	public void setPolylinePoints(final String points, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Polyline());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Polyline) o3).setPoints(points);
	}

	//
	// Project property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setProjectAnnotationRef(final String annotation,
		final int projectIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model
			.addReference(root.getProject(projectIndex), annotationLinks_reference);
	}

	@Override
	public void setProjectDatasetRef(final String dataset,
		final int projectIndex, final int datasetRefIndex)
	{
		// Parents: {u'OME': None}
		// DatasetRef is reference and occurs more than once
		final DatasetRef datasetLinks_reference = new DatasetRef();
		datasetLinks_reference.setID(dataset);
		model.addReference(root.getProject(projectIndex), datasetLinks_reference);
	}

	@Override
	public void setProjectDescription(final String description,
		final int projectIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfProjectList() == projectIndex) {
			o0.addProject(new Project());
		}
		final Project o1 = o0.getProject(projectIndex);
		o1.setDescription(description);
	}

	@Override
	public void setProjectExperimenterGroupRef(final String experimenterGroup,
		final int projectIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterGroupRef is reference and occurs more than once
		final ExperimenterGroupRef experimenterGroup_reference =
			new ExperimenterGroupRef();
		experimenterGroup_reference.setID(experimenterGroup);
		model.addReference(root.getProject(projectIndex),
			experimenterGroup_reference);
	}

	@Override
	public void setProjectExperimenterRef(final String experimenter,
		final int projectIndex)
	{
		// Parents: {u'OME': None}
		// ExperimenterRef is reference and occurs more than once
		final ExperimenterRef experimenter_reference = new ExperimenterRef();
		experimenter_reference.setID(experimenter);
		model.addReference(root.getProject(projectIndex), experimenter_reference);
	}

	@Override
	public void setProjectID(final String id, final int projectIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfProjectList() == projectIndex) {
			o0.addProject(new Project());
		}
		final Project o1 = o0.getProject(projectIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	@Override
	public void setProjectName(final String name, final int projectIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfProjectList() == projectIndex) {
			o0.addProject(new Project());
		}
		final Project o1 = o0.getProject(projectIndex);
		o1.setName(name);
	}

	//
	// Pump property storage
	//
	// {u'Laser': {u'LightSource': {u'Instrument': {u'OME': None}}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference Pump

	// 0:9999
	// Is multi path? False
	// Ignoring Laser_BackReference property of reference Pump

	//
	// ROI property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setROIAnnotationRef(final String annotation, final int ROIIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getROI(ROIIndex), annotationLinks_reference);
	}

	@Override
	public void setROIDescription(final String description, final int ROIIndex) {
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		o1.setDescription(description);
	}

	@Override
	public void setROIID(final String id, final int ROIIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	// Ignoring Image_BackReference back reference
	// Ignoring MicrobeamManipulation_BackReference back reference
	@Override
	public void setROIName(final String name, final int ROIIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		o1.setName(name);
	}

	@Override
	public void setROINamespace(final String namespace, final int ROIIndex) {
		// Parents: {u'OME': None}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		o1.setNamespace(namespace);
	}

	// Ignoring Union element, complex property
	//
	// ROIRef property storage
	//
	// {u'Image': {u'OME': None}, u'MicrobeamManipulation': {u'Experiment':
	// {u'OME': None}}}
	// Is multi path? True

	// 1:1
	// Is multi path? True
	// Ignoring ID property of reference ROIRef

	//
	// Reagent property storage
	//
	// {u'Screen': {u'OME': None}}
	// Is multi path? False

	@Override
	public void
		setReagentAnnotationRef(final String annotation, final int screenIndex,
			final int reagentIndex, final int annotationRefIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getScreen(screenIndex).getReagent(reagentIndex),
			annotationLinks_reference);
	}

	@Override
	public void setReagentDescription(final String description,
		final int screenIndex, final int reagentIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		if (o1.sizeOfReagentList() == reagentIndex) {
			o1.addReagent(new Reagent());
		}
		final Reagent o2 = o1.getReagent(reagentIndex);
		o2.setDescription(description);
	}

	@Override
	public void setReagentID(final String id, final int screenIndex,
		final int reagentIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		if (o1.sizeOfReagentList() == reagentIndex) {
			o1.addReagent(new Reagent());
		}
		final Reagent o2 = o1.getReagent(reagentIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	@Override
	public void setReagentName(final String name, final int screenIndex,
		final int reagentIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		if (o1.sizeOfReagentList() == reagentIndex) {
			o1.addReagent(new Reagent());
		}
		final Reagent o2 = o1.getReagent(reagentIndex);
		o2.setName(name);
	}

	@Override
	public void setReagentReagentIdentifier(final String reagentIdentifier,
		final int screenIndex, final int reagentIndex)
	{
		// Parents: {u'Screen': {u'OME': None}}
		// ReagentIdentifier is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		if (o1.sizeOfReagentList() == reagentIndex) {
			o1.addReagent(new Reagent());
		}
		final Reagent o2 = o1.getReagent(reagentIndex);
		o2.setReagentIdentifier(reagentIdentifier);
	}

	// Ignoring Screen_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// ReagentRef property storage
	//
	// {u'Well': {u'Plate': {u'OME': None}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference ReagentRef

	//
	// Rectangle property storage
	//
	// {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
	// Is multi path? False

	// Ignoring Ellipse of parent abstract type
	// FillColor accessor from parent Shape
	@Override
	public void setRectangleFillColor(final Color fillColor, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setFillColor(fillColor);
	}

	// FillRule accessor from parent Shape
	@Override
	public void setRectangleFillRule(final FillRule fillRule, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setFillRule(fillRule);
	}

	// FontFamily accessor from parent Shape
	@Override
	public void setRectangleFontFamily(final FontFamily fontFamily,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setFontFamily(fontFamily);
	}

	// FontSize accessor from parent Shape
	@Override
	public void setRectangleFontSize(final NonNegativeInteger fontSize,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setFontSize(fontSize);
	}

	// FontStyle accessor from parent Shape
	@Override
	public void setRectangleFontStyle(final FontStyle fontStyle,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setFontStyle(fontStyle);
	}

	// ID accessor from parent Shape
	@Override
	public void setRectangleID(final String id, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		model.addModelObject(id, o3);
		((Rectangle) o3).setID(id);
	}

	// Ignoring Label of parent abstract type
	// Ignoring Line of parent abstract type
	// LineCap accessor from parent Shape
	@Override
	public void setRectangleLineCap(final LineCap lineCap, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setLineCap(lineCap);
	}

	// Locked accessor from parent Shape
	@Override
	public void setRectangleLocked(final Boolean locked, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setLocked(locked);
	}

	// Ignoring Mask of parent abstract type
	// Ignoring Point of parent abstract type
	// Ignoring Polygon of parent abstract type
	// Ignoring Polyline of parent abstract type
	// Ignoring Rectangle of parent abstract type
	// StrokeColor accessor from parent Shape
	@Override
	public void setRectangleStrokeColor(final Color strokeColor,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setStrokeColor(strokeColor);
	}

	// StrokeDashArray accessor from parent Shape
	@Override
	public void setRectangleStrokeDashArray(final String strokeDashArray,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setStrokeDashArray(strokeDashArray);
	}

	// StrokeWidth accessor from parent Shape
	@Override
	public void setRectangleStrokeWidth(final Double strokeWidth,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setStrokeWidth(strokeWidth);
	}

	// Text accessor from parent Shape
	@Override
	public void setRectangleText(final String text, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setText(text);
	}

	// TheC accessor from parent Shape
	@Override
	public void setRectangleTheC(final NonNegativeInteger theC,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setTheC(theC);
	}

	// TheT accessor from parent Shape
	@Override
	public void setRectangleTheT(final NonNegativeInteger theT,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setTheT(theT);
	}

	// TheZ accessor from parent Shape
	@Override
	public void setRectangleTheZ(final NonNegativeInteger theZ,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setTheZ(theZ);
	}

	// Transform accessor from parent Shape
	@Override
	public void setRectangleTransform(final AffineTransform transform,
		final int ROIIndex, final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setTransform(transform);
	}

	// Visible accessor from parent Shape
	@Override
	public void setRectangleVisible(final Boolean visible, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setVisible(visible);
	}

	@Override
	public void setRectangleHeight(final Double height, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setHeight(height);
	}

	@Override
	public void setRectangleWidth(final Double width, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setWidth(width);
	}

	@Override
	public void setRectangleX(final Double x, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setX(x);
	}

	@Override
	public void setRectangleY(final Double y, final int ROIIndex,
		final int shapeIndex)
	{
		// Parents: {u'Shape': {u'Union': {u'ROI': {u'OME': None}}}}
		// Shape is abstract proprietary and not a reference
		final OME o0 = root;
		if (o0.sizeOfROIList() == ROIIndex) {
			o0.addROI(new ROI());
		}
		final ROI o1 = o0.getROI(ROIIndex);
		if (o1.getUnion() == null) {
			o1.setUnion(new Union());
		}
		final Union o2 = o1.getUnion();
		if (o2.sizeOfShapeList() == shapeIndex) {
			o2.addShape(new Rectangle());
		}
		final Shape o3 = o2.getShape(shapeIndex);
		((Rectangle) o3).setY(y);
	}

	//
	// Screen property storage
	//
	// {u'OME': None}
	// Is multi path? False

	@Override
	public void setScreenAnnotationRef(final String annotation,
		final int screenIndex, final int annotationRefIndex)
	{
		// Parents: {u'OME': None}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getScreen(screenIndex), annotationLinks_reference);
	}

	@Override
	public void setScreenDescription(final String description,
		final int screenIndex)
	{
		// Parents: {u'OME': None}
		// Description is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setDescription(description);
	}

	@Override
	public void setScreenID(final String id, final int screenIndex) {
		// Parents: {u'OME': None}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		model.addModelObject(id, o1);
		o1.setID(id);
	}

	@Override
	public void setScreenName(final String name, final int screenIndex) {
		// Parents: {u'OME': None}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setName(name);
	}

	@Override
	public void setScreenPlateRef(final String plate, final int screenIndex,
		final int plateRefIndex)
	{
		// Parents: {u'OME': None}
		// PlateRef is reference and occurs more than once
		final PlateRef plateLinks_reference = new PlateRef();
		plateLinks_reference.setID(plate);
		model.addReference(root.getScreen(screenIndex), plateLinks_reference);
	}

	@Override
	public void setScreenProtocolDescription(final String protocolDescription,
		final int screenIndex)
	{
		// Parents: {u'OME': None}
		// ProtocolDescription is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setProtocolDescription(protocolDescription);
	}

	@Override
	public void setScreenProtocolIdentifier(final String protocolIdentifier,
		final int screenIndex)
	{
		// Parents: {u'OME': None}
		// ProtocolIdentifier is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setProtocolIdentifier(protocolIdentifier);
	}

	// Ignoring Reagent element, complex property
	@Override
	public void setScreenReagentSetDescription(
		final String reagentSetDescription, final int screenIndex)
	{
		// Parents: {u'OME': None}
		// ReagentSetDescription is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setReagentSetDescription(reagentSetDescription);
	}

	@Override
	public void setScreenReagentSetIdentifier(final String reagentSetIdentifier,
		final int screenIndex)
	{
		// Parents: {u'OME': None}
		// ReagentSetIdentifier is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setReagentSetIdentifier(reagentSetIdentifier);
	}

	@Override
	public void setScreenType(final String type, final int screenIndex) {
		// Parents: {u'OME': None}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfScreenList() == screenIndex) {
			o0.addScreen(new Screen());
		}
		final Screen o1 = o0.getScreen(screenIndex);
		o1.setType(type);
	}

	//
	// StageLabel property storage
	//
	// {u'Image': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setStageLabelName(final String name, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Name is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getStageLabel() == null) {
			o1.setStageLabel(new StageLabel());
		}
		final StageLabel o2 = o1.getStageLabel();
		o2.setName(name);
	}

	@Override
	public void setStageLabelX(final Double x, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// X is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getStageLabel() == null) {
			o1.setStageLabel(new StageLabel());
		}
		final StageLabel o2 = o1.getStageLabel();
		o2.setX(x);
	}

	@Override
	public void setStageLabelY(final Double y, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Y is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getStageLabel() == null) {
			o1.setStageLabel(new StageLabel());
		}
		final StageLabel o2 = o1.getStageLabel();
		o2.setY(y);
	}

	@Override
	public void setStageLabelZ(final Double z, final int imageIndex) {
		// Parents: {u'Image': {u'OME': None}}
		// Z is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getStageLabel() == null) {
			o1.setStageLabel(new StageLabel());
		}
		final StageLabel o2 = o1.getStageLabel();
		o2.setZ(z);
	}

	//
	// StructuredAnnotations property storage
	//
	// {u'OME': None}
	// Is multi path? False

	// Ignoring BooleanAnnotation element, complex property
	// Ignoring CommentAnnotation element, complex property
	// Ignoring DoubleAnnotation element, complex property
	// Ignoring FileAnnotation element, complex property
	// Ignoring ListAnnotation element, complex property
	// Ignoring LongAnnotation element, complex property
	// Ignoring TagAnnotation element, complex property
	// Ignoring TermAnnotation element, complex property
	// Ignoring TimestampAnnotation element, complex property
	// Ignoring XMLAnnotation element, complex property
	//
	// TagAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setTagAnnotationAnnotationRef(final String annotation,
		final int tagAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getTagAnnotation(
			tagAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setTagAnnotationDescription(final String description,
		final int tagAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTagAnnotationList() == tagAnnotationIndex) {
			o1.addTagAnnotation(new TagAnnotation());
		}
		final TagAnnotation o2 = o1.getTagAnnotation(tagAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void setTagAnnotationID(final String id, final int tagAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTagAnnotationList() == tagAnnotationIndex) {
			o1.addTagAnnotation(new TagAnnotation());
		}
		final TagAnnotation o2 = o1.getTagAnnotation(tagAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setTagAnnotationNamespace(final String namespace,
		final int tagAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTagAnnotationList() == tagAnnotationIndex) {
			o1.addTagAnnotation(new TagAnnotation());
		}
		final TagAnnotation o2 = o1.getTagAnnotation(tagAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setTagAnnotationValue(final String value,
		final int tagAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTagAnnotationList() == tagAnnotationIndex) {
			o1.addTagAnnotation(new TagAnnotation());
		}
		final TagAnnotation o2 = o1.getTagAnnotation(tagAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// TermAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setTermAnnotationAnnotationRef(final String annotation,
		final int termAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getTermAnnotation(
			termAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setTermAnnotationDescription(final String description,
		final int termAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTermAnnotationList() == termAnnotationIndex) {
			o1.addTermAnnotation(new TermAnnotation());
		}
		final TermAnnotation o2 = o1.getTermAnnotation(termAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void
		setTermAnnotationID(final String id, final int termAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTermAnnotationList() == termAnnotationIndex) {
			o1.addTermAnnotation(new TermAnnotation());
		}
		final TermAnnotation o2 = o1.getTermAnnotation(termAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setTermAnnotationNamespace(final String namespace,
		final int termAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTermAnnotationList() == termAnnotationIndex) {
			o1.addTermAnnotation(new TermAnnotation());
		}
		final TermAnnotation o2 = o1.getTermAnnotation(termAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setTermAnnotationValue(final String value,
		final int termAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTermAnnotationList() == termAnnotationIndex) {
			o1.addTermAnnotation(new TermAnnotation());
		}
		final TermAnnotation o2 = o1.getTermAnnotation(termAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// TiffData property storage
	//
	// {u'Pixels': {u'Image': {u'OME': None}}}
	// Is multi path? False

	@Override
	public void setTiffDataFirstC(final NonNegativeInteger firstC,
		final int imageIndex, final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FirstC is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		o3.setFirstC(firstC);
	}

	@Override
	public void setTiffDataFirstT(final NonNegativeInteger firstT,
		final int imageIndex, final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FirstT is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		o3.setFirstT(firstT);
	}

	@Override
	public void setTiffDataFirstZ(final NonNegativeInteger firstZ,
		final int imageIndex, final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// FirstZ is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		o3.setFirstZ(firstZ);
	}

	@Override
	public void setTiffDataIFD(final NonNegativeInteger ifd,
		final int imageIndex, final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// IFD is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		o3.setIFD(ifd);
	}

	// Ignoring Pixels_BackReference back reference
	@Override
	public void setTiffDataPlaneCount(final NonNegativeInteger planeCount,
		final int imageIndex, final int tiffDataIndex)
	{
		// Parents: {u'Pixels': {u'Image': {u'OME': None}}}
		// PlaneCount is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		o3.setPlaneCount(planeCount);
	}

	// Ignoring UUID element, complex property
	//
	// TimestampAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setTimestampAnnotationAnnotationRef(final String annotation,
		final int timestampAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getTimestampAnnotation(
			timestampAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setTimestampAnnotationDescription(final String description,
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTimestampAnnotationList() == timestampAnnotationIndex) {
			o1.addTimestampAnnotation(new TimestampAnnotation());
		}
		final TimestampAnnotation o2 =
			o1.getTimestampAnnotation(timestampAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void setTimestampAnnotationID(final String id,
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTimestampAnnotationList() == timestampAnnotationIndex) {
			o1.addTimestampAnnotation(new TimestampAnnotation());
		}
		final TimestampAnnotation o2 =
			o1.getTimestampAnnotation(timestampAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setTimestampAnnotationNamespace(final String namespace,
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTimestampAnnotationList() == timestampAnnotationIndex) {
			o1.addTimestampAnnotation(new TimestampAnnotation());
		}
		final TimestampAnnotation o2 =
			o1.getTimestampAnnotation(timestampAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setTimestampAnnotationValue(final Timestamp value,
		final int timestampAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfTimestampAnnotationList() == timestampAnnotationIndex) {
			o1.addTimestampAnnotation(new TimestampAnnotation());
		}
		final TimestampAnnotation o2 =
			o1.getTimestampAnnotation(timestampAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
	//
	// TransmittanceRange property storage
	//
	// {u'Filter': {u'Instrument': {u'OME': None}}}
	// Is multi path? False

	@Override
	public void setTransmittanceRangeCutIn(final PositiveInteger cutIn,
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutIn is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		if (o2.getTransmittanceRange() == null) {
			o2.setTransmittanceRange(new TransmittanceRange());
		}
		final TransmittanceRange o3 = o2.getTransmittanceRange();
		o3.setCutIn(cutIn);
	}

	@Override
	public void setTransmittanceRangeCutInTolerance(
		final NonNegativeInteger cutInTolerance, final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutInTolerance is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		if (o2.getTransmittanceRange() == null) {
			o2.setTransmittanceRange(new TransmittanceRange());
		}
		final TransmittanceRange o3 = o2.getTransmittanceRange();
		o3.setCutInTolerance(cutInTolerance);
	}

	@Override
	public void setTransmittanceRangeCutOut(final PositiveInteger cutOut,
		final int instrumentIndex, final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutOut is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		if (o2.getTransmittanceRange() == null) {
			o2.setTransmittanceRange(new TransmittanceRange());
		}
		final TransmittanceRange o3 = o2.getTransmittanceRange();
		o3.setCutOut(cutOut);
	}

	@Override
	public void setTransmittanceRangeCutOutTolerance(
		final NonNegativeInteger cutOutTolerance, final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// CutOutTolerance is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		if (o2.getTransmittanceRange() == null) {
			o2.setTransmittanceRange(new TransmittanceRange());
		}
		final TransmittanceRange o3 = o2.getTransmittanceRange();
		o3.setCutOutTolerance(cutOutTolerance);
	}

	@Override
	public void setTransmittanceRangeTransmittance(
		final PercentFraction transmittance, final int instrumentIndex,
		final int filterIndex)
	{
		// Parents: {u'Filter': {u'Instrument': {u'OME': None}}}
		// Transmittance is not a reference
		final OME o0 = root;
		if (o0.sizeOfInstrumentList() == instrumentIndex) {
			o0.addInstrument(new Instrument());
		}
		final Instrument o1 = o0.getInstrument(instrumentIndex);
		if (o1.sizeOfFilterList() == filterIndex) {
			o1.addFilter(new Filter());
		}
		final Filter o2 = o1.getFilter(filterIndex);
		if (o2.getTransmittanceRange() == null) {
			o2.setTransmittanceRange(new TransmittanceRange());
		}
		final TransmittanceRange o3 = o2.getTransmittanceRange();
		o3.setTransmittance(transmittance);
	}

	//
	// UUID property storage
	//
	// {u'TiffData': {u'Pixels': {u'Image': {u'OME': None}}}}
	// Is multi path? False

	@Override
	public void setUUIDFileName(final String fileName, final int imageIndex,
		final int tiffDataIndex)
	{
		// Parents: {u'TiffData': {u'Pixels': {u'Image': {u'OME': None}}}}
		// FileName is not a reference
		final OME o0 = root;
		if (o0.sizeOfImageList() == imageIndex) {
			o0.addImage(new Image());
		}
		final Image o1 = o0.getImage(imageIndex);
		if (o1.getPixels() == null) {
			o1.setPixels(new Pixels());
		}
		final Pixels o2 = o1.getPixels();
		if (o2.sizeOfTiffDataList() == tiffDataIndex) {
			o2.addTiffData(new TiffData());
		}
		final TiffData o3 = o2.getTiffData(tiffDataIndex);
		if (o3.getUUID() == null) {
			o3.setUUID(new UUID());
		}
		final UUID o4 = o3.getUUID();
		o4.setFileName(fileName);
	}

	//
	// Union property storage
	//
	// {u'ROI': {u'OME': None}}
	// Is multi path? False

	// Ignoring Shape element, complex property
	//
	// Well property storage
	//
	// {u'Plate': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setWellAnnotationRef(final String annotation,
		final int plateIndex, final int wellIndex, final int annotationRefIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getPlate(plateIndex).getWell(wellIndex),
			annotationLinks_reference);
	}

	@Override
	public void setWellColor(final Color color, final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Color is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		o2.setColor(color);
	}

	@Override
	public void setWellColumn(final NonNegativeInteger column,
		final int plateIndex, final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Column is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		o2.setColumn(column);
	}

	@Override
	public void setWellExternalDescription(final String externalDescription,
		final int plateIndex, final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ExternalDescription is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		o2.setExternalDescription(externalDescription);
	}

	@Override
	public void setWellExternalIdentifier(final String externalIdentifier,
		final int plateIndex, final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ExternalIdentifier is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		o2.setExternalIdentifier(externalIdentifier);
	}

	@Override
	public void setWellID(final String id, final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Plate_BackReference back reference
	@Override
	public void setWellReagentRef(final String reagent, final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// ReagentRef is reference and occurs more than once
		final ReagentRef reagent_reference = new ReagentRef();
		reagent_reference.setID(reagent);
		model.addReference(root.getPlate(plateIndex).getWell(wellIndex),
			reagent_reference);
	}

	@Override
	public void setWellRow(final NonNegativeInteger row, final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Row is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		o2.setRow(row);
	}

	@Override
	public void setWellType(final String type, final int plateIndex,
		final int wellIndex)
	{
		// Parents: {u'Plate': {u'OME': None}}
		// Type is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		o2.setType(type);
	}

	// Ignoring WellSample element, complex property
	//
	// WellSample property storage
	//
	// {u'Well': {u'Plate': {u'OME': None}}}
	// Is multi path? False

	@Override
	public void setWellSampleAnnotationRef(final String annotation,
		final int plateIndex, final int wellIndex, final int wellSampleIndex,
		final int annotationRefIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getPlate(plateIndex).getWell(wellIndex)
			.getWellSample(wellSampleIndex), annotationLinks_reference);
	}

	@Override
	public void setWellSampleID(final String id, final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		if (o2.sizeOfWellSampleList() == wellSampleIndex) {
			o2.addWellSample(new WellSample());
		}
		final WellSample o3 = o2.getWellSample(wellSampleIndex);
		model.addModelObject(id, o3);
		o3.setID(id);
	}

	@Override
	public void setWellSampleImageRef(final String image, final int plateIndex,
		final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// ImageRef is reference and occurs more than once
		final ImageRef image_reference = new ImageRef();
		image_reference.setID(image);
		model.addReference(root.getPlate(plateIndex).getWell(wellIndex)
			.getWellSample(wellSampleIndex), image_reference);
	}

	@Override
	public void setWellSampleIndex(final NonNegativeInteger index,
		final int plateIndex, final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// Index is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		if (o2.sizeOfWellSampleList() == wellSampleIndex) {
			o2.addWellSample(new WellSample());
		}
		final WellSample o3 = o2.getWellSample(wellSampleIndex);
		o3.setIndex(index);
	}

	// Ignoring PlateAcquisition_BackReference back reference
	@Override
	public void setWellSamplePositionX(final Double positionX,
		final int plateIndex, final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// PositionX is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		if (o2.sizeOfWellSampleList() == wellSampleIndex) {
			o2.addWellSample(new WellSample());
		}
		final WellSample o3 = o2.getWellSample(wellSampleIndex);
		o3.setPositionX(positionX);
	}

	@Override
	public void setWellSamplePositionY(final Double positionY,
		final int plateIndex, final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// PositionY is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		if (o2.sizeOfWellSampleList() == wellSampleIndex) {
			o2.addWellSample(new WellSample());
		}
		final WellSample o3 = o2.getWellSample(wellSampleIndex);
		o3.setPositionY(positionY);
	}

	@Override
	public void setWellSampleTimepoint(final Timestamp timepoint,
		final int plateIndex, final int wellIndex, final int wellSampleIndex)
	{
		// Parents: {u'Well': {u'Plate': {u'OME': None}}}
		// Timepoint is not a reference
		final OME o0 = root;
		if (o0.sizeOfPlateList() == plateIndex) {
			o0.addPlate(new Plate());
		}
		final Plate o1 = o0.getPlate(plateIndex);
		if (o1.sizeOfWellList() == wellIndex) {
			o1.addWell(new Well());
		}
		final Well o2 = o1.getWell(wellIndex);
		if (o2.sizeOfWellSampleList() == wellSampleIndex) {
			o2.addWellSample(new WellSample());
		}
		final WellSample o3 = o2.getWellSample(wellSampleIndex);
		o3.setTimepoint(timepoint);
	}

	// Ignoring Well_BackReference back reference
	//
	// WellSampleRef property storage
	//
	// {u'PlateAcquisition': {u'Plate': {u'OME': None}}}
	// Is multi path? False

	// 1:1
	// Is multi path? False
	// Ignoring ID property of reference WellSampleRef

	//
	// XMLAnnotation property storage
	//
	// {u'StructuredAnnotations': {u'OME': None}}
	// Is multi path? False

	@Override
	public void setXMLAnnotationAnnotationRef(final String annotation,
		final int XMLAnnotationIndex, final int annotationRefIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// AnnotationRef is reference and occurs more than once
		final AnnotationRef annotationLinks_reference = new AnnotationRef();
		annotationLinks_reference.setID(annotation);
		model.addReference(root.getStructuredAnnotations().getXMLAnnotation(
			XMLAnnotationIndex), annotationLinks_reference);
	}

	// Ignoring Channel_BackReference back reference
	// Ignoring Dataset_BackReference back reference
	@Override
	public void setXMLAnnotationDescription(final String description,
		final int XMLAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Description is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfXMLAnnotationList() == XMLAnnotationIndex) {
			o1.addXMLAnnotation(new XMLAnnotation());
		}
		final XMLAnnotation o2 = o1.getXMLAnnotation(XMLAnnotationIndex);
		o2.setDescription(description);
	}

	// Ignoring ExperimenterGroup_BackReference back reference
	// Ignoring Experimenter_BackReference back reference
	@Override
	public void setXMLAnnotationID(final String id, final int XMLAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// ID is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfXMLAnnotationList() == XMLAnnotationIndex) {
			o1.addXMLAnnotation(new XMLAnnotation());
		}
		final XMLAnnotation o2 = o1.getXMLAnnotation(XMLAnnotationIndex);
		model.addModelObject(id, o2);
		o2.setID(id);
	}

	// Ignoring Image_BackReference back reference
	@Override
	public void setXMLAnnotationNamespace(final String namespace,
		final int XMLAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Namespace is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfXMLAnnotationList() == XMLAnnotationIndex) {
			o1.addXMLAnnotation(new XMLAnnotation());
		}
		final XMLAnnotation o2 = o1.getXMLAnnotation(XMLAnnotationIndex);
		o2.setNamespace(namespace);
	}

	// Ignoring Pixels_BackReference back reference
	// Ignoring Plane_BackReference back reference
	// Ignoring PlateAcquisition_BackReference back reference
	// Ignoring Plate_BackReference back reference
	// Ignoring Project_BackReference back reference
	// Ignoring ROI_BackReference back reference
	// Ignoring Reagent_BackReference back reference
	// Ignoring Screen_BackReference back reference
	// Ignoring StructuredAnnotations_BackReference back reference
	@Override
	public void setXMLAnnotationValue(final String value,
		final int XMLAnnotationIndex)
	{
		// Parents: {u'StructuredAnnotations': {u'OME': None}}
		// Value is not a reference
		final OME o0 = root;
		if (o0.getStructuredAnnotations() == null) {
			o0.setStructuredAnnotations(new StructuredAnnotations());
		}
		final StructuredAnnotations o1 = o0.getStructuredAnnotations();
		if (o1.sizeOfXMLAnnotationList() == XMLAnnotationIndex) {
			o1.addXMLAnnotation(new XMLAnnotation());
		}
		final XMLAnnotation o2 = o1.getXMLAnnotation(XMLAnnotationIndex);
		o2.setValue(value);
	}

	// Ignoring WellSample_BackReference back reference
	// Ignoring Well_BackReference back reference
}
