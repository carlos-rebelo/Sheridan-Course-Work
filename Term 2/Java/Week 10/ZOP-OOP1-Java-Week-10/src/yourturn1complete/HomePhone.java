package yourturn1complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class HomePhone
{
    private int phoneNumber;

    public HomePhone (int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void makeCall (int numberToCall)
    {
        System.out.println("Dialing...." + numberToCall);
    }
}
