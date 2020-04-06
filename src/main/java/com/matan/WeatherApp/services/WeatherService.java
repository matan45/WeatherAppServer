package com.matan.WeatherApp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.matan.WeatherApp.model.Citykey;
import com.matan.WeatherApp.model.DaysForecasts;

@Service
public class WeatherService {

	@Value("${weather.url}")
	private String WEATHER_DATA_URL;

	@Value("${weather.apikey}")
	private String API_KEY;

	WebClient builder = WebClient.create();

	public Citykey[] getcitykey(String cityname) {

		Citykey[] data = builder.get()
				.uri(WEATHER_DATA_URL + "/locations/v1/cities/autocomplete?apikey=" + API_KEY + "&q=" + cityname)
				.accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(Citykey[].class).block();
		return data;
	}
	
	public DaysForecasts get5daysforecasts(int city) {

		DaysForecasts data = builder.get()
				.uri(WEATHER_DATA_URL + "/forecasts/v1/daily/5day/" + city + "?apikey=" + API_KEY + "&metric=true" )
				.accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(DaysForecasts.class).block();
		return data;
	}
}
