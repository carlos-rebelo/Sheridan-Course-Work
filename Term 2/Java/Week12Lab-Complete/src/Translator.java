public class Translator {
    private TranslatorEngine engine;

    public void setTranslatorEngine(TranslatorEngine engine)
    {
        this.engine = engine;
    }

    public String translateSentence(String sentence)
    {
        return engine.translate(sentence);
    }

}
