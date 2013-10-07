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

package io.scif.ome;

import static org.junit.Assert.assertTrue;
import io.scif.FormatException;
import io.scif.Metadata;
import io.scif.SCIFIO;
import io.scif.ome.xml.meta.OMEXMLFormat;

import java.io.IOException;

import org.junit.Test;

/**
 * Test class to verify that metadata can be translated to OME-XML.
 * 
 * @author Mark Hiner
 */
public class OMEXMLTest {

	private final SCIFIO scifio = new SCIFIO();

	@Test
	public void extractOMEXML() throws FormatException, IOException {
		// Get Metadata describing a .fake image
		final String fakeId =
			"testImg&lengths=512,512,1,1,1&axes=X,Y,Z,Time,Channel.fake";

		final Metadata fakeMeta =
			scifio.initializer().initializeReader(fakeId).getMetadata();

		// Create omexmlformat metadata
		final Metadata omexmlMeta =
			scifio.format().getFormatFromClass(OMEXMLFormat.class).createMetadata();

		// Translate fake metadata to omexmlmetadata
		assertTrue(scifio.translator().translate(fakeMeta, omexmlMeta, false));

		// verify we have omexml
		final String omexml =
			((OMEXMLFormat.Metadata) omexmlMeta).getOMEMeta().getRoot().dumpXML();

		assertTrue(omexml.length() > 0);

		assertTrue(omexml
			.contains("<Pixels DimensionOrder=\"XYZTC\" ID=\"Pixels:0\" " +
				"PhysicalSizeX=\"1.0\" PhysicalSizeY=\"1.0\" PhysicalSizeZ=\"NaN\"" +
				" SizeC=\"1\" SizeT=\"1\" SizeX=\"512\" SizeY=\"512\" SizeZ=\"1\"" +
				" TimeIncrement=\"NaN\" Type=\"uint8\">"));
	}
}
