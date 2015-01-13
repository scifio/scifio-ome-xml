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

import java.util.List;

import io.scif.ImageMetadata;
import io.scif.Metadata;
import io.scif.ome.OMEMetadata;
import io.scif.ome.services.OMEMetadataService;

import org.scijava.plugin.Parameter;

/**
 * Abstract base class for all io.scif.Translators that translate to an
 * OMEMetadata object.
 * 
 * @author Mark Hiner
 */
public abstract class ToOMETranslator<M extends Metadata> extends
	OMETranslator<M, OMEMetadata>
{

	// -- Fields --

	@Parameter
	private OMEMetadataService omexmlMetadataService;

	// -- Translator API Methods --

	@Override
	protected void translateImageMetadata(List<ImageMetadata> source,
		OMEMetadata dest)
	{
		for (int i = 0; i < source.size(); i++) {
			omexmlMetadataService.populateMetadata(dest.getRoot(), i, dest
				.getDatasetName(), source.get(i));
		}
	}
}
