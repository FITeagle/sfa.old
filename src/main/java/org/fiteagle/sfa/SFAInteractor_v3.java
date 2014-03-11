package org.fiteagle.sfa;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.fiteagle.core.aaa.authentication.x509.X509Util;
//import org.fiteagle.sfa.allocate.AllocateOptions;
//import org.fiteagle.sfa.allocate.AllocateRequestProcessor;
//import org.fiteagle.sfa.allocate.AllocateResult;
import org.fiteagle.sfa.common.AMCode;
import org.fiteagle.sfa.common.AMResult;
import org.fiteagle.sfa.common.ListCredentials;
import org.fiteagle.sfa.common.SFARequestProcessorFactory;
import org.fiteagle.sfa.common.SFAv3MethodsEnum;
//import org.fiteagle.sfa.delete.DeleteOptions;
//import org.fiteagle.sfa.delete.DeleteRequestProcessor;
//import org.fiteagle.sfa.delete.DeleteResult;
//import org.fiteagle.sfa.describe.DescribeOptions;
//import org.fiteagle.sfa.describe.DescribeRequestProcessor;
//import org.fiteagle.sfa.describe.DescribeResult;
import org.fiteagle.sfa.getSelfCredential.GetSelfCredentialRequestProcessor;
import org.fiteagle.sfa.getversion.GetVersionRequestProcessor;
import org.fiteagle.sfa.getversion.GetVersionResult;
import org.fiteagle.sfa.listresources.ListResourceOptions;
import org.fiteagle.sfa.listresources.ListResourceRequestProcessor;
import org.fiteagle.sfa.listresources.ListResourcesResult;
//import org.fiteagle.sfa.performoperationalaction.PerformOperationalActionOptions;
//import org.fiteagle.sfa.performoperationalaction.PerformOperationalActionRequestProcessor;
//import org.fiteagle.sfa.performoperationalaction.PerformOperationalActionResult;
//import org.fiteagle.sfa.provision.ProvisionOptions;
//import org.fiteagle.sfa.provision.ProvisionRequestProcessor;
//import org.fiteagle.sfa.provision.ProvisionResult;
//import org.fiteagle.sfa.register.RegisterRequestProcessor;
//import org.fiteagle.sfa.resolve.ResolveRequestProcessor;
import org.fiteagle.sfa.rspec.request.RSpecContents;
//import org.fiteagle.sfa.status.StatusOptions;
//import org.fiteagle.sfa.status.StatusRequestProcessor;
//import org.fiteagle.sfa.status.StatusResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SFAInteractor_v3 implements ISFA {

	
	private final SFARequestProcessorFactory requestProcessorFactor = SFARequestProcessorFactory.getInstance();
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	private X509Certificate certificate;
	
	@Override
	public GetVersionResult getVersion() throws IOException {
		
		GetVersionRequestProcessor getVersionRequestProcessor = requestProcessorFactor.createRequestProcessor(SFAv3MethodsEnum.GET_VERSION);
		
		final GetVersionResult getVersionResult = getVersionRequestProcessor.processRequest();		
		return getVersionResult;
	}

	@Override
	public AMResult listResources(ListCredentials credentials,
			ListResourceOptions listResourceOptions) throws IOException {
		
	
		ListResourceRequestProcessor listResourceRequestProcessor = requestProcessorFactor.createRequestProcessor(SFAv3MethodsEnum.LIST_RESOURCES);
		AMResult result = listResourceRequestProcessor.processRequest(credentials, listResourceOptions);
		
		AMCode returnCode = result.getCode();
		//Do something
		
		return result;
		
	}
	
