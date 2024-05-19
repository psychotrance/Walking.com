package com.walking.aliveThing.animal.pet;

import com.walking.aliveThing.animal.Animal;

public class Dog extends Animal {

    private Dog() {
        System.out.println("I'm a dog");
    }

    public Dog(String color) {
        this();
        System.out.printf("I'm a %s dog\n", color);
    }
}