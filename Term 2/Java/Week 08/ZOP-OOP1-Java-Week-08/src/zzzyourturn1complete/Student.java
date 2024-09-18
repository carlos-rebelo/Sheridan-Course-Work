package zzzyourturn1complete;

public class Student extends Person {

    /*   PARTA
      
        1. Make Student a child class of Person - this makes sense as a Student is a more specific type of person - What code did you get for free by doing this? eat, sleep, speak, getName, setName
        2. Add an additional instance variable to track studenNumber
        3. Add functionality to our Student to allow it to study a particluar subject that we will pass in as a String.  The study method will print out: "<name> is studying <subject>"
                *Note - you will have to use getName in order to access name.  Any idea why?
                Answer - Because name is private so it can only be seen from inside of the Person class - we will learn ways around this soon.
        4. go back to the Start clas and test out our new Student!
    */
    private int studentNumber;
    /* 
        PARTB -
    
        3. Override the speak method so that the it prints out this: "<name> says, is <sentence> going to be on the test? "
    
                !Question - why did we have to use getName in the two methods that we wrote?  Can you think of how you could get away without the getter by changing one word in the Person class?  
                *Answer - Because name is private so can only be seen by the Person class. We could change 'private String name;'  to 'protected String name;' so that the instance variable is available to any classes in the same package or any class outside the pacakge as long as it inherits from it.
    
        
        Go back to Start Class
    */

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;

    }

    @Override
    public void speak(String sentence)
    {
        System.out.println(this.getName() + " says, is " + sentence + "  going to be on the test?");
    }

    public void study(String subject)
    {
        System.out.println(this.getName() + " is studying" + subject);
    }

    @Override
    public String toString()
    {
        return name + " - " + studentNumber;
    }
}
