package immutable;

//Let's make Student immutable

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String program;
    private int GPA;

    public Student(String firstName, String lastName, int studentNumber, String program, int GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.program = program;
        this.GPA = GPA;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public void setProgram(String program)
    {
        this.program = program;
    }

    public void setGPA(int gPA)
    {
        GPA = gPA;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public String getProgram()
    {
        return program;
    }

    public int getGPA()
    {
        return GPA;
    }

    @Override
    public String toString()
    {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentNumber=" + studentNumber + ", program=" + program + ", GPA=" + GPA + "]";
    }

    public static class StudentBuilder {
        private final String firstName;
        private final String lastName;
        private final int studentNumber;
        private String program;
        private int GPA;

        public StudentBuilder(String firstName, String lastName, int studentNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentNumber = studentNumber;
        }

        public StudentBuilder program(String program)
        {
            this.program = program;
            return this;
        }

        public StudentBuilder GPA(int GPA)
        {
            this.GPA = GPA;
            return this;
        }

        public Student build()
        {
            return new Student(firstName, lastName, studentNumber, program, GPA);
        }

    }

}
