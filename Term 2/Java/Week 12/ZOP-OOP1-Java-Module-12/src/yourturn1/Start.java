package yourturn1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args)
    {

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "lawn darts", 1000));
        list.add(new Product(2, "Horseshoes", 1000));
        list.add(new Product(3, "Soccer ball", 4000));
        list.add(new Product(4, "Hockey stick", 4000));
        list.add(new Product(5, "Baseball", 2000));
        list.add(new Product(6, "Cricket bat", 3000));
        list.add(new Product(7, "Football", 2000));
        list.add(new Product(8, "Hammock", 10000));
        list.add(new Product(3, "Soccer ball", 4000));

        // ⁡⁣⁢⁢Part A⁡ :  

        //1. Use Streams to print out all of the names of the Products
        list.stream().forEach(t -> System.out.println(t));
        /* ⁡⁢⁢⁢Answer⁡ : ⁡Try not ot read me! 
        list.stream().forEach(s -> System.out.println(s.getName()));
        */

        // 2. Add a filter to your stream so that only Products that require less than 3000 points print out
        System.out.println("\nProducts that require less than 3000 points");
        String productsName = list.stream()
        .filter(t -> t.getRequiredPoints() < 3000)
        .map((t) -> t.getName())
        .collect(Collectors.joining(", "));
        System.out.println(productsName);

        System.out.println(list.contains(new Product(1, "lawn darts", 1000)));
        
        list.stream()
        .sorted((c1,c2) -> c1.getRequiredPoints() - c2.getRequiredPoints())
        .forEach((c1)-> System.out.println(c1)); 
        
        /*  ⁡⁢⁢⁢Answer⁡ :⁡ Try to work it out on your own first!
            list.stream()
                    .filter(s -> s.getRequiredPoints() < 3001)
                    .forEach(s -> System.out.println(s.getName()));
        */

        // ⁡⁣⁢⁢Part B ⁡: 

        //Let's look at this forEach - how does it really work?  It takes a Consumer which functional Interface!  All we want our method to do is print out the product name.  

        //Let's start by building an anonymous inner class that implements Consumer.  Don't forget that we'll want to set the generic to <Product>

        // ⁡⁢⁢⁢Hint #1⁡: Start by building an annoymous class that implements Consumer

        /*  ⁡⁢⁢⁢Answer⁡ ⁡- Try not to look!
        Consumer<Product> consumer = new Consumer<Product>() {
            @Override
            public void accept(Product t)
            {
                System.out.println(t.getName());
            }
        };
        System.out.println("\nPrinting out our list with our annonymous implementation of the Consumer funtional interface");
        list.stream().forEach(consumer);
        */

        //⁡⁢⁣⁢ Now, can you take the code you just wrote and turn it into a lambda?⁡ .
        /*⁡⁢⁢⁢Hint #1⁡ - You might need to read this one    
        First, instead of using the variable consumer to hold the address, we can squeeze the entire anonymous class into our forEach method argument:
        
        list.stream()
                .forEach(
                        new Consumer<Product>() {
                            @Override
                            public void accept(Product t)
                            {
                                System.out.println(t.getName());
                            }
                        });
        */

        //Next, we can start converting to a lambda
        //Remember:
        //  we don't need the method name since there can only be one method (because it's implementing a functional interface) The compiler will know the name of the method.
        //since we don't need the name of the method, we don't need @Override
        //we don't need public if we don't need a method name
        //we don't need void because the compiler knows about  the return type from the functional interface
        //we don't need the argument type because the compiler can figure that out too
        // we don't need anything on the new line or the {} since our lambda is only goint to be one line
        // we need to add the -> to tell the compiler to use its syntatic sugar to make this a lambda
        //What are we left with?

        //build your stream to output the names of the products here:

        /*  ⁡⁢⁢⁢Answer⁡ :
        list.stream().forEach(s -> System.out.println(s.getName()));  
         */

        //By the way, we could have also used a method reference operator
        // list.stream().forEach(System.out::println);

        // ⁡⁣⁢⁢Part C⁡ :
        //google the java Predicate functional interface.
        //Next build an anonymous class that implements Predicate  But what will you call the method?!  Hint, the functional interface knows!  Also hint, the Generic you want to pass is Product, so the value being passed in will be an address of a Product objet.  Finally, return true if the requiredPoints for that object <3001 and false if it isn't

        /*  ⁡⁢⁢⁢Answer⁡ :
        System.out.println("Filter using anonymous class");
        Predicate<Product> predicate = new Predicate<>() {
        
            @Override
            public boolean test(Product t)
            {
                return t.getRequiredPoints() < 3001;
            }
        };
        */
        //next, create a Stream from listl, call filter, and pass your Predicate class into it.  Finally, chain a .forEach to the stream and print out the name of each product that remains in the List.  If all goes well, you should see only the names of products that require less that 3001 retuiredPoints.

        /* ⁡⁢⁢⁢Answer⁡ : 
        list.stream().filter(predicate).forEach(s -> System.out.println(s.getName()));
        */

        //Now, do the same thing, removing the parts of the anonymous class that you don't need and using the ->  lambda expression

        /* ⁡⁢⁢⁢Answer⁡ : 
        System.out.println("\nExact same filter using lamba expression:");
        list.stream().filter(s -> s.getRequiredPoints() < 3001)
              .forEach(s -> System.out.println(s.getName())); 
            */

        // ⁡⁣⁢⁢Part D⁡ :
        //Notice that we have two SoccerBall entries?  We would like to print out only unique entries.  Fortunately, we can use the distinct method as shown below
        System.out.println("\nPrint out a list with no duplictates");
        list.stream()
                .distinct()
                .forEach(s -> System.out.println(s.getName()));

        //uh oh...that didn't work!  What went wrong?  ⁡⁢⁢⁢Hint #1⁡ - the above code is correct

        /*  ⁡⁢⁢⁢Answer⁡ - try not to read me...think it through
        *  you need to add .equals and .hashCode to Product so that the distinct method can compare Product objects to see if they are the same!
        */

        //By the way, limit can be useful!  Do some googling and see if you can limit that list to 4 products
        /*  ⁡⁢⁢⁢Answer⁡ :  
        System.out.println("\nUsing limit to limit the size of the list to 4");
        list.stream().limit(4).forEach(s -> System.out.println(s.getName()));
        */

        //Now, we would like to filter on Products with requiredPonts <3001 agaion but, instead of using .forEach and printing out the name of each product in our filtered list, we would like to create a new List with only these entries.  We no longer want to use forEach and just pring them out.

        // ⁡⁣⁢⁢Part E⁡ :
        // ⁡⁢⁢⁢Hint ⁡:  Is there some way that you can ⁡⁢⁢⁢'collect'⁡ enough information to solve the problem?
        System.out.println("\nUsing collect to build a List");

        /**  ⁡⁢⁢⁢Answer⁡ : 
            List<Product> myList = list.stream().filter(s -> s.getRequiredPoints() < 3001)
                    .collect(Collectors.toList());
            System.out.println(myList);
        */

    }
}
