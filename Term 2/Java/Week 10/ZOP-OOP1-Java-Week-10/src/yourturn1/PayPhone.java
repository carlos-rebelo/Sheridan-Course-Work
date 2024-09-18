package yourturn1;

public class PayPhone {
    private double moneyAccepted;

    public void acceptCoin(Coin coin) {
        moneyAccepted += coin.getPrice();
    }

    public void makeCall(int phoneNumber) {
        if (moneyAccepted >= 0.25) {
            System.out.println("Payphone is dialing "+phoneNumber);
            moneyAccepted = 0;
        }
        else {
            System.out.println("Sorry, not enough change inserted");
        }
    }
}
