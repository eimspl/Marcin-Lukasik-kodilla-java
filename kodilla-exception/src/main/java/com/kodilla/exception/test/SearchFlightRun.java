package com.kodilla.exception.test;

public class SearchFlightRun {

    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();
        searchFlight.addFlight(new Flight("Paris", "Benjin"));
        searchFlight.addFlight(new Flight("Moscow", "Warsaw"));
        searchFlight.addFlight(new Flight("New Delhi", "Roma"));
        searchFlight.addFlight(new Flight("Cracow", "Radom"));

        try {
            searchFlight.searchFlight("Bergen");
        } catch (RouteNotFoundException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}