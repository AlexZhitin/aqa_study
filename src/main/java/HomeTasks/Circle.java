package HomeTasks;

/*Создайте класс Circle.
Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r.
Используя формулу πR2, вычислите площадь круга и выведите результат на экран.*/

import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус:");
        int r = sc.nextInt();
        double s = pi *  (Math.pow(r,2));

        System.out.println("Площадь круга: " + s);
    }
}
