package com.ramo.examples.impl;

import com.ramo.examples.inf.DataSource;

import java.util.HashSet;
import java.util.Set;

public class CommonDataSource implements DataSource {

    /**
     * This is our source, instead of Set we could've used File or DB
     */
    private Set<String> nameSet = new HashSet<>();
    {
        nameSet.add("test");
        nameSet.add("admin");
        nameSet.add("guest");
    }


    @Override
    public boolean isPresent(String name) {
        return nameSet.contains(name);
    }
}
