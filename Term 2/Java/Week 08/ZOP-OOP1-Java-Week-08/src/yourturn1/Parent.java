package yourturn1;

public class Parent {

    String name; // package protected, can be seen within class, and within package
    protected int age; // can be seen within class, within the package, and in any class that inherits from it
    private int numHats; //can be seen within class
    public int numCookies; //can be seen from anywhere

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void method1()
    {
        System.out.println("In method1 of Parent");
    }

    public void method2()
    {
        System.out.println("In method2 of Parent");
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
