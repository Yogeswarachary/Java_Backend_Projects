package com.patientservice;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//import com.patientservice.mapper.PatientMapper;

//import com.patientservice.mapper.PatientMapper;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@SuppressWarnings("deprecation")
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class CmdPatientServiceApplication {
	
//	@Value(value="${swagger.url.productionURL}")
//	public String productionURL;
	
//	@Value(value="${swagger.url.localURL}")
//	public String localURL;
	
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(CmdPatientServiceApplication.class, args);
	}
	
//	@Bean
//	public PatientMapper getMapperImpl() {
//		return new PatientMapper();
//	}
	
	@Bean
	public OpenAPI customOpenApi() {
		//Server productionserver=new Server();
		
		Server localserver=new Server();
		List<Server> servers=new ArrayList<>();
		
//		//productionserver.setUrl(productionURL);
//		localserver.setUrl(localURL);
//		
//		//servers.add(productionserver);
		servers.add(localserver);
//		
		OpenAPI openAPI=new OpenAPI();
		openAPI.setServers(servers);
		return openAPI;
	}

}
