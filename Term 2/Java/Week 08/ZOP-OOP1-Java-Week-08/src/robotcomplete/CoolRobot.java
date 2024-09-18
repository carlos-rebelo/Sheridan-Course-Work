package robotcomplete;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class CoolRobot extends Robot {

    public CoolRobot(City arg0, int arg1, int arg2, Direction arg3) {
        super(arg0, arg1, arg2, arg3);
        //TODO Auto-generated constructor stub
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void move()
    {
        super.move();
        setLabel("" + getAvenue() + "," + getStreet());
    }

}
