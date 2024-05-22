package com.walking.geometric;

import com.walking.geometric.figure.CorrectFigure;
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
    final static Scanner scanner = new Scanner(System.in);
    final static String figuresMenu = """
            1. Triangle
            2. Square
            3. Super
            """;

    public static void main(String[] args) {
        createFigure();
    }

    static int requireInt(String requireMessage) {
        System.out.print(requireMessage);
        return scanner.nextInt();
    }

    private static CorrectFigure createFigure() {
        int length = requireInt("Enter a length: ");
        int figure = requireInt(figuresMenu + "Choose a figure: ");

        switch (figure) {
            case 1:
                return new Triangle(length);
            case 2:
                return new Square(length);
            case 3:
                return new CorrectFigure(length);
        }
        return null;
    }
}
