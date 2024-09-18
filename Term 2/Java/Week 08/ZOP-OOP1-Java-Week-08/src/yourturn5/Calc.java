package yourturn5;

public abstract class Calc {
    protected double total;
    protected boolean lock;
    private int password;

    public Calc(int password) {
        this.password = password;
        lock = true;
    }
    public void clearTotal() {
        total = 0;
    }

    public void unlock(int password) {
        if (password == this.password) {
            lock = false;
            System.out.println("Calculator Unlocked!");
        }
        else {
            System.out.println("Wrong Password!");
        }
    }

    public boolean add(double num1) {
        if(lock) {
            return false;
        }
        total += num1;
        return true;
        
    }
    public boolean subtract(double num1) {
        if(lock) {
            return false;
        }
        total -= num1;
        return true;
    }
    public boolean multiply(double num1) {
        if(lock) {
            return false;
        }
        total *= num1;
        return true;
    }
    public boolean divide(double num1) {
        if(lock) {
            return false;
        }
        total /= num1;
        return true;
    }

    public double getTotal() {
        return total;
    }
    @Override
    public String toString() {
        String toString = "";
        if (lock) {
            toString += "The calculator is currently locked";
        }
        else {
            toString += "The current total is "+total;
        }
        return toString;
        
    }

    public abstract void printOutModelType();



}
