package Basic.L7_hw1;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Store {

    private final List<Price> products;

    public Store(List<Price> products) {
        this.products = products;
    }

    protected List<Price> addProducts(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Введите название продукта: ");
            Scanner sc = new Scanner(System.in);
            String product = sc.next();

            System.out.println("Введите название магазина: ");
            String store = sc.next();

            System.out.println("Введите цену продукта в гривнах: ");
            int price = sc.nextInt();

            Price newProduct = new Price(product, store, price);
            products.add(newProduct);
        }
        return products.stream().sorted(Comparator.comparing(Price::getStore)).
                collect(Collectors.toList());
    }
}