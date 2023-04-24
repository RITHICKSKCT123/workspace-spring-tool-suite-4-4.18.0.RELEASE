package com.facebook.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FacebookRegController {

	@ResponseBody
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String Signin()
	{
		return "I am in the Signin page";
	}
	@ResponseBody
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String Signup()
	{
		return "I am in the Signup page";
	}
}
