package com.onlinedemo.onlinespringsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping(value="/controller1")
@SpringBootApplication
public class OnlinespringsessionApplication {

	public static void main(String[] args) {

		SpringApplication.run(OnlinespringsessionApplication.class, args);
	}

//	@GetMapping(value="/hello1")
//	public String getData(){
//		return "Hello Spring";
//	}
}
