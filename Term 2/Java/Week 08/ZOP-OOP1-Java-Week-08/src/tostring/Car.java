package tostring;

public class Car {
    private String make;
    private int year;
    private String licensePlate;

    public Car(String make, int year, String licensePlate) {
        this.make = make;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    public void method1() {

    }
    //let's override the toString for our Car
    @Override
    public String toString() {
        return "Make: "+make+" Year: "+year+" LP: "+licensePlate;
    }
}
