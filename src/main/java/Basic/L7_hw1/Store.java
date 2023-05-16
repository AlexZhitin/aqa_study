package Basic.L7_hw1;

import java.util.*;
import java.util.stream.Collectors;

public class Store {

    private final List<Price> products = new ArrayList<>();
    private final int number;

    public Store(int number) {
        this.number = number;
        addProducts();
    }

    protected void addProducts() {
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
    }

    protected List<Price> getPrices() {
        return products.stream().sorted(Comparator.comparing(Price::getStore))
                .collect(Collectors.toList());
    }

    protected Map<String, Integer> getPricesByStore() {
        System.out.println("Введите название магазина для поиска товаров: ");
        Scanner sc = new Scanner(System.in);
        String store = sc.next();
        Map<String, Integer> map = getPrices().stream()
                .filter(s -> s.getStore().equals(store))
                .collect(
                        Collectors.toMap(Price::getProduct, Price::getPrice));
        if (map.isEmpty()) {
            throw new NoSuchElementException();
        }
        return map;
    }
}