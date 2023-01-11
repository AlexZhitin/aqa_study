package HomeTasks;

/*Создайте класс Sort
В классе создать метод который возвращает массив радомных чисел

длинна массива задается с консоли

создать метод сортировки рандомного массива который возвращает 2е самое большое число

реализовать 2ва способа сортировки (2ва метода с разным типом сортировки, Bubble Sort, Selection Sort), выбор типа сортировки осуществляется с консоли*/

import java.util.Scanner;

public class Sort {

    static void createArray(int[] array, int n) {
        System.out.print("Все числа в массиве: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * n));
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int len = array.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j + 1] < array[j]) {

                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    static int secondMaxNumber(int[] array) {
        int size = array.length;
        return array[size - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество элементов, которое будет в массиве: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Введи 1, если bubble sort, 2 - selection sort: ");
        int s = sc.nextInt();

        createArray(array, n);
        if (s == 1) {
            bubbleSort(array);
        } else {
            selectionSort(array);
        }
        System.out.println("\n" + "2е самое большое число: " + secondMaxNumber(array));
    }
}