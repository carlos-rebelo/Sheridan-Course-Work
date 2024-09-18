package polymorphismandcasting;

public class Start {
    public static void main(String[] args)
    {

        CollegeStudent p1 = new CollegeStudent("Bart");
        //what methods do we have access to?
        p1.talk();
        p1.study();
        p1.cramForExams();

        //However, what if we want to treat CollegeStudent as just a Student?  Now what methods do we see?
        ((Student) p1).study();

        //or
        ((Person) p1).talk();

        //This is known as casting!  We can travel up and down an inheritance chain by using casting

    }
}
