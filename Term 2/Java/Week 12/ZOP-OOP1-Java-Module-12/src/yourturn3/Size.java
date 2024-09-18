package yourturn3;

public enum Size {
    SMALL(9.99), MEDIUM(15.99), LARGE(24.99);

    protected double price;

    private Size(double price) {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
}
