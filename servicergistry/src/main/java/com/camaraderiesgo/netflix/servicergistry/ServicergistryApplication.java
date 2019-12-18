package com.camaraderiesgo.netflix.servicergistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicergistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicergistryApplication.class, args);
	}

}
