package buttonandlamp;

public class Lamp implements ButtonSwitchable{
    private boolean on;

    public void acceptSignal()
    {
        on = !on;
        System.out.println(on ? "The lamp is on" : "The lamp is off");
    }
}
