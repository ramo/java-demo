package com.ramo.examples.impl;

import com.ramo.examples.inf.AuthFilter;
import com.ramo.examples.inf.DataSource;

public class CommonAuthFilter extends AbstractAuthFilter implements AuthFilter {

    private DataSource ds = new CommonDataSource();

    @Override
    protected DataSource getDataSource() {
        return this.ds;
    }
}
