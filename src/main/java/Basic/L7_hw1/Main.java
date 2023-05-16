package Basic.L7_hw1;
//Требуется: Описать класс с именем Price, содержащую следующие поля:
//
//        название товара;
//
//        название магазина, в котором продается товар;
//
//        стоимость товара в гривнах.
//
//        Написать программу, выполняющую следующие действия:
//
//        ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);
//
//        вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры (если такого магазина нет, вывести исключение).

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(2);

        try {
            store.getPricesByStore().forEach((priceProduct, pricePrice) -> System.out.println("Product name: " + priceProduct + ", Product price: " + pricePrice));
        } catch (NoSuchElementException e) {
            System.err.println("No such store found");
        }
    }
}