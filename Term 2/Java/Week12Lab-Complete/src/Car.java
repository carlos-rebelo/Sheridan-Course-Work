public class Car implements Loggable{

    private String license;

    public Car(String license) {
        this.license = license;
    }

    @Override
    public String logObject()
    {
        return "Logging a Car Object: " + this.toString();
    }

    @Override
    public String toString()
    {
        return "[" + license + "]\n";
    }
}
