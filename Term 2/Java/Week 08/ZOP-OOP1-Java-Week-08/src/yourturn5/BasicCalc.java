package yourturn5;

public class BasicCalc extends Calc {

    public BasicCalc(int password) {
        super(password);
    }

    @Override
    public void printOutModelType() {
        System.out.println("Basic Calculator");
    }
}
