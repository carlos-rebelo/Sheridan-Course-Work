package yourturn1;

public enum Power {
    ON (true), OFF(false);
    private boolean value;

    private Power(boolean value) {
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }

}
