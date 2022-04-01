package com.example.bestmovies.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.vaadin.flow.component.details.Details;

import reactor.core.publisher.Mono;

@Service
public class MyService {
	private final WebClient webClient;
	
	public MyService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://api.nytimes.com/svc/movies/v2/reviews").build();
	}
	
	public Mono<Details> someRestCall(String movie, String key){
		return this.webClient.get().uri("/search.json?query={movie}&api-key={key}", movie, key).accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(Details.class);
	}
	
	
}
