package abstractclassescomplete;

public class Pizza extends Food {

    public Pizza() {
        super(75);
    }

    @Override
    public void prepare()
    {
        System.out.println("Throwing pizza dough over my head and twirling it");
    }
}
