package yourturn3complete;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Start {
    public static void main(String[] args)
    {
        //This one is a little trickier.  If you have problems, check the completed exercise.

        //Java has a functional interface called Consumer. Consumer has an abstract method called accept that takes in a single <Generic> argument and returns void.  

        //To get to a particular character in and String we can use the CharAt method.
 
        //For example String myString ="ABCDE";  sout (myString.charAt(2)) will print out C

        //Your job is to build a lambda expression that will print out any String backwards.  This lambda will need more than one line so you will need to use  { } to contain it.

        Consumer<String> printBackwards = (s) -> {
            for (int i = s.length() - 1; i >= 0; i--)
            {
                System.out.print(s.charAt(i));
            }
        };

        printBackwards.accept("ABCDEFG");
    }
}
