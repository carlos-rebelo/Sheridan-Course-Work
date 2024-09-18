package innerclasses;

public class Start {
    public static void main(String[] args)
    {
        // uncomment the lines below

        // Car.startEngine(); //why doesn't this work?

        /* ⁡⁢⁢⁢Answer⁡ :
         * Because startEngine isn't static.
         */

        Car car = new Car();

        car.startEngine();

        //Let's instantiate the inner class into an object

        // Car.Horn horn = new Car.new Horn();  //uh oh!

        //Question:  Why doesn't his work?

        /*  Answer 1 :
         * first the compiler needs to be able to find Horn
         * 
         */

        //Remember Random?

        // Random rnd = new Random();  //We need to import

        //However, instead of importing, we can use a fully qualified path:

        // java.util.Random rnd = new java.util.Random();

        /* Answer 2 :
         In order to instatiate Horn, we have to instantiate a Car and use the instance of Car to get to Horn in order to instantiate it.
        */

        // Car.Horn horn = car.new Horn();
        // horn.honk();

        //OK, that's one way...but isn't it a little weird to have to have an instance of the outer class in order to instantiate the inner class?  Turns out there is another way that doesn't involve the Car object.

        //Let's make our Horn class static

        Car.Horn h1 = new Car.Horn();

    }

}
