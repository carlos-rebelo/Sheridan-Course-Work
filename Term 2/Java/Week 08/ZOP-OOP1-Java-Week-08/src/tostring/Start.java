package tostring;

public class Start {
    public static void main(String[] args)
    {
        int a = 32;
        System.out.println(a);

        Car c1 = new Car("Audi S5", 2023, "ABC123");
        System.out.println(c1);
        //just for fun:
        // System.out.println(c1.hashCode());
        // System.out.println(Integer.toHexString(c1.hashCode()));

        System.out.println(c1.toString());

        // String myString = "Hello World!";
        // System.out.println(myString);
        // System.out.println(myString.toString());

        // myString.toString();
        //however, we can get to the hashcode in a String.
        // System.out.println(myString);
        //System.out.println(Integer.toHexString(myString.hashCode()));

        //huh...we know that String is an object so myString is a reference variable, just like Student is an object and s1 is reference variable....so why does it print out Hello World instead of the address of myString???

        //let's look at the Object.  Remember that every object in java inherits from Object

        //1. goto settings.json in the .vscode folder and comment out JDK
        //2. put a breakpoint on our o1.toString(); line
        //3. debug

        // Object o1 = new Object();
        // o1.toString();
        // System.out.println(Integer.toHexString(o1.hashCode()));
    }
}
