package com.walking.roar;

public class Cat extends Animal {
    public Cat() {
        name = "cat";
        roar = "meow";
    }

    private void meow() {
        super.sound();
    }
    protected void sound() {
        this.meow();
    }
}