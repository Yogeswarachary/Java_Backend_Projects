package net.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "docker demo application";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
