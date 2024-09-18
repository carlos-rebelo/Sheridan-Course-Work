package abstractclassescomplete;

public class Start {
    public static void main(String[] args)
    {
        Food f1 = new Food(25);
        f1.eat();
        f1.prepare();

        //Let's make Pizza and Pancakes inherit from food

        // Pizza pizza = new Pizza();
        // pizza.prepare();
        // pizza.eat();
        // System.out.println(pizza);

        // Pancakes pancakes = new Pancakes();
        // pancakes.prepare();
        // pancakes.eat();
        // System.out.println(pancakes);

        // IceCream icecream = new IceCream();
        // icecream.prepare();
        // icecream.eat();
        // System.out.println(icecream);

        ///hmmmm....the way we prepare a pizza is different than preparing pancakes, isn't it?  Let's override our prepare in both these classes!

        //So, I have a question:  I can order a pizza, right?  And I can order a pancake.  But, can I order a Food?  That doesn't really make sense, does it?  What is a food?  We still want Food to be the parent class so we can easily inherit the code from it but we don't really want a programmer to be able to instantiate our Food class into an object.

        //turns out we can do this with one word...Abstract

        //Now, we've overriden the prepare method in Pizza and Pancakes.  What if we wanted to force every child of Food to implement their own prepare method?  In fact, we can!

        //Let's change our prepare method in Food to be abstract.  Now, let's build an IceCream object that inherits from Food. Aha!!! The compiler won't let us inherit from Food unless we implement the prepare method!

    }
}
