package com.walking.aliveThing.animal.pet;

import com.walking.aliveThing.animal.Animal;

public class Dog extends Animal {
    private final String name = "Dog";
    String color;

    private Dog() {
    }
    public Dog(String color) {
        getPhrase(color);
    }

    @Override
    public void getPhrase() {
        article = setArticle(name);
        System.out.printf("I'm %s %s\n", article, name);
    }
    public void getPhrase(String color) {
        article = setArticle(color);
        System.out.printf("I'm %s %s %s\n", article, color, name);
    }

    public String setArticle(String string) {
        char[] vowels = new char[]{'a', 'o', 'i', 'e','u', 'y'};
        for (char v : vowels) {
            if (string.charAt(0) == v)
                return "an";
        }
        return "a";
    }
}
