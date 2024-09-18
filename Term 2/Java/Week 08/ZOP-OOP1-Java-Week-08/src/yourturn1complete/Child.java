package yourturn1complete;

public class Child extends Parent {

    public Child(int instVar) {
        super(instVar);
        System.out.println("In the constructor of child");
    }

    @Override
    public void method1()
    {
        System.out.println("In method1 of Child class");
        super.method1();
    }

    public void method3()
    {
        System.out.println("The value of instVar is " + instVar);
    }

    @Override
    public String toString()
    {
        return "I'm the toString method in the Child class";
    }

}
