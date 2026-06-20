package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/")
	@ResponseBody
	public String welcome() {
		System.out.println("welcome");
		return "Welcome!";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		System.out.println("hello");
		return "Hello World!";
	}
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		System.out.println("hi");
		return "Hi World!";
	}
}