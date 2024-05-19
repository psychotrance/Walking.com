package com.walking.roar;
/**
Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow. Каждый из
наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
Остальные поля и методы суперкласса и наследников реализовать по своему
усмотрению, если они необходимы.
<p>
Каждый из методов должен выводить в консоль соответствующую ему строку: "woof
", "meow " или "moo".
<p>
В main() создать и наполнить в произвольном порядке объектами разных классов-
наследников массив типа Animal. Реализовать метод, принимающий массив Animal
и вызывающий метод, характерный для конкретного животного.
<p>
Использовать при решении instanceof, getClass() или другие неизвестные нам
механики – недопустимо.
<p>
Дополнительное условие (необязательно): решить задачу, при условии, что woof(),
meow() и moo() внутри себя выполняют только вызов protected-метода sound(),
который определен в Animal.
<p>
Примечание: не забывайте об использовании пакетов. Название продуктов (пакет 3-
го уровня) для задач текущего урока предлагаю выбрать самостоятельно.
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        Animal[] animals = new Animal[]{dog, cat, cow};

        growl(animals, "cow");

    }

    private static void growl(Animal[] animals, String sound) {
        for (Animal x : animals) {
            if (x.name.equals(sound)) {
                switch (x.name) {
                    case "dog":
                        Dog dcDog = (Dog) x;
                        dcDog.sound();
                        break;
                    case "cat":
                        Cat dcCat = (Cat) x;
                        dcCat.sound();
                        break;
                    case "cow":
                        Cow dcCow = (Cow) x;
                        dcCow.sound();
                        break;
                }
            }
        }
    }
}                                                           