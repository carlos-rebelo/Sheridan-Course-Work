package makingourowngeneric;

//  ⁡⁢⁣⁢Problem⁡: We want to be able to log any kind of object?

//hmmm...if only there were a Class that every object inherits from...

/* ⁡⁢⁢⁢Solution⁡ : 
 *  We can change the parameter in log to Object - this works because of polymorphism!
 */

// ⁡⁢⁣⁢Problem⁡: The casting is weird.  What if I want to limit my Logger to only accept a certain type of object?

/* ⁡⁢⁢⁢Solution⁡ :
 *  Generics!  Let's use <T> to replace String
 */
public class LogManager <T>{

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
