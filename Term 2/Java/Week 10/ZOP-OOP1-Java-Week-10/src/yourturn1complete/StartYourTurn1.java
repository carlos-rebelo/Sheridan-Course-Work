package yourturn1complete;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class StartYourTurn1
{
   public static void main (String[] args)
   {
      System.out.println("HomePhone");
      HomePhone p1 = new HomePhone(5555555);
      p1.makeCall(5151151);

      System.out.println("\nPayPhone");
      PayPhone p2 = new PayPhone();
      p2.acceptCoin(Coin.DIME);
      p2.makeCall(51515151);
      p2.acceptCoin(Coin.DIME);
      p2.acceptCoin(Coin.NICKEL);
      p2.makeCall(51515151);

      System.out.println("\nCellPhone");
      CellPhone p3 = new CellPhone();
      p3.makeCall(41414141);
      p3.setPowerStatus(Power.ON);
      p3.makeCall(41414141);

      System.out.println("\nHeart");
      Heart h1 = new Heart(55, HeartBeat.PITTERPATTER);
      h1.pump();
   }
}
