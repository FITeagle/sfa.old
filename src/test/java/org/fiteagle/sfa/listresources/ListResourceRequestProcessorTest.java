package org.fiteagle.sfa.listresources;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.easymock.EasyMock;
import org.fiteagle.api.core.ResourceRepository;
import org.fiteagle.sfa.common.AMResult;
import org.fiteagle.sfa.common.Authorization;
import org.fiteagle.sfa.common.Credentials;
import org.fiteagle.sfa.common.Geni_RSpec_Version;
import org.fiteagle.sfa.common.ListCredentials;
import org.fiteagle.sfa.rspec.advertisement.AvailableContents;
import org.fiteagle.sfa.rspec.advertisement.LocationContents;
import org.fiteagle.sfa.rspec.advertisement.NodeContents;
import org.fiteagle.sfa.rspec.advertisement.ObjectFactory;
import org.fiteagle.sfa.rspec.advertisement.RSpecContents;
import org.junit.Assert;
import org.junit.Test;

public class ListResourceRequestProcessorTest {

	@Test
	public void testProcessRequest() throws JAXBException {

		String resourceRepositoryResult = getMockRepositoryResponse();

		ResourceRepository resourceRepository = EasyMock
				.createMock(ResourceRepository.class);
		EasyMock.expect(resourceRepository.listResources()).andReturn(
				resourceRepositoryResult);
		ListResourceRequestProcessor listResourcesRequestProcessor = new ListResourceRequestProcessor();
		ListResourceRequestProcessor.setResourceRepository(resourceRepository);

		EasyMock.replay(resourceRepository);

		ListCredentials credentials = getMockListCredentials();
		ListResourceOptions options = getMockTestListResourceOptions("GENI",
				"3");

		AMResult listResourcesResult = listResourcesRequestProcessor
				.processRequest(credentials, options);

		// EasyMock.verify(listResourcesRequestProcessor);

		Assert.assertNotNull(listResourcesResult);

		Assert.assertEquals(0, listResourcesResult.getCode().getGeni_code());
		Assert.assertTrue(((String) listResourcesResult.getValue())
				.contains("node"));

	}

	private String getMockRepositoryResponse() throws JAXBException {
		RSpecContents adRSpecContents = new RSpecContents();
		adRSpecContents.setType("advertisement");
		List<Object> rspecElements = adRSpecContents.getAnyOrNodeOrLink();
		Object node = createMockNode();
		rspecElements.add(node);

		return getStringFromAdvertisedRSpec(adRSpecContents);
	}

	private String getStringFromAdvertisedRSpec(RSpecContents adRSpecContents) throws JAXBException {
		JAXBElement<RSpecContents> rspecElem = new ObjectFactory()
				.createRspec(adRSpecContents);

		JAXBContext context = JAXBContext
				.newInstance("org.fiteagle.sfa.rspec.advertisement");
		Marshaller marshaller = context.createMarshaller();
		marshaller
				.setProperty(
						Marshaller.JAXB_SCHEMA_LOCATION,
						"http://www.geni.net/resources/rspec/3 http://www.geni.net/resources/rspec/3/ad.xsd");
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(rspecElem, stringWriter);

		return stringWriter.toString();

	}

	private Object createMockNode() {
		NodeContents node = new NodeContents();

		node.setComponentId("testCompId");
		node.setComponentManagerId("testComponentManagerId");
		node.setExclusive(true);

		List<Object> nodeContent = node.getAnyOrRelationOrLocation();
		AvailableContents available = new AvailableContents();
		available.setNow(true);
		nodeContent.add(new ObjectFactory().createAvailable(available));

		LocationContents location = new LocationContents();
		location.setCountry("DE");
		location.setLatitude("12.12312");
		location.setLongitude("0.3232");
		nodeContent.add(new ObjectFactory().createLocation(location));
		return new ObjectFactory().createNode(node);
	}

	private ListCredentials getMockListCredentials() {
		Credentials credentials = new Credentials();
		credentials.setGeni_type(Authorization.GENI_TYPE);
		credentials.setGeni_version(Authorization.GENI_VERSION);
		ListCredentials listCredentials = new ListCredentials();
		listCredentials.getCredentialsList().add(credentials);
		return listCredentials;
	}

	// private Object getMockValue() {
	// return new Object();
	// }
	//
	// private AMCode getMockReturnCode() {
	// AMCode amCode = new AMCode();
	// amCode.setGeni_code(GENI_CodeEnum.SUCCESS);
	// return amCode;
	// }
	//
	// private String getMockOutput() {
	// // TODO Auto-generated method stub
	// return "something";
	// }

	private ListResourceOptions getMockTestListResourceOptions(String type,
			String version) {
		ListResourceOptions options = new ListResourceOptions();
		Geni_RSpec_Version geni_rspec_version = new Geni_RSpec_Version();
		geni_rspec_version.setType(type);
		geni_rspec_version.setVersion(version);
		options.setGeni_rspec_version(geni_rspec_version);
		return options;
	}

}
