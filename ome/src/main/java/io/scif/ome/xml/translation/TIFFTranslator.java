/*
 * #%L
 * SCIFIO OME-XML Formats.
 * %%
 * Copyright (C) 2013 Open Microscopy Environment:
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

import io.scif.formats.TIFFFormat;
import io.scif.ome.xml.meta.OMEMetadata;
import io.scif.ome.xml.meta.OMEXMLMetadata;
import ome.xml.model.primitives.PositiveFloat;
import ome.xml.model.primitives.Timestamp;

import org.scijava.Priority;
import org.scijava.plugin.Attr;
import org.scijava.plugin.Plugin;

/**
 * Container class for translators between OME and TIFF formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class TIFFTranslator {

	// -- Constants --

	public static final double PRIORITY = Priority.HIGH_PRIORITY;

	/**
	 * Translator class from {@link io.scif.formats.TIFFFormat.Metadata} to
	 * {@link OMEMetadata}
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(
		type = ToOMETranslator.class,
		priority = TIFFTranslator.PRIORITY,
		attrs = {
			@Attr(name = TIFFOMETranslator.SOURCE, value = TIFFFormat.Metadata.CNAME),
			@Attr(name = TIFFOMETranslator.DEST, value = OMEMetadata.CNAME) })
	public static class TIFFOMETranslator extends
		ToOMETranslator<TIFFFormat.Metadata>
	{

		// -- Translator API Methods --

		@Override
		protected void typedTranslate(final TIFFFormat.Metadata source,
			final OMEMetadata dest)
		{
			super.typedTranslate(source, dest);

			final OMEXMLMetadata meta = dest.getRoot();

			final double physX = source.getPhysicalSizeX();
			final double physY = source.getPhysicalSizeY();
			final double physZ = source.getPhysicalSizeZ();

			meta
				.setPixelsPhysicalSizeX(new PositiveFloat(physX > 0 ? physX : 1.0), 0);
			meta
				.setPixelsPhysicalSizeY(new PositiveFloat(physY > 0 ? physY : 1.0), 0);
			meta
				.setPixelsPhysicalSizeZ(new PositiveFloat(physZ > 0 ? physZ : 1.0), 0);
			meta.setImageDescription(source.getDescription(), 0);
			meta.setExperimenterFirstName(source.getExperimenterFirstName(), 0);
			meta.setExperimenterLastName(source.getExperimenterLastName(), 0);
			meta.setExperimenterEmail(source.getExperimenterEmail(), 0);

			final String creationDate = source.getCreationDate();
			if (creationDate != null) meta.setImageAcquisitionDate(new Timestamp(
				creationDate), 0);
		}
	}

	/**
	 * Translator class from {@link io.scif.formats.TIFFFormat.Metadata} to
	 * {@link OMEMetadata}.
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = FromOMETranslator.class, priority = TIFFTranslator.PRIORITY,
		attrs = {
			@Attr(name = OMETIFFTranslator.SOURCE, value = OMEMetadata.CNAME),
			@Attr(name = OMETIFFTranslator.DEST, value = TIFFFormat.Metadata.CNAME) })
	public static class OMETIFFTranslator extends
		FromOMETranslator<TIFFFormat.Metadata>
	{

		@Override
		protected void typedTranslate(final OMEMetadata source,
			final TIFFFormat.Metadata dest)
		{
			super.typedTranslate(source, dest);

			final OMEXMLMetadata meta = source.getRoot();

			if (meta.getPixelsBinDataCount(0) > 0) {
				dest.setPhysicalSizeX(checkValue(meta.getPixelsPhysicalSizeX(0)));
				dest.setPhysicalSizeY(checkValue(meta.getPixelsPhysicalSizeY(0)));
				dest.setPhysicalSizeZ(checkValue(meta.getPixelsPhysicalSizeZ(0)));
			}

			if (meta.getImageCount() > 0) dest.setImageDescription(meta
				.getImageDescription(0));

			if (meta.getExperimentCount() > 0) {
				dest.setExperimenterEmail(meta.getExperimenterEmail(0));
				dest.setExperimenterFirstName(meta.getExperimenterFirstName(0));
				dest.setExperimenterLastName(meta.getExperimenterLastName(0));
				dest.setCreationDate(meta.getImageAcquisitionDate(0).getValue());
			}
		}

		private double checkValue(final PositiveFloat f) {
			if (f == null) return 1.0;
			return f.getValue();
		}
	}
}
