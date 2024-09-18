package yourturn1complete;

/* ⁡⁣⁢⁢Part A⁡ :
    Take a look at the Parent Class.  Now, make Child inherit from Parent
    Instantiate a Parent object and a Child object and call the methods.  You just got code for free!!!
 */

/*  ⁡⁣⁢⁢Part B⁡ :
       - Overide method1 in the Child class so that, when we call method1 in the Child object, it prints out "In method1 of the Child object!"
       - run your code again

 */

/*  ⁡⁣⁢⁢Part C⁡ :
    - Write a method called method3 in the Child class.  We want to be able to print out the value of the instVar variable in Parent from this method.  What change will we have to make to Parent?

 */

/*⁡⁣⁢⁢ Part D⁡⁡ :
 * 
 Every Object must run a constructor after instantiation, even if it is the empty constructor
- Add a constructor to Parent that allows us to set the value of instVar when we instantiate the Parent object.
- uh oh...a bunch of things just broke.  Can you fix them?  It would be 'super' if you could

 */

/* ⁡⁣⁢⁢Part E⁡ : 
 Let's create a GrandChild class.    However, we only want an empty constructor in GrandChild.  This poses a problem since we need to call the constructor in Parent and it requires that we pass it an int.   Go ahead and make the empty constructor in GrandChild pass 555 to the Parent constructor.  Instantiate it,  and call method1.  Notice that we inherited the method1 from Child.  Next, run the whole program through the debugger
 */

/*⁡⁣⁢⁢ Part F⁡ :
 -Let's override the toString method in Child to return "toString in Child is running"
       - go ahead and print out the reference variable pointing to your Child object.  Notice that we no longer see the address of the object, we see our message from the toString method.  Notice also that Grandchild inherited this overriden method.
 */

public class Start {
    public static void main(String[] args)
    {
        Parent p1 = new Parent(123);
        p1.method1();
        System.out.println();
        Child c1 = new Child(456);
        c1.method3();
        c1.method1();

        System.out.println();
        GrandChild g1 = new GrandChild();
        g1.method1();
    }
}
