package com.example.application.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("custom-property")
//Look in application.properties, property are defined as custom-property.xxxx
public class CustomConfigurationProperty {

	private String appName;
	private String appVersion;
	private String appOwner;
	
	public CustomConfigurationProperty() {

	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppOwner() {
		return appOwner;
	}
	public void setAppOwner(String appOwner) {
		this.appOwner = appOwner;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + ((appOwner == null) ? 0 : appOwner.hashCode());
		result = prime * result + ((appVersion == null) ? 0 : appVersion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomConfigurationProperty other = (CustomConfigurationProperty) obj;
		if (appName == null) {
			if (other.appName != null)
				return false;
		} else if (!appName.equals(other.appName))
			return false;
		if (appOwner == null) {
			if (other.appOwner != null)
				return false;
		} else if (!appOwner.equals(other.appOwner))
			return false;
		if (appVersion == null) {
			if (other.appVersion != null)
				return false;
		} else if (!appVersion.equals(other.appVersion))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomConfigurationProperty [appName=");
		builder.append(appName);
		builder.append(", appVersion=");
		builder.append(appVersion);
		builder.append(", appOwner=");
		builder.append(appOwner);
		builder.append("]");
		return builder.toString();
	}
	
}
