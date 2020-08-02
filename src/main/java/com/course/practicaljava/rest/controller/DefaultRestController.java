package com.course.practicaljava.rest.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println(StringUtils.join("Hello ","This is ","Spring Boot ", "REST API"));
		return "Welcome to Spring Boot";
	}


	@GetMapping("/time")
	public String time() {
	   return LocalTime.now().toString();
    }

}
