package pirates;

@FunctionalInterface
public interface PirateTranslatable { //this is a functional interface because it has only 1 abstract method
    String translate(String sentence);
}
