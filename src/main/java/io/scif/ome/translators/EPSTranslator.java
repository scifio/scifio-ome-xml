/*
 * #%L
 * SCIFIO support for the OME data model, including OME-XML and OME-TIFF.
 * %%
 * Copyright (C) 2013 - 2020 SCIFIO developers.
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
import io.scif.formats.EPSFormat;
import io.scif.ome.OMEMetadata;

import net.imagej.axis.Axes;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

import loci.formats.ome.OMEXMLMetadata;

/**
 * Container class for translators between OME and EPS formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class EPSTranslator {

	/**
	 * Translator class from {@link io.scif.formats.EPSFormat.Metadata} to
	 * {@link OMEMetadata}.
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = FromOMETranslator.class, priority = Priority.HIGH)
	public static class OMEEPSTranslator extends
		FromOMETranslator<EPSFormat.Metadata>
	{

		@Override
		public Class<? extends Metadata> source() {
			return OMEMetadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return EPSFormat.Metadata.class;
		}

		@Override
		protected void translateFormatMetadata(final OMEMetadata source,
			final EPSFormat.Metadata dest)
		{
			final OMEXMLMetadata meta = source.getRoot();

			final int sizeX = meta.getPixelsSizeX(0).getValue().intValue();
			final int sizeY = meta.getPixelsSizeY(0).getValue().intValue();
			final int sizeC = //
				meta.getChannelSamplesPerPixel(0, 0).getValue().intValue();

			dest.get(0).setAxisLength(Axes.X, sizeX);
			dest.get(0).setAxisLength(Axes.Y, sizeY);
			dest.get(0).setAxisLength(Axes.CHANNEL, sizeC);
		}
	}
}
