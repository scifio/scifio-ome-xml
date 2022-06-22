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

import io.scif.Metadata;
import io.scif.ome.OMEMetadata;

import org.scijava.Priority;
import org.scijava.plugin.Plugin;

/**
 * Basic translator for OME Metadata. Uses ImageMetadata to populate a
 * MetadataStore.
 * 
 * @author Mark Hiner hinerm at gmail.com
 */
@Plugin(type = ToOMETranslator.class, priority = Priority.NORMAL)
public class DefaultOMETranslator extends ToOMETranslator<Metadata> {

	// -- Translator API Methods --

	@Override
	public Class<? extends Metadata> source() {
		return Metadata.class;
	}

	@Override
	public Class<? extends Metadata> dest() {
		return OMEMetadata.class;
	}
}
