package com.walking.aliveThing;

import com.walking.aliveThing.animal.Animal;
import com.walking.aliveThing.animal.pet.Cat;
import com.walking.aliveThing.animal.pet.Dog;

/**
 * Реализовать класс Animal, содержащий protected-конструктор без параметров,
 * который выводит в консоль сообщение «I’m an animal». DONE
 * <p>
 * Реализовать для Animal классы-наследники Dog и Cat. DONE
 * <p>
 * Реализовать для каждого из них приватный конструктор без параметров,
 * который выводит в консоль сообщение «I’m a dog» («I’m a cat»). DONE
 * <p>
 * Также реализовать публичный конструктор, принимающий строковый параметр color. DONE
 * <p>
 * Он должен вызывать конструктор без параметров, NOT DONE?
 * а также выводить в консоль сообщение «I’m a <color> dog» («I’m a <color> cat»),
 * где <color> – значение параметра конструктора color. DONE
 * <p>
 * Создайте в main() экземпляр Dog и экземпляр Cat. Обратите внимание на консоль.
 * Такой ли порядок сообщений вы ожидали увидеть?
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("black");
        Animal cat = new Cat("red");
    }
}