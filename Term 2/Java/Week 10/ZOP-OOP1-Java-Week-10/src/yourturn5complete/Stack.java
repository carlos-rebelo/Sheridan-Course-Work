package yourturn5complete;

import java.util.ArrayList;

public class Stack implements Stackable {
    private ArrayList<Car> stack = new ArrayList<>();
    private int stackSize;

    public void push(Car car)
    {
        stack.add(car);
        stackSize++;
    }

    public Car pop()
    {
        stackSize--;
        return stack.remove(stackSize);
    }

    public int size()
    {
        return stackSize;
    }

    public Car peek()
    {
        return stack.get(stackSize - 1);
    }
}
