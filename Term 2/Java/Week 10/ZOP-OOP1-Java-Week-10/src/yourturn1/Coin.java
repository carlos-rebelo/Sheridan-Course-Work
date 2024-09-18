package yourturn1;

public enum Coin {
    NICKEL (0.05), DIME(0.10), QUARTER(0.25);
    private double price;

    private Coin (double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
