package parkinglot;

public class Start {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot("Excelsior Parking");
        lot.parkCar(new Car("ABC123", 9));
        lot.parkCar(new Car("GEF567", 3));
        lot.printLotStatus();
    }
}
