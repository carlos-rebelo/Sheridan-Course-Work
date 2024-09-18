package yourturn1;

public class CollegeStudent extends Student {

    public CollegeStudent(String name) {
        super(name);
    }

    public void goToCollegeParty()
    {
        System.out.println(name + " is attending a college party");
    }
}
