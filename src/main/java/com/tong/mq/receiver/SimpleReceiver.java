package com.tong.mq.receiver;

import com.tong.mq.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "FirstQueue",id = "R1")
public class SimpleReceiver {

    @RabbitHandler
    public void process(User hello){
        System.out.println("Receiver1 name="+hello.getUserName()+"   age="+hello.getAge());
    }
}