//	@Override
//	public DescribeResult describe(ArrayList<String> urns, ListCredentials credentials,
//			DescribeOptions describeOptions) throws IOException {
//		
//		SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
//		DescribeRequestProcessor describeRequestProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.DESCRIBE);
//		DescribeResult result = describeRequestProcessor.processRequest(urns, credentials, describeOptions);
//		
//		return result;
//		
//	}
//
//  @Override
//  public List<Map<String, Object>> resolve(String urn, String credential) {
//    SFARequestProcessorFactory sfaRequestProcessorFactory = new SFARequestProcessorFactory();
//    ResolveRequestProcessor process =  sfaRequestProcessorFactory.createRequestProcessor(SFAv3MethodsEnum.RESOLVE);
//    return process.resolve(urn,credential);
//  }
//
  @Override
  public String getSelfCredential(String certificate, String xrn, String type) {
	  SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
	  GetSelfCredentialRequestProcessor getSelfCredentialRequestProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.GET_SELF_CREDENTIAL);
	  String result = getSelfCredentialRequestProcessor.processRequest(certificate, xrn, type);
	  log.debug(result.toString());
	  return result;
  }

  @Override
  public String getCredential(String credential, String xrn, String type) {
    log.debug("GetCredential");
    log.debug(credential);
    log.debug("target: " + xrn);
    log.debug("type: "+ type);
    return credential;
//    return "";
  }
  
  @Override
  public HashMap<String, Object> getCredential() {
    if(this.certificate!=null){
      Collection<List<?>> alternativeNamesCollection;
      try {
        alternativeNamesCollection = certificate.getSubjectAlternativeNames();
      } catch (CertificateParsingException e) {
        e.printStackTrace();
        throw new RuntimeException();//TODO: specify this.
      }
      
      Iterator<?> iter =  alternativeNamesCollection.iterator();
      String urn = "";
      while(iter.hasNext()){
        List<?> altName = (List<?>) iter.next();
        String altNameString = (String) altName.get(1);
        if (altName.get(0).equals(Integer.valueOf(6)) && altNameString.contains("+user+")) {
          urn = (String) altName.get(1);
        }
      }
      String response="";
      try {
        response =  getSelfCredential(X509Util.getCertficateEncoded(certificate), urn, "user");
      } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException();//TODO: specify this.
      }
      
      HashMap<String, Object> result = new HashMap<>();
      result.put("value", response);
      result.put("code", 0);
      result.put("output", "");
      return result;
    }
    return null;
  }
  
//  @Override
//  public AllocateResult allocate(String urn, ListCredentials credentials, RSpecContents requestRspec, AllocateOptions allocateOptions) throws IOException {
//    
//    SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
//    AllocateRequestProcessor allocateRequestProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.ALLOCATE);
//    allocateRequestProcessor.setUserCertificate(certificate);
//    AllocateResult result = allocateRequestProcessor.processRequest(urn, credentials, requestRspec, allocateOptions);
//    return result;
//    
//  }
//  
//  @Override
//  public ProvisionResult provision(ArrayList<String> urns, ListCredentials credentials, ProvisionOptions provisionOptions) throws IOException {
//    
//    SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
//    ProvisionRequestProcessor provisionRequestProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.PROVISION);
//    ProvisionResult result = provisionRequestProcessor.processRequest(urns, credentials, provisionOptions);
//    return result;
//    
//  }
//  
//  @Override
//  public StatusResult status(ArrayList<String> urns, ListCredentials credentials,
//      StatusOptions statusOptions) throws IOException {
//    
//    SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
//    StatusRequestProcessor statusRequestProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.STATUS);
//    StatusResult result = statusRequestProcessor.processRequest(urns, credentials, statusOptions);
//    
//    return result;
//    
//  }
//
//  @Override
//  public DeleteResult delete(ArrayList<String> urns, ListCredentials credentials,
//      DeleteOptions deleteOptions) throws IOException {
//    
//    SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
//    DeleteRequestProcessor deleteRequestProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.DELETE);
//    DeleteResult result = deleteRequestProcessor.processRequest(urns, credentials, deleteOptions);
//    
//    return result;
//    
//  }
//  
//  
//  @Override
//  public PerformOperationalActionResult performOperationalAction(ArrayList<String> urns, ListCredentials credentials, String action, PerformOperationalActionOptions performOpActionOptions) throws IOException {
//    SFARequestProcessorFactory sfaRequestProcFactory = new SFARequestProcessorFactory();
//    PerformOperationalActionRequestProcessor performOperationalActionProcessor = sfaRequestProcFactory.createRequestProcessor(SFAv3MethodsEnum.PERFORM_OPERATIONAL_ACTION);
//    PerformOperationalActionResult result = performOperationalActionProcessor.processRequest(urns, credentials, action, performOpActionOptions);
//    return result;
//    
//  }

  public X509Certificate getCertificate() {
    return certificate;
  }

  public void setCertificate(X509Certificate certificate) {
    this.certificate = certificate;
  }

//  @Override
//  public HashMap<String, Object> register(HashMap<String, Object> registerParameters) {
//    SFARequestProcessorFactory sfaRequestProcessorFactory = new SFARequestProcessorFactory();
//    RegisterRequestProcessor registerRequestProcessor = sfaRequestProcessorFactory.createRequestProcessor(SFAv3MethodsEnum.REGISTER);
//    return registerRequestProcessor.register(registerParameters);
//  }




}
