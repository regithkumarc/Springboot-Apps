package com.example.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.Payment;
import com.example.orderservice.entity.TransactionRequest;
import com.example.orderservice.entity.TransactionResponse;
import com.example.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse bookOrder(TransactionRequest transactionRequest) {
		
		Order order = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		String response = "";
		//rest call
		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		System.out.println("paymentResponse : " + paymentResponse);
		response = paymentResponse.getPaymentStatus().equals("Success") ? "Payment processing is successful and order placed" : "There is a failure in payment api,Order added to cart";;
		orderRepository.save(order);
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}

}
