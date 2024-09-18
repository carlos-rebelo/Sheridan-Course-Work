package dotequals;

import java.util.Arrays;

public class Start {
    public static void main(String[] args)
    {
        // ⁡⁣⁢⁢Part A⁡ : 
        int a = 7;
        int b = 7;
        System.out.println(a == b);

        Student s1 = new Student("Bart", 1);
        Student s2 = new Student("Bart", 1);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2); //uh oh

        //good news!  The Object class has a method called equals!  Hurray!
        System.out.println(s1.equals(s2));

        // uh oh!

        //Back to Slides

        // ⁡⁣⁢⁢Part B⁡ : 
        //Let's fix our equality problem - we'll add an equals method to Student

        //Did we remember to @Overrides?  uh oh...

        //Actually, we still have a problem.  Let's look at the following code:

        Student[] list = {
                new Student("Lisa", 1),
                new Student("Millhouse", 2),
                new Student("Nelson", 3),
                new Student("Lisa", 1),
        };

        //We will learn about Streams in Week 12 - For now, this line of code should print out only a list of unique Students.  In other words, it should not print out the second Student with a studentNumber of 1

        System.out.println("\nOur Stream results:");
        Arrays.stream(list).distinct().forEach(s -> System.out.println(s.getName()));

        // uh oh!  What gives?  

        //hashCode and equals are like pizza and pineapple!  They go together!  When you write one, you need to write both!
    }
}
