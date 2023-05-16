package Basic.L7_hw1;

public class Price {
    private final String product;
    private final String store;
    private final int price;

    public Price(String product, String store, int price) {
        this.product = product;
        this.store = store;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public String getStore() {
        return store;
    }

    public int getPrice() {
        return price;
    }
}