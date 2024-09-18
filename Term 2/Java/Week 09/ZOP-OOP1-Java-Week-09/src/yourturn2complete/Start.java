package yourturn2complete;

public class Start {
    public static void main(String[] args)
    {
        /*Let's start with an Animal class:
        
        - Notice what a1.getClass() returns 
        - Where did the getClass method come from?
        - let's run the a1.getAnimalType method - this just cleans up the .getClass so we only see the Animal's type
        
        - OK.  We would like our Lion class to inherit the getAnimalType method from Animal - Let's do that and prove it worked.
        
        - We want to be able to build different kinds of animal classes that inherit from Animal but we don't want to be able to instantiate an Animal class.  How can we do this?!  While we are at it, let's force every class that inherits from Animal to make their own noise
        
        
        */

        // Animal a1 = new Animal("Food");
        // System.out.println(a1.getClass());
        // // System.out.println(a1.getAnimalName());
        // System.out.println(a1.makeNoise());

        Lion l1 = new Lion("Ice Cream");
        // System.out.println(l1.getAnimalType());
        //System.out.println(l1.makeNoise());

        // System.out.println("The " + l1.getAnimalName() + " says, " + l1.makeNoise());

        SeeAndSay s1 = new SeeAndSay();
        s1.addAnimal(l1);
        s1.addAnimal(new Dog("Spaghetti"));
        s1.addAnimal(new Duck("quackers"));
        s1.pullString();
    }
}
