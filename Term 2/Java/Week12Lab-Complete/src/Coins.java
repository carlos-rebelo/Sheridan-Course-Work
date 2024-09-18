public enum Coins {
    NICKEL(0.05), DIME(0.10), QUARTER(0.25);
    private double value;

    private Coins(double value) {
        this.value=value;
    }

    public double getValue() {
        return this.value;
    }

}
