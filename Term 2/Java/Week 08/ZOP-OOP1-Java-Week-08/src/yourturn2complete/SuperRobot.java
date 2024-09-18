package yourturn2complete;

import java.util.Random;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class SuperRobot extends Robot {

    public SuperRobot(City arg0, int arg1, int arg2, Direction arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public void turnRight()
    {
        double speed = this.getSpeed();
        this.setSpeed(150);
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
        this.setSpeed(speed);
    }

    public void move(int howFar)
    {
        for (int i = 0; i < howFar; i++)
        {
            this.move();
        }
    }

    @Override
    public void move()
    {
        this.setLabel("" + this.getStreet() + "," + this.getAvenue());
        super.move();
    }

    public void moveSafely(int howFar)
    {
        while (howFar > 0)
        {
            if (!this.frontIsClear())
            {
                return;
            }
            move();
            howFar--;
        }
    }

    public void moveAndPick()
    {
        while (this.canPickThing())
        {
            this.pickThing();
        }
        this.move();
    }

    public void moveAndPick(int howFar)
    {
        for (int i = 0; i < howFar; i++)
        {
            moveAndPick();
        }
    }

    public void dizzyWalk(int howFar)
    {
        Random rnd = new Random();
        for (int j = 0; j < howFar; j++)
        {
            for (int turn = 0; turn < rnd.nextInt(4) + 1; turn++)
            {
                this.turnLeft();
            }
            this.move();
        }
    }
}
