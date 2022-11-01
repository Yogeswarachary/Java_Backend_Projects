package com.appointment_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableCircuitBreaker
public class CmdAuthenticationApplication {

//	@Value(value = "${swagger.url.productionURL}")
//  public String productionURL;
//  @Value(value = "${swagger.url.localURL}")
//  public String localURL;
	
	public static void main(String[] args) {
		SpringApplication.run(CmdAuthenticationApplication.class, args);
		
//		@Bean
//	    public OpenAPI customOpenAPI() {
//	       // Server productionserver = new Server();
//	        Server localserver = new Server();
//	        List<Server> servers = new ArrayList<>();
//	      // productionserver.setUrl(productionURL);
//	       localserver.setUrl(localURL);
//	        //servers.add(productionserver);
//	        servers.add(localserver);
//	        OpenAPI openAPI = new OpenAPI();
//	        openAPI.setServers(servers);
//	        return openAPI;
//	    }
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate rTemplate() {
		return new RestTemplate();
	}

}
