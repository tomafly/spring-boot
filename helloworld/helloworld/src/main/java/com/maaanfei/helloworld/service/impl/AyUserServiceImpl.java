package com.maaanfei.helloworld.service.impl;

import com.maaanfei.helloworld.pojo.AyUser;
import com.maaanfei.helloworld.repository.AyUserRepository;
import com.maaanfei.helloworld.service.AyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AyUserServiceImpl implements AyUserService {

    @Resource
    private AyUserRepository ayUserRepository;

    @Override
    public AyUser findById(String id) {
        return ayUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<AyUser> findAll() {
        return ayUserRepository.findAll();
    }

    @Override
    public AyUser save(AyUser ayUser) {
        return ayUserRepository.save(ayUser);
    }

    @Override
    public void delete(String id) {
        ayUserRepository.deleteById(id);
    }
}
