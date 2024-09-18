package abstractclassescomplete;

public class IceCream extends Food {

    public IceCream() {
        super(-5);
    }

    @Override
    public void prepare()
    {
        System.out.println("Deepfrying onion rings");
    }

}
