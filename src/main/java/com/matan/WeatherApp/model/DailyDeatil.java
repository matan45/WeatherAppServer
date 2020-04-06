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
public class DailyDeatil {
	private String Date;
	private Temperature temperature;
	private Day day;
	private Night night;

	public DailyDeatil(@JsonProperty("Date") String date, @JsonProperty("Temperature") Temperature temperature,
			@JsonProperty("Day") Day day, @JsonProperty("Night") Night night) {
		Date = date;
		this.temperature = temperature;
		this.day = day;
		this.night = night;
	}

}
