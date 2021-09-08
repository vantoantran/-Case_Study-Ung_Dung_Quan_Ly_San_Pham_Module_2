package com.company.controller;

import com.company.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserData extends ProductData<User> {

    @Override
    public  List<User> readToUserFile() {
        List<User> users = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("User Data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            users = (List<User>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return users;
    }

    @Override
    public void writeToUserFile(List<User> users) {
        try {
            FileOutputStream fos = new FileOutputStream("User Data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
