package com.company.controller;

import com.company.model.User;

import java.util.LinkedList;
import java.util.List;

public class UserManagement implements GeneralManagement<User> {
    List<User> users = new LinkedList<>();
    UserData userData = new UserData();

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addNew(User user) {
        this.users.add(user);
        userData.writeToUserFile(users);
    }

}
