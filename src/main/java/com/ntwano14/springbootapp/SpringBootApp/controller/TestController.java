package com.ntwano14.springbootapp.SpringBootApp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Ntwanano Mathebula");
		object.put("email", "ntwano14@gmail.com");
		return object;
	}

}
