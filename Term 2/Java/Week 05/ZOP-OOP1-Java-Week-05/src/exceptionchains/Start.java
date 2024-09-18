package exceptionchains;

public class Start {
   public static void main(String[] args) 
   {
      //Let's debug this!
      ExceptionChains obj1 = new ExceptionChains();
      try {
         obj1.method1(1);
      } 
      catch (Exception e) {
         System.out.println("Trying to solve in main method - success");
      }
      

   }
}
