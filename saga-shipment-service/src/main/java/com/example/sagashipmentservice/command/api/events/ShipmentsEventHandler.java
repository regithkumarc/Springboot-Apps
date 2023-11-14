package com.example.sagashipmentservice.command.api.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.sagacommonservice.events.OrderShippedEvent;
import com.example.sagashipmentservice.command.api.data.Shipment;
import com.example.sagashipmentservice.command.api.data.ShipmentRepository;

@Component
public class ShipmentsEventHandler {

    private ShipmentRepository shipmentRepository;

    public ShipmentsEventHandler(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @EventHandler
    public void on(OrderShippedEvent event) {
        Shipment shipment
                = new Shipment();
        BeanUtils.copyProperties(event,shipment);
        shipmentRepository.save(shipment);
    }
}
