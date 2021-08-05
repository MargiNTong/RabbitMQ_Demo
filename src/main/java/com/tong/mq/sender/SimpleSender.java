package com.tong.mq.sender;

import com.tong.mq.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
public class SimpleSender {
    @Autowired
    private AmqpTemplate rabbitmqTemolate;

    public void send(){
        String context = "hello："+new Date().getTime();
        User user = new User("Tong"+(new Date()).getTime(), 25);
        rabbitmqTemolate.convertAndSend("FirstQueue",user);
    }
}
