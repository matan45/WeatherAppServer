package com.matan.WeatherApp.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.matan.WeatherApp.model.coronavirus.CoronaVirusModel;



@Service
public class CoronaVirusService {
	
	@Value("${coronavirus.url}")
	private String VIRUS_DATA_URL;

	private CoronaVirusModel data;

	WebClient builder = WebClient.create();

	@PostConstruct
	@Scheduled(cron = "0 0 1 * * *")
	public void fetchVirusData() {

		data = builder.get().uri(VIRUS_DATA_URL).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToMono(CoronaVirusModel.class).block();

		int total = 0;
		
		data.setDate(data.getDate().substring(0, 10));

		for (int i = 1; i < data.getCountries().size(); i++) {
			total += data.getCountries().get(i).getTotalDeaths();
		}
		data.setTotalDeath(total);
		
		total = 0;
		for (int i = 1; i < data.getCountries().size(); i++) {
			total += data.getCountries().get(i).getTotalConfirmed();
		}
		data.setTotalReportedCases(total);
	}

	public CoronaVirusModel getData() {
		return data;
	}

}
