package parkinglot;

public class ParkingLot {
    private String lotName;
    private Car[] parkingSpots = new Car[10];


    public ParkingLot(String lotName) {
        this.lotName = lotName;
    }

    public void parkCar( Car car) {
        for(int i = 0; i < parkingSpots.length; i++) {
            if(parkingSpots[i] == null) {
                parkingSpots[i] = car;
                return;
            }
        }
    }
    public void printLotStatus() {
        for(int i = 0; i < parkingSpots.length; i++) {
            System.out.print("Spot #"+i+" ");
            if(parkingSpots[i] != null) {
                System.out.println(parkingSpots[i].getLicense());
            }
            else {
                System.out.println("EMPTY");
            }
        }
    }
}
