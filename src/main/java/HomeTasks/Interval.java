package HomeTasks;

/*Создайте класс Interval.
Напишите программу определения, попадает ли указанное пользователем
число от 0 до 100 в числовой промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100].
Если да, то укажите, в какой именно промежуток.
Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков,
то выводится соответствующее сообщение.*/


import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();

        if (num >= 0 && num <= 14) {
            System.out.println("Число попадает в числовой промежуток [0 - 14]");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Число попадает в числовой промежуток [15 - 35]");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Число попадает в числовой промежуток [36 - 50]");
        } else if (num >= 51 && num <= 100) {
            System.out.println("Число попадает в числовой промежуток [50 - 100]");
        } else {
            System.out.println("Чило не попадает ни в один из промежутков");
        }
    }
}
