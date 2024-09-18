package yourturn5complete;

public abstract class Calc {
    protected double total;
    protected int password;
    protected boolean locked = true;

    public Calc(int password) {
        this.password = password;
    }

    public void unlock(int password)
    {
        if (password == this.password)
        {
            locked = false;
        }
    }

    public void lock()
    {
        locked = true;
    }

    public boolean add(double number)
    {
        if (locked)
            return false;

        total += number;
        return true;
    }

    public boolean subtract(double number)
    {
        if (locked)
        {
            return false;
        }
        total -= number;
        return true;
    }

    public boolean multiply(double number)
    {
        if (locked)
        {
            return false;
        }
        total *= number;
        return true;
    }

    public boolean divide(double number)
    {
        if (locked)
        {
            return false;
        }
        total /= number;
        return true;
    }

    public double getTotal()
    {
        if (locked)
        {
            return 0;
        }
        return total;
    }

    public void clearTotal()
    {
        total = 0;
    }

    @Override
    public String toString()
    {
        return (locked) ? "The calculator is currently locked" : "The current total is: " + total;
    }

    public abstract void printOutModelType();
}
