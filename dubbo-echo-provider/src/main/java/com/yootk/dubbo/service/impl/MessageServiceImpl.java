package com.yootk.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yootk.dubbo.service.IMessageService;
import com.yootk.dubbo.vo.Message;

@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    public Message echo(Message msg) {
        Message echoMessage = new Message() ;
        echoMessage.setTitle("【ECHO - " + Thread.currentThread().getName() + "】" + msg.getTitle());
        echoMessage.setContent("【ECHO - " + Thread.currentThread().getName() + "】" + msg.getContent());
        echoMessage.setSender("【ECHO - " + Thread.currentThread().getName() + "】" + msg.getSender());
        return echoMessage;
    }
}
