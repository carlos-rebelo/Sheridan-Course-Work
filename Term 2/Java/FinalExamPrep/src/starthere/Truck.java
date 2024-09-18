package starthere;

public class Truck extends Automobile{

    public Truck(String plate, Person driver) {
        super(plate, driver);
    }
    public Truck(String plate) {
        super(plate);
    }

    @Override
    public void honk() {
        System.out.println("awhooogha");
    }

}
