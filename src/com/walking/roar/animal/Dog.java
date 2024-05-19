package com.walking.roar.animal;

public class Dog extends Animal {
    public Dog() {
        name = "dog";
        roar = "woof";
    }

    private void woof() {
        super.sound();
    }
    public void sound() {
        this.woof();
    }
}