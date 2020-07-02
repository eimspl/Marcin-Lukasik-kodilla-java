package com.kodilla.stream.world;

import java.math.BigDecimal;


public final class Country {

    private final String nameCountry;
    private final BigDecimal peopleQuantityOfCountry;
    private final ListOfContinent listOfContinent;

    public Country(final String nameCountry, final BigDecimal peopleQuantityOfCountry, ListOfContinent listOfContinent) {
        this.nameCountry = nameCountry;
        this.peopleQuantityOfCountry = peopleQuantityOfCountry;
        this.listOfContinent = listOfContinent;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantityOfCountry;
    }
}
