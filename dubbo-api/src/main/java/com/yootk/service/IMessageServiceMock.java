package com.yootk.service;

import com.yootk.vo.Message;

public class IMessageServiceMock implements IMessageService {
    @Override
    public Message echo(Message msg) {
        Message echoMessage = new Message() ;
        echoMessage.setSender("【ECHO】Nothing...");
        echoMessage.setTitle("【ECHO】Nothing...");
        echoMessage.setContent("【ECHO】Nothing...");
        return echoMessage;
    }
}
