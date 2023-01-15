package HomeTasks;

/*Напишите метод, возвращающий n-й элемент последовательности Фибоначчи (последовательность Фибоначчи — это последовательность чисел: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
Следующее число находится путем сложения два числа перед ним.)*/

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи индекс n-ого элемента последовательности: ");
        a = sc.nextInt();
        int[] array = new int[a];
        array[0] = 0;
        array[1] = 1;

        for (b = 2; b < a; b++) {

            array[b] = array[b - 1] + array[b - 2];
        }
        System.out.println("Число: " + array[a - 1]);
    }
}
