package com.example.bestmovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bestmovies.service.MyService;

@SpringBootApplication
public class BestMoviesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BestMoviesApplication.class, args);
		
		MyService service = context.getBean(MyService.class);		
		
		String key = "M4RX1QJAjCOOM6ngMgEWoop1IEboLxHb";
		String movie = "godfather";
		
		System.out.println(service.someRestCall(movie, key).block());
		
		//System.out.println(service.callResult(movie, key).block());
	}

}
