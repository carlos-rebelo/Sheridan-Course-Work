public class ObjectLogger {
    private String logFile="";

    public void log(Loggable thing) {
        logFile += thing.logObject();
    }

    public String getLog() {
        return logFile;
    }
}
