package yourturn4complete;

/* ⁡⁣⁢⁢Read Me: ->⁡
 Part A - Do you know what an NPC is?  In video games, and NPC or non-player character are characters in the game that are controlled by the computer instead by a human being.  These NPCs often interact with human players but they are controlled by the game software.
 
 Build a class called NonPlayerCharacter that:
 
 - has an int representing its health
 - has an x coordinate representing its location along the x axis on a grid
 - has a y coordinate representing its location  along the y axis on a grid
 - has a constructor that allows us to set the health (from 0 to 10) and the x,y coordinates of where our character is on the grid
 -override the toString method to return the health of the NPC and the location of the NPC - check out the complete solution to see a cool way of showing what kind of monster it is ;->

 -Now, we want to be able to extend our NPC with other classes that can take advantage of the code we have already written but we don't want anyone to be able to instantiate an acutal NPC object.  How can we do this?

 Next, we want any class that inherits from our NonPlayerCharacter class to be forced to write a method called attack that accepts nothing.  However, every different kind of NPC should attack differently.

 For example, 
 - our Zombie should attack by printing "Zombie eats your brains!"
 - our mummy should attack by printing "Mummy wraps you up in bandages!"
 - Go ahead and build these two classes, inheriting from our parent class

 Next, build a Dragon class that inherits from parent class and then build a FireBreathingDragon.  Can FireBreathingDragon inherit from Dragon?  What is our test?  Did you notics that the compiler didn't complain about not having an attack method in FireBreatingDragon?  Why is that???
 
 How will Dragon and FireBreathing Dragon attack?


 Finally, let's instantiate some monsters in the main method and test our code!
 */

public class Start {
    public static void main(String[] args)
    {
        Zombie zombie = new Zombie(10, 5, 4);
        zombie.attack();
        System.out.println(zombie);
        System.out.println(zombie.toString());

        Mummy mummy = new Mummy(8, 4, 6);
        System.out.println(mummy.toString());

        Dragon dragon = new Dragon(3, 9, 7);
        dragon.toString();
        dragon.attack();

        FireBreathingDragon fireDragon = new FireBreathingDragon(8, 9, 1);
        fireDragon.attack();
        System.out.println(fireDragon);
        System.out.println(fireDragon.toString());
    }
}