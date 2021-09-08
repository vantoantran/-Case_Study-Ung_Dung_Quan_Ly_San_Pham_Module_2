package com.company.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String userName;
    private String userPassword;
    private String type;

    public User() {
    }

    public User(int id, String userName, String userPassword, String type) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", roles='" + type + '\'';
    }
}
