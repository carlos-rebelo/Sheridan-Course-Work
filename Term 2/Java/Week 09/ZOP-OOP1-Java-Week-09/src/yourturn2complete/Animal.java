package yourturn2complete;

public abstract class Animal {

    private String favouriteFood;

    public Animal(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood()
    {
        return favouriteFood;
    }

    public String getAnimalType()
    {
        String[] returnString = this.getClass().toString().split("\\.");
        return returnString[1];
    }

    public abstract String makeNoise();

}
