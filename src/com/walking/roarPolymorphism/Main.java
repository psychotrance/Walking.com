package com.walking.roarPolymorphism;

import com.walking.roarPolymorphism.animal.Animal;
import com.walking.roarPolymorphism.animal.Cat;
import com.walking.roarPolymorphism.animal.Cow;
import com.walking.roarPolymorphism.animal.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};
        System.out.println(roar(animals));
    }

    protected static String roar(Animal[] animals) {
        String say = "";
        for (Animal x : animals) {
            say += x.sound() + '\n';
        }
        return say;
    }
}
