package zzzyourturn1complete;

public class Start {
    public static void main(String[] args)
    {
        //PART A
        //1.  Follow the instructions in the Person class
        //2. Test your Person class by Instantiating a Person named Millhouse and make him eat and speak the sentence:  "Everything is coming up Millhouse!"

        Person p1 = new Person();
        p1.setName("Millhouse");
        p1.eat();
        p1.speak("Everything is coming up Millhouse!");

        /*PARTB 
        
        Make Student a child of Person - follow the comments in Student
        
        Instantiate a Student object with a name of Bart
        Make the object say "inheritance"
        
        Now,  override the speak method so that the it prints out this: "<name> says, is <sentence> going to be on the test? "
        
        re-run our code to see how it affects our output
        
        Spoiler alert - YES, inheiritance will be on the test!
        
              !Question - why did we have to use getName in the two methods that we wrote?  Can you think of how you could get away without the getter by changing one word in the Person class?  
        */

        Student s1 = new Student("Bart", 123);
        s1.speak("inheritance");

        //PART C - let's fix our name instance variable to be protected and use our setter to set the name

        //Part D - Let's overload the empty default constructor to Person with one that accepts a name - uh oh...how will we fix Student?

        //PART E - Let's make the toString method more useful for Person - we want it to print out the person's name
        System.out.println(p1);
        System.out.println(s1);

        //Now override the toString in the Student object to print out the student's name, student number, and GPA

        System.out.println(p1);
        System.out.println(s1);

    }
}
