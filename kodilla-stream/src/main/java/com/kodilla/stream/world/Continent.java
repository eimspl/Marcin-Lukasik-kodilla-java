package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.*;

public class Continent {

    private Country country;
    private final List<Country> countries = new ArrayList<>();

    public Continent(final ListOfContinent continent) {

    }

    public List<Country> getCountries() {
        return Collections.unmodifiableList(countries);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public BigDecimal getPeopleQuantity() {
        return country.getPeopleQuantity();
    }
}