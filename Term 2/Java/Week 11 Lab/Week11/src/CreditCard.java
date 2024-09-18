import java.util.ArrayList;

public abstract class CreditCard {
    private String name;
    protected double balanceOwing = 0;
    private ArrayList <String> transactions = new ArrayList<>();

    public CreditCard(String name) {
        this.name = name;
    }
    public void makePurchase(String itemName, double cost) {
        balanceOwing += cost;
        transactions.add(itemName + ": "+cost+"$");
    }
    public void makePayment(double amount) {
        balanceOwing -= amount;
        transactions.add("Payment of "+amount+" made");
    }

    public abstract void addInterestCharges();

    @Override
    public String toString() {
        return "Name: "+name+"\nBalance: "+balanceOwing+"\nTransactions: \n"+transactions;
    }
}
