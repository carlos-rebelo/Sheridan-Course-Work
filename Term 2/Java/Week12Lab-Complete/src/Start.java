import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Start {
    public static void main(String[] args) throws Exception
    {
        /* ⁡⁣⁢⁢Part A⁡ :  Read me  -15 mins
        
        You have been given the functional interface called RectangleAreaCalc
        
        Build an inner-anonymous class of type RectangleAreaCalc that will return the area of a rectangle and assign it to a reference variable of type RectangleAreaCalc called r1 .  Prove that your code works.
        
        Next, declare a reference variable of type RectangleAreaCalc called r2 and turn your inner-anonymous RectangleAreaCalc class into a lambda expression and prove that it works too!      
        
        */

        System.out.println("Part A:");
        RectangleAreaCalc r1 = new RectangleAreaCalc() {

            @Override
            public double calcAreaOfRectangle(double length, double width) {
                return length * width;
            }
            
        };
        System.out.println(r1.calcAreaOfRectangle(2, 3));
        RectangleAreaCalc r2 = (l, w) ->  l * w;
        System.out.println(r2.calcAreaOfRectangle(2, 4));
        /*  ⁡⁣⁢⁢Part B:⁡ Read me  - 15 mins
         
        You have been given the Interface: FormatEngine.  Take a look at it.  It is a functional interface!
        
        Build an inner-annymous class and assign it to a reference variable of type FormatEngine called f1.  Your inner anonymous class will return whatever String is passed to it as UPPERCASE (remember that the string class has a toUpperCase() method)
        
        Next, build a lambda expression that will return any String passed to it as lowercase and and assign it to a reference variable of type FormatEngine called f2.
        
        Prove that both reference variables can format the text sent to the format method.
        
        Finally, the String class has a method called transform that takes a Function interface.  The Function interface is built right into Java and is a functional interface.  Since it is a functional interface, we can use a lamba expression with it.  Use the string.transform()method with your lambda expression that adds 3 *s to the beginning and end of the text passed in:   ***text***
        
        Your output should look something like this:
        
        Part B
        ABCDEGS
        abcdegs
        ****aBCdeGS***
         
         */

        System.out.println("Part B");

        //use this string in your FormatEngines
        String input = "aBCdeGS";
        FormatEngine f1 = new FormatEngine() {
            @Override
            public String format(String text) {
                return text.toUpperCase();
            }
        };
        System.out.println(f1.format(input));
        FormatEngine f2 = (t) -> t.toLowerCase();
        System.out.println(f2.format(input));
        System.out.println(input.transform((t) ->"***"+t+"***"));

        /*  ⁡⁣⁢⁢Part C ⁡: Read me - 20 mins
        
         Build a class called SwissArmyKnife.  This class will contain an ArrayList that holds objects of type Blade (notice that Blade is a functional interface)
        
         add a method called addBlade that will allow us to install a new Blade into our knife (add a blade to our arraylist of Blade)
        
         add a method called chooseBlade that will pass an int to represent the Blade number in our ArrayList that you want to use
        
         Build an External Class called KnifeEdgeBlade that implements Blade and have the method print "Using knife-edge blade to carve a branch"
        
         Call the addBlade method from the main method and pass it a new KnifeEdgeBlade
        
         test that it works
        
         Next, build a new Blade but this time, use an inner-anonymous class -  This blade should print out Using screwdriver blade to screw in a screw
        
         Finally, use a lambda expression to add a blade the will print out using saw blade to saw a branch
        
         Prove that all blades work by calling the chooseBlade method for each blade
        
         //Finally, protect your chooseBlade method by throwing an exception that says "No such blade" if the method is called for a blade number that doesn't exist
         */

        System.out.println("Part C");
        SwissArmyKnife s1 = new SwissArmyKnife();
        s1.addBlade(new KnifeEdgeBlade());
        s1.chooseBlade(1); 
        s1.addBlade(new Blade() {

            @Override
            public void use() {
               System.out.println("Using screwdriver blade to screw in a screw");
            }
            
        });
        s1.addBlade(()->System.out.println("Using saw blade to saw branch"));
        s1.chooseBlade(2);
        s1.chooseBlade(3);

        /*  ⁡⁣⁢⁢Part D: ⁡ Read me  - 10 mins
        
         Build an Arraylist of Student objects and add 4 Students
        
         Use streams to:
        -  print out all of the students
        -  print out only students with grades over 80
        - print out the students in a sorted order
         -print out only names of the students who have a name with more than 4 characters in it
        
        Your output should look something like this:
        Part D:
        All Students:
        Student [name=Bart, grade=60]
        Student [name=Lisa, grade=95]
        Student [name=Millhouse, grade=52]
        Student [name=Nelson, grade=93]
        All Students with grades over 80:
        Student [name=Lisa, grade=95]
        Student [name=Nelson, grade=93]
        All Students, in a sorted fashion
        Student [name=Millhouse, grade=52]
        Student [name=Bart, grade=60]
        Student [name=Nelson, grade=93]
        Student [name=Lisa, grade=95]
        All Student names with names over 4 characters in length:
        Millhouse
        Nelson 
        
         Question:  Why does java  print [Student [name=Bart, grade=60] instead of the address of the Student object?
        
         */

        System.out.println("Part D:");
        ArrayList <Student> students = new ArrayList<>();
        students.add(new Student("Carlos", 81));
        students.add(new Student("Justin", 90));
        students.add(new Student("Rich", 67));
        students.add(new Student("Selena", 93));
        
        students.stream().forEach((t) ->System.out.println(t));
        System.out.println("Part D-2:");
        students.stream()
        .filter((t) ->t.getGrade()>80)
        .forEach((t)-> System.out.println(t));
        /* students.stream()
        .sorted(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {

            }
            
        }); */
        System.out.println("Part D-4:");
        students.stream()
        .filter((t)->t.getName().length()>4)
        .forEach((t) -> System.out.println(t.getName()));


        /* ⁡⁣⁢⁢Part E:⁡  Read Me  10 mins
        
         Build a class called ObjectLogger 
         
            -  that has method called  log that accepts a Loggable.  Notice  that Loggable is an interface.  
            
            - The log method will add the value returned from logObject() method of the  object being logged to an instance variable called log that is a String
        
            - The  getLog method returns a String containing all of the information in logFile.
        
            Write a Car class that has a license plate, and make it possible to pass in Car objects to the log method in Logger.  If your code works, the code below will output:
        
        Part E:
        Logging a Car Object: [ABC123]
        Logging a Car Object: [XYA999]
         
         */

        System.out.println("Part E:");

        ObjectLogger log = new ObjectLogger();

        log.log(new Car("ABC123"));

        log.log(new Car("XYA999"));

        System.out.println(log.getLog());

        /* ⁡⁣⁢⁢Part F:⁡  Read Me - 10 mins
         * 
            Take a look at Translator.  Notice that it has an instance variable of type TranslatorEngine.  Notice too, that TranslatorEngine is a functional interface.  Finally, notice there is a setter that allows us to pass in a TranslatorEngine object and a method called translateSentence that uses the TranslatorEngine to translate from english to whatever TranslatorEngine language we choose.
        
            Go ahead and instantiate a Translator and write a Class called PirateTranslator that implements TranslatorEngine.  Use the setter to set the TranslatorEngine to one that will convert "Lovely day" to "arrrr, Lovely day, you scurvy dog."
        
            Next, use the setter to pass in a TranslatorEngine object using an inner-annoymous class.  This translator will translate "Lovely Day" to "Lovely Day.  Can I have an extension on my assignment?"  (This is a student translator ;->)
            
            Finally, use a lamba expression to set one more translator that will convert "Lovely Day" to "LOVELY DAY"   (This is a shouting translator)
        
            Output:
            Part F:
        
        arrrrr, Lovely day, you scurvy dog
        Lovely day, can you give me an extension on the assignment?
        LOVELY DAY
        
         */

        System.out.println("Part F:");

        Translator translator = new Translator();
        translator.setTranslatorEngine(new PirateTranslator());
        System.out.println(translator.translateSentence("Lovely Day"));
        translator.setTranslatorEngine(new TranslatorEngine() {

            @Override
            public String translate(String sentence) {
                return sentence+". Can I have an extension on my assignment?";
            }
            
        });
        System.out.println(translator.translateSentence("Lovely Day"));
        translator.setTranslatorEngine((sentence)->sentence.toUpperCase());
        System.out.println(translator.translateSentence("Lovely Day"));

        /*  ⁡⁣⁢⁢Part G: ⁡ Read me -10 mins
        
        Take a look at StorageContainer.  It can store a Car object and the weight of the container.  Use generics so that you can store whatever you want to store in the Container.  For Example, I want to store a Friend object in a Container and I want to Store a String in a Container, or a Student
          
         */
        System.out.println("Part G:");
        StorageContainer <Car> c1 = new StorageContainer<>(new Car("ABC123"), 5000);
        System.out.println(c1);
        //System.out.println(c1);

        StorageContainer <Friend> c2 = new StorageContainer<>(new Friend("Bart"), 5000);

        System.out.println(c2);

        StorageContainer<Student> c3 = new StorageContainer<>(new Student("Lisa",95), 5000);

        System.out.println(c3);

        StorageContainer<String> c4 = new StorageContainer<>("I am a String!", 5000);

        System.out.println(c4);

        /* ⁡⁣⁢⁢Part H: ⁡  Read Me: 
         
        Prove that you understand Enumerated types by building an enumerated type for Coin which can be QUARTER worth .25, DIME worth .1, and NICKEL worth .05
        
         */
        System.out.println("Part H:");
        Coins coin1 = Coins.QUARTER;
        System.out.println(coin1.getValue());
        System.out.println(Coins.DIME.getValue());
    }
}
