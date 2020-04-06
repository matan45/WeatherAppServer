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
public class DaysForecasts {
	private DailyDeatil[] DailyForecasts;
	private HeadLine Headline;
	
	public DaysForecasts(@JsonProperty("DailyForecasts")DailyDeatil[] dailyForecasts,@JsonProperty("Headline") HeadLine headline) {
		DailyForecasts = dailyForecasts;
		Headline = headline;
	}
	
	
}
