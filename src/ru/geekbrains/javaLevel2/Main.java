package ru.geekbrains.javaLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String>words = List.of("Ball", "War", "Red", "House", "Hole",
                                     "War", "Myst", "House", "Book", "Thunder",
                                    "Game", "Work", "Ray", "House", "Brain");
        Set<String> unique = new HashSet<>(words);
        System.out.println(unique);

        HashMap<String, Integer> numberOfWords = new HashMap<>();
        for (String word : words) {
            numberOfWords.put(word, numberOfWords.getOrDefault(word, 0) + 1);
        }
        System.out.println(numberOfWords);
    }
}
