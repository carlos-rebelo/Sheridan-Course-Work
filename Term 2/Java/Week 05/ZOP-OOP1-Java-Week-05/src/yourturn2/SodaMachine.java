package yourturn2;

public class SodaMachine {
    private double totalMoneyCollected;
    private double costOfCan;
    private int cansInMachine;
    private double moneyCollectedSinceLastDispense = 0;

    public SodaMachine(int cansInMachine, double costOfCan) {
        this.costOfCan = costOfCan;
        this.cansInMachine = cansInMachine;
    }
    public void acceptCoin(Coin coin){
        totalMoneyCollected += coin.getValue();
        moneyCollectedSinceLastDispense += coin.getValue();
    }
    public void dispenseSodaCan() {
        if (moneyCollectedSinceLastDispense < costOfCan) {
            System.out.println("Sorry, you must insert "+(costOfCan - moneyCollectedSinceLastDispense)+" more");
        }
        else if (cansInMachine < 1) {
            System.out.println("Sorry, not enough soda cans in machine");
        }
        else {
            moneyCollectedSinceLastDispense = 0;
            System.out.println("Dispensing a can of soda!");
        }
        
    }

    public double getTotalMoneyCollected() {
        return totalMoneyCollected;
    }

    public void returnChange() {
        System.out.println("Sorry, return change is out of order");
    }

}
