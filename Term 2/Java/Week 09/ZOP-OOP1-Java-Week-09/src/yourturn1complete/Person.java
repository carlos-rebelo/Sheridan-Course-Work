package yourturn1complete;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping...");
    }
}
