package yourturn5;

public class Start {

    /*  ⁡⁣⁢⁢Read Me: ->⁡
    
    ⁡⁢⁣⁢PARTA⁡
    Let's build the Calc class together:
    
    Make the Calc class abstract 
    
    We want our Calc class to have concrete methods for adding, subtracting, multiplying and dividing.
    
    We also want to be able to lock our calculator so that it can't be used.  If we try to perform a math operation with the calculator locked, we will not do the operation and will return false.  Once the calculator is unlocked, we can do the operations and return true.
    
    We will pass in the password to our calculator in the constructor and set our calculator to be locked 
    
    We want a method called getTotal that will return the current total
    
    We want to override the toString method to return either "The calculator is currectly locked" or "The current total is <total>"
    
    Finally, we want an abstract method called printOutModelType that will accept nothing and return nothing but will print out what model type the calculator is.
    
    ⁡⁢⁣⁢    PARTB:⁡
    
    Now, let's build a concrete class called BasicCalc...
    
    BasicCalc will do basic math and will print out "Basic Calculator" when the printOutModelType method is called
    
    ⁡⁢⁣⁢ PARTC:⁡
    
    Things get a little more interesting here.  We want to create a DeluxeCalc calculator.
    
    DeluxeCalc should inherit from Calc and implement the Memory interface - see Memory for details.
    
    It should print out "Deluxe Calculator" when the printOutModelType method is called
    
    ⁡⁢⁣⁢   PARTD:⁡
    
    Now, build a BusinessCalc that inherits from DeluxeCalc (so it has memory functions) and add the ability to call a method called getHistory that accepts nothing but returns a String containing all operations since the last time clearMemory was called.  Think this one through...you will have to override a lot of stuff...that will be SUPER ;->  -If you get stuck, remember that my solution is in yourturn5complete
    
    ...fun fact, while building this exercise, I mistyped subtract  and the @Override caught it for me ;-> ...
    
    Also, you'll probably want to clear the history when you clear the total
    
    You will also want a getHistory method that will accept nothing and will return a String that looks something like this:
    
    testing BusinessCalc
    +  45.3
    +  5.2
    -  4.0
    /  3.0
    ________________________
    15.5
    ================ 
    +  15.5
    *  3.0
    ________________________
    46.5
    ================
    
    
    
     PART E - For super smarty pants only!
    
     Write a ScientificCalc that inherits from deluxeCalc and implements Scientifical interface - see Scientifical for more info
     Also, make a public, static, variable called PI 
    
    */

    public static void main(String[] args)
    {
        // Calc c1 = new Calc(); //shouldn't be able to instantiate this one!  just go ahead and comment it out

        BasicCalc basic = new BasicCalc(1234);

        DeluxeCalc deluxe = new DeluxeCalc(1234);
        deluxe.unlock(1234);
        deluxe.add(50);
        deluxe.divide(2);
        System.out.println(deluxe.getTotal());
        deluxe.addToMemory();
        deluxe.clearTotal();
        deluxe.add(10);
        deluxe.addToMemory();
        System.out.println(deluxe.getMemory());
        // basic.add(45);
        // System.out.println(basic.toString());

        // basic.unlock(1234);
        // basic.add(15);
        // basic.add(10);
        // basic.subtract(5);
        // System.out.println(basic.getTotal());
        // System.out.println(basic);
        // basic.printOutModelType();

        // System.out.println("\n testing BusinessCalc");
        // BusinessCalc businessCalc = new BusinessCalc(4567);
        // businessCalc.unlock(4567);
        // businessCalc.add(45.3);
        // businessCalc.add(5.2);
        // businessCalc.subtract(4);
        // businessCalc.divide(3);
        // System.out.println(businessCalc.getHistory());
        // businessCalc.addToMemory();
        // businessCalc.clearTotal();

        // businessCalc.add(businessCalc.getMemory());
        // businessCalc.multiply(3);
        // System.out.println(businessCalc.getHistory());

    }
}
