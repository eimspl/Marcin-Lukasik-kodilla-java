package com.kodilla.exception.test;

import java.util.HashMap;

public class SearchFlight {
    private HashMap<String, Boolean> flightTable = new HashMap<>();

    public HashMap<String, Boolean> addFlight(Flight flight) {
        flightTable.put(flight.getArrivalAirport(), true);
        //flightTable.put(flight.getDepartureAirport(), false);
        return flightTable;
    }

    public void searchFlight(String searchingAirport) throws RouteNotFoundException {
        if (!flightTable.containsKey(searchingAirport)) {
            throw new RouteNotFoundException(searchingAirport);
        }
        System.out.println("You can book it.");
    }

}