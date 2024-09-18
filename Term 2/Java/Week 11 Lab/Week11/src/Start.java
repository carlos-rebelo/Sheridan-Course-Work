import java.util.ArrayList;

public class Start {
    public static void main(String[] args)
    {
        VisaGold c1 = new VisaGold("Rich");
        c1.makePurchase("Large Pizza", 25.99);
        c1.makePurchase("Movie Tickets ", 15.99);
        c1.makePurchase("bicycle", 125.99);
        c1.makePayment(100);
        c1.makePurchase("groceries", 75.99);
        System.out.println(c1);

        //Why can we add both Visa and VisaGold cards to the arraylist?

        ArrayList<CreditCard> cards = new ArrayList<>();
        cards.add(c1);
        cards.add(new Visa("Bart"));
        cards.add(new VisaGold("Lisa"));
        cards.add(new Visa("Ralph"));

        cards.get(2).makePurchase("Books", 42.98);
        cards.get(3).makePurchase("Candy", 4.98);
        cards.get(3).makePurchase("Marbles", 2.98);

        for (CreditCard creditCard : cards)
        {
            creditCard.addInterestCharges();
            System.out.println(creditCard.toString());
        }
    }
}
