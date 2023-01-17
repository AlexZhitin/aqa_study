package Beginner;

import java.util.Scanner;

public class Calculator {

    static int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    static int sub(int operand1, int operand2) {
        return operand1 - operand2;
    }

    static int mul(int operand1, int operand2) {
        return operand1 * operand2;
    }

    static double div(int operand1, int operand2) {
        return operand2 == 0 ? operand2 : (double) operand1 / (double) operand2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число #1, знак арифметической операции и число #2 через пробел");

        int operand1 = sc.nextInt();
        String sign = sc.next();
        int operand2 = sc.nextInt();

        switch (sign) {
            case "+":
                System.out.print("Результат: " + add(operand1, operand2));
                break;
            case "-":
                System.out.print("Результат: " + sub(operand1, operand2));
                break;
            case "*":
                System.out.print("Результат: " + mul(operand1, operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Нельзя делить на ноль");
                } else {
                    System.out.println("Результат: " + div(operand1, operand2));
                }
                break;
            default:
                System.out.println("Операция не поддерживается");
        }
    }
}
