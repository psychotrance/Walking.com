package com.walking.roar.pet;

import com.walking.roar.Main;

public class Dog extends Animal {
    public Dog() {
        name = "Dog";
        roar = "WOOF";
        woof();
    }

    public void woof() {
        sound(name, roar);
    }
}
