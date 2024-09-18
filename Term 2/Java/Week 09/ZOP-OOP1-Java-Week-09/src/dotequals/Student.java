package dotequals;

public class Student {
    private String name;
    private int studentNumber;

    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getName()
    {
        return name;
    }

    

    // @Override
    // public int hashCode()
    // {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + studentNumber;
    //     return result;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
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

    //Let's start by adding a .equals method
    // @Override
    // public boolean equals(Object otherStudent)
    // {
    //     if (this.studentNumber == ((Student) otherStudent).studentNumber)
    //     {
    //         return true;
    //     }
    //     return false;
    // }

    /*  ⁡⁢⁢⁢Hint⁡ :
     public boolean equals(Student otherStudent)
    {
        return this.getStudentNumber() == otherStudent.getStudentNumber();
    }
     */

    //Great, but since .equals is in Object, we really should add @Overrides...uh oh!

    //How can we fix this?

    /*  ⁡⁢⁢⁢Hint⁡ :
     @Override
    public boolean equals(Object object)
    {
        Student otherStudent = ((Student) object);
        System.out.println(this.studentNumber == otherStudent.getStudentNumber());
        return this.studentNumber == ((Student) object).getStudentNumber();
    
    }
     */

    //Let's look at the .equals method associated with the Object class - Back to Slides

    //need to include hashcode stuff as well

}
