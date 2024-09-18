package zzzyourturn1complete;

public class Person {
    /*
    
    1.Person needs a name with a getter and setter and the ability to eat (print out "<name is eating>""), sleep(print out "<name> is sleeping") and speak a message that we pass to it (print out "<name> says, <sentence>")
    
    ***** for now, let's make our name instance variable public  ******
    
    Test your code from the Start class
    
    */

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {}

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void eat()
    {
        System.out.println(name + " is eating");
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping");
    }

    public void speak(String sentence)
    {
        System.out.println(name + "says, " + sentence);
    }

    @Override
    public String toString()
    {
        return name;
    }
}
