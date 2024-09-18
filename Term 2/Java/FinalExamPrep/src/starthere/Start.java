package starthere;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) throws Exception
    {
        // ⁡⁣⁢⁢Part A⁡ : 15 mins

        //  What are the three kinds of programming languages?
        //Machine Language, Assembly Language, High-Level Language

        //  What is the biggest difference between a local variable and an instance variable?
        // A local variable is stored in the current stack frame, while an instance variable is stored inside an object which is stored in the heap
        
        //  What is a class variable?
        // A class variable is a variable declared at the class level, which is not stored in the object, rather in a special section of the method area.
        //Class variables are also reffered to as static variables, and they are not stored in the object once instantiated.
        
        //  We would like to inherit from an abstract class.  What are two things that we have to make sure we do in our child class?
        // We must implement a call to the parent constructor using super() and make sure we have overriden any abstract methods in the parent class

        //  Build a Class called Automobile that has a licenseplate and boolean (engineRunning) representing whether the engine is running or off.

        //  Add a constructor to the Automobile class that accepts a String representing the licensePlate.  The engine will always be off when we first instantiate an Automobile object.

        //Add getters for licensePlate and engineRunning

        // Making our instance variables private and using getters and setters is part of which of the 4 pillars of OOP?
        // Encapsulation
        
        //  Add two methods called startEngine and StopEngine that will set the engineRunning instance variable to true or false

        // Instantiate an Automobile and start the engine

        Automobile auto1 = new Truck("AAA111", new Person("Justin", 12));

        auto1.startEngine();

        // ⁡⁣⁢⁢Part B⁡ : 20 mins

        // Write a Person class that has a name and an age

        //  Add a Person instance variable called driver to the Automobile Class

        //  Overload the constructor in Automobile so we can pass just the licensePlate or the licensePlate and the driver

        // Instantiate another Automobile object but, this time add a driver to it
        Automobile auto2 = new Car("AAA222", new Person("Carlos",19));

        //Good!  Now add a method to Automoible called driveTo that accepts a String representing the destination we want to drive to.  If our Automobile has a driver that is old enough to drive, we will print out <name> is driving to <destination>  Otherwise, print out "Sorry the Automobile must have driver over 16 in it in order to drive it"  

        // Let's try to drive the two Automobile objects that we've instantiated to the pizza parlor.
        System.out.println(auto1.getEngineStatus());
        System.out.println(auto2.getEngineStatus());
        auto2.startEngine();
        auto1.driveTo("pizza parlor");
        auto2.driveTo("pizza parlor");
        // Now, let's require the automobile engine to be running before we allow our car to drive to the destination

        //What type of relationship does Automobile have with Person?
        // Association
        //Add a class variable to Automobile called nextVinNumber

        //Every Automobile manufactured has a unique VIN number.

        //Add an instantance variable to Automobile called vinNumber.  Arrange the constructors so that, every Automobile that is instantiated has a unique vinNumber.

        // Add a getter for vinNumber and prove that your code is generating unique vinNumbers
        System.out.println(auto1.getVinNumber());
        System.out.println(auto2.getVinNumber());

        // ⁡⁣⁢⁢Part C ⁡: 20 mins

        //Our Automobiles are not allowed to drive to the "IceCream Store".  change driveTo so that, if we attempt to driveTo the "IceCream Store", it will throw an Exception with the message "Not allowed to go for IceCream without Rich!"

        //test to make sure the Exception will get thrown.  Once you've proven that, use a try/catch to prevent the program from terminating
        
        try {
            auto1.driveTo("IceCream Store");
        } catch (Exception e) {
            System.out.println("Cant go for ice cream without Rich!");
        }
        //Ok, Let's make Automobile abstract.  Notice the errors that show up on every line that you try to instantiate an Automobile!

        //  add an abstract method to Automobile called honk that accepts nothing and returns nothing.

        //  Build a Car class and Truck class that inherit from Automobile.  Car horns print out "honk" and truck horns print out "ahwoooga".  Also, make sure that you can instantiate both the Car and Truck class using either a constructor that just takes the licenseplate or a constructor that takes both the licenseplate and a driver

        // Go back in you code in the main method where you were instantiating Vehicles and instantiate Car and Trucks instead.

        //When you are finished, all of the errors should be gone.  Now make the Car honk and the Truck honk
        auto1.honk();
        auto2.honk();
        // ⁡⁣⁢⁢Part D⁡ :  20 mins

        // Build an array that is capable of storing both Car and Truck objects.  Add two cars and two Trucks to your array.  Loop through the array and make every object honk.
        Automobile[] autos = {
            new Car("1234",new Person("John", 20)),
            new Car("5678", new Person("Rich",30)),
            new Truck("1122", new Person("Arthur", 40)),
            new Truck("2233", new Person("Max", 17))
        };
        for (Automobile automobile : autos) {
            automobile.honk();
        }
        //Build an ArrayList that can take both Cars and Trucks and fill it with a bunch of Cars and Trucks.  Make two of the cars have the same licenseplate
        ArrayList<Automobile> autos2 = new ArrayList<>();
        autos2.add(new Car("11223"));
        autos2.add(new Car("11223"));
        autos2.add(new Car("44525"));
        autos2.add(new Truck("10002"));
        autos2.add(new Truck("33564"));
        autos2.add(new Truck("998765"));
        //What do we call the part between the <>?
        // a generic
        //loop through the array list and print out the toString method for each one.  Hmmm...that's not great.  We would like the licenseplate number to print when we do this.  What can we do and which class should we do it in to get this result?  What annotation (@) should we put before the method?
        for (Automobile automobile : autos2) {
            System.out.println(automobile);
        }
        // to show liscence plate as toString we should override the Automobile to string to print the liscence plate, and we use @Override
        // ⁡⁣⁢⁢Part E ⁡:  20 mins

        // Look at the Torpedo interface.   Build a class called Submarine that has an ArrayList that can hold objects that implement the Torpedo interface

        //write a method called loadTorpedo that will accept a Torpedo and add it to the ArrayList of Torpedos

        //write a class called StandardTorpedo that implements Torpedo --the fire method should print "firing Standard Mark II torpedo"

        //Instantiate the Submarine and load a StandardTorpedo into it
        Submarine sub1 = new Submarine();
        sub1.loadTorpedo(new StandardTorpedo());
        //Load another type of torpedo into the sub by calling the loadTorpedo method.  However, this time, new up  an anonymous-inner class that says "Firing Deluxe, Mark III torpedo"
        sub1.loadTorpedo(new Torpedo() {
            public void fire() {
                System.out.println("Firing Deluxe, Mark III torpedo");
            }
        });
        // Load another type of torpedo, but this time, use a Lambda expression to build our final torpedo.  This torp should say Firing Homing Torpedo.
        sub1.loadTorpedo(()-> System.out.println("Firing Homing torpedo"));
        //Your submarine should now have three torpedos loaded into it.

        //write a method called fireAllTorpedos that will fire the torpedos and remove them from the sub's inventory

        //test out your code
        sub1.fireAllTorpedos();
        //What was it about the interface that allowed us to use a lambda expression?
        // we were able to use lambda because its a functional interface, meaning it only has one method
        // ⁡⁣⁢⁢Part F⁡ : 20 mins

        //Use Streams to print out only the Cars in the Automobile ArrayList that you build earlier - Remember instanceof   (c1 instanceof Car)

        System.out.println("Only Cars in our ArrayList");
        autos2.stream()
        .filter((c1)-> c1 instanceof Car)
        .forEach((a)-> System.out.println(a));

        //Go to the Automobile class and add an equals method and hashcode method.  Our equals method should only compare licenseplates to determine equality

        //Use streams to print out only the Cars but with no duplicates -  remember how distinct works!
        System.out.println("Only unique Cars in our ArrayList");
        autos2.stream()
        .filter((c1)-> c1 instanceof Car)
        .distinct()
        .forEach((c)-> System.out.println(c));
        //Print out all of the Automobiles in our ArrayList and sort them from largest VinNumber to smallest

        System.out.println("All Automobiles, sorted by VIN");
        autos2.stream()
        .sorted((a1,a2)-> a2.getVinNumber()-a1.getVinNumber())
        .forEach((c)->System.out.println(c.getVinNumber()));
        //Build an ArrayList of all Trucks in our Automobile ArrayList

        System.out.println("Only Trucks!");
        ArrayList<Automobile> trucks = new ArrayList<>();
        autos2.stream()
        .filter((a) -> a instanceof Truck)
        .forEach((a)-> trucks.add(a));
        trucks.stream()
        .forEach((t)->System.out.println(t));

    }
}
