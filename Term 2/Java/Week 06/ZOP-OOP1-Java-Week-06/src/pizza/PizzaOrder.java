package pizza;

public class PizzaOrder {
    private String customer;
    private Size size; //let's make size an enumerated type and attach a price to the various sizes
    private Topping[] toppings = new Topping[20];
    private int toppingsStored;
    

    //hmmm...what if I want more or less toppings?

    public PizzaOrder(String customer, Size size) {
        this.customer = customer;
        this.size = size;
    }
    public void addTopping(Topping topping) {
        toppings[toppingsStored] = topping;
        toppingsStored++;
    }
    public void getToppings() {
        for (Topping topping: toppings) {
            if(topping != null) {
                System.out.println(topping);;
            }
        }
    }
    public void printBill() {
        System.out.println("Mama's Pizza");
        System.out.println("Customer name: "+ customer);
        System.out.println("Size: "+ size);
        System.out.println("Toppings: ");
        for (Topping topping : toppings) {
            System.out.println("Topping " + topping);
            
        }
        double price = size.getPrice() + toppingsStored * 0.99;
    }

}
