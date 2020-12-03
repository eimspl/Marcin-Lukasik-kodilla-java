package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        User olaf = new Millenials("Olaf Kowlaski");
        User brajan = new YGeneration("Brajan Nowak");
        User mahomet = new ZGeneration("Mahomet Iksiński");

        //When
        String olafShouldShare = olaf.whereShare();
        System.out.println("Olaf: " + olafShouldShare);
        String brajanShouldShare = brajan.whereShare();
        System.out.println("Brajan: " + brajanShouldShare);
        String mahometShouldShare = mahomet.whereShare();
        System.out.println("Mahomet: " + mahometShouldShare);

        //Then
        Assert.assertEquals("Millenials post on Facebook", olafShouldShare);
        Assert.assertEquals("YGeneration post on Twitter", brajanShouldShare);
        Assert.assertEquals("ZGeneration post on Snapchat", mahometShouldShare);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User albin = new Millenials("Albin Kolano");

        //When
        String albinShouldShare = albin.whereShare();
        System.out.println("Albin: " + albinShouldShare);
        albin.setDefaultSocial(new SnapchatPublisher());
        albinShouldShare = albin.whereShare();
        System.out.println("Albin after change preference: " + albinShouldShare);

        //Then
        Assert.assertEquals("ZGeneration post on Snapchat", albinShouldShare);
    }
}