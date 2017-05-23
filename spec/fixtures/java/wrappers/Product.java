package com.gyro.tests;

import io.realm.RealmObject;

/* DO NOT EDIT | Generated by gyro */

public class Product extends RealmObject {

    public static class Attributes {
        private Attributes() {
            // Hide constructor
        }
        
        public static final String BRAND = "brand";
        public static final String NAME = "name";
        public static final String PRICE = "price";
    }

    private String brand;
    private String name;
    private Integer price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }
}
