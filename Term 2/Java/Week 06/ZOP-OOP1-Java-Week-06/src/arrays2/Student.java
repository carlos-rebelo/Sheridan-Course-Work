package arrays2;

public class Student {
    private String name;
    private int studentNumber;
    private double gPA;

    public Student(String name, int studentNumber, double gPA) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gPA = gPA;
    }

    public String getName()
    {
        return name;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public double getGPA()
    {
        return gPA;
    }

    public void study()
    {
        System.out.println(this.name + " is studying!");
    }
}
