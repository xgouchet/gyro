package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject;

public class Product extends RealmObject {

    public static final class Attributes {
        public static final String BRAND = "brand";
        public static final String NAME = "name";
        public static final String PRICE = "price";

        private Attributes() {
            // Hide constructor
        }
    }

    private String brand;
    @Required
    private String name;
    private int price = 0;

    @android.support.annotation.Nullable
    public String getBrand() {
        return brand;
    }

    public void setBrand(@android.support.annotation.Nullable final String brand) {
        this.brand = brand;
    }

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }
}
