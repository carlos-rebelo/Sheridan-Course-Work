package yourturn2;

public enum Coin {
    NICKEL (0.05), DIME(0.10), QUARTER(0.25);
    private double coinValue;

    private Coin(double coinValue) {
        this.coinValue = coinValue;
    }

    public double getValue() {
        return coinValue;
    }
}
