package org.fiteagle.sfa.common;
//import org.fiteagle.core.ResourceAdapterManager;
import org.fiteagle.core.aaa.authentication.KeyStoreManagement;
//import org.fiteagle.core.groupmanagement.GroupDBManager;
//import org.fiteagle.sfa.allocate.AllocateRequestProcessor;
//import org.fiteagle.sfa.delete.DeleteRequestProcessor;
//import org.fiteagle.sfa.describe.DescribeRequestProcessor;
//import org.fiteagle.sfa.getSelfCredential.GetSelfCredentialRequestProcessor;
import org.fiteagle.sfa.getversion.GetVersionRequestProcessor;
import org.fiteagle.sfa.listresources.ListResourceRequestProcessor;
//import org.fiteagle.sfa.performoperationalaction.PerformOperationalActionRequestProcessor;
//import org.fiteagle.sfa.provision.ProvisionRequestProcessor;
//import org.fiteagle.sfa.register.RegisterRequestProcessor;
//import org.fiteagle.sfa.resolve.ResolveRequestProcessor;
//import org.fiteagle.sfa.status.StatusRequestProcessor;

public class SFARequestProcessorFactory {

	private static SFARequestProcessorFactory factory = new SFARequestProcessorFactory();
	
	public static SFARequestProcessorFactory getInstance(){
		return factory;
	}
	
	@SuppressWarnings("unchecked")
	public <E extends SFAv3RequestProcessor> E createRequestProcessor(SFAv3MethodsEnum method){
		
		E result = null;
		switch(method){
//		case ALLOCATE:
//		  AllocateRequestProcessor allocateRequestProcessor = new AllocateRequestProcessor();
//		  allocateRequestProcessor.setResourceManager(ResourceAdapterManager.getInstance());
//		  result = (E) allocateRequestProcessor;
//		  
//			break;
//		case DELETE:
//			DeleteRequestProcessor delProc = new DeleteRequestProcessor();
//			delProc.setResourceManager(ResourceAdapterManager.getInstance());
//			delProc.setGroupDBManager(GroupDBManager.getInstance());
//		  result = (E) delProc;
//			break;
//		case DESCRIBE:
//			result = (E) new DescribeRequestProcessor();
//			break;
		case LIST_RESOURCES:
			result = (E) new ListResourceRequestProcessor();
			break;
//		case PERFORM_OPERATIONAL_ACTION:
//			result = (E) new PerformOperationalActionRequestProcessor();
//			break;
//		case PROVISION:
//		  ProvisionRequestProcessor provisionRequestProcessor =  new ProvisionRequestProcessor();
//		  provisionRequestProcessor.setResourceManager(ResourceAdapterManager.getInstance());
//		  result = (E) provisionRequestProcessor;
//			break;
//		case RENEW:
//			break;
//		case SHUTDOWN:
//			break;
//		case GET_SELF_CREDENTIAL:
//			result = (E) new GetSelfCredentialRequestProcessor();
//			break;
//		case STATUS:
//		  result = (E) new StatusRequestProcessor();
//			break;
		case GET_VERSION:
			result = (E) new GetVersionRequestProcessor();
			break;
//		case REGISTER: 
//		RegisterRequestProcessor registerRequestProcessor = new RegisterRequestProcessor(KeyStoreManagement.getInstance(), GroupDBManager.getInstance());
//		  result = (E) registerRequestProcessor;
//		  break;
//		case RESOLVE: 
//      result = (E) new ResolveRequestProcessor();
//      break;
		default:
			break;
			
		}
		
		return result;
	}
}
