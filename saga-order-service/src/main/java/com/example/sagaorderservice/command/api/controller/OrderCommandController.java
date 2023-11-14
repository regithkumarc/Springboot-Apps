package com.example.sagaorderservice.command.api.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sagaorderservice.command.api.command.CreateOrderCommand;
import com.example.sagaorderservice.command.api.model.OrderRestModel;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderCommandController {

    private CommandGateway commandGateway;

    @Autowired
    public OrderCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRestModel orderRestModel) {

        String orderId = UUID.randomUUID().toString();

        CreateOrderCommand createOrderCommand
                = CreateOrderCommand.builder()
                .orderId(orderId)
                .addressId(orderRestModel.getAddressId())
                .productId(orderRestModel.getProductId())
                .quantity(orderRestModel.getQuantity())
                .orderStatus("CREATED")
                .build();

        commandGateway.sendAndWait(createOrderCommand);

        return "Order Created";
    }
}
