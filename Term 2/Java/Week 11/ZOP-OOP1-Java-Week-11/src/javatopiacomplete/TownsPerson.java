package javatopiacomplete;

import java.util.Random;

public class TownsPerson implements BreadEventListener {
    private String name;

    public TownsPerson(String name) {
        this.name = name;
    }

    @Override
    public void handleBreadEvent(EventObject breadEventObject)
    {
        System.out.println("    - " + name + " has received a Bread Event and reads list of bread contained in the event object:");
        System.out.println(breadEventObject.getBreadList());
    }

    public String doingSomething()
    {
        Random rnd = new Random();
        String returnValue = name + " is ";
        returnValue += switch (rnd.nextInt(4)) {
        case 0 -> "churning butter";
        case 1 -> "chopping wood";
        case 2 -> "sleeping in the barn";
        default -> "churning butter";
        };
        return returnValue;
    }

}
