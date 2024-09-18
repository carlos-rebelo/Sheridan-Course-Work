package yourturn1complete;

public class Parent {

    protected int instVar;

    public Parent(int instVar) {
        this.instVar = instVar;
        System.out.println("In the constructor of Parent");
    }

    public void method1()
    {
        System.out.println("In method1 of Parent");
    }

    public void method2()
    {
        System.out.println("In method2 of Parent");
    }

}
