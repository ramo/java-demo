package com.ramo.examples.test;

import com.ramo.examples.impl.CommonAuthFilter;
import com.ramo.examples.impl.SpecialAuthFilter;
import com.ramo.examples.inf.AuthFilter;

public class TestDriver {

    public static void main(String args[]) {
        AuthFilter sf = new SpecialAuthFilter();
        AuthFilter cf = new CommonAuthFilter();

        String name = "ramo";
        if (sf.isAuthorized(name)) {
            System.out.println("User : " + name + ", authorized by Special filter");
        } else {
            System.out.println("User : " + name + ", not authorized by Special filter");
        }

        if (cf.isAuthorized(name)) {
            System.out.println("User : " + name + ", authorized by Common filter");
        } else {
            System.out.println("User : " + name + ", not authorized by Common filter");
        }
    }
}
