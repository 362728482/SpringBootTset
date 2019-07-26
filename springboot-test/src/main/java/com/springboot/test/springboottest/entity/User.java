package com.springboot.test.springboottest.entity;

public class User {
    private Integer id;
    private String userName;
    private String password;
    private String name;
    private String mobile;
    private Integer sex;               //男：1   女：2  保密：0
    private String email;
    private String headImg;             //头像

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        headImg = headImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
