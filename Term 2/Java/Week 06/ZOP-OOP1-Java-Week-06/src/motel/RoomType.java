package motel;

public enum RoomType {
    SINGLE(99), DOUBLE(129), SUITE(169);

    private double roomPrice;

    private RoomType(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getRoomPrice()
    {
        return roomPrice;
    }   
}
