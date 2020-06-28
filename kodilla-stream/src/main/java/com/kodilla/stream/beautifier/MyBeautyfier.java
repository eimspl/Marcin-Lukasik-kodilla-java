
package com.kodilla.stream.beautifier;

public class MyBeautyfier {

    public static String beautifierAddLineInABC(String someText) {
        String newText = ("ABC~ " + someText + " ~ABC");
        return newText;
    }

    public static String beautifierSnakeText(String text) {
        String newText = "";
        String temporary = "";
        for (int i = 0; i < text.length(); i++) {
            temporary = text.charAt(i) + "";
            if(i % 2 == 0) {
                newText = newText + temporary.toUpperCase();
            } else {
                newText = newText + temporary.toLowerCase();
            }
        }
        return newText;
    }

    public static String beautifierReverseText(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText = text.charAt(i) + newText;
        }
        return newText;
    }
}