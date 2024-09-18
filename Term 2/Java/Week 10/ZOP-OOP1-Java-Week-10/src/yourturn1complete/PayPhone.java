package yourturn1complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class PayPhone
{
    private int moneyAccepted;

    public void acceptCoin (Coin coin)
    {
        switch (coin) {
            case NICKEL:
                this.moneyAccepted += 5;
                break;
            case DIME:
                this.moneyAccepted += 10;
                break;
            case QUARTER:
                this.moneyAccepted += 25;
                break;
        }
    }

    public void makeCall (int number)
    {
        if (this.moneyAccepted >= 25) {
            System.out.println("Dialing..." + number);
            this.moneyAccepted = 0;
        }
        else {
            System.out.println("Sorry...A call costs 25 cents.  You have deposited " + this.moneyAccepted);
        }
    }
}
