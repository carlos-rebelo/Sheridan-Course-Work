package yourturn5;

public class DeluxeCalc extends Calc implements Memory{
    private double memorizedTotal;
    public DeluxeCalc(int password) {
        super(password);
    }
    @Override
    public void clearMemory() {
        memorizedTotal = 0;
    }

    @Override
    public void addToMemory() {
        memorizedTotal += total;
        
    }

    @Override
    public double getMemory() {
       return memorizedTotal;
    }

    @Override
    public void printOutModelType() {
       System.out.println("Deluxe Calculator");
    }

}
