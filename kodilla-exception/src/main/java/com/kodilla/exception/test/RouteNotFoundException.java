package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    RouteNotFoundException(final String airport) {
        super(airport + " dosn't exists on our database");
    }
}