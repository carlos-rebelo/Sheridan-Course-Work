package pizza;

public enum Size {
    SMALL(8.99), MEDIUM(10.99), LARGE(12.99);
    double price;

    private Size(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
