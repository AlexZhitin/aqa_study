package Beginner;

/*Создайте класс ArithmeticAverage.
Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.*/

import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();

        System.out.println("Введите второе число:");
        int b = sc.nextInt();

        System.out.println("Введите третее число:");
        int c = sc.nextInt();

        double sum = a + b + c;
        double avg = sum / 3;
        System.out.println("Среднее арифметическое: " + avg);
    }
}
