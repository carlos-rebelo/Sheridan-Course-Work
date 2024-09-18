package yourturn2;

public class Start {
    public static void main(String[] args)
    {
        /* ⁡⁣⁢⁢Read Me⁡ :
        
        Let's start with an Animal class:
        
        - Notice what a1.getClass() returns 
        - Where did the getClass method come from?
        - let's run the a1.getAnimalType method - this just cleans up the .getClass so we only see the Animal's type
        
        - OK.  We would like our Lion class to inherit the getAnimalType method from Animal - Let's do that and prove it worked.
        
        - We want to be able to build different kinds of animal classes that inherit from Animal but we don't want to be able to instantiate an Animal class.  How can we do this?!  While we are at it, let's force every class that inherits from Animal to make their own noise
        */

        // Animal a1 = new Animal();

        // System.out.println(a1.getClass());

        // System.out.println(a1.getAnimalType());

        // System.out.println(a1.makeNoise());

        //  Make animal abstract, make the makeNoise method be an abstract method and make Lion, Dog, and Duck inhrit from Animal.

        //Test that your Lion, Dog and Duck all make different noises

        //Write the SeeAndSay class so that the following code results in a Dog, a Lion, and a Duck being added to the SeeAndSay and then one of them prints out when the pullString method is called

        // System.out.println("The " + l1.getAnimalType() + " says, " + l1.makeNoise());

        // SeeAndSay s1 = new SeeAndSay();

        // s1.addAnimal(new Duck());

        // s1.addAnimal(new Dog());

        // s1.addAnimal(new Lion());

        // s1.pullString();
    }
}
