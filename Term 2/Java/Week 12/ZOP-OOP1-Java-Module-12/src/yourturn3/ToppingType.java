package yourturn3;

public enum ToppingType {
    CHEESE(1.99), PINEAPPLE(0), ONIONS(9.99), ROASTEDTOMATOS(15.99), ANCHOVIES(99.99);

    protected double price;

    private ToppingType(double price) {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

}
