package yourturn3complete;

public class Lion extends Animal {

    public Lion(String name, String favFood) {
        super(name, 4, favFood);
    }

    @Override
    public void makeNoise()
    {
        System.out.println(name + "ROOAAARSSSS!");
    }
}
