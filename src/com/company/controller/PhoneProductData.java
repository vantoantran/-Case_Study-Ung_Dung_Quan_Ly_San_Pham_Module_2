package com.company.controller;

import com.company.model.PhoneProduct;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PhoneProductData extends ProductData<PhoneProduct> {

    @Override
    public List<PhoneProduct> readToUserFile() {
        List<PhoneProduct> phoneProducts = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("Phone Data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            phoneProducts = (List<PhoneProduct>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return phoneProducts;
    }

    @Override
    public void writeToUserFile(List<PhoneProduct> phoneProducts) {
        try {
            FileOutputStream fos = new FileOutputStream("Phone Data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(phoneProducts);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
