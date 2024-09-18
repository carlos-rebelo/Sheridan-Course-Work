package zzzencryptor;

public class Start {
    public static void main(String[] args)
    {
        EnigmaMachine e1 = new EnigmaMachine(new SubstitutionEngine());
        String encrypted = e1.encryptMessage("you need to study very hard for the final exam");
        System.out.println(encrypted);
        System.out.println(e1.decryptMessage(encrypted));

        EnigmaMachine e2 = new EnigmaMachine(new NumberizerEngine());
        encrypted = e2.encryptMessage("Java is fun ;->");
        System.out.println(encrypted);
        System.out.println(e2.decryptMessage(encrypted));

        //Build your own encryption engine as a seperate class.  Inject it into a new EnigmaMachine instance here in the main method and test it out

    }
}
