package robot;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class Hmmmm {
    public static void main(String[] args)
    {
        City city = new City(20, 20);

        Robot r1 = new Robot(city, 10, 10, Direction.EAST);

        //⁡⁣⁢⁢Part A:⁡

        r1.turnLeft(); //what excactly is happening here?
        r1.move();
        r1.move();

        turnRight(r1);
        

        // r1.turnRight(); //huh...doesn't work!  ⁡⁢⁣⁢Question:⁡ Why???

        /*⁡⁢⁢⁢Answer:⁡
         * The people that wrote the Robot class didn't include a method called turnRight.
         */
    
    
        //⁡⁢⁣⁢Question⁡:  What can we do about it?

        //⁡⁢⁢⁢Answer:⁡  We could write a method!   Let's do it!

        //ok, but that kind of sucks, right?  We would have to write this method every time we used Becker Robots.  Also, why can we say r1.turnLeft() but we have to say turnRight (r1) ??? This isn't very intuitive

        //If only there was a better way ;->   ⁡⁣⁢⁣STAY TUNED!!!⁡

        // Go to inheritance package and demo

        // ⁡⁢⁣⁡⁣⁢⁡⁣⁢⁢Part B:⁡

        //If only we could add functionality to Robot....In fact, we can do one better - We can add Robot functionality to our own code!  In other words, we can EXTEND the functionality of Robot

        //let's fix turnRight!

        //we could add labels to our move method  (notice how we use super to run the parent move method)

    }
    public static void turnRight (Robot robot) {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    }

}
