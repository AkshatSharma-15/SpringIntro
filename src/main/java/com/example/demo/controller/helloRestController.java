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

	@GetMapping("/query")
	public String sayHello(@RequestParam String name){
		return "Hello " + name+" from Bridgelabcz";
	}

	@GetMapping("/params/{name}")
	public String sayHelloPathVariable(@PathVariable String name){
		return "Hello " + name+" from Bridgelabz";
	}

	@PostMapping("/post")
	public String sayHelloPost(@RequestBody User user){
		return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
	}

	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + "!";
	}
}


