package polymorphismandcasting;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void talk()
    {
        System.out.println(name + " is talking");
    }

}
