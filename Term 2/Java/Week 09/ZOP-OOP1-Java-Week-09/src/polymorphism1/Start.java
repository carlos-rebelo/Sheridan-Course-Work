package polymorphism1;

public class Start {
        public static void main(String[] args)
        {
                //  ⁡⁣⁢⁢Part A:⁡  Let's Look at the Person Class
                // Person person1 = new Person("Bart");
                // person1.eat();
                // person1.speak("Cowabunga!");

                //  OK, let's make Pirate inherit from person!  While we're at it, let's override the speak method to make the pirate talk better, just like before.  Also, let's give our pirate an numEyepatch variable which we will set in the constructor, and make our pirate drawSword

                Pirate pirate = new Pirate("Pete the Pirate", 1);
                // pirate.speak("Cowabunga");
                // pirate.drawSword();

                //notice, however, that we can't do this:

                 Person person2 = new Student("Rich"); 

                //Ok, that makes sense because we know that the reference variable type must match the object that it holds the address of.

                //OK, we know all this..what about polymorphism?

                //This is polymorphism:

                

                // *** ⁡⁣⁢⁡⁢⁢⁣​‌‌‌𝙏𝙝𝙖𝙩'𝙨 𝙞𝙩.  𝙏𝙝𝙖𝙩'𝙨 𝙥𝙤𝙡𝙮𝙢𝙤𝙧𝙥𝙝𝙞𝙨𝙢.​ ***⁡⁡

                // Polymorphism ⁡⁣⁢⁢l⁡⁡⁣⁢⁢et's us declare the reference variable type as a Parent class to the child object.⁡  That's it!  (Actually, we can do the same thing with interfaces but more on that soon!)

                // Now, what we can do with it is another story, but polymorphism boils down to having a reference variable type that is a parent of the actual object.  ( Again, we'll see soon that interfaces work too)

                //⁡⁣⁢⁢Back to slides⁡

                // ⁡⁣⁢⁢Part B:⁡  What can we do with Polymorphism

                //Let's play around with this this Pirate object that is being referenced by a Person Type:
                Person p1 = pirate;
                p1.eat();

                // p1.drawSword();    // huh...we don't have access to drawSword.  That's because Person doesn't have access to that method.  When we are using a Parent class as the reference variable, we only see things that the Parent class can see.

                p1.speak("Hello");//    ⁡⁣⁢⁣​‌‍‍//  ​‌‍‍⁡⁢⁢⁣notice?  Even though our Parent class (Person) has an implentation of speak, the Pirate version still runs since the object is a Pirate object⁡​

                /* Object o1 = pirate; //​‌‍‍⁡⁢⁢⁣ Remember, every class inherits from object⁡​
                System.out.println(o1.hashCode()); */
                //what happens when we type o1.   ?  Let's find out

                //Even though the object that o1 points to is a Pirate object, we can only see methods associated with the parent class (object)
 
                // ⁡⁣⁢⁢Part C⁡ :
                 Person [] people = {new Person("Rich"), new Pirate("Carlos",1), new Pirate("Justin",3)};
                /* for (int floor = 0; floor < people.length; floor++) {
                        people[floor].speak("Hello there");
                }  */
                ((Pirate)people[1]).drawSword();
                ((Pirate)people[0]).drawSword();
                ((Pirate)people[2]).drawSword();

                //ok, that's marginally interesting.  But why did you say that Polymorphism is the most powerful pillar of OOP?

                //So, it will take a while to truly appreciate polymorphism, but here's a small taste:

                //Remember how we can only put one kind of thing in an array?  Watch this:

                // ⁡⁣⁢⁢Code⁡:

                // System.out.println("\nPolymorphic array:");
                // Person[] people = { new Pirate("Blackbeard", 1), new Person("Bart"), new Accountant("Karl"), new Pirate("Jack Sparrow", 0) };
                // for (Person person : people)
                // {
                //         person.eat();
                //         person.speak("Hello");
                //         if (person instanceof Pirate)
                //         {
                //                 ((Pirate) person).drawSword(); //remember, we can't see this method 
                //         }
                // // System.out.println(person.getNumEyePatches()); //⁡⁢⁣⁢same thing - why do you think that is???  Why are we prevented from this⁡?

                /*⁡⁢⁢⁢Answer⁡:
                 * Because our reference variable type doesn't see the drawSword or the getNumEyePatches methods.
                 */

                // ⁡⁢⁡⁢⁣⁢QUESTION: ⁡  So, why doesn't the following line of code work? 

                Person person3 = new Student("Bart");

                //  but this does?

                // Person person3 = new Accountant("Poindexter");

                /* ⁡⁢⁢⁢ANSWER:⁡  
                Because Student doesn't inherit from Person.  Polymorphism only works if the object extends (inherits) or implements (Interface) the reference variable Type
                */

                // ⁡⁢⁣⁢QUESTION:⁡  Why do you think that is??

                /* ⁡⁢⁢⁢ANSWER:⁡
                Hmmm...what could go wrong if we could assign a Person reference variable to a Student object?
                Remember, we can see all of the methods in the Person class but Student doesn't inherit from Person so there is no quarantee that the method that is available to the Person reference variable has been written in the Studnt class.   Our Person reference variable wants to be able to call eat(); but the Student object doesn't have an eat method
                
                In our array of Person, all of the objects held in that array are children of Person so we KNOW that they all have implementations of all of the Person methods.
                */

                //Casting Primitives:

                int a = 5;
                double b = 3.45;

                // b=a;
                // System.out.println(b); //this is called upcasting.  The compiler lets us put an int value in a double because there is plenty of room!  The compiler implicitly casts for us.

                a=(int)b; //This is downcasting.  We're trying to put a variable that has more precision into a variable type that has less precision.  The compiler won't let us do this unless we make it clear to it that we know what we're doing by explicitly casting.
                // System.out.println(a);

                b = a;
                // ⁡⁣⁢⁢Part D:  Casting objects⁡

                Person p5 = new Pirate("Carlos", 2); //implicit cast -we are moving up the inheritance chain so we call this upcasting. When we are upcasting (moving up the inheritance chain) we don't need to add the casting information - the compiler does it for us automatically

                Pirate aPirate  = (Pirate) p5; // However, here, we are downcasting (moving down the inheritance chain)  The compiler is going to flag this because, the reference variable of type Pirate will allow us to call a method (say, drawSword) that may not be in the object that it holds the address to (A Person object).  We must EXPLICITLY tell the compiler that we know this and promise not to break anything

                //let's talk about our polymorphic array that we built in Part B
                //we can hold an object of any child class of Person in our array and we can call any methods that Person supports.
                //But what if we wanted all the Pirate objects to be able to drawSword?

                // System.out.println("\n Casting:");
                // for (Person person : people)
                // {
                //     ((Pirate) person).drawSword(); //⁡⁢⁣⁢Question : ⁡ hmm..it worked on the first one but why didn't it work for the second one?
                // }

                /*  ⁡⁢⁢⁢Answer: ->⁡
                    The first object in floor 0 of our array was a Pirate object so the drawSword was in the object
                    However, floor 1, in our array, holds a Person object and a Person object wouldn't have been built (instantiated) with a drawSword method so we get a runtime error
                 */

                //  ⁡⁣⁢⁢Part E⁡ :
                // for(
                // Person person:people)
                // {
                //     if (person instanceof Pirate)
                //     {
                //         ((Pirate) person).drawSword();
                //     }
                // }

                // ⁡⁢⁣⁢Question: ⁡Why do you think the compiler will upcast for us automatically but requires explicit casting when downcasting?

                /*⁡⁢⁢⁢Answer ⁡
                - Because we could break things during runtime when downcasting but we can't break anything when upcasting
                */

                //Let's look at this:

                // Object anotherObject = new Pirate("Blackbeard", 1); 
                // ((Person) anotherObject).eat();
                // ((Pirate) anotherObject).drawSword();

                //⁡⁢⁣⁢Question⁡: what would happen if we make our object a Person instead of a Pirate?  Let's find out

                /* ⁡⁣⁢⁢Part F⁡ :
                        It turns out that polymorphis doesn't just work with class inheritance.  It works with interfaces too!  Let's make Pirate and Accountant implment CookieBaker
                */
        }
}
