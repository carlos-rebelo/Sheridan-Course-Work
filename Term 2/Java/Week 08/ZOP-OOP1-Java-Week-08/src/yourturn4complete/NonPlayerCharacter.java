package yourturn4complete;

public abstract class NonPlayerCharacter {
    protected int health;
    protected int xCoord;
    protected int yCoord;

    public NonPlayerCharacter(int health, int xCoord, int yCoord) {
        this.health = health;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public void moveWest()
    {
        xCoord--;
    }

    public void moveEast()
    {
        xCoord++;
    }

    public void moveNorth()
    {
        yCoord++;
    }

    public void moveSouth()
    {
        yCoord--;
    }

    @Override
    public String toString()
    {
        return "NPC Type: " + this.getClass().getSimpleName() + " - Health: " + health + " - Location: " + xCoord + "," + yCoord;
    }

    //we would like our NPCs to be able to attack but every NPC will attack differently
    public abstract void attack();
}
