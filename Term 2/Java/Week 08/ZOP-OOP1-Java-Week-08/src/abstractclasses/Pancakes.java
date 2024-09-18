package abstractclasses;

public class Pancakes extends Food {
    public Pancakes(int temperature) {
        super(temperature);
    }
    @Override
    public void prepare() {
        System.out.println("Mix batter, lick spoon, pour on grill");
    }
}
