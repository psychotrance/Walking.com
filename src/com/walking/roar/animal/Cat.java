package com.walking.roar.animal;

public class Cat extends Animal {
    public Cat() {
        name = "cat";
        roar = "meow";
    }

    private void meow() {
        super.sound();
    }
    public void sound() {
        this.meow();
    }
}