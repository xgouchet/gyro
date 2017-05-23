package com.gyro.tests;

import io.realm.RealmList;
import io.realm.RealmObject;

/* DO NOT EDIT | Generated by gyro */

public class Person extends RealmObject {
    
    public static class Attributes {
        private Attributes() {
            // Hide constructor
        }
        
        public static final String DOGS = "dogs";
    }

    private RealmList<Dog> dogs;

    public RealmList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(final RealmList<Dog> dogs) {
        this.dogs = dogs;
    }
}
