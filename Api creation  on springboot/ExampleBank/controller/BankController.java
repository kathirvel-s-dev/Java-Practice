package com.bank.ExampleBank.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@GetMapping("/sayhello") ///usually runs on port no 8080
	public String greeting() {
		return "hello from springboot";
	}
}
