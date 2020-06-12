package com.example.entity;

public class User {
    private Integer id;

    private Integer tId;

    private String tName;

    private String tPwd;

    private String tSex;

    private Integer tAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettPwd() {
        return tPwd;
    }

    public void settPwd(String tPwd) {
        this.tPwd = tPwd == null ? null : tPwd.trim();
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

}