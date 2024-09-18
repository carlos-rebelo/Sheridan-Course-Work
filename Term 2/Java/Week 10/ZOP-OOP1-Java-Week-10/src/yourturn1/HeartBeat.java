package yourturn1;

public enum HeartBeat {
    PITTERPATTER("Pitterpatter"), THUMPITYTHUMP("THumpitythump"), BOOMCHIKA("Boomchika"), FLIPITYFLOP("Flipityflop");
    private String value;

    private HeartBeat(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
