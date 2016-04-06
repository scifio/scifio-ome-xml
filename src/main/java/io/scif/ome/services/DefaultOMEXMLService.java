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

package io.scif.ome.services;

import io.scif.ome.OMEMetadata;

import java.util.Hashtable;

import loci.common.services.DependencyException;
import loci.common.services.ServiceException;
import loci.common.services.ServiceFactory;
import loci.formats.meta.MetadataRetrieve;
import loci.formats.meta.MetadataStore;
import loci.formats.ome.OMEXMLMetadata;

import org.scijava.plugin.Plugin;
import org.scijava.service.AbstractService;
import org.scijava.service.Service;

/** Default implementation of {@link OMEXMLService}. */
@Plugin(type = Service.class)
public class DefaultOMEXMLService extends AbstractService implements
	OMEXMLService
{

	private loci.formats.services.OMEXMLService omexmlService;

	@Override
	public String getLatestVersion() {
		return omexmlService().getLatestVersion();
	}

	@Override
	public String transformToLatestVersion(final String xml)
		throws ServiceException
	{
		return omexmlService().transformToLatestVersion(xml);
	}

	@Override
	public OMEXMLMetadata createOMEXMLMetadata() throws ServiceException {
		return omexmlService().createOMEXMLMetadata();
	}

	@Override
	public OMEXMLMetadata createOMEXMLMetadata(final String xml)
		throws ServiceException
	{
		return omexmlService().createOMEXMLMetadata(xml);
	}

	@Override
	public OMEXMLMetadata createOMEXMLMetadata(String xml, final String version)
		throws ServiceException
	{
		return omexmlService().createOMEXMLMetadata(xml, version);
	}

	@Override
	public Object createOMEXMLRoot(final String xml) throws ServiceException {
		return omexmlService().createOMEXMLRoot(xml);
	}

	@Override
	public boolean isOMEXMLMetadata(final Object o) {
		return omexmlService().isOMEXMLMetadata(o);
	}

	@Override
	public boolean isOMEXMLRoot(final Object o) {
		return omexmlService().isOMEXMLRoot(o);
	}

	@Override
	public String getOMEXMLVersion(final Object o) {
		return omexmlService().getOMEXMLVersion(o);
	}

	@Override
	public OMEXMLMetadata getOMEMetadata(final MetadataRetrieve src)
		throws ServiceException
	{
		return omexmlService().getOMEMetadata(src);
	}

	@Override
	public String getOMEXML(final MetadataRetrieve src) throws ServiceException {
		return omexmlService().getOMEXML(src);
	}

	@Override
	public boolean validateOMEXML(final String xml) {
		return omexmlService().validateOMEXML(xml);
	}

	@Override
	public boolean validateOMEXML(String xml, final boolean pixelsHack) {
		return omexmlService().validateOMEXML(xml, pixelsHack);
	}

	@Override
	public void populateOriginalMetadata(final OMEMetadata omeMeta,
		final Hashtable<String, Object> metadata)
	{
		omexmlService().populateOriginalMetadata(omeMeta.getRoot(), metadata);
	}

	@Override
	public void populateOriginalMetadata(final OMEMetadata omeMeta,
		final String key, final String value)
	{
		omexmlService().populateOriginalMetadata(omeMeta.getRoot(), key, value);
	}

	@Override
	public Hashtable<String, Object> getOriginalMetadata(
		final OMEXMLMetadata omexmlMeta)
	{
		@SuppressWarnings("unchecked")
		final Hashtable<String, Object> originalMetadata =
			omexmlService().getOriginalMetadata(omexmlMeta);
		return originalMetadata;
	}

	@Override
	public void convertMetadata(final String xml, final MetadataStore dest)
		throws ServiceException
	{
		omexmlService().convertMetadata(xml, dest);
	}

	@Override
	public void convertMetadata(final MetadataRetrieve src,
		final MetadataStore dest)
	{
		omexmlService().convertMetadata(src, dest);
	}

	@Override
	public void removeBinData(final OMEXMLMetadata omexmlMeta) {
		omexmlService().removeBinData(omexmlMeta);
	}

	@Override
	public void removeChannels(final OMEXMLMetadata omexmlMeta, final int image,
		final int sizeC)
	{
		omexmlService().removeChannels(omexmlMeta, image, sizeC);
	}

	@Override
	public void addMetadataOnly(final OMEXMLMetadata omexmlMeta, final int image)
	{
		omexmlService().addMetadataOnly(omexmlMeta, image);
	}

	@Override
	public boolean isEqual(final OMEXMLMetadata src1, final OMEXMLMetadata src2) {
		return omexmlService().isEqual(src1, src2);
	}

	@Override
	public MetadataStore asStore(final MetadataRetrieve meta) {
		return omexmlService().asStore(meta);
	}

	@Override
	public MetadataRetrieve asRetrieve(final MetadataStore meta) {
		return omexmlService().asRetrieve(meta);
	}

	// -- Helper methods --

	private loci.formats.services.OMEXMLService omexmlService() {
		if (omexmlService == null) initOMEXMLService();
		return omexmlService;
	}

	private synchronized void initOMEXMLService() {
		if (omexmlService != null) return;
		try {
			final ServiceFactory serviceFactory = new ServiceFactory();
			omexmlService =
				serviceFactory.getInstance(loci.formats.services.OMEXMLService.class);
		}
		catch (final DependencyException exc) {
			throw new IllegalStateException("Cannot access OME-XML service", exc);
		}
	}

}
