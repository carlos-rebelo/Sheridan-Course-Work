package buttonandlampcomplete;

public class Start {
    public static void main(String[] args)
    {
        //​‌‍‌⁡⁣⁢⁢ PART A​

        //⁡⁢⁣ ⁡⁢⁣⁢QUESTION:⁡⁡   What will happen when we run these lines of code?

        Lamp l1 = new Lamp();
        Fan f1 = new Fan();
        Heater h1 = new Heater();
        Button b1 = new Button(l1);
        Button b2 = new Button(f1);
        Button b3 = new Button(h1);
        b1.push();
        b1.push();
        b1.push();
        b2.push();
        b2.push();
        b2.push();
        b3.push();

        //⁡⁢⁣  ⁡⁢⁣⁢QUESTION: ⁡ Describe the relationship between
        //      Start and Button
        //      Button to Lamp
        //      Lamp to Button
        //      Start and Lamp

        /*⁡⁢⁢  ⁡⁢⁢⁢ANSWER: ⁡⁢⁢⁡⁢⁢⁢=⁡⁢⁢⁢>
        ⁡⁡⁡
         * Start is dependent on Button.  What was the test again?  If Button didn't exist or had an error, could we still compile Start.  The answer is no because we are instantiating a Button in the main method.  So we know it's dependency at least.  However, Start doesn't hold a reference to Button (have an instance variable with it's address in it), so it is not association
         * 
         * Button has a composition relationship with Lamp.  Button can not compile without a working Lamp so we know that button depends (dependency) on Lamp.  However, Button DOES hold a reference to Lamp so it is at least Association.  The way the code is written, the Lamp object is instantiated at the same time the Button is (they are born together).  We know this because, in the constructor of the Button class, we are instantiating the Lamp and we know the constructor runs automatically and immediately when the object is created.  Also, Lamp is final and there aren't any setters so we can never swap a new Lamp in, and it is private with no getters so we can never share the address of Lamp with any other code.  This means that, when Button dies( is garbage collected), Lamp dies too.
         * 
         * However, Lamp has no dependency on Button or Start.  If either Button or Start disappear, Lamp will still compile just fine since it does not have any knowledge or Button or Start.
         * 
         * Ulltimately, Start is dependent on Lamp since Button cannont exist without Lamp and Start cannot exist without Button.
         * 
         */

        // ⁡⁢⁢⁣NEXT STEP:⁡  OK, now we'd like to make Button operate our Fan Object - uh oh...we are going to need to do a lot of work...

        // ⁡⁢⁣⁢QUESTION: ⁡ Do you think our Button and Lamp code is tightly coupled or loosely coupled?
        /* ⁡⁢⁢⁢ANSWER: =>⁡
         * Button and Lamp are very tightly coupled!!!
         */

        // back to slides!

        // ⁡⁣⁢⁢​‌‍‌𝗣𝗔𝗥𝗧 𝗕​⁡

        // ⁡⁢⁣⁢QUESTION:⁡  We would like to make our code less tightly coupled.  Any ideas?
        /* ⁡⁢⁢⁢ANSWER: =>⁡
         * 
         * Here's an idea, what if we passed in the Lamp instead of having the constructor instantiate it?  That will break the composition relationship as Button and Lamp don't both need to be born together.  We can instantiate a Lamp and, later on, pass it to the constructor of Button.  What relationship have we got now?  Association/aggregation (remember that aggregation and association are the exact same thing in java code- it is just a question of semantics as to whether you beleive the button has ownership of the lamp)
         */

        // ⁡⁣⁢⁢​‌‍‌PART C ​⁡- Polymorphism to the rescue!

        //Let's take a look at the interface, ButtonSwitchable
        //OK, so what?  So, let's make Lamp and Fan both implement ButtonSwitchable.  That's easy because both classes have an acceptSignal method already so we don't have to do any work.
        //Tada!!!!  We've fixed everything!

        //Huh?  What are you talking about???
        //Let's change our Button class to use ButtonSwitchable as the reference variable type, instead of Lamp.  We'll have to rework our code a little but this is the last time!

        //Look what happens!  We've decoupled our code and now we can pass a Lamp or a Fan (or anything that implements ButtonSwitchable) into our Button and it will operate it!

        // ⁡⁢⁣⁢QUESTION: ⁡ Is this not the coolest thing you've seen today?
        /* ⁡⁢⁢⁢ANSWER =>⁡
         * 
         * Yes.  Yes it is!  ;->
         */
    }
}
