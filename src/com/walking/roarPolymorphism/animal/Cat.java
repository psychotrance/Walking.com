package com.walking.roarPolymorphism.animal;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    @Override
    public String sound() {
        return "Meow";
    }
}
