package com.maaanfei.helloworld.pojo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "ay_user")
public class AyUser {
    @Id
    private String id;
    private String name;
    private String password;
}
