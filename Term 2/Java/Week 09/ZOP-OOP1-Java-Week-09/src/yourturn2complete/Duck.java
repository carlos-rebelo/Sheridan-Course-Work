package yourturn2complete;

public class Duck extends Animal {

    public Duck(String favouriteFood) {
        super(favouriteFood);
    }

    @Override
    public String makeNoise()
    {
        return "Quack!";
    }

}
