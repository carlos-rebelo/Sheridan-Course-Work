public class VisaGold extends CreditCard{

    public VisaGold(String name) {
        super(name);
    }

    @Override
    public void addInterestCharges() {
        balanceOwing += balanceOwing * 1.02;
    }
        

}
