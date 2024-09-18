package yourturn2complete;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;

public class Start {
    public static void main(String[] args)
    {

        //Let's park some cars!

        List<ParkingSpace> parkingSpaces = new ArrayList<>();
        parkingSpaces.add(new ParkingSpace("ABC123"));
        parkingSpaces.add(new ParkingSpace("ZZZ321"));
        parkingSpaces.add(new ParkingSpace("NARF1"));
        parkingSpaces.add(new ParkingSpace("ZOINKS"));

        System.out.println("Printing out all Cars parked in the lot");
        parkingSpaces.stream().forEach(s -> System.out.println(s.toString()));

        System.out.println("Adding 2 hours to each car parked asnd printing out the results");
        parkingSpaces.stream()
                .forEach(s -> s.setNumHoursParked(s.getNumHoursParked() + 2));

        parkingSpaces.stream().forEach(System.out::println);

        System.out.println("Car with license ZZZ321 has just left");
        //uh oh...We'll probably need to make a change to Parking spot
        /*  ⁡⁢⁢⁢Hint⁡ 1: 
         *   we need to be able to compare parking spots!
         */

        /* ⁡⁣⁢⁢Solution⁡ : 
         ParkingSpace spot = (parkingSpaces.stream().filter(s -> s.getLicense() == "ZZZ321").findFirst().orElse(null));
        int index = parkingSpaces.indexOf(spot);
        parkingSpaces.remove(index);
         */

        parkingSpaces.stream()
                .forEach(s -> System.out.println(s));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(15);
        list.add(4);
        list.add(7);
        list.add(99);
        Stream<Integer> stream1 = list.stream();

        // Let's print out our list using Streams
        System.out.println("Our List:");

        // Let's add 5 to each element in our list and print out the results
        // ⁡⁣⁢⁢Introducing map⁡ :    
        System.out.println("Adding 5 to each");

        //notice that adding 5 to the above stream did NOT change our list
        System.out.println("Proving that our streams are non-destructive");
        list.stream().forEach(s -> System.out.println(s));

        //So, how does map work?
        //the map method takes a functional interface called Function that accepts two generic arguments.

        /*  Answer :
        Function<Integer, Integer> map1 = new Function<>() {
            @Override
            public Integer apply(Integer t)
            {
                return t + 500;
            }
        };
        
        System.out.println("\nOur own map:");
        list.stream()
                .map(map1)
                .forEach(s -> System.out.println(s));
        */

    }

}
