package howtomakeanobject;

public class Animal {

    public static int animalStatic = 9;

    static
    {
        System.out.println("Hello! from Animal static");
    }
    private int numLegs = 2;

    public Animal() {
        System.out.println(numLegs);
    }

    public void makeNoise()
    {
        System.out.println("Animal is making noise");
    }

    public void howManyLegs()
    {
        System.out.println(numLegs);
    }
}
