package pirates;

public class PirateTranslator implements PirateTranslatable{

    @Override
    public String translate(String sentence) {
        return "Arrr, "+sentence+", you scurvy dog";
    }

}
