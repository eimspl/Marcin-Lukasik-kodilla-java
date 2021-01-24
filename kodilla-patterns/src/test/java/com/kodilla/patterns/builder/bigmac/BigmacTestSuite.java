package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmackNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.WITH_SEZAME)
                .burgers(2)
                .sauce(SauceType.ISLAND_1000)
                .ingredients(IngredientsType.CHEESE)
                .ingredients(IngredientsType.ONION)
                .ingredients(IngredientsType.LETTUCE)
                .build();
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredientsInBigmac = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredientsInBigmac);
        Assert.assertTrue(bigmac.getIngredients().contains(IngredientsType.ONION));
        Assert.assertFalse(bigmac.getIngredients().contains(IngredientsType.BACON));
    }
}