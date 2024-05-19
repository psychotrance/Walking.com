package com.walking.roar;

public class Dog extends Animal {
    public Dog() {
        name = "dog";
        roar = "woof";
    }

    private void woof() {
        super.sound();
    }
    protected void sound() {
        this.woof();
    }
}