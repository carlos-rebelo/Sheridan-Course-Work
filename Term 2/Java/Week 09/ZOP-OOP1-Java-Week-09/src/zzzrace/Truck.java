package zzzrace;

public class Truck extends Vehicle {

    public Truck(int speed, String licensePlate) {
        super(18, speed, licensePlate);
    }

    @Override
    public void honk()
    {
        System.out.println("AAAWHHHOOOOOGGGGGAAAA");
    }

}
