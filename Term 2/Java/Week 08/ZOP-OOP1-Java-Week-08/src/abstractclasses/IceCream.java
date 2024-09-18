package abstractclasses;

public class IceCream extends Food{

    public IceCream(int temperature) {
        super(temperature);
    }

    public void prepare() {
        System.out.println("Process sugar");
    }
}
