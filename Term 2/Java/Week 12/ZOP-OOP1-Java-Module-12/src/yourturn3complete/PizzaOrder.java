package yourturn3complete;

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

    public void addTopping(ToppingType type)
    {
        toppings.add(type);
    }

    public double calcPriceBeforeTax()
    {
        double price = size.getPrice();
        for (ToppingType toppingType : toppings)
        {
            price += toppingType.getPrice();
        }
        return price;
    }

    public double calcPriceBeforeTaxUsingStreams()
    {
        double price = size.getPrice() +
                toppings.stream()
                        .mapToDouble(t -> t.getPrice())
                        .sum();
        return price;
    }

    @Override
    public String toString()
    {
        return "PizzaOrder [orderNumber=" + orderNumber + ", size=" + size + ", toppings=" + toppings + " Price: " + calcPriceBeforeTaxUsingStreams() + "]";
    }

}
