package yourturn3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MamasPizza {
    private List<PizzaOrder> orders = new ArrayList<>();

    public void addOrder(PizzaOrder order) {
        orders.add(order);
    }
    public PizzaOrder getOrderByOrderNumber(int num) {
        return orders.get(num);
    }
}
