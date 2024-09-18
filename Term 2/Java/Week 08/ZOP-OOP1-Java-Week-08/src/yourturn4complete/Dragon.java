package yourturn4complete;

public class Dragon extends NonPlayerCharacter {

    public Dragon(int health, int xCoord, int yCoord) {
        super(health, xCoord, yCoord);
    }

    @Override
    public void attack()
    {
        System.out.println("Dragon swoops down on you");
    }

}
