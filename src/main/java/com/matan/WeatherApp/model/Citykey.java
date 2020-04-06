package com.matan.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Citykey {
	
	private int Key;
	private String LocalizedName;
	private Country country;
	
	public Citykey(@JsonProperty("Key")int key,@JsonProperty("LocalizedName") String localizedName,@JsonProperty("Country") Country country) {
		Key = key;
		LocalizedName = localizedName;
		this.country = country;
	}
	
	
}
