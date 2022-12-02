package HomeTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumMin {
    /*Создайте класс SumMin.
Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.*/


    /*чтобы убрать отсюда  System.out.println не догадался ни до чего другого, как возвращать массив*/
    static ArrayList<Integer> odd(int a, int b) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0)
                num.add(i);
        }
        return num;
    }

    static int sum(int a, int b) {
        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = sc.nextInt();

        System.out.print("Введите число B: ");
        int b = sc.nextInt();

        System.out.println("Сумма чисел между " + a + " и " + b + ": " + sum(a, b));
        System.out.println("Нечетные числа между " + a + " и " + b + ": " + odd(a, b));
    }
}