package com.twitter.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterLoginContoller {
    
    @GetMapping("/login/{userId}")
    
	public String login(@PathVariable("userId") String userId)
	{
		return "Login Successful for "+userId;
	}
}
