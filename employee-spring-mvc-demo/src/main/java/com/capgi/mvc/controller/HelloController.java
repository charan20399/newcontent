package com.capgi.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		//System.out.println("Hello world");
		return "hello.jsp";
	}
	@PostMapping("/do")
	public void something() {
		System.out.println("done.............");
	}
}
