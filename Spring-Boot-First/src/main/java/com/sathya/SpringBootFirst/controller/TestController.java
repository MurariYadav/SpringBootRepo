package com.sathya.SpringBootFirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping(value="/test")
	public  String  getDisplayPage() {
		return  "display";
	}

}
