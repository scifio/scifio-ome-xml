/*
 * #%L
 * SCIFIO support for the OME data model, including OME-XML and OME-TIFF.
 * %%
 * Copyright (C) 2013 - 2015 Board of Regents of the University of
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
import io.scif.formats.BMPFormat;
import io.scif.ome.OMEMetadata;
import ome.units.UNITS;
import ome.units.quantity.Length;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

/**
 * Container class for translators between OME and BMP formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class BMPTranslator {

	/**
	 * Translator class from {@link io.scif.formats.BMPFormat.Metadata} to
	 * {@link OMEMetadata}
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = ToOMETranslator.class, priority = Priority.HIGH_PRIORITY)
	public static class BMPOMETranslator extends
		ToOMETranslator<BMPFormat.Metadata>
	{

		// -- Translator API Methods --

		@Override
		public Class<? extends Metadata> source() {
			return BMPFormat.Metadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMEMetadata.class;
		}

		@Override
		protected void translateFormatMetadata(final BMPFormat.Metadata source,
			final OMEMetadata dest)
		{
			// resolution is stored as pixels per meter; we want to convert to
			// microns per pixel

			final Integer pixelSizeX = (Integer) source.getTable().get("X resolution");

			final Integer pixelSizeY = (Integer) source.getTable().get("Y resolution");

			final double correctedX =
				pixelSizeX == null || pixelSizeX == 0 ? 0.0 : 1000000.0 / pixelSizeX;
			final double correctedY =
				pixelSizeY == null || pixelSizeY == 0 ? 0.0 : 1000000.0 / pixelSizeY;

			if (correctedX > 0) {
				dest.getRoot().setPixelsPhysicalSizeX(
					new Length(correctedX, UNITS.MICROM), 0);
			}
			else {
				log().warn(
					"Expected positive value for PhysicalSizeX; got " + correctedX);
			}
			if (correctedY > 0) {
				dest.getRoot().setPixelsPhysicalSizeY(
					new Length(correctedY, UNITS.MICROM), 0);
			}
			else {
				log().warn(
					"Expected positive value for PhysicalSizeY; got " + correctedY);
			}
		}
	}
}
