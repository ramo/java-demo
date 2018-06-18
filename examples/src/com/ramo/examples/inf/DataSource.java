package com.ramo.examples.inf;

public interface DataSource {

    /**
     *
     * @param name
     * @return true if the name exist in the underlying list of names; false otherwise.
     */
    boolean isPresent(String name);
}
