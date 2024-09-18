package yourturn2;

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


        parkingSpaces.stream().forEach(System.out::println);

        System.out.println("Car with license ZZZ321 has just left");
        
        //uh oh...We'll probably need to make a change to Parking spot
        /*  ⁡⁢⁢⁢Hint⁡ 1: 
         *   we need to be able to compare parking spots!
         */


    }

}
