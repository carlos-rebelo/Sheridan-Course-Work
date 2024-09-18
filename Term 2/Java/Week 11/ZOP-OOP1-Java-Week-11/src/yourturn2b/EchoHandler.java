package yourturn2b;

public class EchoHandler implements EchoMaker{

    @Override
    public String echo(String phrase) {
        return phrase+"..."+phrase+"..."+phrase;
    }

}
