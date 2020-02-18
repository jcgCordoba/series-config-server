package com.example.bac.kseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SeriesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeriesConfigServerApplication.class, args);
	}

}
