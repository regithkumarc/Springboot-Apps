package com.example.feignservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FeignServiceController")
public class FeignServiceController {
	
	@GetMapping("/getName")
	public String getName() {
		return "getting name";
	}
	
	@GetMapping("/getStatus")
	public String getStatus() {
		return "getting status";
	}

}
