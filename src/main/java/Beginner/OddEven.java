package Beginner;

import java.util.Scanner;

/*Создайте класс OddEven
Напишите метод, который возвращает boolean значение является ли введенное число нечетным или четным.
Выведите результат в консоль. Используйте тернарную операцию*/

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }
}


