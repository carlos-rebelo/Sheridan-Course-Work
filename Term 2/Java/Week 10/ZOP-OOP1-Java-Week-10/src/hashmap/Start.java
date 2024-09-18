package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Start {
    public static void main(String[] args)
    {
        /*  Read me!
         * 
         * Hashmaps allow us to create a list of  key->value pairs.  
         *  We'll learn more about them in the demo
         */

        //Remember when we used the ArrayList and then we could access a particular entry using the index?

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("How");
        list.add("are");
        list.add("you?");
        //we can use the list's index to access an element in our ArrayList:

        System.out.println(list.get(1)); //prints World

        //We can think of a HashMap as being like an ArrayList but we can use an index that is not based on the order things were added to it:

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Good");
        map.put(1, "Luck");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Luck"));
        map.remove(1);
        System.out.println(map.size());

        //We can use indexes of different types as well:

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Hello", "Goodbye");
        map2.put("Rainy", "Sunny");
        map2.put("Bad", "Good");
        System.out.println(map2.get("Rainy"));

        //we can get a set of the keys for our map
        System.out.println(map2.keySet());

        //We can use any object as the key....provided we implement our equals and hashcodes correctly!
        HashMap<Car, Integer> map3 = new HashMap<>(); //car and price
        map3.put(new Car("Audi S5", "Grey", 1234), 68000);
        map3.put(new Car("Mclaren", "Green", 1235), 300000);
        map3.put(new Car("Bugatti", "Red", 1236), 500000);

        Car carIWantThePriceFor = new Car("McLaren", "Green", 1235);

        System.out.println(map3.get(carIWantThePriceFor)); ///hmmm...

        /* ⁡⁢⁢⁢Hint⁡ : 
         * We need to give Car the ability to check if two Cars are equal
         */

        for (String string : map2.keySet())
        {
            System.out.println(map2.get(string));
        }
        //We can even iterate over a map but this won't make sense until we get to funtional programming at the end of the course

        //   map3.forEach((car, price) -> System.out.println(car.getMake() + ": $" + price));
    }
}
