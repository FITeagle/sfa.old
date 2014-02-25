package org.fiteagle.sfa.common;

import java.util.ArrayList;
import java.util.List;

public class ListCredentials {

	private List<Credentials> credentialsList;
	
	int id ;
	public ListCredentials() {
		 this.credentialsList = new ArrayList<>();
		 this.id = this.hashCode();
	}
	
	public List<Credentials> getCredentialsList() {
		return credentialsList;
	}
	
	public void setCredentialsList(ArrayList<Credentials> credentialsList) {
		if(credentialsList != null)
		this.credentialsList = credentialsList;
	}
	
	public void addCredentials(Credentials credentials){
		if(credentials != null)
			this.credentialsList.add(credentials);
	}
	
	public Credentials getCredentials(int index){
		return credentialsList.get(index);
	}
	
	public int getId() {
		return id;
	}
}
