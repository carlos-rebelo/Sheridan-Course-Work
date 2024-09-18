package buttonandlampcomplete;

public class Heater implements ButtonSwitchable {

    @Override
    public void acceptSignal()
    {
        System.out.println("See, heater will work with the button as well, because it implements ButtonSwitchable!");
    }

}
