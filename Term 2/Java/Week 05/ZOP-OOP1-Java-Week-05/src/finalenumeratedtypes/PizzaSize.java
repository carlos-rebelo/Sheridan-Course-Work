package finalenumeratedtypes;

public enum PizzaSize {
    SMALL(10.95),MEDIUM(15.95),LARGE(20.95);
    private double price;

    private PizzaSize(double price) {
        this.price = price;

    }

    public double getPrice() {
        return price;
    }
}
