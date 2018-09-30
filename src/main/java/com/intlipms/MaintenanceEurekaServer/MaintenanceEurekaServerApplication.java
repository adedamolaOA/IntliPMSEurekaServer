package com.intlipms.MaintenanceEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class MaintenanceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaintenanceEurekaServerApplication.class, args);
	}
}
