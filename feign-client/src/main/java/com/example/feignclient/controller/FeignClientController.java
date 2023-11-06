package com.example.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.util.FeignServiceUtil;

@RestController
@RequestMapping("/FeignClientController")
public class FeignClientController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/feign-name")
	public String getName() {
		return feignServiceUtil.getName();
	}
	
	@GetMapping("/feign-status")
	public String getStatus() {
		return feignServiceUtil.getStatus();
	}
}
