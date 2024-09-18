package atasteofstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataSlicerizer {

    private ArrayList<Student> students;

    public DataSlicerizer(Student[] students) {
        this.students = new ArrayList<Student>(Arrays.asList(students));
    }

    //1. print out student names
    //2. print out names of students with gpa over 50
    //3. print out names of students with gpa over 50 and in COMP
    //4. print out how many students are in COMP with GPA over 50
    //Back to Slides

    //5. return an ArrayList of students in COMP with GPA over 50
    //6. return a String of student names in COMP with GPA over 50

    //let's start by using object-oriented programming
    public void oopSliceAndDice()
    {

        System.out.println("======OOP======");

        System.out.println("All Students:");

        for (Student student : students) {
            System.out.println(student);
        }
        /** Hint :
            for (Student student : students)
            {
                System.out.println(student.getName());
            }
        */

        System.out.println("\nAll Students with gpa over 50");

        for (Student student : students) {
            if (student.getGpa() > 50) {
                System.out.println(student);
            }
        }

        /** Hint :
            for (Student student : students)
            {
                if (student.getGpa() > 50)
                {
                    System.out.println(student.getName());
                }
            }
        */

        System.out.println("\nAll students that are both over 50 gpa and are COMP students");

        for (Student student : students) {
            if(student.getGpa() < 50 && student.getProgram() == Program.COMP) {
                System.out.println(student);
            }
        }

        System.out.println("Sorted by GPA");
        students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa() - o2.getGpa();
            }
            
        });
        for (Student student : students) {
            System.out.println(student);
        }
        /** Hint: 
            for (Student student : students)
            {
                if (student.getGpa() > 50 && student.getProgram() == Program.COMP)
                {
                    System.out.println(student.getName());
                }
            }
        */

        System.out.println("Count of how many students are in COMP and have a gpa over 50");
            int count = 0;
            for (Student student : students) {
                if (student.getGpa() > 50 && student.getProgram() == Program.COMP) {
                    count++;
                }
            }
            System.out.println("Count: "+count);
        /** Hint :
            int count = 0;
            for (Student student : students)
            {
                if (student.getGpa() > 50 && student.getProgram() == Program.COMP)
                {
                    count++;
                }
            }
            System.out.println(count);
        */

    }

    public void functionalSliceAndDice()
    {

        System.out.println("======Functional ======");

        System.out.println("All Students:");
        students.stream().forEach((t) -> System.out.println(t));
        
        /** Hint :
            students.stream().forEach(s -> System.out.println(s.getName()));
        */

        System.out.println("\nAll Students with gpa over 50");
        students.stream()
        .filter((t) -> t.getGpa() > 50)
        .forEach(t -> System.out.println(t));

        /** Hint :
            students.stream()
                    .filter(s -> s.getGpa() > 50)
                    .forEach(s -> System.out.println(s.getName()));
        */

        System.out.println("\nAll students that are both over 50 gpa and are COMP students");
        students.stream()
        .filter(t -> t.getGpa() > 50 && t.getProgram() == Program.COMP)
        .forEach(t -> System.out.println(t));
        /** Hint :
            students.stream()
                    .filter(s -> s.getGpa() > 50)
                    .filter(s -> s.getProgram() == Program.COMP)
                    .forEach(s -> System.out.println(s.getName()));
        */

        System.out.println("Count of how many students are in COMP and have a gpa over 50");
        long count = students.stream()
        .filter(t -> t.getGpa() > 50 && t.getProgram() == Program.COMP)
        .count();
        System.out.println(count);

        Stream <Student> s1 = students.stream();
        Stream <Student> s2 = s1.filter(t -> t.getGpa() > 50);
        Stream <Student> s3 = s2.sorted((o1,o2) -> o1.getGpa() - o2.getGpa());
        /** Hint:
            int numStudents = (int) students.stream()
                    .filter(s -> s.getProgram() == Program.COMP)
                    .filter(s -> s.getGpa() > 80)
                    .count(); //returns a long
            System.out.println(numStudents);
        */

        // ⁡⁣⁢⁢Back to Slides⁡!

    }

    // ⁡⁣⁢⁢Part B⁡ : 
    //let's make our own filter!
    public void filterOnCompStudents()
    {
        System.out.println("\nBuilding our own filter");
        students.stream()
                //here is our stream solution
                .filter((s) -> s.getProgram() == Program.COMP)
                .forEach(s -> System.out.println(s.getName()));

        //The filter method takes a Predicate.  A predicate is just a Functional Interface (an interface with only one abstract method).  OK, let's build an anonymous class that implements Predicate.

        /*Hint
        Predicate<Student> predicate = new Predicate<Student>() {
        
            @Override
            public boolean test(Student student)
            {
                return (student.getProgram() == Program.COMP);
            }
        };
        */

        //Now, let's pass predicate to our filter:

        /** Hint :
        students.stream()
                .filter(predicate)
                .forEach(s -> System.out.println(s.getName()));
         */

        //Aha!  It looks all fancy, but all we are doing is building an anonymous class that implements the functional interface ,"Predicate" and using lambda to simplify the writing of it.

        // Hmmm... Instead of assigning our new object to the reference variable predicate and then passing predicate into the filter method, we could cram that whole thing into the filter arguments.  Then we could start using lambda to simplify and voila!  We have our original expression
    }

    public void ourOwnHomegrownForEach()
    {
        System.out.println("\nLets build our own, homegrown forEach");
        students.stream()
                .forEach(s -> System.out.println(s.getName()));

        //The forEach method accepts a Consumer which is just a Functional Interface!  Let's build one!

        /*Hint: 
        Consumer<Student> consumer = new Consumer<Student>() {
        
            @Override
            public void accept(Student student)
            {
                System.out.println(student.getName());
            }
        
        };
        
        students.stream()
                .forEach(consumer);
        */
        //Same thing...if we squish the new object into the forEach arguments, we can build our lambda directly!

    }

    // ⁡⁣⁢⁢Part C⁡⁡ :

    //Let's print out our list of students without any duplicates
    //Hint, one of the pipeline methods is distinct - Easy, right!

    public void printOutStudentsWithoutDuplicates()
    {
        // System.out.println("Names without duplicates");
        // String names = students.stream()
        // .filter(t -> t.getGpa() > 60)
        // .map(new Function<Student,String>() {

        //     @Override
        //     public String apply(Student t) {
        //         // TODO Auto-generated method stub
        //         throw new UnsupportedOperationException("Unimplemented method 'apply'");
        //     }
            
        // });
        /*  Hint 
        System.out.println("\n Printing out list with no duplicates");
        students.stream()
                .distinct()
                .forEach(s -> System.out.println(s.getName()));
        */
    }
    //⁡⁢⁣⁢uh oh!!!  Why didn't this work?  How can we fix it?⁡
    /*  ⁡⁢⁢⁢Answer⁡ :
    Our Student must override equals and hashCode so that the duplicate code can work correctly
     */

    // ⁡⁣⁢⁢Part D⁡ :

    //Let's sort our results

    public void printOutSortedListByGpa()
    {
        System.out.println("\nPrinting out list, sorted by gpa");

        //In order to sort, we need to use the Comparator functional interface.  Let's build an inner-anonymous class of type Comparator to figure this out.

        //Hint - our compare method should return a negative number if the first object should come before the second object, a 0 if they are equal, and a positive number if the first object should come after the second object.

        /*  Hint #1 - inner-anonymous class
        students.stream()
                .sorted(new Comparator<Student>() {
        
                    @Override
                    public int compare(Student o1, Student o2)
                    {
                        return o2.getGpa() - o1.getGpa();
                    }
        
                })
                .forEach(s -> System.out.println(s.getName()));
        */

        /*  Hint #2 - lambda expression
        students.stream()
                .sorted((o1, o2) -> (o2.getGpa() - o1.getGpa()))
                .forEach(s -> System.out.println(s.getName()));
        */
    }

    // ⁡⁣⁢⁢Part E⁡ :
    // public List getSortedListOfStudentsInComp()
    // {

    //     /* Hint
    //     List<Student> list = students.stream()
    //             .filter(s -> s.getProgram() == Program.COMP)
    //             .sorted((o1, o2) -> o2.getGpa() - o1.getGpa())
    //             .collect(Collectors.toList());
    //     return list; 
    //      */
    // }

    // ⁡⁣⁢⁢Part F⁡: 

    public void usingMap()
    {
        //Let's say that we just want a list of all of the GPAs
        System.out.println("\n Using the map method");

        /* Hint :  
        List<Integer> gpas = students.stream()
                .map(s -> s.getGpa())
                .collect(Collectors.toList());
        
        System.out.println(gpas);
        */
    }

}
