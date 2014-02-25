package org.fiteagle.sfa.common;

import java.util.List;

public abstract class SFAOptionsStruct {

	 List<? extends SFAOption> options;
	 
	 public abstract List<? extends SFAOption> getOptions();
	 
}
