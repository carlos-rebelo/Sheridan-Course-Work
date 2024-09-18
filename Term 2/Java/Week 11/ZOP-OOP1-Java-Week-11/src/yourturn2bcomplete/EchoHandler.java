package yourturn2bcomplete;

public class EchoHandler implements EchoMaker {

    @Override
    public String echo(String phrase)
    {
        return phrase + "..." + phrase + "..." + phrase;
    }

}
