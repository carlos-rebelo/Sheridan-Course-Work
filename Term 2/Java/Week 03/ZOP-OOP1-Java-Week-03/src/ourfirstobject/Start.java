package ourfirstobject;

public class Start {
    public static void main(String[] args)
    {
        //We want to build a person!
        int num1 = 100;
        Person p1 = new Person(); //why do we have an error?
        p1.name = "Bart";
        p1.age = 12;
        System.out.println(p1.name);
        System.out.println(p1.age);

        Person p2 = new Person(); //why do we have an error?
        p2.name = "Lisa";
        p2.age = 21;

        System.out.println(p2.name);
        System.out.println(p2.age);
        p2.eat("Pizza");
        //Let's fix this! - we would like our Person to have a name and an age and should be able to eat and sleep

        //back to slides

        //let's build another Person object - let's debug

        //let's add the name of the Person to our methods
    }

}
