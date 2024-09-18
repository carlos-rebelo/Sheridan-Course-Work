package abstractclasses;

public abstract class Food {
    protected int temperature;

    public Food(int temperature) {
        this.temperature = temperature;
    }

    public void eat()
    {
        System.out.println("Yummm!");
    }

    public abstract void prepare();

    @Override
    public String toString()
    {
        return this.getClass() + " has a temperature of " + temperature; //check out this.getClass  -where do you suppose that method came from?
    }

}
