package overloadingmethods;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public Student() {
        
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void study()
    {
        System.out.println(name + " is studying");
    }
    public void study(String subject)
    {
        System.out.println(name + " is studying "+ subject);
    }
    public void study(String subject, int hours)
    {
        System.out.println(name + " is studying "+ subject +" for "+hours+" hours");
    }
    //let's overload study to study a particular subject

    //let's further overload study so we can also choose how many hours to study

}
