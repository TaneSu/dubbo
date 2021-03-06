package com.yootk.authc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yootk.authc.dao.IMemberDAO;
import com.yootk.service.IMemberService;
import com.yootk.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MemberServiceImpl implements IMemberService {
    @Autowired
    private IMemberDAO memberDAO;
    @Override
    public Member login(Member info) {
        Member user = this.memberDAO.findById(info.getMid());
        if (info.getPassword().equals(user.getPassword()) && user.getLocked().equals(0)){
            return user;
        }
        return null;
    }
}



















