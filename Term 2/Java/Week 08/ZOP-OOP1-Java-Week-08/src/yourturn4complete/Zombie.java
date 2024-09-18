package yourturn4complete;

public class Zombie extends NonPlayerCharacter {

    public Zombie(int health, int xCoord, int yCoord) {
        super(health, xCoord, yCoord);
    }

    @Override
    public void attack()
    {
        System.out.println("Zombie is eating your brains!");
    }

}
