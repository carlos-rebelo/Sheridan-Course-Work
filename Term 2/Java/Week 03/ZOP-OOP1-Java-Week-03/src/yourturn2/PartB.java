package yourturn2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class PartB {
    public static void main(String[] args)
    {
        City city = new City(20, 20);
        new Thing(city, 10, 10);

        //Instantiate a Robot object called r2d2.  Note that, you must pass the city variable and coordinates of the robot, and the direction it will face.  These values will be (city, 2,8, Direction.EAST)  <-- we will learn more about this soon!

        //Don't forget that you have to import Robot at the top of the file! Take a look at the imports for City, Direction and Thing

        //Write the code to make r2d2 stand on the yellow dot - you will need more than just the move method to get there.  How can you explore the methods available to you in the Robot class?

        //hmmm...seem to be missing a method, aren't we???  Can you figure out a different way?

    }

    public static void main(String[] args)
    {
        //Let's run this code!
        City city = new City(25, 25);
        Robot r2d2 = new Robot(city, 5, 5, Direction.EAST);
        Thing car = new Thing(city,10,10);
        r2d2.setSpeed(10)
        for(int i = 0; i <5;i++) {
            r2d2.move();
        
        }
        for(int i = 0; i <3;i++) {
            r2d2.turnLeft();
        
        }
        for(int i = 0; i <5;i++) {
            r2d2.move();
        
        }
        r2d2.canPickThing();
        r2d2.pickThing(car);
    
        //So, can you make the Robot do anything else?  Remember dot notation.  What other methods are available to us?
    }
}
