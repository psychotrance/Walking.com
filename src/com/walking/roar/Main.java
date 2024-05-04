package com.walking.roar;

import com.walking.roar.pet.Animal;
import com.walking.roar.pet.Dog;

/**
 * Реализуйте класс Animal.
 * <p>
 * Реализуйте его наследников: Dog, Cat, Cow.
 * <p>
 * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
 * <p>
 * Остальные поля и методы суперкласса и наследников реализовать по своему
 * усмотрению, если они необходимы.
 * <p>
 * Каждый из методов должен выводить в консоль соответствующую ему строку:
 * "woof", "meow " или "moo".
 * <p>
 * В main() создать и наполнить в произвольном порядке объектами разных классов-
наследников массив типа Animal.
 <p>
 * Реализовать метод, принимающий массив Animal
 * и вызывающий метод, характерный для конкретного животного
 * <p>
 * Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
 * <p>
 * Дополнительное условие (необязательно): решить задачу, при условии, что woof(),
meow() и moo() внутри себя выполняют только вызов protected-метода sound(),
который определен в Animal.
 * <p>
Примечание: не забывайте об использовании пакетов. Название продуктов (пакет 3-
го уровня) для задач текущего урока предлагаю выбрать самостоятельно.
 */
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

    }
}
