package zzzrace;

public class Scooter extends Vehicle {

    public Scooter(int speed, String licensePlate) {
        super(2, speed, licensePlate);
    }

    @Override
    public void honk()
    {
        System.out.println("meep meep!");
    }

}
