package piratescomplete;

public class Start {
    public static void main(String[] args)
    {
        //To translate from English to Pirate, add 'arrrrr' to the front and , you scurvy dog to the end!

        //Make an external class called PirateTranslator that can translate into pirate
        PirateTranslatable t0 = new PirateTranslator();
        System.out.println(t0.translate("would you like sugar with that"));

        //Now, do it with an Inner Anonymous class
        PirateTranslatable t1 = new PirateTranslatable() {
            @Override
            public String translate(String sentence)
            {
                return "Arrrrr, " + sentence + ", you scurvy dog!";
            }
        };
        String translation = t1.translate("Have a lovely day!");
        System.out.println(translation);

        //Finally, do it with a lambda expression
        PirateTranslatable t2 = (s) -> "arrrrrr, " + s + ", you landlubber";
        System.out.println(t2.translate("Please pass the salt"));

    }

}
