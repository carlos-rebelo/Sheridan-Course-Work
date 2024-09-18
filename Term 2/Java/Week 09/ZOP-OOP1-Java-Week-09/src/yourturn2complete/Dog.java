package yourturn2complete;

public class Dog extends Animal {

    public Dog(String favouriteFood) {
        super(favouriteFood);
    }

    @Override
    public String makeNoise()
    {
        return "bark bark bark!";
    }

}
