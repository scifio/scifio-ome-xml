/*
 * #%L
 * SCIFIO support for the OME data model (OME-XML and OME-TIFF).
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
 * #L%
 */

package io.scif.ome;

import io.scif.AbstractMetadata;
import io.scif.ome.xml.services.OMEXMLMetadataService;
import io.scif.ome.xml.services.OMEXMLService;
import loci.common.services.ServiceException;
import loci.formats.ome.OMEXMLMetadata;

import org.scijava.Context;
import org.scijava.plugin.Parameter;

/**
 * io.scif.Metadata class wrapping an OME-XML root.
 * 
 * @see OMEXMLMetadata
 * @see io.scif.Metadata
 * @author Mark Hiner
 */
public class OMEMetadata extends AbstractMetadata {

	// -- Constants --

	public static final String CNAME = "io.scif.ome.xml.meta.OMEMetadata";

	// -- Fields --

	/** OME core */
	protected OMEXMLMetadata root;

	@Parameter
	OMEXMLService omexmlService;

	// -- Constructor --

	public OMEMetadata(final Context context) {
		this(context, null);
	}

	public OMEMetadata(final Context context, final OMEXMLMetadata root) {
		setContext(context);
		setRoot(root);
	}

	// -- Metadata API Methods --

	@Override
	public void populateImageMetadata() {
		getContext().getService(OMEXMLMetadataService.class).populateMetadata(
			getRoot(), this);
	}

	// -- Helper Methods --

	/**
	 * Sets the root for this Metadata
	 */
	public void setRoot(final OMEXMLMetadata root) {
		this.root = root;
	}

	/**
	 * Returns the root of this Metadata
	 */
	public OMEXMLMetadata getRoot() {
		if (root == null) {
			try {
				root = omexmlService.createOMEXMLMetadata();
			}
			catch (final ServiceException e) {
				log().debug("Failed to get OME-XML Service", e);
			}
		}
		return root;
	}
}
