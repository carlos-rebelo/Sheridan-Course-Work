package inheritancecomplete;

public class Person {
    protected String name; //I know, I know - we shouldn't make our instance variables public!  We will fix this soon!

    public Person(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void speak(String sentence)
    {
        System.out.println(name + " says, " + sentence);
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping");
    }

}
