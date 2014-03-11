package org.fiteagle.sfa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fiteagle.sfa.common.AMResult;
//import org.fiteagle.sfa.allocate.AllocateOptions;
//import org.fiteagle.sfa.allocate.AllocateResult;
import org.fiteagle.sfa.common.ListCredentials;
//import org.fiteagle.sfa.delete.DeleteOptions;
//import org.fiteagle.sfa.delete.DeleteResult;
//import org.fiteagle.sfa.describe.DescribeOptions;
//import org.fiteagle.sfa.describe.DescribeResult;
import org.fiteagle.sfa.getversion.GetVersionResult;
import org.fiteagle.sfa.listresources.ListResourceOptions;
import org.fiteagle.sfa.listresources.ListResourcesResult;
//import org.fiteagle.sfa.performoperationalaction.PerformOperationalActionOptions;
//import org.fiteagle.sfa.performoperationalaction.PerformOperationalActionResult;
//import org.fiteagle.sfa.provision.ProvisionOptions;
//import org.fiteagle.sfa.provision.ProvisionResult;
import org.fiteagle.sfa.rspec.request.RSpecContents;
//import org.fiteagle.sfa.status.StatusOptions;
//import org.fiteagle.sfa.status.StatusResult;

public interface ISFA {
	public static final int ERRORCODE_SUCCESS = 0;

	public static final String KEY_GENI_API = "geni_api";
	public static final String KEY_CODE = "code";
	public static final String KEY_GENI_CODE = "geni_code";
	public static final String KEY_VALUE = "value";
	public static final String KEY_API_VERSIONS = "api_versions";
	public static final String KEY_RSPEC_VERSIONS = "geni_request_rspec_versions";
	public static final String KEY_VERSION = "version";
	public static final String KEY_TYPE = "type";

	 GetVersionResult getVersion() throws IOException;
	AMResult listResources(ListCredentials credentials,
			ListResourceOptions listResourceOptions) throws IOException;

	// List<Map<String,Object>> resolve(String o1, String o2);
	 String getSelfCredential(String certificate, String xrn, String type);
	 String getCredential(String credential, String xrn, String type);

	// DescribeResult describe(ArrayList<String> urns, ListCredentials
	// credentials,
	// DescribeOptions describeOptions) throws IOException;
	// AllocateResult allocate(String urn, ListCredentials credentials,
	// RSpecContents requestRspec,
	// AllocateOptions allocateOptions) throws IOException;
	// ProvisionResult provision(ArrayList<String> urns, ListCredentials
	// credentials, ProvisionOptions provisionOptions)
	// throws IOException;
	// StatusResult status(ArrayList<String> urns, ListCredentials credentials,
	// StatusOptions statusOptions)
	// throws IOException;
	// DeleteResult delete(ArrayList<String> urns, ListCredentials credentials,
	// DeleteOptions deleteOptions)
	// throws IOException;
	 HashMap<String, Object> getCredential();
	// HashMap<String, Object> register(HashMap<String, Object>
	// registerParameters);
	// PerformOperationalActionResult performOperationalAction(ArrayList<String>
	// urns, ListCredentials credentials, String action,
	// PerformOperationalActionOptions performOpActionOptions)
	// throws IOException;

}
