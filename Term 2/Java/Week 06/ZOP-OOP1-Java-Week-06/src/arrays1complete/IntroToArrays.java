package arrays1complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class IntroToArrays {
   public static void main(String[] args)
   {
      int mark1 = 55;
      int mark2 = 66;
      int mark3 = 77;
      int mark4 = 99;
      //calculate the average of a bunch of marks --What if there were 10000 marks?

      int ave = (mark1 + mark2 + mark3 + mark4) / 4;
      System.out.println(ave);

      //There has to be a better way...  Introducing Arrays!

      int[] marks = new int[4];///huh?  What does new mean again??? Instantiating an object - we are instantiating an array object
      marks[0] = 55;
      marks[1] = 66;
      marks[2] = 77;
      marks[3] = 99;

      int sum = 0;
      for (int floor = 0; floor < marks.length; floor++)
      {
         sum += marks[floor];
      }
      ave = sum / marks.length;
      System.out.println(ave);

      for (int mark : marks) //notice the for each loop
      {
         sum += mark;
      }
      ave = sum / marks.length;
      //PART B  - Shortcut for declaring arrays and building an array of Strings

      int[] aBunchOfInts = { 45, 32, 67, 8, 2, 89 };
      for (int i : aBunchOfInts)
      {
         System.out.println(i);
      }

      String[] aBunchOtStrings = { "Hello", "World", "What a great day to be a programmeer!" };
      for (String string : aBunchOtStrings)
      {
         System.out.println(string);
      }
      //What if we want to find the largest element?

      int largest = aBunchOfInts[0];
      for (int myInt : aBunchOfInts)
      {
         if (largest < myInt)
         {
            largest = myInt;
         }
      }
      System.out.println("Largest: " + largest);
   }
}
