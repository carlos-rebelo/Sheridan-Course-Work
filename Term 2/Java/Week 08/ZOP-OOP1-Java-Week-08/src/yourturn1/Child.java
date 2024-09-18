package yourturn1;

public class Child extends Parent{
    public Child(String name, int age) {
        super(name, age);
    }
   @Override
    public void method2()
    {
        System.out.println("In method2 of Child");
    }
    public void method3()
    {
        System.out.println(name);
        System.out.println(age);
    }
    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
