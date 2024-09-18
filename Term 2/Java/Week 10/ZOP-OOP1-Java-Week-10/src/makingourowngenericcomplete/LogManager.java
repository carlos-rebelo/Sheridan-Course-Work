package makingourowngenericcomplete;

public class LogManager<T> {

    private String logFile = "";

    public void log(T objectToBeLogged)
    {
        logFile += objectToBeLogged.toString() + "\n";
    }

    public void printLogfile()
    {
        System.out.println(logFile);
    }
}
