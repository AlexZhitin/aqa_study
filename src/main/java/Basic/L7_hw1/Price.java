package Basic.L7_hw1;

public class Price {
    private String product;
    private String store;
    private int price;

    public Price(String product, String store, int price) {
        this.product = product;
        this.store = store;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}