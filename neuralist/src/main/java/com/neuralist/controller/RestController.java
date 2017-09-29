package com.neuralist.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/api/hello")
	public String greet() {
		return "hello there!";
	}
}
