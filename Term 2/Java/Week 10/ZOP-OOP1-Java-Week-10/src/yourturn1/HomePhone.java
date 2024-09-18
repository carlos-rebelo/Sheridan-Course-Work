package yourturn1;

public class HomePhone {
    private int phoneNumber;

    public HomePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeCall (int numberToCall) {
        System.out.println("Homephone is dialing "+numberToCall);
    }
}
