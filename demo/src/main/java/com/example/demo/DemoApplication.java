package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);

		UserService service =context.getBean(UserService.class);
		var authedU = service.upload("i m a user");
		System.out.println(authedU);
		var notAuthedU = service.upload("Bmw_f90");
		System.out.println(notAuthedU);
	}

}
