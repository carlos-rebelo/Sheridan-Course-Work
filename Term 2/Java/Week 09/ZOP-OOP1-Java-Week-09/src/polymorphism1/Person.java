package polymorphism1;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Person [name=" + name + "]";
    }

    public void eat()
    {
        System.out.println(name + " is eating");
    }

    public void speak(String sentence)
    {
        System.out.println(name + " says, " + sentence);
    }
}
