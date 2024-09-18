package finalenumeratedtypes;

public class PizzaOrder {
    private String customerName;
    private PizzaSize size;
    private PizzaToppings topping1;
    private PizzaToppings topping2;
    private PizzaToppings topping3;

    public PizzaOrder(String customerName, PizzaSize size) {
        this.customerName = customerName;
        this.size = size;
    }

    public PizzaToppings getTopping1()
    {
        return topping1;
    }

    public void setTopping1(PizzaToppings topping1)
    {
        this.topping1 = topping1;
    }

    public PizzaToppings getTopping2()
    {
        return topping2;
    }

    public void setTopping2(PizzaToppings topping2)
    {
        this.topping2 = topping2;
    }

    public PizzaToppings getTopping3()
    {
        return topping3;
    }

    public void setTopping3(PizzaToppings topping3)
    {
        this.topping3 = topping3;
    }
    public double calcCostPizza() {
        double price = size.getPrice();
        price += topping1.getCostOfTopping();
        price += topping2.getCostOfTopping();
        price += topping3.getCostOfTopping();
        return price;
    }

    public String toString() {
        String returnValue = "Customer Name: "+customerName
         + "\nSize:" + size + 
         "\nTopping 1: " + topping1 + 
         "\nTopping 2: " + topping2 +
         "\nTopping 3: " + topping3 + "\nPrice: "+ this.calcCostPizza();
        return returnValue;
    }

}
