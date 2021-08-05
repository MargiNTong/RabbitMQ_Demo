package com.tong.rabbitmq_demo;

import com.tong.mq.RabbitMqDemoApplication;
import com.tong.mq.sender.SimpleSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitMqDemoApplication.class)
public class RabbitmqTest {
    @Autowired
    private SimpleSender SimpleSender;
    @Test
    public void sayHello() throws InterruptedException {
       for (int i = 0; i < 10; i++) {
           SimpleSender.send();
           Thread.sleep(1000);
       }
   }
}
