package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String sayHello(Map<String,String> model) {
		System.out.println("Inside sayHello Method...");
		model.put("msg", "Hello World");
		return "hello_world";
	}
	
}
