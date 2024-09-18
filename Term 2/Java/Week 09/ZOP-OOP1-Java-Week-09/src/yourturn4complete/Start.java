package yourturn4complete;

public class Start {

    public static void main(String[] args)
    {

        //Create a Car class that tracks the model of the car and license plate
        Car car1 = new Car("Audi", "ABC123");
        Car car2 = new Car("Audi", "XYZ123");
        Car car3 = new Car("Audi", "ABC123");

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        //Override the .equals method and the .hashcode method in the Car class so that you can tell if two Car objects are the same 

        //Prove that your code works

    }
}
