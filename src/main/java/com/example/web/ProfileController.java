package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProfileController {

	@RequestMapping(value = "/")
	public String index(){
		System.out.println("aaaaaaaaaaaaaaaaaa");
		return "index";
	}
	
	@RequestMapping(value = "/oohata")
	public String oohata(){
		return "oohata";
	}
	
	@RequestMapping(value = "/sato")
	public String sato(){
		return "sato";
	}

}
