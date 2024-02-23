package com.example.learmspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//crrency-service.url=
//currency-service.username=
//currency-service.key=


// tek app.properties bejm konfigurimin e app qe po perdorim dhe  mund te bejm konf per gjera te ndryshme
// qe ti terg springut se per cfare kemi nevoj krijojm kte klasen e cila merret me konfigurimet

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
	
	private String url;
	private String username;
	private String key;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	

}
