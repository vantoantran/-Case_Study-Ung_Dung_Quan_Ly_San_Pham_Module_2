package com.company.model;

import java.io.Serializable;

public class PhoneProduct extends Product {
    public PhoneProduct() {
        super();
    }

    public PhoneProduct(int id, String nameProduct, String manufacture, String about) {
        super(id, nameProduct, manufacture, about);
    }

    @Override
    public String toString() {
        return "id=" + super.getId() +
                ", namePhone='" + super.getNameProduct() + '\'' +
                ", manufacture='" + super.getManufacture() + '\'' +
                ", about='" + super.getAbout();
    }
}
