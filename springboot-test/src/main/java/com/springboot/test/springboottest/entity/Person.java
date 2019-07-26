package com.springboot.test.springboottest.entity;

import java.io.Serializable;

public class Person implements Serializable {
    //序列化ID
    private static final long serialVersionUID = -5809782578272943999L;

    private String name;
    private Integer age;
    private Integer sex;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
