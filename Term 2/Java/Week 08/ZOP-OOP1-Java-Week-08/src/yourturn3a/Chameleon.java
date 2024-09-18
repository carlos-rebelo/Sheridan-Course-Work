package yourturn3a;

public class Chameleon extends Animal {

    public Chameleon(String name, String favFood) {
        super(name, 4, favFood);
    }
    public void makeNoise() {
        System.out.println(name+" squeacks");
    }
}
