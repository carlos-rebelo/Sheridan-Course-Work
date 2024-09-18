package buttonandlamp;

public class Heater implements ButtonSwitchable{
    private int heat;
    public void acceptSignal() {
        System.out.println("Turning up the Heat!");
    }
}
