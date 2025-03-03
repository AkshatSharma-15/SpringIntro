package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;

@RestController
@RequestMapping("/hello")

public class helloRestController {

	@GetMapping(value = {"","/","/home"})
	public String hello() {
		return "Hello from BridgeLabz !!!";
	}

}


