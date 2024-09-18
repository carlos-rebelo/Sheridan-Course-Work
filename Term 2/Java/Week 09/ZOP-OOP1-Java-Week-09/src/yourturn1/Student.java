package yourturn1;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void study()
    {
        System.out.println(name + " is studying...");
    }
}
