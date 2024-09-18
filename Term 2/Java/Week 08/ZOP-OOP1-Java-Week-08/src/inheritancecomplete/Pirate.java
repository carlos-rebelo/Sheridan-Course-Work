package inheritancecomplete;

public class Pirate extends Person {

    public Pirate(String name) {
        super(name);
    }

    public int numEyePatches;

    public void pillage()
    {
        System.out.println(name + " is pillaging!");
    }

    @Override
    public void speak(String sentence)
    {
        System.out.println(name + " says, arrrrrr, " + sentence + " you scurvy dog");
    }

}
