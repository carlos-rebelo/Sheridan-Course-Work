package yourturn3;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    protected int orderNumber;
    protected Size size;
    protected List<ToppingType> toppings = new ArrayList<>();
    private static int nextOrderNumber;

    public PizzaOrder(Size size) {
        this.size = size;
        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;
    }
    public void addTopping(ToppingType topping) {
        toppings.add(topping);
    }
    @Override
    public String toString() {
        return "PizzaOrder [orderNumber=" + orderNumber + ", size=" + size + ", toppings=" + toppings + "]";
    }

}
