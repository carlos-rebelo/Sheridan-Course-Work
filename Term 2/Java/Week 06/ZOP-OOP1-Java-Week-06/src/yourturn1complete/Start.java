package yourturn1complete;

import java.util.Random;

/**
 * @author Rich Smith at ZenOfProgramming.com  
 */
public class Start {
    public static void main(String[] args)
    {
        //Make an array of ints that can hold 10 ints
        int[] aBunchOfInts = new int[10];
        // use a loop to print out the value of every int in the array.  Notice that they are all 0
        for (int floor = 0; floor < aBunchOfInts.length; floor++)
        {
            System.out.print(aBunchOfInts[floor] + ", ");
        }
        System.out.println();
        // make the int at floor 3 equal to your favourite number
        aBunchOfInts[3] = 8;
        //loop through and print out your array again!
        for (int floor = 0; floor < aBunchOfInts.length; floor++)
        {
            System.out.print(aBunchOfInts[floor] + ", ");
        }
        System.out.println();
        //Now, use a loop and the Random class to make each int in the array a random int from 0 to 9  (Hint: Remember that the Random class has a method called nextInt that will return a random int from 0 to what ever int you pass into it)
        Random rnd = new Random();
        for (int floor = 0; floor < aBunchOfInts.length; floor++)
        {
            aBunchOfInts[floor] = rnd.nextInt(10);
        }
        //now print out your array again
        for (int floor = 0; floor < aBunchOfInts.length; floor++)
        {
            System.out.print(aBunchOfInts[floor] + ", ");
        }
        System.out.println();
        //Next, write code to print out the largest int in the array every time
        int largest = aBunchOfInts[0];
        for (int floor = 0; floor < aBunchOfInts.length; floor++)
        {
            if (aBunchOfInts[floor] > largest)
            {
                largest = aBunchOfInts[floor];
            }

        }
        System.out.print("Largest = " + largest);
        //Now, ask yourself if your solution would have worked if all of the ints were negative
        // YES!
        //write code to figure out the average of the array of ints
        int sum = 0;
        for (int floor = 0; floor < aBunchOfInts.length; floor++)
        {
            sum += aBunchOfInts[floor];
        }
        int average = sum / aBunchOfInts.length;
        System.out.println("Average is " + average + "\n");

        //PART B
        //Make an array that holds your favourite 5 movies, using the shortcut { } to insert them right into the array!
        String[] favMovies = {
                "Harry Potter",
                "Star Wars IV",
                "The Sure Thing",
                "No Way Out",
                "Monsters Inc"
        };
        //Print out all of your favourite movies using a loop
        for (int floor = 0; floor < favMovies.length; floor++)
        {
            System.out.print(favMovies[floor] + ", ");
        }
        System.out.println();
        //Print out all of your favourite movies backwards (using a loop)
        for (int floor = favMovies.length - 1; floor >= 0; floor--)
        {
            System.out.print(favMovies[floor] + ", ");
        }
        System.out.println();
        //for the super-smarty pants only:  print out your favourite movies (using a loop) in the following order:   1st in list, last in list, 2nd in list 2nd from last in the list, middle of the list
        for (int floor = 0; floor < favMovies.length / 2; floor++)
        {
            System.out.print(favMovies[floor] + ", " + favMovies[favMovies.length - 1 - floor] + ", ");
        }
        if (favMovies.length % 2 == 1)
        {
            System.out.println(favMovies[favMovies.length / 2]);
        }
        System.out.println();
        System.out.println();
        // PARTC - go to the LearningArrays Class and follow the instructions there

        LearningArrays learn = new LearningArrays();
        System.out.println(learn.translateToPirate("Have a lovely day"));
        System.out.println(learn.translateToPirate("Please pass the sugar"));
        System.out.println(learn.translateToPirate("Study hard for java"));

    }
}
