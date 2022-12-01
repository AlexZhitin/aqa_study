package HomeTasks;

import java.util.Scanner;

import static java.lang.String.format;

public class Premium {

    /*Создайте класс Premium.
Напишите программу расчета начисления премий сотрудникам. Премии рассчитываются согласно выслуге лет.
Результаты расчета, выведите на экран согласно условию если выслуга:

до 5 лет, премия составляет 10% от заработной платы.
от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
от 25 лет (включительно) и более, премия составляет 50% от заработной платы.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выслугу:");
        int y = sc.nextInt();
        String defaultMessage = "Премия составляет %s от заработной платы";

        if (y < 5) {
            System.out.println(defaultMessage);
        } else if (y >= 5 && y < 10) {
            System.out.println(format(defaultMessage, "15%"));
        } else if (y >= 10 && y < 15) {
            System.out.println(format(defaultMessage, "25%"));
        } else if (y >= 15 && y < 20) {
            System.out.println(format(defaultMessage, "35%"));
        } else if (y >= 20 && y < 25) {
            System.out.println(format(defaultMessage, "45%"));
        } else {
            System.out.println(format(defaultMessage, "50%"));
        }
    }
}

/*тут сделать через format*/