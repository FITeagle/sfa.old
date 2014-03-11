package org.fiteagle.sfa.listresources;

import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.fiteagle.api.core.ResourceRepository;
import org.fiteagle.sfa.common.AMCode;
import org.fiteagle.sfa.common.AMResult;
import org.fiteagle.sfa.common.GENI_CodeEnum;
import org.fiteagle.sfa.common.ListCredentials;
//
//import java.util.List;
//
////import org.fiteagle.adapter.common.ResourceAdapter;
////import org.fiteagle.adapter.common.ResourceProperties;
////import org.fiteagle.core.ResourceAdapterManager;
//import org.fiteagle.sfa.common.AMCode;
//import org.fiteagle.sfa.common.Authorization;
//import org.fiteagle.sfa.common.GENI_CodeEnum;
//import org.fiteagle.sfa.common.ListCredentials;
import org.fiteagle.sfa.common.SFAv3RequestProcessor;
import org.fiteagle.sfa.rspec.advertisement.AvailableContents;
import org.fiteagle.sfa.rspec.advertisement.LocationContents;
import org.fiteagle.sfa.rspec.advertisement.NodeContents;
import org.fiteagle.sfa.rspec.advertisement.ObjectFactory;
////import org.fiteagle.sfa.rspec.advertisement.AdvertisementRspecTranslator;
//import org.fiteagle.sfa.rspec.advertisement.RSpecContents;
//
import org.fiteagle.sfa.rspec.advertisement.RSpecContents;

public class ListResourceRequestProcessor extends SFAv3RequestProcessor {

	private static ResourceRepository resourceRepository;

	@Override
	public AMResult processRequest(ListCredentials credentials,
			Object... specificArgs) {

		ListResourceOptions options = (ListResourceOptions) specificArgs[0];
		// TODO: this is a mock response. Connect to core and get the
		// information about resources and parse them to RSpec advertisement
		// TODO: check credentials
		// TODO: check options
		
		if(resourceRepository == null){
			addResourceRepository();
		}
		
		ListResourcesResult result = null;
		
		try {
			result = getResult(credentials, options);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result; 
	}
	
	
	private void addResourceRepository() {
		//TODO: lookup and set Repository for ListResourceRequestProcessor
//		this is only to test, get the real values from the interfaces!!
		
	}

	private ListResourcesResult getResult(ListCredentials listCredentials,
			ListResourceOptions options) throws JAXBException {

		System.out.println("get resut is called...");
		Object value = getValue();
		String output = getOutput();
		AMCode returnCode = getReturnCode();
		
		System.out.println("all methods are called and the returned values are: value= "+value+" output= "+output+" return code: "+returnCode);

		ListResourcesResult result = new ListResourcesResult();

		result.setCode(returnCode);
		result.setOutput(output);
		result.setValue(value);
		System.out.println("result is: "+result);
		
		return result;
	}

	public AMCode getReturnCode() {
		//TODO: extend/correct this method!
		AMCode amCode = new AMCode();
		amCode.setGeni_code(GENI_CodeEnum.SUCCESS);
		return amCode;
	}

	public String getOutput() {
		// TODO: see what to send here!
		return "";
	}

	public Object getValue() throws JAXBException {
//		return resourceRepository.listResources();
//		TODO: change this. this is only for test!
		return getMockRepositoryResponse();
	}
	private String getMockRepositoryResponse() throws JAXBException {
		RSpecContents adRSpecContents = new RSpecContents();
		adRSpecContents.setType("advertisement");
		List<Object> rspecElements = adRSpecContents.getAnyOrNodeOrLink();
		Object node = createMockNode();
		rspecElements.add(node);
		
		return getStringFromAdvertisedRSpec(adRSpecContents);
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
	
	

	public static ResourceRepository getResourceRepository() {
		return resourceRepository;
	}

	public static void setResourceRepository(ResourceRepository resourceRepository) {
		ListResourceRequestProcessor.resourceRepository = resourceRepository;
	}

	//
	// private ResourceAdapterManager resourceManager;
	// private ListResourceOptionsService optionsService;
	//

	// TODO: Get the needed method here and the response as mock(list of nodes
	// with OS etc.. in it).
	// TODO: delete unnecessary classes and parts in them! such as SFA
	// interactor staff.
	// TODO: write a test case for this class only for processRequest method!

	// public ListResourceRequestProcessor() {
	// resourceManager = ResourceAdapterManager.getInstance();
	// }
	//
	//
	// private ListResourcesResult getResult(ListCredentials listCredentials,
	// ListResourceOptions options) {
	//
	// Object value = "";
	// String output = "";
	// AMCode returnCode = null;
	//
	// Authorization auth = new Authorization();
	//
	// auth.checkCredentialsList(listCredentials);
	//
	// if (!auth.areCredentialTypeAndVersionValid()) {
	// returnCode = auth.getReturnCode();
	// output = auth.getAuthorizationFailMessage();
	// ListResourcesResult result = new ListResourcesResult();
	// result.setCode(returnCode);
	// result.setOutput(output);
	// result.setValue(value);
	// return result;
	// }
	//
	// checkOptions(options);
	//
	// ListResourcesResult result = new ListResourcesResult();
	// if (optionsAreValid()) {
	// value = getValue();
	//
	// if (this.optionsService.isCompressed()) {
	// result.setValue(this.compress((String) value));
	// } else {
	// result.setValue(value);
	// }
	//
	// output = getOutput();
	// returnCode = getRuntimeReturnCode();
	// } else {
	// returnCode = getOptionsValidationReturnCode();
	// output = getOptionsValidationOutput();
	// }
	// result.setCode(returnCode);
	// result.setOutput(output);
	// return result;
	// }
	//
	// private String getOptionsValidationOutput() {
	//
	// return optionsService.getErrorOutput();
	// }
	//
	// private AMCode getRuntimeReturnCode() {
	// if (runTimeReturnCode == null) {
	// runTimeReturnCode = new AMCode();
	// runTimeReturnCode.setGeni_code(GENI_CodeEnum.SUCCESS);
	// }
	// return runTimeReturnCode;
	// }
	//
	// private void checkOptions(ListResourceOptions options) {
	// if (optionsService == null)
	// this.optionsService = new ListResourceOptionsService(options);
	//
	// optionsService.checkOptions();
	//
	// }
	//
	// private String getOutput() {
	// return outPutString;
	// }
	//
	// private Object getValue() {
	//
	// List<ResourceAdapter> resourceAdapters;
	// RSpecContents advertisedRspec;
	//
	// if (optionsService.isAvailableSet()) {
	// resourceAdapters =
	// resourceManager.getResourceAdapterInstancesAvailable();
	// }
	// else{
	// resourceAdapters = resourceManager.getResourceAdapterInstances();
	// }
	// AdvertisementRspecTranslator adTranslator = new
	// AdvertisementRspecTranslator();
	// advertisedRspec = adTranslator.getAdvertisedRSpec(resourceAdapters);
	// String advertisedRspecSTR =
	// adTranslator.getAdvertisedRSpecString(advertisedRspec);
	//
	// return advertisedRspecSTR;
	//
	// }
	//
	// private boolean optionsAreValid() {
	//
	// return optionsService.areOptionsValid();
	// }
	//
	// private AMCode getOptionsValidationReturnCode() {
	//
	// return optionsService.getErrorCode();
	// }
	//
}
