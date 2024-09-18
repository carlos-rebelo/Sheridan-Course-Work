package makingourowngeneric;

public class Dinosaur {
    private String name;

    public Dinosaur(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

}
