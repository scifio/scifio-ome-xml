/*
 * #%L
 * SCIFIO support for the OME data model, including OME-XML and OME-TIFF.
 * %%
 * Copyright (C) 2013 - 2014 Board of Regents of the University of
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

import io.scif.ImageMetadata;
import io.scif.Metadata;
import io.scif.formats.OBFFormat;
import io.scif.ome.OMEMetadata;

import java.util.List;

import net.imglib2.meta.Axes;
import ome.xml.model.primitives.PositiveFloat;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

/**
 * Container class for translators between OME and OBF formats.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
public class OBFTranslator {

	/**
	 * Translator class from {@link io.scif.formats.OBFFormat.Metadata} to
	 * {@link io.scif.ome.OMEMetadata}
	 * <p>
	 * NB: Plugin priority is set to high to be selected over the base
	 * {@link io.scif.Metadata} translator.
	 * </p>
	 * 
	 * @author Mark Hiner
	 */
	@Plugin(type = ToOMETranslator.class, priority = Priority.HIGH_PRIORITY)
	public static class OBFOMETranslator extends
		ToOMETranslator<OBFFormat.Metadata>
	{

		// -- Translator API methods --

		@Override
		public Class<? extends Metadata> source() {
			return OBFFormat.Metadata.class;
		}

		@Override
		public Class<? extends Metadata> dest() {
			return OMEMetadata.class;
		}

		@Override
		protected void translateOMEXML(final OBFFormat.Metadata source,
			final OMEMetadata dest)
		{
			for (int image = 0; image != source.getImageCount(); ++image) {
				final ImageMetadata obf = source.get(image);

				final String name = obf.getTable().get("Name").toString();
				dest.getRoot().setImageName(name, image);

				@SuppressWarnings("unchecked")
				final List<Double> lengths =
					(List<Double>) obf.getTable().get("Lengths");

				final double lengthX = Math.abs(lengths.get(0));
				if (lengthX > 0) {
					final PositiveFloat physicalSizeX =
						new PositiveFloat(lengthX / obf.getAxisLength(Axes.X));
					dest.getRoot().setPixelsPhysicalSizeX(physicalSizeX, image);
				}
				final double lengthY = Math.abs(lengths.get(1));
				if (lengthY > 0) {
					final PositiveFloat physicalSizeY =
						new PositiveFloat(lengthY / obf.getAxisLength(Axes.Y));
					dest.getRoot().setPixelsPhysicalSizeY(physicalSizeY, image);
				}
				final double lengthZ = Math.abs(lengths.get(2));
				if (lengthZ > 0) {
					final PositiveFloat physicalSizeZ =
						new PositiveFloat(lengthZ / obf.getAxisLength(Axes.Z));
					dest.getRoot().setPixelsPhysicalSizeZ(physicalSizeZ, image);
				}
			}
		}
	}
}
