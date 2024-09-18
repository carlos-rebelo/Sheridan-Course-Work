package exceptionchains;

public class ExceptionChains {

   public void method1(int arg1) throws Exception
   {
      this.method2(arg1 + 1);
   }

   public void method2(int arg1) throws Exception 
   {
      try {
         this.method3(arg1 + 1);
      } catch (Exception e) {
         System.out.println("trying to solve in method 2 but unable -throw exception again ");
         throw e;
      }
      
   }

   public void method3(int arg1) throws Exception
   {
      this.method4(arg1 + 1);
   }

   public void method4(int arg1) throws Exception 
   {
      
      this.method5(arg1 + 1);
      
         
   }

   public void method5(int arg1) throws Exception
   {
      System.out.println(arg1);
      Exception error = new Exception("Yikes, you made a mistako " + arg1);
      throw error;    
      //what would happen if we uncomment the code above?
   }

}
