package com.anfeis.springbootweb.bean;

public class Fortes {
    private String name;
    private Integer time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Fortes{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
