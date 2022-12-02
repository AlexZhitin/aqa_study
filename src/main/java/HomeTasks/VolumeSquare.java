package HomeTasks;

import java.util.Scanner;

/*Создайте класс Volume.
        Напишите программу расчета объема - V и площади поверхности -S цилиндра.
        Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
        Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
        Результаты расчетов выведите на экран.*/

public class VolumeSquare {
    static final double PI = 3.14;

    static double volume(double r, double h) {
        return PI * (Math.pow(r, 2)) * h;
    }

    static double square(double r, double h) {
        return 2 * PI * r * (h + r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус:");
        double r = sc.nextDouble();

        System.out.println("Введите высоту:");
        double h = sc.nextDouble();

        System.out.println("Объем: " + volume(r, h));
        System.out.println("Площадь: " + square(r, h));
    }
}
