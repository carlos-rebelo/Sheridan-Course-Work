package javatopia;

import java.util.Random;

//We would like our TownsPerson to be able to Listen for the bread to be ready so it must implement BreadEventListener

public class TownsPerson implements BreadEventListener{
    private String name;

    public TownsPerson(String name) {
        this.name = name;
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

    @Override
    public void handleBreadEvent(EventObject eventObject) {
        System.out.println(name+" says: Yayyy!! I know the bread is ready");
    }

}
