package arrayofrobots;

import java.awt.Color;
import java.util.Random;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class LotsOfRobots {
    public static void main(String[] args)
    {
        final int CITYWIDTH = 15;
        final int CITYHEIGHT = 15;
        Random rnd = new Random();
        City city = new City(CITYWIDTH, CITYHEIGHT);

        Robot[] robots = new Robot[30];

        for (int i = 0; i < robots.length; i++)
        {
            robots[i] = new Robot(city, rnd.nextInt(CITYWIDTH), rnd.nextInt(CITYWIDTH), Direction.EAST);
            robots[i].setSpeed(35);
        }

        //BTW - Can we refactor this to make it more readable?

        for (Robot robot : robots)
        {
            robot.setColor(Color.BLUE);
            robot.turnLeft();
            while (robot.getStreet() > 0)
            {
                robot.move();
            }
            robot.turnLeft();
            while (robot.getAvenue() > 0)
            {
                robot.move();
            }
            robot.setColor(Color.GREEN);
        }
    }
}
