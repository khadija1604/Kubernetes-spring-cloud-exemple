package com.springcloud.kubernetes.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeConfig")
public class WelcomeController {
 @Value("${message: Welcome to config project}")
	private String message; 
 
 @GetMapping
 public String welcome() {
	return message;
}
}
