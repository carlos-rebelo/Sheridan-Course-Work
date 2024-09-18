package yourturn2;

public enum TicketType {
    CHILD(9.99), ADULT(16.99), SENIOR(14.99);
    double price;
    private TicketType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
