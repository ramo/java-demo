package com.ramo.examples.inf;


public interface AuthFilter {

    /**
     *
     * @param user
     * @return true if the user is authorized; false otherwise.
     */
    boolean isAuthorized(String user);
}
