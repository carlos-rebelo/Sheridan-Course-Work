package parkinglot;

public class Car {

    private String license;
    private int amountOwed;
  
public Car(String license, int amountOwed) {
    this.license = license;
    this.amountOwed = amountOwed;
}

public String getLicense()
{
    return license;
}

public int getAmountOwed()
{
    return amountOwed;
}




    
}
