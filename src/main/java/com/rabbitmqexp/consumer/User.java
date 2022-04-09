package com.rabbitmqexp.consumer;

import com.rabbitmqexp.config.MessagingConfig;
import com.rabbitmqexp.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class User {

    private Logger logger = Logger.getLogger(User.class.getName());

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
       logger.log(Level.INFO ,"Message received from queue: {0}" , orderStatus);
    }

}
