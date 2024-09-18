package pizzacomplete;

public class Start {
    public static void main(String[] args)
    {
        //let's fix up our PizzaOrder
        PizzaOrder order1 = new PizzaOrder("Rich", Size.PARTY);
        order1.addTopping(Topping.CHEESE);
        order1.addTopping(Topping.COOKIES);
        order1.addTopping(Topping.PINEAPPLE);

        order1.printReceipt();
    }
}
