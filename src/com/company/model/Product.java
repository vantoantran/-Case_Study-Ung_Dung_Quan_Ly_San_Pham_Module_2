package com.company.model;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String manufacture;
    private String about;

    public Product() {
    }

    public Product(int id, String nameProduct, String manufacture, String about) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manufacture = manufacture;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", about='" + about;
    }
}
