package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.MyBeautyfier;
import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ThIS Text should bE SMALL",String::toLowerCase);
        poemBeautifier.beautify("Presentation", (text) -> MyBeautyfier.beautifierAddLineInABC(text));
        poemBeautifier.beautify("snake text", (text) -> MyBeautyfier.beautifierSnakeText(text));
        poemBeautifier.beautify("Kamil slimak", (text) -> MyBeautyfier.beautifierReverseText(text));

    }
}