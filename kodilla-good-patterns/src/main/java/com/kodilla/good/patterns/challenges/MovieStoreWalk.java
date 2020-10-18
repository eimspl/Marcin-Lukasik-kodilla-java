package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreWalk {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String listOfTitle = movieStore.getMovies().entrySet().stream()
                .flatMap(t -> t.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.print(listOfTitle);
    }
}