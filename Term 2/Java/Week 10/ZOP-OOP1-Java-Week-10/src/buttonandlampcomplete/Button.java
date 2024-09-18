package buttonandlampcomplete;

public class Button {

    private ButtonSwitchable device;

    public Button(ButtonSwitchable device) {
        this.device = device;
    }

    public void push()
    {
        device.acceptSignal();
    }
}
