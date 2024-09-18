package yourturn3a;

public abstract class Animal {
    protected String name;
    private int numLegs;
    private String favFood;

    public Animal(String name, int numLegs, String favFood) {
        this.name = name;
        this.numLegs = numLegs;
        this.favFood = favFood;
    }

    public void eat() {
        System.out.println(name+" is eating "+favFood);
    }
    public abstract void makeNoise();

    @Override
    public String toString() {
        return name+" has "+numLegs+" legs and loves "+favFood;
    }
}
