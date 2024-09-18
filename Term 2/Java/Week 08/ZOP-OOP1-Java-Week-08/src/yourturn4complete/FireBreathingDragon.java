package yourturn4complete;

public class FireBreathingDragon extends Dragon {

    public FireBreathingDragon(int health, int xCoord, int yCoord) {
        super(health, xCoord, yCoord);
    }

    @Override
    public void attack()
    {
        System.out.println("Fire Breathing Dragon spits a fireball at you!");
    }

}
