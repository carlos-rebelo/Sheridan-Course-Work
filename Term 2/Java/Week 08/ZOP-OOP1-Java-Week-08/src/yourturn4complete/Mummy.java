package yourturn4complete;

public class Mummy extends NonPlayerCharacter {

    public Mummy(int health, int xCoord, int yCoord) {
        super(health, xCoord, yCoord);
    }

    @Override
    public void attack()
    {
        System.out.println("Mummy wraps you in bandages");
    }

}
