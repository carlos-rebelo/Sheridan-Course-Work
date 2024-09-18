package arrays1;

public class IntroToArrays {
   public static void main(String[] args)
   {
      // ⁡⁣⁢⁢Part A:⁡ 
      int mark1 = 55;
      int mark2 = 66;
      int mark3 = 77;
      int mark4 = 99;
      //calculate the average of a bunch of marks --What if there were 10000 marks?
      
      //There has to be a better way...  Introducing Arrays!
      
      int[] marks = new int[6];
      marks[0] = 10;
      marks[1] = 20;
      marks[2] = 30;
      marks[3] = 90;
      marks[4] = 40;
      marks[5] = 50;
      System.out.println(marks.length);
      int biggestSoFar= 0;
      for (int index = 0; index < marks.length; index++) {
         System.out.println(marks[index]);
         if (biggestSoFar < marks[index]) {
            biggestSoFar = marks[index];
         }
         
      }

      System.out.println("Larges is "+biggestSoFar);
      // sum /= marks.length;
      // System.out.println(sum);
      
     
  
      
      
      //Using loops in arrays

      //What if we want to find the largest element?

      //shortcut declaration of arrays

      //⁡⁣⁢⁢PART B⁡  - An array of Strings

      String[] favCars = {"Audi","Volvo","Tesla","Mustang", "Corvette", "Mclaren", "Ferrari", "Masserati"};

      for (int floor = favCars.length - 1; floor >= 0; floor--) {
         System.out.println(favCars[floor]);
      }

      for (String car : favCars) {
         System.out.println(car);
      }

      //Let's make an array of our favourite cars

      //For Each loops

   }
}
