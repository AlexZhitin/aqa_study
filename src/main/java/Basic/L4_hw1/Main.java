package Basic.L4_hw1;

import java.util.Scanner;

/*Создайте класс AbstractHandler.
В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы
открытия, создания, редактирования, сохранения определенного формата документа.*/

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите  формат документа: ");
        Scanner sc = new Scanner(System.in);
        String format = sc.next();

        AbstractHandler handler = new DOCHandler();
        AbstractHandler doc = handler.getDocObject(format);

        doc.save();
        doc.open();
        doc.change();
        doc.create();
    }
}