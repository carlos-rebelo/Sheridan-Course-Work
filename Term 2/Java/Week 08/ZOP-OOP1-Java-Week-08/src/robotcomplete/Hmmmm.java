package robotcomplete;

import java.awt.Color;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class Hmmmm {
    public static void main(String[] args)
    {
        City city = new City(25, 25);

        Robot r1 = new Robot(city, 10, 10, Direction.EAST);

        //!PART A 

        r1.turnLeft(); //what excactly is happening here?

        // r1.turnRight(); //huh...doesn't work!  Why???

        //?What can we do about it?

        //*We could write a method! 

        turnRight(r1);

        //ok, but that kind of sucks, right?  We would have to write this method every time we used Becker Robots.

        //If only there was a better way ;->

        //! PARTB

        //If only we could add functionality to Robot....In fact, we can do one better - We can add Robot functionality to our own code!  In other words, we can EXTEND the functionality of Robot

        CoolRobot cr = new CoolRobot(city, 8, 8, Direction.EAST);
        cr.setColor(Color.YELLOW);
        for (int i = 0; i < 10; i++)
        {
            cr.move();
        }
        cr.turnRight();
        cr.move();
        cr.move();
        cr.move();
    }

    private static void turnRight(Robot robot)
    {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    }
}
