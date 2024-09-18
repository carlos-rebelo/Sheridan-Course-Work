package hashmap;

public class Car {
    String make;
    String colour;
    int vin; //vehicle identification number

    public Car(String make, String colour, int vin) {
        this.make = make;
        this.colour = colour;
        this.vin = vin;
    }

    public String getMake()
    {
        return make;
    }

    public String getColour()
    {
        return colour;
    }

    public int getVin()
    {
        return vin;
    }

}
