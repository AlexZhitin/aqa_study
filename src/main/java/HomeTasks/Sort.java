package HomeTasks;

/*Создайте класс Sort
В классе создать метод который возвращает массив радомных чисел

длинна массива задается с консоли

создать метод сортировки рандомного массива который возвращает 2е самое большое число

реализовать 2ва способа сортировки (2ва метода с разным типом сортировки, Bubble Sort, Selection Sort), выбор типа сортировки осуществляется с консоли*/

import java.util.Scanner;

public class Sort {

    static int getInputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static String getInputString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static int[] createArray(int n) {
        System.out.print("Все числа в массиве: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) ((Math.random() * n));
            System.out.print(array[i] + " ");
        }
        return array;
    }

    static int[] bubbleSort(int[] array) {
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
        return array;
    }

    static int[] selectionSort(int[] array) {
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
        return array;
    }

    static int secondMaxNumber(int[] array) {
        int size = array.length;
        return array[size - 2];
    }

    public static void main(String[] args) {
        System.out.println("Введи количество элементов, которое будет в массиве: ");
        int n = getInputInt();

        System.out.println("Введи bubble sort или selection sort");
        String s = getInputString();

        int[] array = createArray(n);

        switch (s) {
            case "bubble sort":
                System.out.println("\n" + "2е самое большое число: " + secondMaxNumber(bubbleSort(array)));
                break;
            case "selection sort":
                System.out.println("\n" + "2е самое большое число: " + secondMaxNumber(selectionSort(array)));
                break;
            default:
                System.out.print("\n" + "Неправильное название сортировки");
        }
    }
}