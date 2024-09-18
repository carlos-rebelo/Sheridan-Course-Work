package yourturn1;

public class CellPhone {
    private Power powerStatus;

    public CellPhone() {
        this.powerStatus = Power.OFF;
    }
    public void makeCall(int numberToCall) {
        if (powerStatus.getValue() == true) {
            System.out.println("Cellphone is dialing "+numberToCall);
        }
        else {
            System.out.println("Sorry, cellphone is powered off");
        }
    }
    public Power getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(Power power) {
        this.powerStatus = power;
    }
}
