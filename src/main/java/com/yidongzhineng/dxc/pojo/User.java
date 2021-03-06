package com.yidongzhineng.dxc.pojo;

public class User {
    private Integer userId;

    private String email;

    private String name;

    private Short certified;

    private String phone;

    private String picPath;

    public User(Integer userId, String email, String name, Short certified, String phone, String picPath) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.certified = certified;
        this.phone = phone;
        this.picPath = picPath;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getCertified() {
        return certified;
    }

    public void setCertified(Short certified) {
        this.certified = certified;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}