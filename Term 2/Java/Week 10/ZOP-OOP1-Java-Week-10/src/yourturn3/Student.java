package yourturn3;

public class Student {

    protected String name;
    protected int studentNumber;
    protected int GPA;

    public Student(String name, int studentNumber, int gPA) {
        this.name = name;
        this.studentNumber = studentNumber;
        GPA = gPA;
    }

    public String getName()
    {
        return name;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public int getGPA()
    {
        return GPA;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public void setGPA(int gPA)
    {
        GPA = gPA;
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", studentNumber=" + studentNumber + ", GPA=" + GPA + "]\n";
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (studentNumber != other.studentNumber)
            return false;
        return true;
    }

}
