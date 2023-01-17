package br.gov.pa.simcomex.config.simcomexconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SimcomexConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimcomexConfigServerApplication.class, args);
	}

}
