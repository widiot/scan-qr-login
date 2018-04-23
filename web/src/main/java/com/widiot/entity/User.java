package com.widiot.entity;

public class User {
    private String id;
    private String username;
    private String password;
    private String guid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGUID() {
        return guid;
    }

    public void setGUID(String guid) {
        this.guid = guid;
    }
}