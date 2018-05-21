package com.hackathon.security.springsecurityoauthserver.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class HelloResource {

	@GetMapping("/principal")
	public Principal user(Principal principal){
		return principal;
	}
	
	@GetMapping("/rest/hello")
	public String hello(){
		return "Hello World";
	}
}
