package abstractclasses;

public class Pizza extends Food{
    public Pizza(int temperature) {
        super(temperature);
    }
    @Override
    public void prepare() {
        System.out.println("Roll the dough, throw over head, put on toppings, bake");
    }
}
