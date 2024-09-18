package beckerrobots;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class Becker {
    public static void main(String[] args)
    {
        //Let's run this code!
        City city = new City(25, 25);
        Robot r2d2 = new Robot(city, 5, 5, Direction.EAST);
        Thing car = new Thing(city,10,10);
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
