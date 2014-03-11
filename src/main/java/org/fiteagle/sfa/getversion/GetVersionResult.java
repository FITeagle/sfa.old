package org.fiteagle.sfa.getversion;

import org.fiteagle.sfa.common.AMResult;
import org.fiteagle.sfa.getversion.GetVersionValue;

public class GetVersionResult extends AMResult {
		

	private GetVersionValue value;

	public GetVersionValue getValue() {
		return this.value;
	}
	

	public void setValue(final GetVersionValue value) {
		this.value = value;
	}


	public int getGeni_api() {
		return this.value.getGeni_api();
	}

	
}
