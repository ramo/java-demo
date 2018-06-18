package com.ramo.examples.impl;

import com.ramo.examples.inf.AuthFilter;
import com.ramo.examples.inf.DataSource;

public abstract class AbstractAuthFilter implements AuthFilter {

    @Override
    public boolean isAuthorized(String user) {
        return getDataSource().isPresent(user);
    }

    protected abstract DataSource getDataSource();
}
