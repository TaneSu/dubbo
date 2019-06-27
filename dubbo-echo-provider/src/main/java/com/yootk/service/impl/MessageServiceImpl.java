package com.yootk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yootk.service.IMessageService;
import com.yootk.vo.Message;

@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    public Message echo(Message msg) {
        Message echoMessage = new Message() ;
        echoMessage.setTitle("【ECHO - 3】" + msg.getTitle());
        echoMessage.setContent("【ECHO - 3】" + msg.getContent());
        echoMessage.setSender("【ECHO - 3】" + msg.getSender());
        return echoMessage;
    }
}
