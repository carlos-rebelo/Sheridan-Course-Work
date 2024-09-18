package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Start {
    public static void main(String[] args)
    {
        Person[] people = new Person[3];

        people[0] = new Person("Bart", 1);
        people[1] = new Person("Lisa", 2);
        people[2] = new Person("Ralph", 4);
        // people[3] = new Person("Nelson",6);  //uh oh!

        // System.out.println("Let's pring the list");

        // for (int i = 0; i < people.length; i++)
        // {
        //     System.out.println(people[i]);
        // }

        // //There is a slightly easier way to loop through an array or an ArrayList        
        // for (Person person : people)
        // {
        //     System.out.println(person.toString());
        // }
        ArrayList <String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        System.out.println(strings);
    

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Bart", 1));
        list.add(new Person("Lisa", 2));
        list.add(new Person("Ralph", 3));
        list.add(new Person("Nelson", 4));
        list.add(new Person("Millhouse", 5));

        System.out.println(list); //why did it print this way?  We didn't even need to loop?

        System.out.println("Size of ArrayList is " + list.size());
        System.out.println();
        System.out.println("Testing get - should return the Person at index 1");
        System.out.println(list.get(1));

        System.out.println("Let's print the whole list with a loop");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("Testing contains");
        System.out.println(list.contains(new Person("Lisa", 2))); //hmmm looks like we have to fix Person to make this code work
        System.out.println(list.contains(new Person("Homer", 7)));

        System.out.println("Testing remove");
        list.remove(2);
        for (Person person : list)
        {
            System.out.println(person);
        }
        list.remove(new Person("Nelson", 4));
        System.out.println(list);

        System.out.println("Testing indexOf ");
        System.out.println(list.indexOf(new Person("Millhouse", 5)));
        System.out.println(list.indexOf(new Person("Marge", 9)));

        System.out.println("Testing set - changing Person at index 1 from Lisa to a new Carl Person");
        list.set(1, new Person("Carl", 6));
        System.out.println(list.get(1));
        //This is cool...let's build an ArrayList of ints...uh oh

        ArrayList<Integer> myListOfInts = new ArrayList<>();
        myListOfInts.add(23);
        myListOfInts.add(5);
        myListOfInts.add(9);
        System.out.println(myListOfInts);
        int a = myListOfInts.get(0);
        System.out.println(a);

        System.out.println("We can even sort");
        Collections.sort(myListOfInts);
        System.out.println(myListOfInts);

        //ok, this is pretty cool...what else can we do?

        System.out.println("Using Arrays.asList to load ArrayList");
        ArrayList<Integer> anotherList = new ArrayList<>(Arrays.asList(56, 343, 67, 54));
        System.out.println(anotherList);
    }
}
