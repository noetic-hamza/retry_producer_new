package com.example.demo.util;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    private String exchange = "direct-exchange";

    public void send(String routingKey,Object message) {
        try {
            rabbitTemplate.convertAndSend(exchange, routingKey, message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
