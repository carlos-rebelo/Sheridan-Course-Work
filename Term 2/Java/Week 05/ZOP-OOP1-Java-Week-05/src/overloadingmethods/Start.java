package overloadingmethods;

public class Start {
    public static void main(String[] args)
    {

        String string = "123456789";
        System.out.println(string.substring(5));
        System.out.println(string.substring(5, 7));

        Student s1 = new Student("Carlos");

        //let's make our Student study - if only it were this easy!
        s1.study();
        s1.study("Math");
        s1.study("Science",2);
        //what if we want our Student to study a particular subject?

        //what if we want our Student to study x number of hours?
    }
}
