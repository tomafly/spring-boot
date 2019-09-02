package com.anfeis.springbootweb;

import com.anfeis.springbootweb.bean.AyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWebApplicationTests {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void mySqlTest(){
        String SQL = "selcet * from ay_user";
        List<AyUser>  userList= (List<AyUser>)jdbcTemplate.query(SQL, new RowMapper<AyUser>(){
            @Override
            public AyUser mapRow(ResultSet re, int rowNum) throws SQLException {
                AyUser user = new AyUser();
                user.setId(re.getString("id"));
                user.setName(re.getString("name"));
                user.setPassword(re.getString("password"));
                return user;
            }
        });
        System.out.println("查询成功");
        for(AyUser user:userList){
            System.out.println("id:"+user.getId()+"name:"+user.getName()+"password:"+user.getPassword());
        }
    }
}
