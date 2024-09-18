package zzzrace;

public class Start {
    public static void main(String[] args)
    {

        Vehicle[] vehicles = {
                new Car(50, "ABC123"),
                new Scooter(24, "ZZ45"),
                new Truck(100, "XYZ123"),
                new Scooter(24, "YY13"),
        };

        for (Vehicle vehicle : vehicles)
        {
            vehicle.honk();
        }

        Scooter scooter = new Scooter(24, "YY13");

        for (int i = 0; i < vehicles.length; i++)
        {
            if (vehicles[i].equals(scooter))
            {
                System.out.println("Found the same scooter on floor " + i + " of our array");
            }
        }

    }
}
