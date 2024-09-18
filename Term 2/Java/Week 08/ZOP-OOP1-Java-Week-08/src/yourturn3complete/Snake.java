package yourturn3complete;

public class Snake extends Animal {

    public Snake(String name, String favFood) {
        super(name, 0, favFood);
    }

    @Override
    public void makeNoise()
    {
        System.out.println(name + " hissssessss");
    }

}
