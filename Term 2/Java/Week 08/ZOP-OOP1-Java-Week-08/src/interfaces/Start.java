package interfaces;

public class Start {
    public static void main(String[] args)
    {
        //Let's look at ICharacter
        // Sailor sailor = new Sailor("Lori");
        // sailor.battenHatch();
        Pirate pirate = new Pirate("Davey Jones");
        pirate.battenHatch();
        pirate.eatCereal();
        pirate.action();
        pirate.speak();
        Captain captain = new Captain("Kirk");
        captain.eatCereal();
        captain.battenHatch();
        Parrot parrot = new Parrot();
        //Let's make Pirate and Parrot implement ICharacter
        //Next, IKillable
    }
}
