package yourturn3a;

public class Panda extends Animal{

    public Panda(String name, String favFood) {
        super(name, 4, favFood);
    }
    public void makeNoise() {
        System.out.println(name+" grunts");
    }
}
