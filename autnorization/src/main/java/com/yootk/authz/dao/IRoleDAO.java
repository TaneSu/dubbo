package com.yootk.authz.dao;

import java.util.Set;

public interface IRoleDAO {
    public Set<String> findAllByMember(String mid);
}