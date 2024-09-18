package motel;

public class Guest {
    private String name;
    private String carLicensePlate;
    private double amountOwed;
  
    public Guest(String name, String carLicensePlate, double amountOwed) {
        this.name = name;
        this.carLicensePlate = carLicensePlate;
        this.amountOwed = amountOwed;
    }

    public String getName()
    {
        return name;
    }

    public String getCarLicensePlate()
    {
        return carLicensePlate;
    }

    public double getAmountOwed()
    {
        return amountOwed;
    }

    public void addRoomCharge(double charge)
    {
        this.amountOwed += charge;
    }
}
