package polymorphismandcasting;

//we would like Student to extend Person and we would like Student to be able to study
public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void study()
    {
        System.out.println(name + "is studying");
    }

}
