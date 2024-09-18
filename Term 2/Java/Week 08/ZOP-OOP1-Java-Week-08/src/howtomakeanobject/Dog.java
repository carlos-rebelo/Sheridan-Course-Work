package howtomakeanobject;

public class Dog extends Animal {

    public static int dogStatic = 10;

    static
    {
        System.out.println("Hello from  Dog static");
    }

    private int numLegs = 4;

    public Dog() {
        System.out.println(numLegs);
    }

    @Override
    public void makeNoise()
    {
        System.out.println("Dog is barking");
    }

    //PartB - uncomment this! Huh?  What happend to numLegs?  What if we add super into the mix?
    // @Override
    // public void howManyLegs()
    // {
    //     System.out.println(numLegs);
    //     //super.howManyLegs();
    // }

}
