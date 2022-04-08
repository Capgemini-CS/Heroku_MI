package com.example.heroku.herokusaaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokusaaanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokusaaanApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String helloWork() {
		return "Hello World!";
	}

}
