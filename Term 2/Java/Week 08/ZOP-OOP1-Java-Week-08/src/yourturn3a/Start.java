package yourturn3a;

public class Start {

    /*  ⁡⁢⁣⁢Part A⁡ :
    
    Create an Animal class with the following instance variables:  name, numLegs, favFood
     and an eat method ( <name> is eating) and a makeNoise method (<name> makes a noise)
    
    We would like to set the instance variables with our constructor
     
     Pick your two favourite kinds of Animals and make a Class for each of them that inherits from the Animal class.  For example, you could make a Lion class and a Penguin class that both inherit from Animal
     
     Recall that your child classes will need to be able to call the Animal constructor.  It would be 'super' if you get this right ;->
    
     While we're at it, let's override the toString method from the Object class to describe the Animal <name> has <numLegs> and loves <favFood>
     
     In this Start class, in the main method, instantiate the two child classes and call the toString method to describe them.
    */

    /*  ⁡⁢⁣⁢Part B⁡ :
    
        Not all animals make the same noise.  Let's override the makeNoise method in the two child classes to make the kind of noise that your particular animal would make.  For example:  A Lion would ROAR (<name> roars), a Duck would quack (<name> quacks)
     
     */

    /*  ⁡⁢⁣⁢Part C⁡ :  ->⁡
    
    We don't want other programmers to be instantiate an Animal object but we still want other classes to be able to inherit from Animal.
    
    Make Animal abstract and force anyone who inherits from Animal to have to write their own makeNoise method.
    
    Change your child classes to adhere to the requirement that they implement makeNoise
    
    */
    public static void main(String[] args)
    {
        Chameleon c1 = new Chameleon("Jerry", "Bugs");
        Panda p1 = new Panda("Pancho", "Bamboo");

        System.out.println(c1);
        System.out.println(p1);

        c1.makeNoise();
        p1.makeNoise();

        c1.eat();
        p1.eat();
    }
}
