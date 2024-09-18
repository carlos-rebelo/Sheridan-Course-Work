package pizzacomplete;

public enum Size {
    SMALL(10.99), MEDIUM(18.99), LARGE(24.99), PARTY(34.99);

    private double price;

    private Size(double price) {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

}
