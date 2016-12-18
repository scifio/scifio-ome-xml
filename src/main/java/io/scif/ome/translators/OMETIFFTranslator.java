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

package io.scif.ome.translators;

import io.scif.Metadata;
import io.scif.ome.OMEMetadata;
import io.scif.ome.formats.OMETIFFFormat;

import org.scijava.log.LogService;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

import loci.common.services.ServiceException;
import loci.formats.ome.OMEXMLMetadata;
import loci.formats.services.OMEXMLServiceImpl;

/**
 * Container class for translators between OME and OMETIFF formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class OMETIFFTranslator {

	/**
	 * Translator class from {@link io.scif.ome.formats.OMETIFFFormat.Metadata}
	 * to {@link OMEMetadata}
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = ToOMETranslator.class, priority = TIFFTranslator.PRIORITY + 1)
	public static class OMEtoOMETIFFTranslator extends
		ToOMETranslator<OMETIFFFormat.Metadata>
	{

		@Parameter
		private LogService logService;

		// -- Translator API Methods --

		@Override
		public Class<? extends Metadata> source() {
			return OMETIFFFormat.Metadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMEMetadata.class;
		}

		// -- Translator API Methods --

		@Override
		protected void translateFormatMetadata(final OMETIFFFormat.Metadata source,
			final OMEMetadata dest)
		{
			OMEXMLMetadata xmlMetadata;

			try {
				xmlMetadata =
					new OMEXMLServiceImpl().createOMEXMLMetadata(source.getOmeMeta()
						.getRoot().dumpXML());
				dest.setRoot(xmlMetadata);
			}
			catch (final ServiceException e) {
				logService.error(e);
			}
		}
	}

	/**
	 * Translator class from {@link io.scif.ome.formats.OMETIFFFormat.Metadata}
	 * to {@link OMEMetadata}.
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = FromOMETranslator.class,
		priority = TIFFTranslator.PRIORITY + 1)
	public static class OMETIFFtoOMETranslator extends
		FromOMETranslator<OMETIFFFormat.Metadata>
	{
		@Parameter
		private LogService logService;

		@Override
		public Class<? extends Metadata> source() {
			return OMEMetadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMETIFFFormat.Metadata.class;
		}

		/*
		 * @see OMETranslator#typedTranslate(io.scif.Metadata, io.scif.Metadata)
		 */
		@Override
		protected void translateFormatMetadata(final OMEMetadata source,
			final OMETIFFFormat.Metadata dest)
		{
			OMEXMLMetadata sourceXML;

			try {
				sourceXML =
					new OMEXMLServiceImpl().createOMEXMLMetadata(source.getRoot()
						.dumpXML());

				OMEMetadata destOMEMeta = dest.getOmeMeta();
				if (destOMEMeta == null) {
					dest.setOmeMeta(new OMEMetadata(getContext(), sourceXML));
				}
				else {
					destOMEMeta.setRoot(sourceXML);
					destOMEMeta.populateImageMetadata();
				}
			}
			catch (final ServiceException e) {
				logService.error(e);
			}
		}
	}
}
