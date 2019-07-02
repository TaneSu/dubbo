package com.yootk.authc.dao;


import com.yootk.vo.Member;

public interface IMemberDAO {
    public Member findById(String mid);
}
