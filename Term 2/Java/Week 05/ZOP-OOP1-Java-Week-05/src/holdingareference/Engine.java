package holdingareference;

public class Engine {
    private final int numCylinders;

    public Engine(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public int getNumCylinders()
    {
        return numCylinders;
    }
    

    public void start()
    {
        System.out.println("VVVRRRROOOOOMMMM");
    }

}
