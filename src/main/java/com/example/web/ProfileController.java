package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProfileController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/oohata")
	public String oohata(){
		return "";
	}
	
	@RequestMapping("/sato")
	public String sato(){
		return "sato";
	}

}
