package com.rabbitmq.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = "lessons.demo",concurrency = "3")
    public void consume(String message) {
        System.out.println("Message Received: " + message);
    }

}
