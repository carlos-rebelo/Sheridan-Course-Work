package yourturn3complete;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MamasPizza {
    private List<PizzaOrder> orders = new ArrayList<>();

    public void addOrder(PizzaOrder order)
    {
        orders.add(order);
    }

    public PizzaOrder getOrderByOrderNumber(int orderID)
    {
        return orders.stream()
                .filter(s -> s.orderNumber == orderID)
                .findFirst()
                .orElse(null);
    }

    public int howManyToppingsOrdered(ToppingType topping)
    {
        long num = orders.stream()
                .filter(s -> s.toppings.contains(topping))
                .count();

        return (int) num;
    }

}
