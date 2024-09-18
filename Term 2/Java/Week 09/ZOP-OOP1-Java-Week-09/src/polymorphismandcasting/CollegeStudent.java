package polymorphismandcasting;

//We would like CollegeStudent to extend Student and let's add a method called cramForExams
public class CollegeStudent extends Student {

    public CollegeStudent(String name) {
        super(name);
    }

    public void cramForExams()
    {
        System.out.println(name + "is cramming for exams");
    }

}
