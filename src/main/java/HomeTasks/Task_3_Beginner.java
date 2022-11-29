package HomeTasks;

/*Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
        Выполните и рассчитайте результат следующих операций для этих переменных:

    x += y - x++ * z;

    z = --x – y * 5;

    y /= x + 5 % z;

    z = x++ + y * 5;

    x = y - x++ * z;*/


public class Task_3_Beginner {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        System.out.println(x + y - ((x + 1) * z));
        System.out.println((x - 1) - y * 5);
        System.out.println(y / x + 5 % z);
        System.out.println((x + 1) + y * 5);
        System.out.println(y-((x+1)*z));
    }
}
