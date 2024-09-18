package yourturn1;

import java.util.Random;

public class Start {
    public static void main(String[] args)
    {
        //⁡⁢⁣⁢Part A⁡
        //Make an array of ints that can hold 10 ints
        int[] bunchOfInts = new int[10];
        bunchOfInts[3] = 21;
        // for (int index = 0; index < bunchOfInts.length; index++) {
        //     System.out.println(bunchOfInts[index]);
        // }

        // for (int index = 0; index < bunchOfInts.length; index++) {
        //     Random rand = new Random();
        //     bunchOfInts[index] = rand.nextInt(100) * 1;
        // }
        // for (int index = 0; index < bunchOfInts.length; index++) {
        //     System.out.print(bunchOfInts[index]+", ");
        // }
        // int sum = 0;
        // int largestSoFar = bunchOfInts[0];
        // for (int index = 0; index < bunchOfInts.length; index++) {
        //     if (largestSoFar < bunchOfInts[index]) {
        //         largestSoFar = bunchOfInts[index];
        //     }
        //     sum += bunchOfInts[index];
        // }
        // int avg = sum / bunchOfInts.length;
        
        // System.out.println("\nLargest int is "+largestSoFar);
        // System.out.println("\nAverage is "+avg);

        // LearningArrays ear = new LearningArrays();
        // String pirateSpeak = ear.translateToPirate("how are you?");
        // System.out.println(pirateSpeak);
        
        // use a loop to print out the value of every int in the array.  Notice that they are all 0

        // make the int at floor 3 equal to your favourite number

        //loop through and print out your array again!

        //Now, use a loop and the Random class to make each int in the array a random int from 0 to 9  (Hint: Remember that the Random class has a method called nextInt that will return a random int from 0 to what ever int you pass into it)

        //now print out your array again

        //Next, write code to print out the largest int in the array every time

        //Now, ask yourself if your solution would have worked if all of the ints were negative

        //write code to figure out the average of the array of ints

        //open the Learing Arrays class and follow the directions

        //⁡⁢⁣⁢Part B⁡

        //Make a String array that holds your favourite 5 movies, using the shortcut { } to insert them right into the array!
        String[] movies = {"Black Panther", "Straight Outta Compton", "Nemo", "Star Wars", "John Wick"};
        //Print out all of your favourite movies using a loop
        for (int index = 0; index < movies.length; index++) {
            System.out.println(movies[index]);
        }

        //Print out all of your favourite movies backwards (using a loop)
        for (int index = movies.length - 1; index >= 0; index--) {
            System.out.println(movies[index]);
        }
        //for the super-smarty pants only:  print out your favourite movies (using a loop) in the following order:   1st in list, last in list, 2nd in list 2nd from last in the list, middle of the list
        for (int floor = 0; floor < movies.length / 2; floor++)
        {
            System.out.print(movies[floor] + ", " + movies[movies.length - 1 - floor] + ", ");
        }
        if (movies.length % 2 == 1)
        {
            System.out.println(movies[movies.length / 2]);
        }
        System.out.println();
        System.out.println();
        // ⁡⁢⁣⁢Part C⁡ - go to the LearningArrays Class and follow the instructions there

    }
}
