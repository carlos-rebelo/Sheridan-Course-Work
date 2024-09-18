package atasteofstreams;

enum Program {
    COMP, MATH, PHYS, BUSI, ENGI
}

public class Student {
    private String name;
    private int studentNumber;
    private Program program;
    private int gpa;

    private static int nextStudentNumber;

    public Student(String name, Program program, int gpa) {
        this.name = name;
        this.program = program;
        this.gpa = gpa;
        this.studentNumber = nextStudentNumber;
        nextStudentNumber++;
    }

    public String getName()
    {
        return name;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public int getGpa()
    {
        return gpa;
    }

    public Program getProgram()
    {
        return program;
    }

    public void setGpa(int gpa)
    {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentNumber=" + studentNumber + ", program=" + program + ", gpa=" + gpa
                + "]";
    }

}
