package Basic;
/*Создать класс с именем Rectangle.
В теле класса создать два поля, описывающие длины сторон double side1, double side2.
Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator () и периметр прямоугольника – double perimeterCalculator ().
Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.*/

import java.util.Scanner;

public class Rectangle {

   private double side1;
   private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    double perimeterCalculator() {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Длинна стороны 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Длинна стороны 2: ");
        double side2 = sc.nextDouble();

        Rectangle r = new Rectangle(side1, side2);

        System.out.println("Площадь: " + r.areaCalculator());
        System.out.println("Периметр: " + r.perimeterCalculator());
    }
}