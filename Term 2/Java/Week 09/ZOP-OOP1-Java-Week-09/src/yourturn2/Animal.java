package yourturn2;

public abstract class Animal {

    public String getAnimalType()
    {
        String[] returnString = this.getClass().toString().split("\\.");
        return returnString[1];
    }

    public abstract String makeNoise();

}
