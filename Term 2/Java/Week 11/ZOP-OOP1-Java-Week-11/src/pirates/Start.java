package pirates;

public class Start {
    public static void main(String[] args)
    {
        //To translate from English to Pirate, add 'arrrrr' to the front and , you scurvy dog to the end!

        //Make an external class called PirateTranslator implements PirateTranslatable  that can translate into pirate
        PirateTranslatable t1 = new PirateTranslator();
        t1.translate("good afternoon");
        //Now, do it with an Inner Anonymous class
        /* Hint:
         PirateTranslatable t1 = new PirateTranslatable() {
            @Override
            public String translate(String sentence)
            {
                return "Arrrrr, " + sentence + ", you scurvy dog!";
            }
        };
        String translation = t1.translate("Have a lovely day!");
        System.out.println(translation);
         */
        PirateTranslatable t2 = new PirateTranslatable() {
            public String translate(String sentence) {
                return "Arrr, "+sentence+", you scurvy dog";
            }
        };
        System.out.println(t2.translate("yessss"));
        //Finally, do it with a lambda expression
        /*Hint:
            PirateTranslatable t2 = (s) -> "arrrrrr, " + s + ", you landlubber";
            System.out.println(t2.translate("Please pass the salt"));
         */
        PirateTranslatable t3 = (sentence) -> "Arrr, "+sentence+", you scurvy dog";
        
        System.out.println(t3.translate("Yipeeeee!"));
    }
}
