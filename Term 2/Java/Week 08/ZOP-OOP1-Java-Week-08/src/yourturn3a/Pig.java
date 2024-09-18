package yourturn3a;

public class Pig extends Animal {

    public Pig(String name, String favFood) {
        super(name, 4, favFood);
    }

    public void makeNoise() {
        System.out.println(name+" oinks");
    }
}
