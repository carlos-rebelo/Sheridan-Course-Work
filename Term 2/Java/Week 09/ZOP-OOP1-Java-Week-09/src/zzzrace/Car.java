package zzzrace;

public class Car extends Vehicle {

    public Car(int speed, String licensePlate) {
        super(4, speed, licensePlate);
    }

    @Override
    public void honk()
    {
        System.out.println("Honk Honk!");
    }

}
