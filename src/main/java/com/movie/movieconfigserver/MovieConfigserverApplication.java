package com.movie.movieconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MovieConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieConfigserverApplication.class, args);
	}

}
