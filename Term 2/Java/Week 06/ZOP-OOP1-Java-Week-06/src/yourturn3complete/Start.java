package yourturn3complete;

public class Start {
    public static void main(String[] args) throws Exception
    {

        //Build a Stack class!  Write your methods so that output of the following code is:

        //      4
        //      Tesla
        //      Tesla
        //      Aston Martin
        //      2
        //      Audi

        Stack stack = new Stack();
        stack.push(new Car("ZYZ123", "Jaguar"));
        stack.push(new Car("ABC124", "Audi"));
        stack.push(new Car("BDH234", "Aston Martin"));
        stack.push(new Car("ERF456", "Tesla"));

        System.out.println(stack.size());
        System.out.println(stack.peek().getModel());
        System.out.println(stack.pop().getModel());
        System.out.println(stack.pop().getModel());
        System.out.println(stack.size());
        System.out.println(stack.pop().getModel());
    }
}
