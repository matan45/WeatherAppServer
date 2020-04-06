package com.matan.WeatherApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matan.WeatherApp.model.Citykey;
import com.matan.WeatherApp.model.DaysForecasts;
import com.matan.WeatherApp.model.coronavirus.CoronaVirusModel;
import com.matan.WeatherApp.services.CoronaVirusService;
import com.matan.WeatherApp.services.WeatherService;

@RestController
@CrossOrigin("https://matan-weatherapp.herokuapp.com")
@RequestMapping("api")
public class Weather {

	CoronaVirusService corona;
	WeatherService weather;

	@Autowired
	public Weather(CoronaVirusService corona, WeatherService weather) {
		this.corona = corona;
		this.weather = weather;
	}

	@GetMapping("/coronavirus")
	public CoronaVirusModel coronavirus() {
		return corona.getData();
	}

	@GetMapping("/citykey/{cityname}")
	public Citykey[] name(@PathVariable(value = "cityname") String cityname) {
		return weather.getcitykey(cityname);
	}
	
	@GetMapping("/forecasts/{citykey}")
	public DaysForecasts forecasts(@PathVariable(value = "citykey") int cityname) {
		return weather.get5daysforecasts(cityname);
	}
}
