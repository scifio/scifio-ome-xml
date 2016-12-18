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
import io.scif.formats.NRRDFormat;
import io.scif.ome.OMEMetadata;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

import ome.units.UNITS;
import ome.units.quantity.Length;

/**
 * Container class for translators between OME and NRRD formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class NRRDTranslator {

	/**
	 * Translator class from {@link io.scif.formats.NRRDFormat.Metadata} to
	 * {@link OMEMetadata}
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = ToOMETranslator.class, priority = Priority.HIGH_PRIORITY)
	public static class NRRDOMETranslator extends
		ToOMETranslator<NRRDFormat.Metadata>
	{

		// -- Translator API Methods --

		@Override
		public Class<? extends Metadata> source() {
			return NRRDFormat.Metadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMEMetadata.class;
		}

		@Override
		protected void translateFormatMetadata(final NRRDFormat.Metadata source,
			final OMEMetadata dest)
		{

			final String[] pixelSizes = source.getPixelSizes();

			if (pixelSizes != null) {
				for (int i = 0; i < pixelSizes.length; i++) {
					if (pixelSizes[i] == null) continue;
					try {
						final Double d = new Double(pixelSizes[i].trim());
						if (d > 0) {
							if (i == 0) {
								dest.getRoot().setPixelsPhysicalSizeX(
									new Length(d, UNITS.MICROM), 0);
							}
							else if (i == 1) {
								dest.getRoot().setPixelsPhysicalSizeY(
									new Length(d, UNITS.MICROM), 0);
							}
							else if (i == 2) {
								dest.getRoot().setPixelsPhysicalSizeZ(
									new Length(d, UNITS.MICROM), 0);
							}
						}
						else {
							log().warn("Expected positive value for PhysicalSize; got " + d);
						}
					}
					catch (final NumberFormatException e) {}
				}
			}
		}
	}
}
