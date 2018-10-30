package com.example.demosecurityjwt.model;

public class JwtUser {
    private String userName;
    private String role;
    private long id;
    public void setuserName(String userName) {
        this.userName = userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public long getId() {
        return id;
    }
}
