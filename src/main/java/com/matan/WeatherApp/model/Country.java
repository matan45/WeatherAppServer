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
public class Country {

	private String LocalizedName;

	public Country(@JsonProperty("LocalizedName") String localizedName) {
		LocalizedName = localizedName;
	}
	
	
}
