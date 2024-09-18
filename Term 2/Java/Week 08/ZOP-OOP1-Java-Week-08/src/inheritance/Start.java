package inheritance;

public class Start {
    public static void main(String[] args)
    {
        //⁡⁣⁢⁢PARTA ⁡ - Let's build a Person!  We want our person to have a name and to be able to sleep and speak any sentence we pass to it. ⁡⁣⁢⁡⁢⁣⁣For the moment, we will make name public⁡.⁡  We'll fix it up later.

        Person person1 = new Person("Bart");
        // person1.setName("Bart");
        person1.speak("Have a nice day!");

        Pirate pirate1 = new Pirate("Software");
        // pirate1.setName("Jack Sparrow");
        pirate1.speak("Please pass the salt");

        ClassA a1 = new ClassA();
         System.out.println(a1.getClass());
        //OK - Now, let's build a Pirate.  We also want our pirate to have a name and to be able to sleep, and speak sentences.  

        //hmmmm....that seems like a lot of time wasted, writing similar code twice.

        //Let's make our life easier with inheritance!!!  --let's make Pirate inherit from Person

        // Pirate pirate1 = new Pirate();

        // pirate1.speak();

        // We can even add functionality to Pirate! Let's give our Pirate the ability to pillage (careful though, it is only avaialable to Pirate)

        // pirate1.pillage();

        //Hey, why not add an instance variable to Pirate to track numEyePatches?

        //back to slides

        //⁡⁣⁢⁢PART B⁡ - Pirates don't talk like that...let's override speak so that we add "Arrrrr," to the front and ", you scurvy dog" to the end of the sentence passed in --Don't forget the @Override  annotation

        // back to slides

        // ⁡⁣⁢⁢PART C⁡ - Hmmm...how is overriding different than overloading?

        //Let's make our pirate be able to eat, so that:

        // If we call eat and pass a String, our pirate will print out <name> is eating <String we passed in>
        // If we call eat and pass nothing, our pirate will print out <name> is eating crumpets

        // This is overloading!  Same method name, different method signature (parameters are different)

        // Overriding is when we replace a method with the exact same method signature from the parent class, like we did in Speak!

        // Quick TIP - if you add the @Override annotation and it gives an error, you are not overriding!

        //⁡⁣⁢⁢PART D⁡ - We really should make our name instance variable private though...uh oh!!!

        //back to slides

        //⁡⁣⁢⁢Part E ⁡- Let's add a constructor for Person so we can assign the name when we instantiate....uh oh!!!

        //Let's go back to the slides to figure this out.

        //Now, let's fix it! - let's use the debugger to see what is happening!
    }
}
