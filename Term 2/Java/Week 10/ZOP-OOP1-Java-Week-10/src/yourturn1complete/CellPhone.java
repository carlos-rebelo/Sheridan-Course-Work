package yourturn1complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class CellPhone
{
    private Power powerStatus;

    public CellPhone ()
    {
        this.powerStatus = Power.OFF;
    }

    public Power getPowerStatus ()
    {
        return powerStatus;
    }

    public void setPowerStatus (Power powerStatus)
    {
        this.powerStatus = powerStatus;
    }

    public void makeCall (int numberToCall)
    {
        if (this.powerStatus == Power.ON) {
            System.out.println("Dialing...." + numberToCall);
        }
        else {
            System.out.println("Sorry...the phone is turned off");
        }
    }
}
