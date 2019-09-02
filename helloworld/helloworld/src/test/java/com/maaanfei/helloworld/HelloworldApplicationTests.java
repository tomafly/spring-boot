package com.maaanfei.helloworld;

import com.maaanfei.helloworld.pojo.AyUser;
import com.maaanfei.helloworld.service.AyUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Resource
    private AyUserService ayUserService;

    @Test
    public void testRepository(){
        List<AyUser> userList = ayUserService.findAll();
        System.out.println("findAll() :"+userList.size());

        AyUser ayUser = new AyUser();
        ayUser.setId("3");
        ayUser.setName("hillen");
        ayUser.setPassword("345322");
        AyUser user_result = ayUserService.save(ayUser);
        System.out.println(user_result.toString());

    }


}
