package com.company.controller;

import com.company.model.PhoneProduct;

import java.util.LinkedList;
import java.util.List;

public abstract class ProductManagement<E> implements GeneralManagement<E>{
    List<E> data = new LinkedList<>();

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }

    public abstract void showAll();

  public abstract void editById(int id, E e);

   public abstract void deleteById(int id);

   public abstract int findById(int id);

    @Override
    public void addNew(E e) {

    }
}
