package yourturn5complete;

public class Start {
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(new Car("Blue", "ABC123"));
        stack.push(new Car("Red", "XYZ321"));
        stack.push(new Car("Yellow", "AAA111"));
        stack.push(new Car("White", "ZZZ999"));

        System.out.println(stack.pop().getColour());
        System.out.println(stack.pop().getColour());
        System.out.println(stack.pop().getColour());
        stack.push(new Car("Black", "LMN001"));
        System.out.println(stack.pop().getColour());

        System.out.println(stack.peek().getColour());

        GenericStack<Student> stack2 = new GenericStack<>();
        stack2.push(new Student("Bart", 123));
        stack2.push(new Student("Lisa", 134));
        stack2.push(new Student("Millhouse", 456));
        System.out.println(stack2.pop().getName());

        GenericStack<Car> stack3 = new GenericStack<>();
        stack3.push(new Car("Blue", "ABC123"));
        stack3.push(new Car("Red", "XYZ321"));
        stack3.push(new Car("Yellow", "AAA111"));
        System.out.println(stack3.pop().getColour());

    }
}
