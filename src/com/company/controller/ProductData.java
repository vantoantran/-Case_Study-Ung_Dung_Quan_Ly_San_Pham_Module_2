package com.company.controller;

import com.company.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class ProductData<E> {

    public abstract List<E> readToUserFile();

    public abstract void writeToUserFile(List<E> users);
}
