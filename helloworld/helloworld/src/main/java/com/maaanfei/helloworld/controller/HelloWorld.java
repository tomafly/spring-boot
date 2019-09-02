package com.maaanfei.helloworld.controller;

import com.maaanfei.helloworld.pojo.AyUser;
import com.maaanfei.helloworld.service.AyUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloWorld {

    @Resource
    private AyUserService ayUserService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring helloworld";
    }

    @RequestMapping("/adduser")
    @ResponseBody
    public AyUser saveUser(){
        AyUser ayUser = new AyUser();
        ayUser.setId("3");
        ayUser.setName("hillen");
        ayUser.setPassword("345322");
        AyUser user_result = ayUserService.save(ayUser);
        return user_result;
    }

    @RequestMapping("/findbyid")
    @ResponseBody
    public AyUser findById(){
        AyUser ayUser_id = ayUserService.findById("3");
        return ayUser_id;
    }

    @RequestMapping("/findall")
    @ResponseBody
    public List<AyUser> findAll(){
        List<AyUser> all_user = ayUserService.findAll();
        return all_user;
    }

}
