package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CmdEurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmdEurekaDiscoveryServerApplication.class, args);
	}

}
