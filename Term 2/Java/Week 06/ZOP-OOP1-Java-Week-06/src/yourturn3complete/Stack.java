package yourturn3complete;

public class Stack {
    private Car[] stack = new Car[20];
    private int sizeOfStack;

    public void push(Car car) throws Exception
    {
        if (sizeOfStack == stack.length)
        {
            throw new Exception("Stack is full");
        }
        stack[sizeOfStack] = car;
        sizeOfStack++;
    }

    public Car pop() throws Exception
    {
        if (sizeOfStack == 0)
        {
            throw new Exception("Nothing on Stack");
        }
        sizeOfStack--;
        return stack[sizeOfStack];
    }

    public int size()
    {
        return sizeOfStack;
    }

    public Car peek()
    {
        return stack[sizeOfStack - 1];
    }

}
