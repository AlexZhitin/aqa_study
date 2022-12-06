package HomeTasks;

/*Создайте класс Conversion.
Напишите программу, которая будет выполнять конвертирование валют. Пользователь вводит:
сумму денег в определенной валюте,
курс для конвертации в другую валюту.
Организуйте вывод результата операции конвертирования валюты на экран.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversion {

    static double buy(double sumBuy, double rate) {
        return (Double.parseDouble(new DecimalFormat("#.##").format(sumBuy / rate)));
    }

    static double sell(double sumSell, double rate) {
        return (Double.parseDouble(new DecimalFormat("#.##").format(sumSell * rate)));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи 1 если нужно купить валюту, 2 - если продать: ");
        String operation = sc.next();

        System.out.println("Введите курс: ");
        double rate = sc.nextDouble();

        switch (operation) {
            case "1":
                System.out.println("Введите сумму, на которую хотите купить валюту: ");
                double sumBuy = sc.nextDouble();
                System.out.println(buy(sumBuy, rate));
                break;
            case "2":
                System.out.println("Введите сумму валюты, которую хотите продать: ");
                double sumSell = sc.nextDouble();
                System.out.println(sell(sumSell, rate));
                break;
            default:
                System.out.println("Не выбрана валютная операция)");
        }
    }
}
