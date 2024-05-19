package com.walking.roar.animal;

public class Cow extends Animal {
    public Cow() {
        name = "cow";
        roar = "moo";
    }

    private void moo() {
        super.sound();
    }
    public void sound() {
        this.moo();
    }
}
