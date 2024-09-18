package inheritance;

public class Pirate extends Person {

    public Pirate(String name) {
        super(name);
    }
    
    public void pillage () {
        System.out.println(getName()+ " is stealing treasure");
    }
    @Override
    public void speak(String phrase) {
        System.out.println(getName()+" says: Arrrrr, "+phrase+", you scurvy dog");
    }
    
}
