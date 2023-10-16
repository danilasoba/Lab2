package com.example.lab2;

public class WordCharCounter {
    public static int countWords(String text) {
        // Split the text based on spaces, commas, and dots
        String[] words = text.split("[\\s,\\.]");
        return words.length;
    }

    public static int countChars(String text) {
        // Count the characters in the text
        return text.length();
    }
}

