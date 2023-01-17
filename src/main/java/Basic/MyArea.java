package Basic;

/*Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
который должен принимать радиус и используя PI посчитать площадь круга.*/

import java.util.Scanner;

public class MyArea {
    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус:");
        double r = sc.nextDouble();

        System.out.println("Площадь: " + areaOfCircle(r));
    }

    static double areaOfCircle(double r) {
        return PI * (Math.pow(r, 2));
    }
}
