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
public class Temperature {
	private Minimum minimum;
	private Maximum maximum;
	
	public Temperature(@JsonProperty("Minimum")Minimum minimum, @JsonProperty("Maximum")Maximum maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	
}
