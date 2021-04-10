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

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "9111234567");
        phoneBook.add("Petrov", "9157645890");
        phoneBook.add("Sidorov", "9116230951");
        phoneBook.add("Smirnov", "9116230951");
        phoneBook.add("Ivanov", "9213234567");
        phoneBook.add("Alekseev", "9060987654");
        phoneBook.add("Maksimov", "9104563128");
        phoneBook.add("Maksimov", "9101111111");
        phoneBook.add("Maksimov", "9102222222");

        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Maksimov"));
    }

    static class PhoneBook {
        private final HashMap<String, HashSet<String>> map;

        PhoneBook() {
            this.map = new HashMap<>();
        }

        void add(String name, String phone) {
            HashSet<String> numbers;
            if (map.containsKey(name)) {
                numbers = map.get(name);
            } else {
                numbers = new HashSet<>();
            }
            numbers.add(phone);
            map.put(name, numbers);
        }

        Set<String> get(String getName) {
            return map.get(getName);
        }
    }
}
