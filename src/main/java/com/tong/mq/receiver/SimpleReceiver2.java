package com.tong.mq.receiver;

import com.tong.mq.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "FirstQueue",id="R2")
public class SimpleReceiver2 {
    @RabbitHandler
    public void process(User hello){
        System.out.println("Receiver2 name="+hello.getUserName()+"   age="+hello.getAge());
    }
}
