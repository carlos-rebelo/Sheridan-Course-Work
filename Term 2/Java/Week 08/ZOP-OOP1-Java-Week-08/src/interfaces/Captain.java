package interfaces;

import javax.swing.Icon;

public class Captain extends Sailor implements ICharacter, IKillable{
    public Captain(String name) {
        super(name);
    }
    public void eatCereal() {
        System.out.println("The Captain is eating oatmeal");
    }
    public void speak() {
        System.out.println("Cheerio");
    }

    public void die() {
        System.out.println("Im dying");
    }
    public void action() {
        System.out.println("Steer the boat");
    }
}
