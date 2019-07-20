package com.anfeis.springbootweb.bean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "emp")
public class Emp {
    private String name;
    private Integer age;
    private Date birthday;
    private Integer salary;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", skill=" + skill +
                ", fortes=" + fortes +
                '}';
    }

    public List getSkill() {
        return skill;
    }

    public void setSkill(List skill) {
        this.skill = skill;
    }

    private List skill;
    private Fortes fortes;

    public Fortes getFortes() {
        return fortes;
    }

    public void setFortes(Fortes fortes) {
        this.fortes = fortes;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
