package abstractclassescomplete;

public class Pancakes extends Food {

    public Pancakes() {
        super(50);

    }

    @Override
    public void prepare()
    {
        System.out.println("mixing up the batter and pouring onto a skillet");
    }

}
