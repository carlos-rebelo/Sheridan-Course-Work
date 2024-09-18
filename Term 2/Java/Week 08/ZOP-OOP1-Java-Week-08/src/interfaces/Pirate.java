package interfaces;

//We would like Pirate to implement ICharacter and IKillable
public class Pirate extends Sailor implements ICharacter, IKillable{
    public Pirate(String name) {
        super(name);
    }

    public void eatCereal() {
        System.out.println("The Pirate is eating Cpatain Crunch");
    }

    public void speak() {
        System.out.println(name+ " speaks");
    }
    public void action() {
        System.out.println("Pokes with Sword");
    }
    public void die() {
        System.out.println("Aaaarghhhhh");
    }

}
