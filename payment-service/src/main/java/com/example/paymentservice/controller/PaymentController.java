package com.example.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/payment/")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return paymentService.doPayment(payment);
	}
	
	@GetMapping("/findByOrderId/{orderId}")
	public Payment findByOrderId(@PathVariable int orderId) {
		return paymentService.findByOrderId(orderId);
	}

}
