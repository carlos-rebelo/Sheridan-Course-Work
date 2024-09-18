public class PirateTranslator implements TranslatorEngine{

    @Override
    public String translate(String sentence) {
        return "arrr, "+sentence+", you scurvy dog.";
    }

}
