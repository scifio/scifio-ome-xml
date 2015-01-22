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

package io.scif.ome.services;

import io.scif.SCIFIOService;
import io.scif.ome.OMEMetadata;

import java.util.Hashtable;

import loci.common.services.ServiceException;
import loci.formats.meta.MetadataRetrieve;
import loci.formats.meta.MetadataStore;
import loci.formats.ome.OMEXMLMetadata;

/** SCIFIO service wrapper for {@link loci.formats.services.OMEXMLService}. */
public interface OMEXMLService extends SCIFIOService {

	/** @see loci.formats.services.OMEXMLService#getLatestVersion() */
	public String getLatestVersion();

	/**
	 * @see loci.formats.services.OMEXMLService#transformToLatestVersion(String)
	 */
	public String transformToLatestVersion(String xml) throws ServiceException;

	/** @see loci.formats.services.OMEXMLService#createOMEXMLMetadata() */
	public OMEXMLMetadata createOMEXMLMetadata() throws ServiceException;

	/** @see loci.formats.services.OMEXMLService#createOMEXMLMetadata() */
	public OMEXMLMetadata createOMEXMLMetadata(String xml)
		throws ServiceException;

	/**
	 * @see loci.formats.services.OMEXMLService#createOMEXMLMetadata(String,
	 *      String)
	 */
	public OMEXMLMetadata createOMEXMLMetadata(String xml, String version)
		throws ServiceException;

	/** @see loci.formats.services.OMEXMLService#createOMEXMLRoot(String) */
	public Object createOMEXMLRoot(String xml) throws ServiceException;

	/** @see loci.formats.services.OMEXMLService#isOMEXMLMetadata(Object) */
	public boolean isOMEXMLMetadata(Object o);

	/** @see loci.formats.services.OMEXMLService#isOMEXMLRoot(Object) */
	public boolean isOMEXMLRoot(Object o);

	/** @see loci.formats.services.OMEXMLService#getOMEXMLVersion(Object) */
	public String getOMEXMLVersion(Object o);

	/** @see loci.formats.services.OMEXMLService#getOMEMetadata(MetadataRetrieve) */
	public OMEXMLMetadata getOMEMetadata(MetadataRetrieve src)
		throws ServiceException;

	/** @see loci.formats.services.OMEXMLService#getOMEXML(MetadataRetrieve) */
	public String getOMEXML(MetadataRetrieve src) throws ServiceException;

	/** @see loci.formats.services.OMEXMLService#validateOMEXML(String) */
	public boolean validateOMEXML(String xml);

	/** @see loci.formats.services.OMEXMLService#validateOMEXML(String, boolean) */
	public boolean validateOMEXML(String xml, boolean pixelsHack);

	/**
	 * @see loci.formats.services.OMEXMLService#populateOriginalMetadata(OMEXMLMetadata,
	 *      Hashtable)
	 */
	public void populateOriginalMetadata(OMEMetadata omexmlMeta,
		Hashtable<String, Object> metadata);

	/**
	 * @see loci.formats.services.OMEXMLService#populateOriginalMetadata(OMEXMLMetadata,
	 *      String, String)
	 */
	public void populateOriginalMetadata(OMEMetadata omexmlMeta, String key,
		String value);

	/** @see loci.formats.services.OMEXMLService#getOriginalMetadata(OMEXMLMetadata) */
	public Hashtable<String, Object>
		getOriginalMetadata(OMEXMLMetadata omexmlMeta);

	/**
	 * @see loci.formats.services.OMEXMLService#convertMetadata(String,
	 *      MetadataStore)
	 */
	public void convertMetadata(String xml, MetadataStore dest)
		throws ServiceException;

	/**
	 * @see loci.formats.services.OMEXMLService#convertMetadata(MetadataRetrieve,
	 *      MetadataStore)
	 */
	public void convertMetadata(MetadataRetrieve src, MetadataStore dest);

	/** @see loci.formats.services.OMEXMLService#removeBinData(OMEXMLMetadata) */
	public void removeBinData(OMEXMLMetadata omexmlMeta);

	/**
	 * @see loci.formats.services.OMEXMLService#removeChannels(OMEXMLMetadata, int,
	 *      int)
	 */
	public void removeChannels(OMEXMLMetadata omexmlMeta, int image, int sizeC);

	/**
	 * @see loci.formats.services.OMEXMLService#addMetadataOnly(OMEXMLMetadata,
	 *      int)
	 */
	public void addMetadataOnly(OMEXMLMetadata omexmlMeta, int image);

	/**
	 * @see loci.formats.services.OMEXMLService#isEqual(OMEXMLMetadata,
	 *      OMEXMLMetadata)
	 */
	public boolean isEqual(OMEXMLMetadata src1, OMEXMLMetadata src2);

	/** @see loci.formats.services.OMEXMLService#asStore(MetadataRetrieve) */
	public MetadataStore asStore(MetadataRetrieve meta);

	/** @see loci.formats.services.OMEXMLService#asRetrieve(MetadataStore) */
	public MetadataRetrieve asRetrieve(MetadataStore meta);

}
