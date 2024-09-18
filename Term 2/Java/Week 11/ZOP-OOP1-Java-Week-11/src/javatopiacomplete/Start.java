package javatopiacomplete;

public class Start {
    public static void main(String[] args) throws InterruptedException {

        EventDispatcher littleGirl = new EventDispatcher();
        EventSource bakery = new EventSource(littleGirl);
        bakery.start(); //This spins up a separate thread for the bakery exist in

        TownsPerson p1 = new TownsPerson("Rich");
        TownsPerson p2 = new TownsPerson("Lori");
        Mouse m1 = new Mouse("Jerry");

        littleGirl.registerEventListener(p1);
        littleGirl.registerEventListener(p2);
        littleGirl.registerEventListener(m1);

        while (true) {
            Thread.sleep(2000);
            System.out.println(p1.doingSomething());
            System.out.println(p2.doingSomething());
        }

        // A thought experiment - what if another bakery opened up in town and our little girl wanted to expand her business?
    }
}
