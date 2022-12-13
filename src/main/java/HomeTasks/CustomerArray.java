package HomeTasks;

import java.util.Scanner;

public class CustomerArray {

    /*Создайте класс CustomerArray.
Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер массива задает пользователь).
Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех элементов, среднее арифметическое всех элементов,
 вывести все нечетные значения.
*/

    static void createArray(int[] array, int n) {
        System.out.print("Все числа в массиве: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * n));
            System.out.print(array[i] + " ");
        }
    }

    static int minNumber(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }

    static int maxNumber(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    static int sumNumber(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }

    static int avgNumber(int[] array, int n) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum / n;
    }

    static void oddNumber(int[] array) {

        for (int i : array) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество элементов в массиве: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        createArray(array, n);

        System.out.print("\n" + "Наименьшее число: " + minNumber(array));
        System.out.print("\n" + "Наибольшее число: " + maxNumber(array));
        System.out.print("\n" + "Сумма чисел: " + sumNumber(array));
        System.out.print("\n" + "Среднее арифметическое: " + avgNumber(array, n));
        System.out.print("\n" + "Нечетные числа: ");
        oddNumber(array);
    }
}

