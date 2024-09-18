package yourturn4complete;

import java.util.Random;

public class Start {
    public static void main(String[] args)
    {
        //⁡⁢⁣⁢Need to make this more readable

        //Create a class called ObjectSafe that uses a Generic to allow the calling method to store any object in the safe, along with a password.  Write a constructor that will accept an object of the Generic type, and am int password used to retrieve this object.

        //This class will have only one other method: retrieveObject that will accecpt an int and, if the int passed in matches the password, will retrun the object being stored inside of it.

        ObjectSafe<String> ob1 = new ObjectSafe<>("It works with Strings", 123);

        System.out.println(ob1.retrieveObject(123));

        ObjectSafe<Random> ob2 = new ObjectSafe<>(new Random(), 456);
        System.out.println(ob2.retrieveObject(456).nextInt(30));

        ObjectSafe<MyObject> ob3 = new ObjectSafe<>(new MyObject(), 999);
        ob3.retrieveObject(999).method1();
    }
}
