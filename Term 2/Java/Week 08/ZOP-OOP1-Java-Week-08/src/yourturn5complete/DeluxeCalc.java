package yourturn5complete;

public class DeluxeCalc extends Calc implements Memory {

    protected double memory;

    public DeluxeCalc(int password) {
        super(password);
    }

    @Override
    public void clearMemory()
    {
        memory = 0;
    }

    @Override
    public void addToMemory()
    {
        memory = total;
    }

    @Override
    public double getMemory()
    {
        return memory;
    }

    @Override
    public void printOutModelType()
    {
        System.out.println("This is a Deluxe Calculator");
    }

}
