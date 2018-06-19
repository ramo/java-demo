package com.ramo.examples.test;

import java.lang.reflect.Constructor;

public class Test {

    public static void callCafeteria(Cafeteria c) {
        if (c.isFoodAvailable()) {
            System.out.println("Food available");
        } else {
            System.out.println("Food is not available");
        }
    }


    public static void main(String args[]) throws Exception {
        System.out.println("Application starting...");
        Cafeteria c = null;
        c = Cafeteria.getInstance();
        callCafeteria(c);
        Cafeteria c1 = Cafeteria.getInstance();
        c1.setFoodAvailable(false);
        callCafeteria(c1);

        Cafeteria c2 = Cafeteria.getInstance();
        callCafeteria(c2);

    }
}
