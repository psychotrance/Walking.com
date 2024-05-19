package com.walking.aliveThing.animal.pet;

import com.walking.aliveThing.animal.Animal;

public class Cat extends Animal {

    private Cat() {
        System.out.println("I'm a cat");
    }
    public Cat (String color) {
        this();
        System.out.printf("I'm a %s cat\n", color);
    }
}