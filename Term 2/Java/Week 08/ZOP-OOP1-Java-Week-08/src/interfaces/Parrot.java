package interfaces;

public class Parrot implements ICharacter, IKillable{

    @Override
    public void action() {
        System.out.println("Parrot Eats a cracker");
        
    }

    @Override
    public void speak() {
        System.out.println("Squaaaakk");
        
    }
    public void die() {
        System.out.println("Squaaaak...thunk!");
    }

    
}
