package org.redrock.mysc.cpforezp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@RestController
@SpringBootApplication
public class CpforezpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpforezpApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/mysctest")
	public String home(@RequestParam String name) {
		return "hi" + name + ",  this is my port:" + port;
	}

}
