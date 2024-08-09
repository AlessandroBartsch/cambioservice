package com.ale.cambioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CambioserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CambioserviceApplication.class, args);
	}

}
