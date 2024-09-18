package yourturn1complete;

public class Start {
    public static void main(String[] args)
    {
        /*  ⁡⁣⁢⁡⁣⁢⁢Part A⁡⁡ :
        Take a look at the Person class
        Have Student inherit from Person (don't forget to fix up the constructors!)
        Make our student be able to study (<name> is studying)
        Make CollegeStudent extend Student
        Make our College student attendCollegeParty (<name> is attending a College Party)
        
        In the main method, instantiate a CollegeSudent and make our CollegeStudent sleep, study and attend a college party
        
        Now, create a Student reference variable and have it hold the address of our College Student.  We can do this because of polymorphism!
        
        Use our Student reference variable to try to make our object sleep, study and attend the party.  Hmmm?!  We couldn't attend the party, could we?  Why do you think that is?
        
        
        Now make a reference variable of type Person and have it point to the same object as the other two.  Can you predict what one method will still work?
        */

        CollegeStudent collegeStudent = new CollegeStudent("Lisa");
        collegeStudent.sleep();
        collegeStudent.study();
        collegeStudent.goToCollegeParty();

        Student student = collegeStudent;
        student.study();
        student.sleep();
        //student.goToCollegeParty();  this won't work because Student doesn't know about eh goToCollegeParty method

        Person person = collegeStudent;
        person.sleep();
        //the other two methods won't work because the reference variable (of type Person) can only see methods in the Person class

        /* ⁡⁣⁢⁡⁣⁢⁢Part B⁡⁡:
        *   So, let's make an array that can hold three Person objects and put a CollegeStudent into floor (element) 0;
        * Now, using polymorphism, instantiate a Student object and place its address into element 1
        * Finally, instantiate a Person object and place its address into  element 2
        
        Now, loop through the array and make each object sleep
        
        Ok, let's try to add the ability to make each object in the array study.  It gives us an error.  Because our array uses Person as our reference variable, we can only use methods that are available to Person.
        
        */

        System.out.println("Part B");
        System.out.println("---------------------------------------");
        Person[] polymorphicArray = {
                new CollegeStudent("Lisa"),
                new Student("Bart"),
                new Person("Millhouse"),
        };

        for (Person person2 : polymorphicArray)
        {
            person2.sleep();
            // person2.study(); //won't work because our reference variable is of type Person and Person doesn't know how to study.
        }

        /*   ⁡⁣⁢⁢Part C⁡ :
         use casting to force the compiler to allow us to call the study method.  What happens when we run it?
         
         Why?
        
        */
        System.out.println("Part C:");
        System.out.println("---------------------------------------");
        for (Person person2 : polymorphicArray)
        {
            person2.sleep();
            //((Student) person2).study(); //we use casting to force the compiler to allow us to call the method.  However, when we try to call study on the Person object, we will get a runtime error because the object doesn't know how to do that
        }

        /* ⁡⁣⁢⁢Part D⁡ :
        Let's make every object in our array that can Study, run the study method.  instanceOf is your friend here
        */

        //We can use the instanceOf keyword to check if the child object is of the correct type before calling the method.

        System.out.println("Part D");
        System.out.println("---------------------------------------");
        for (Person person2 : polymorphicArray)
        {
            person2.sleep();
            if (person2 instanceof Student)
            {
                ((Student) person2).study();
            }
        }
    }
}
