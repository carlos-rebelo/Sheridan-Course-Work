package buttonandlamp;

public class Button {

    private final ButtonSwitchable device;

    public Button(ButtonSwitchable device) {
        this.device = device;
    }

    public void push()
    {
        device.acceptSignal();
    }
}
