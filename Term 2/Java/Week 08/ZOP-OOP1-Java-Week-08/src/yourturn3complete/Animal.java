package yourturn3complete;

public abstract class Animal {
    protected String name;
    protected int numLegs;
    protected String favFood;

    public Animal(String name, int numLegs, String favFood) {
        this.name = name;
        this.numLegs = numLegs;
        this.favFood = favFood;
    }

    public String getName()
    {
        return name;
    }

    public int getNumLegs()
    {
        return numLegs;
    }

    public String getFavFood()
    {
        return favFood;
    }

    public void eat()
    {
        System.out.println(name + " is eating");
    }

    public abstract void makeNoise();

    @Override
    public String toString()
    {
        return "[" + this.name + "]";
    }

}
