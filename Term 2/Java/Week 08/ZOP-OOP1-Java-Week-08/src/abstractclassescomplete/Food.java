package abstractclassescomplete;

public class Food {
    protected int temperature;

    public Food(int temperature) {
        this.temperature = temperature;
    }

    public void eat()
    {
        System.out.println("Yummm!");
    }

    public void prepare()
    {
        System.out.println("prepairing food!");
    }

    @Override
    public String toString()
    {
        return this.getClass() + " has a temperature of " + temperature;
    }

}
