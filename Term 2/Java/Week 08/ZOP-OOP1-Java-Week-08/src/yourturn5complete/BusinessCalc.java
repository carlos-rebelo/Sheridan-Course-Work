package yourturn5complete;

public class BusinessCalc extends DeluxeCalc {

    private String history = "";

    public BusinessCalc(int password) {
        super(password);
    }

    @Override
    public boolean add(double number)
    {
        if (super.add(number))
        {
            history += "+  " + number + "\n";
            return true;
        }
        return false;
    }

    @Override
    public void clearTotal()
    {
        history = "";
        super.clearTotal();
    }

    @Override
    public boolean subtract(double number)
    {
        if (super.subtract(number))
        {
            history += "-  " + number + "\n";
            return true;
        }
        return false;
    }

    @Override
    public boolean multiply(double number)
    {
        if (super.multiply(number))
        {
            history += "*  " + number + "\n";
            return true;
        }
        return false;
    }

    @Override
    public boolean divide(double number)
    {
        if (super.divide(number))
        {
            history += "/  " + number + "\n";
            return true;
        }
        return false;
    }

    public String getHistory()
    {
        if (locked)
        {
            return "Sorry, calc is locked";
        }
        history += "________________________\n" + total + "\n================\n";
        return history;
    }

    @Override
    public void printOutModelType()
    {
        System.out.println("This is a Deluxe Calculator");
    }
}
