package yourturn2complete;

import java.util.Random;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Wall;

public class Start {
    public static void main(String[] args)
    {
        /*create a class called SuperRobot that extends robot and:
         * 
         * 1. has a turnRight() method;
         * 2. has a method called move that accepts an int and will move forward as many spaces as the int passed in
         * 3. has a method called moveSafely that accepts an int and will move forward as many spaces as the int passed in, unless it encounters a wall in it's path.  If it encounters a wall, have the robot stop
         * 4. has a method called moveAndPick that will accept an int and move forward as many spaces as the int passed in, and will pick up any Things that it encounters on the way
         * 5. overload moveAndPick so that, if you pass no arguments, it will move forward only once space while picking.
         * 6. has a method called dizzyWalk that will accept an int and will move in as many spaces as the int passed in but will move in a random direction each time
         * 7. Finally, override the move method that accepts no arguments and make it change the robot's appearance so that it shows the street and avenue over top of the icon.  Run your code again...Hmmm..does it seem like sometimes this works and sometimes it doesn't?  Why is that?  Can you fix it so that your robot always shows the correct street and avenue?
         */
        Random rnd = new Random();
        City city = new City(15, 15);
        new Wall(city, 4, 7, Direction.EAST);
        for (int i = 0; i < 10; i++)
        {
            new Thing(city, 5, rnd.nextInt(8) + 1);
        }
        SuperRobot r1 = new SuperRobot(city, 2, 1, Direction.EAST);
        SuperRobot r2 = new SuperRobot(city, 3, 1, Direction.EAST);
        SuperRobot r3 = new SuperRobot(city, 4, 1, Direction.EAST);
        SuperRobot r4 = new SuperRobot(city, 5, 1, Direction.EAST);
        SuperRobot r5 = new SuperRobot(city, 7, 7, Direction.EAST);

        //Proving that SuperRobot can turn right
        r1.move();
        r1.turnRight();
        //Proving that SuperRobot can move forward x number of spaces
        r2.move(10);
        //Proving that SuperRobot can move safely
        r3.moveSafely(10);
        //Proving that SupeerRobot can move and pick
        r4.moveAndPick(10);
        //Proving that SuperRobot can get dizzy
        r5.dizzyWalk(7);
    }
}
