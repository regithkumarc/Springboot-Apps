package com.example.sagapaymentservice.command.api.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

import com.example.sagacommonservice.events.PaymentCancelledEvent;
import com.example.sagacommonservice.events.PaymentProcessedEvent;
import com.example.sagapaymentservice.command.api.data.Payment;
import com.example.sagapaymentservice.command.api.data.PaymentRepository;

import java.util.Date;

@Component
public class PaymentsEventHandler {

    private PaymentRepository paymentRepository;

    public PaymentsEventHandler(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @EventHandler
    public void on(PaymentProcessedEvent event) {
        Payment payment
                = Payment.builder()
                .paymentId(event.getPaymentId())
                .orderId(event.getOrderId())
                .paymentStatus("COMPLETED")
                .timeStamp(new Date())
                .build();

        paymentRepository.save(payment);
    }

    @EventHandler
    public void on(PaymentCancelledEvent event) {
        Payment payment
                = paymentRepository.findById(event.getPaymentId()).get();

        payment.setPaymentStatus(event.getPaymentStatus());

        paymentRepository.save(payment);
    }
}
