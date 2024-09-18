package javatopia;

public class Start {
    public static void main(String[] args) throws InterruptedException
    {

        EventDispatcher littleGirl = new EventDispatcher();
        EventSource bakery = new EventSource(littleGirl);
        bakery.start();
        // bakery.start(); //This spins up a separate thread for the bakery exist in

        TownsPerson p1 = new TownsPerson("Rich");
        TownsPerson p2 = new TownsPerson("Lori");

        littleGirl.registerEventListener(p1);  //uh oh!!!  How do we fix this???  Let's look at our TownsPerson
        littleGirl.registerEventListener(p2);

        /* ⁡⁢⁣⁢Yourturn 1 -  Jerry the Mouse! ⁡
         * 
         * Write a Mouse class that can hold a mouse's name.  Add a constructor and a getter.  Make the Mouse class capable of listening for the bread events by implementing the BreadEventListener class Instantiate jerry the Mouse and add jerry as a listener for the bread events
        */

        while (true)
        {
            Thread.sleep(2000);
            System.out.println(p1.doingSomething());
            System.out.println(p2.doingSomething());
        }

        // A thought experiment - what if another bakery opened up in town and our little girl wanted to expand her business?
    }
}
