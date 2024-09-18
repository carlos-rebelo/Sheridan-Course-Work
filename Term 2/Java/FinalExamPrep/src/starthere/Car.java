package starthere;

public class Car extends Automobile{

    public Car(String plate) {
        super(plate);
    }
    public Car(String plate, Person driver) {
        super(plate, driver);
    }

    @Override
    public void honk() {
        System.out.println("honk");
    }

}
