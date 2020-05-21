package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.demo.MySAMInterface;
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
	MySAMInterface conCa = (fname,lname) -> fname + " " + lname;
		return conCa.sconcat("Voila "," This is Akshara Avyaya.");
	}
}

