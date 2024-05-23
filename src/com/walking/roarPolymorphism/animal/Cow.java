package com.walking.roarPolymorphism.animal;

public class Cow extends Animal {
    public Cow() {
        super();
    }

    @Override
    public String sound() {
        return "Moo";
    }
}
