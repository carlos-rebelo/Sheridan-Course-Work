package howtomakeanobject;

public class Start {
    public static void main(String[] args)
    {
        //Let's run this with the debugger!
        int a = 8;
        Animal a1; //this line causes the JVM to load the Animal bytecode from disk

        //when we execute the next line, we are using the Animal class for the first time so that static variables are created and the static code block runs
        System.out.println(Animal.animalStatic);

        //  a1.makeNoise(); ///hmmmm? makes sense, right?

        //Now we are instantiating an Animal OBJECT! Our object is created, our instance variables placed inside, and our Constructor runs!

        a1 = new Animal();
        a1.makeNoise();
        a1.howManyLegs();

        Dog d1;
        System.out.println(Dog.dogStatic);
        d1 = new Dog();
        d1.makeNoise();
        d1.howManyLegs();

    }
}
