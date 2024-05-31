package com.walking.geometric;

import com.walking.geometric.figure.Square;
import com.walking.geometric.figure.Triangle;

import java.util.Scanner;

/*
Реализуйте класс «Правильная фигура». Для него создайте классы-наследники
«Треугольник» и «Квадрат».

Пользователь должен иметь возможность ввести длину стороны и выбрать тип
фигуры. Программа должна нарисовать в консоли выбранную пользователем
фигуру, используя символы '-', '|', '/', '\'.

Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 */
public class Main {
    final static Scanner SCANNER = new Scanner(System.in);
    final static String THE_CHOICE_MENU = """
            1. Triangle
            2. Square
            """;

    public static void main(String[] args) {
        int length = requireInt("Enter a length: ");
        int figure = requireInt(THE_CHOICE_MENU + "Choose a figure: ");
        switch (figure) {
            case 1:
                new Triangle(length).build();
                break;
            case 2:
                new Square(length).build();
                break;
            default:
                System.out.println("FAQ");
                break;
        }
    }

    static int requireInt(String requireMessage) {
        System.out.print(requireMessage);
        return SCANNER.nextInt();
    }
}
