package com.yootk.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yootk.service.IMessageService;
import com.yootk.vo.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
//    @Reference(mock = "true",check = false)
    @Reference(mock = "return null",check = false)
    // @Reference(url = "dubbo://192.168.31.247:9327/com.yootk.dubbo.service.IMessageService")
    private IMessageService messageInstance ;
    @Test
    public void testEcho() throws Exception {
        for (int x = 0 ; x < 10000 ; x ++ ) {
            TimeUnit.SECONDS.sleep(1);
            new Thread(()->{
                Message message = new Message() ;
                message.setTitle("Hello同学们");
                message.setContent("即将迎来伟大的假期！");
                message.setSender("超级可爱的小李");
                System.out.println(this.messageInstance.echo(message));
            }).start();
        }
        TimeUnit.DAYS.sleep(Long.MAX_VALUE);
    }
}
