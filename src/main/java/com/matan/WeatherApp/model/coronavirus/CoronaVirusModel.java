package com.matan.WeatherApp.model.coronavirus;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoronaVirusModel {
	
	private List<CountryData> Countries;
	private String Date;
	private int totalDeath;
	private int totalReportedCases;
	
	
	public CoronaVirusModel(@JsonProperty("Countries")List<CountryData> countries,@JsonProperty("Date") String date) {
		Countries = countries;
		Date = date;
	}

}
