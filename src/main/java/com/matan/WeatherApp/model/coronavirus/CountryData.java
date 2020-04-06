package com.matan.WeatherApp.model.coronavirus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryData {

	private String Country;
	private Integer NewConfirmed;
	private Integer TotalConfirmed;
	private Integer NewDeaths;
	private Integer TotalDeaths;
	private Integer NewRecovered;
	private Integer TotalRecovered;

	public CountryData(@JsonProperty("Country") String country, @JsonProperty("NewConfirmed") Integer newConfirmed,
			@JsonProperty("TotalConfirmed") Integer totalConfirmed, @JsonProperty("NewDeaths") Integer newDeaths,
			@JsonProperty("TotalDeaths") Integer totalDeaths, @JsonProperty("NewRecovered") Integer newRecovered,
			@JsonProperty("TotalRecovered") Integer totalRecovered) {
		Country = country;
		NewConfirmed = newConfirmed;
		TotalConfirmed = totalConfirmed;
		NewDeaths = newDeaths;
		TotalDeaths = totalDeaths;
		NewRecovered = newRecovered;
		TotalRecovered = totalRecovered;
	}

}
