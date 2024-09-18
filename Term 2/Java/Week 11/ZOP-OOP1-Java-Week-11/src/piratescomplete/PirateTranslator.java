package piratescomplete;

public class PirateTranslator implements PirateTranslatable {

    @Override
    public String translate(String sentence)
    {
        return "Arrrrr, " + sentence + ", you scurvy dog!";
    }

}
