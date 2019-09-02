package com.maaanfei.helloworld.service;

import com.maaanfei.helloworld.pojo.AyUser;

import java.util.List;

public interface AyUserService {
    AyUser findById(String id);
    List<AyUser> findAll();
    AyUser save(AyUser ayUser);
    void delete(String id);
}
