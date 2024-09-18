package yourturn2complete;

public enum TicketType {
    CHILD(9.99), ADULT(16.99), SENIOR(14.99);

    private double ticketPrice;

    private TicketType(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice()
    {
        return ticketPrice;
    }

}
