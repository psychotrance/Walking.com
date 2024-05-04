package com.walking.roar.pet;

public class Animal {
    protected String name;
    protected String roar;

    protected void sound(String name, String roar) {
        System.out.printf("%s roar is %s", name, roar);
    }
}
