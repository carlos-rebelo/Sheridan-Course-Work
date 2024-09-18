package yourturn5complete;

public class BasicCalc extends Calc {

    public BasicCalc(int password) {
        super(password);
    }

    @Override
    public void printOutModelType()
    {
        System.out.println("This is a BasicCalc calculator");
    }

}
