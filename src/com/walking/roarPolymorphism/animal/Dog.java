package com.walking.roarPolymorphism.animal;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    public String sound() {
        return "Woof";
    }
}
