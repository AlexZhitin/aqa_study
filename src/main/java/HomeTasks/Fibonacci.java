package HomeTasks;

/*Напишите метод, возвращающий n-й элемент последовательности Фибоначчи (последовательность Фибоначчи — это последовательность чисел: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
Следующее число находится путем сложения два числа перед ним.)*/

import java.util.Scanner;

public class Fibonacci {

    public static int fibNumber(int n) {
        if (n <= 1) {
            return n;
        }

        return fibNumber(n - 1) + fibNumber(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи индекс n-ого элемента последовательности: ");
        int n = sc.nextInt();

        System.out.println("Число: " + fibNumber(n - 1));
    }
}
