package buttonandlamp;

public class Fan implements ButtonSwitchable{

    private int speed;

    public void acceptSignal()
    {
        speed++;
        speed = speed % 3;
        System.out.println("The fan is at speed setting " + speed);
    }
}
