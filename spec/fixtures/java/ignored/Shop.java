package com.gyro.tests;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/* DO NOT EDIT | Generated by gyro */

public class Shop extends RealmObject {

    public static class Attributes {
        private Attributes() {
            // Hide constructor
        }
        
        public static final String NAME = "name";
    }

    public static class Relationships {
        private Relationships() {
            // Hide constructor
        }
        
        public static final String OWNER = "owner";
        public static final String PRODUCTS = "products";
    }

    @Ignore
    private String ignored;
    private String name;
    private Owner owner;
    private RealmList<Product> products;

    public String getIgnored() {
        return ignored;
    }

    public void setIgnored(final String ignored) {
        this.ignored = ignored;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public RealmList<Product> getProducts() {
        return products;
    }

    public void setProducts(final RealmList<Product> products) {
        this.products = products;
    }
}
