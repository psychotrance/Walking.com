package com.walking.roar;

public class Cow extends Animal {
    public Cow() {
        name = "cow";
        roar = "moo";
    }

    private void moo() {
        super.sound();
    }
    protected void sound() {
        this.moo();
    }
}
