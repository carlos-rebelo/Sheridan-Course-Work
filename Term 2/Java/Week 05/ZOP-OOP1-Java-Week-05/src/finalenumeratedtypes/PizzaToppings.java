package finalenumeratedtypes;

public enum PizzaToppings {
    CHEESE (0), PINEAPPLE(1), ONION(1), PEPPERONI(1), HAM(1), ANCHOVIES(50);
    private double costOfTopping;

    private PizzaToppings (double costOfTopping) {
        this.costOfTopping = costOfTopping;
    }

    public double getCostOfTopping() {
        return costOfTopping;
    }
}
