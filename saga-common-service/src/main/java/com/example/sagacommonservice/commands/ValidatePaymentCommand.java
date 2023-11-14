package com.example.sagacommonservice.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import com.example.sagacommonservice.model.CardDetails;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidatePaymentCommand {

    @TargetAggregateIdentifier
    private String paymentId;
    private String orderId;
    private CardDetails cardDetails;
}
