package com.example.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

	@GetMapping("/orderFallBack")
	public Mono<String> orderServiceFallBackGet() {
		return Mono.just("Order Service Get is taking too long to respond or is down. Please try again later");
	}
	
//	@PostMapping("/orderFallBack")
//	public Mono<String> orderServiceFallBackPost() {
//		return Mono.just("Order Service Post is taking too long to respond or is down. Please try again later");
//	}
	
	@GetMapping("/paymentFallBack")
	public Mono<String> paymentServicefallBackGet() {
		return Mono.just("Payment service Get is taking too long to respond or is down. Please try again later");
	}
	
//	@PostMapping("/paymentFallBack")
//	public Mono<String> paymentServicefallBackPost() {
//		return Mono.just("Payment service Post is taking too long to respond or is down. Please try again later");
//	}
}
