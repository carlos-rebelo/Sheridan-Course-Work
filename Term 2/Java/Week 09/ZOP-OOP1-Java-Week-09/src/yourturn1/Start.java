package yourturn1;

public class Start {
    public static void main(String[] args)
    {
        /* ⁡⁣⁢⁡⁣⁢⁢Part A⁡⁡ :
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
        /* CollegeStudent cs1 = new CollegeStudent("Carlos");
        cs1.sleep();
        cs1.study();
        cs1.goToCollegeParty();
        Student s1 = cs1;
        s1.sleep();
        s1.study();
        Person p1 = s1;
        p1.sleep(); */
        /* ⁡⁣⁢⁡⁣⁢⁢Part B⁡⁡:
        *   So, let's make an array that can hold three Person objects and put a CollegeStudent into floor (element) 0;
        * Now, using polymorphism, instantiate a Student object and place its address into element 1
        * Finally, instantiate a Person object and place its address into  element 2
        
        Now, loop through the array and make each object sleep
        
        Ok, let's try to add the ability to make each object in the array study.  It gives us an error.  Because our array uses Person as our reference variable, we can only use methods that are available to Person.
        
        */
        Person[] people = {
            new Student("Carlos"),
            new CollegeStudent("Justin"),
            new Person("John")
        };
        for (Person person : people) {
            if (person instanceof Student || person instanceof CollegeStudent) {
                ((Student) person).study();
            }
            else {
                person.sleep();
            }
            
            
        }
        /* ⁡⁣⁢⁢Part C⁡ :
         use casting to force the compiler to allow us to call the study method.  What happens when we run it?
         
         Why?
        
        */

        /* ⁡⁣⁢⁢Part D⁡ :
        Let's make every object in our array that can Study, run the study method.  instanceOf is your friend here
        */

    }
}
