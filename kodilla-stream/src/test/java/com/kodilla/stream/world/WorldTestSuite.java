package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        Country china = new Country("China", new BigDecimal("10000000"),  ListOfContinent.Asia);
        Country poland = new Country("Poland", new BigDecimal("20000000"), ListOfContinent.Europe);
        Country egypt = new Country("Egypt", new BigDecimal("30000001"), ListOfContinent.Africa);

        Continent asia = new Continent(ListOfContinent.Asia);
        Continent europe = new Continent(ListOfContinent.Europe);
        Continent africa = new Continent(ListOfContinent.Africa);

        asia.addCountry(china);
        europe.addCountry(poland);
        africa.addCountry(egypt);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        //when
        BigDecimal actualWorldQuantityPopulation = world.getTotalWorldPopulation();

        //then
        BigDecimal expectedWoldQuantityPopulation = new BigDecimal(60000001);
        Assert.assertEquals(expectedWoldQuantityPopulation, actualWorldQuantityPopulation);
    }
}