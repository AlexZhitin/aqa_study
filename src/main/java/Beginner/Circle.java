package Beginner;

/*Создайте класс Circle.
Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r.
Используя формулу πR2, вычислите площадь круга и выведите результат на экран.*/

import java.util.Scanner;

public class Circle {
    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус:");
        int r = sc.nextInt();
        double s = PI * (Math.pow(r, 2));

        System.out.println("Площадь круга: " + s);
    }
}
