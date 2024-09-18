package polymorphism1;

public class Pirate extends Person{
    protected int numEyePatches;
    public Pirate(String name, int numEyePatches) {
        super(name);
        this.numEyePatches = numEyePatches;
    }

    public void drawSword() {
        System.out.println(name+" draws his sword");
    }

    @Override
    public void speak(String sentence) {
        System.out.println(name + " says Arrrr, " + sentence + ", you scurvy dog");
    }
}
