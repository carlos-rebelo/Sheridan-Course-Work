package yourturn3complete;

public class Car {
    private String licensePlate;
    private String model;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    public String getModel()
    {
        return model;
    }

}
