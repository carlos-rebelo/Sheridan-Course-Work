package yourturn2complete;

public class Lion extends Animal {

    public Lion(String favouriteFood) {
        super(favouriteFood);
    }

    @Override
    public String makeNoise()
    {
        return "ROAR!!!";
    }

}
