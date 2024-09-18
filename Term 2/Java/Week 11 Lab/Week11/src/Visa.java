public class Visa extends CreditCard{

    public Visa(String name) {
        super(name);
    }

    @Override
    public void addInterestCharges() {
        balanceOwing += balanceOwing * 1.04;
    }

}
