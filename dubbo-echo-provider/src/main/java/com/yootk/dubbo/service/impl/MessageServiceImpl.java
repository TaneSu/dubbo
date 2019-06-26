package com.yootk.dubbo.service.impl;

import com.yootk.dubbo.service.IMessageService;
import com.yootk.dubbo.vo.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    public Message echo(Message msg) {
        Message echoMessage = new Message() ;
        echoMessage.setTitle("【ECHO】" + msg.getTitle());
        echoMessage.setContent("【ECHO】" + msg.getContent());
        echoMessage.setSender("【ECHO】" + msg.getSender());
        return echoMessage;
    }
}
