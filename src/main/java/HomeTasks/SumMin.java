package HomeTasks;

import java.util.Scanner;

public class SumMin {
    /*Создайте класс SumMin.
Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.*/

    static void odd(int a, int b) {
        System.out.println("Нечетные числа между " + a + " и " + b + ": ");
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    static void sum(int a, int b) {
        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел между " + a + " и " + b + ": " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = sc.nextInt();

        System.out.println("Введите число B:");
        int b = sc.nextInt();
        odd(a, b);
        sum(a, b);
    }
}

