package org.fiteagle.sfa.getversion;

public class GeniAdRSpecVersions {
	private String type;
	private String version ;
	private String schema;
	private String namespace;
	private String[] extensions;

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(final String version) {
		this.version = version;
	}

	public String getSchema() {
		return this.schema;
	}

	public void setSchema(final String schema) {
		this.schema = schema;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(final String namespace) {
		this.namespace = namespace;
	}

	public String[] getExtensions() {
		return extensions;
	}

	public void setExtensions(String[] extensions) {
		this.extensions = extensions;
	}

}
