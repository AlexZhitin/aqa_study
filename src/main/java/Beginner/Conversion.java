package Beginner;

/*Создайте класс Conversion.
Напишите программу, которая будет выполнять конвертирование валют. Пользователь вводит:
сумму денег в определенной валюте,
курс для конвертации в другую валюту.
Организуйте вывод результата операции конвертирования валюты на экран.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversion {

    static double calculate(String symbol, double sum, double rate) {

        double result = symbol.equals("1") ? sum / rate : sum * rate;
        return (Double.parseDouble(new DecimalFormat("#.##").format(result)));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи 1 если нужно купить валюту, 2 - если продать: ");
        String operation = sc.next();

        System.out.println("Введите сумму за которую купить или какую продать");
        double sum = sc.nextDouble();

        System.out.println("Введите курс: ");
        double rate = sc.nextDouble();

        System.out.println("В итоге получите: " + calculate(operation, sum, rate));
    }
}