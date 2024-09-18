package yourturn1;

import java.util.Random;

public class LearningArrays {
   private String[] pirateInsults = {"you scurvy dog!","you lily-livered landlubber!","you feckless kraken!","you barnacle-covered simpleton"};
   private Random rand = new Random();
   /*⁡⁢⁣⁢Read me!⁡
   make a private instance variable called pirateInsults that will contain the an array with the following 4 Strings:
         "you scurvy dog!"
         "you lily-livered landlubber!"
         "you feckless kraken!"
         "you barnacle-covered simpleton"
   
         Hint - you can use the shortcut to create this array
         (Question - if you couldn't use the shortcut can you think of another way you could 'construct' this array?)
   
   write a method called translateToPirate that will take String and manipulate the string thusly:
   
      String passed -> have a lovely day
      String returned ->   Arrrrrr, have a lovely day, you <random pirate insult inserted here>
   
      go back to the Start class and test your code!
   
   */
  public String translateToPirate(String phrase) {
   return "Arrrr, "+phrase+", "+pirateInsults[rand.nextInt(3)];
  }

}
