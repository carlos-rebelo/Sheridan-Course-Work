package makingourowngeneric;

public class Start {
    public static void main(String[] args)
    {
        LogManager <String> logManager1 = new LogManager<>();

        String string1 = "Hello";
        String string2 = "Study";
        String string3 = "Hard!";

        logManager1.log(string1);
        logManager1.log(string2);
        logManager1.log(string3);
        logManager1.printLogfile();

        //OK, LogManager works with Strings.  But what if I wanted to be able to add Dinosaur Objects to our logfile?

        LogManager <Dinosaur> logManager2 = new LogManager<>();

        Dinosaur dinosaur1 = new Dinosaur("Bob");

        Dinosaur dinosaur2 = new Dinosaur("Cecil");

        Dinosaur dinosaur3 = new Dinosaur("Groc");

        Dinosaur dinosaur4 = new Dinosaur("Jimbo");

        logManager2.log(dinosaur1);

        logManager2.log(dinosaur2);

        logManager2.log(dinosaur3);

        logManager2.log(dinosaur4);

        logManager2.printLogfile();

    }
}
