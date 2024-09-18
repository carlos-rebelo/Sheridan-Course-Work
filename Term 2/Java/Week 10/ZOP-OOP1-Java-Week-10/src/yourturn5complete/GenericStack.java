package yourturn5complete;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack = new ArrayList<>();
    private int stackSize;

    public void push(T car)
    {
        stack.add(car);
        stackSize++;
    }

    public T pop()
    {
        stackSize--;
        return stack.remove(stackSize);
    }

    public int size()
    {
        return stackSize;
    }

    public T peek()
    {
        return stack.get(stackSize - 1);
    }
}
