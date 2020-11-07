package com.example.RestAPITLC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiTlcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiTlcApplication.class, args);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld(@RequestParam(value = "name", defaultValue = "world") String name){
		return String.format("Hello %s!", name);
	}

}
