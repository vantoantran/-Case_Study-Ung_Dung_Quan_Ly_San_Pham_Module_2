package com.company.controller;

import com.company.model.PhoneProduct;

import java.util.List;

public class PhoneProductManagement extends ProductManagement<PhoneProduct> {
    PhoneProductData phoneProductData = new PhoneProductData();

    @Override
    public List<PhoneProduct> getData() {
        return super.getData();
    }

    @Override
    public void setData(List<PhoneProduct> data) {
        super.setData(data);
    }

    @Override
    public void showAll() {
        for (PhoneProduct phone: phoneProductData.readToUserFile()) {
            System.out.println(phone);
        }
    }

    @Override
    public void editById(int id, PhoneProduct phoneProduct) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public int findById(int id) {
        return 0;
    }

    @Override
    public void addNew(PhoneProduct phoneProduct) {
        getData().add(phoneProduct);
        phoneProductData.writeToUserFile(getData());
    }
}
