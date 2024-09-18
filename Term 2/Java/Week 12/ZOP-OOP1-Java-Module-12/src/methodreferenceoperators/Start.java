package methodreferenceoperators;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args)
    {
        ArrayList<String> sentences = new ArrayList<>(Arrays.asList("Study hard", "have a nice day", "Yikes"));

        sentences.stream()
                .forEach(s -> Translator.toPirate(s));

        sentences.stream()
                .peek(Translator::toStudent)
                .forEach(Translator::toPirate);
    }
}
