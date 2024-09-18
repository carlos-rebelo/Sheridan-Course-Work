package pizzacomplete;

public class PizzaOrder {
    private String customer;
    private Size size; //let's make size an enumerated type and attach a price to the various sizes
    private Topping[] toppings = new Topping[15];
    private int numToppings = 0;

    //hmmm...what if I want more or less toppings?

    public PizzaOrder(String customer, Size size) {
        this.customer = customer;
        this.size = size;
    }

    public void addTopping(Topping topping)
    {
        toppings[numToppings] = topping;
        numToppings++;
    }

    public void printReceipt()
    {
        double amountOwed = calcAmountOwed();
        System.out.println("Customer name: " + customer);
        listToppings();
        System.out.println("\nAmount Owed: " + amountOwed);
    }

    private void listToppings()
    {
        System.out.print("Toppings: ");
        for (Topping topping : toppings)
        {
            System.out.print((topping != null) ? topping + "," : "");
        }
    }

    private double calcAmountOwed()
    {
        double amountOwed = size.getPrice();
        amountOwed += numToppings * 1.99;
        return amountOwed;
    }

}
