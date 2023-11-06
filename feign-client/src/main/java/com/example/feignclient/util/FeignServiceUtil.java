package com.example.feignclient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo",url="http://localhost:8087/FeignServiceController/")
public interface FeignServiceUtil {
	
	@GetMapping("/getName")
	public String getName();
	
	@GetMapping("/getStatus")
	public String getStatus();

}
