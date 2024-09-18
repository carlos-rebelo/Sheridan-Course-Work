package javatopiacomplete;

import java.util.Random;

public class EventSource extends Thread {
    private EventDispatcher girl;

    public EventSource(EventDispatcher girl) {
        this.girl = girl;
    }

    @Override
    public void run()
    {
        Random rnd = new Random();
        while (true)
        {
            System.out.println("\nThe baker has started preparing the next batch of bread");
            try
            {
                Thread.sleep(rnd.nextInt(4000) + 3000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Error");
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Baker has finished baking bread and gives the little girl the list of breads available today");
            girl.receiveTodaysBreadList();

        }
    }

}
