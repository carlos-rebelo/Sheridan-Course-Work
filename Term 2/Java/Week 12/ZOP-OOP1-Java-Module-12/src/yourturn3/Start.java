package yourturn3;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args)
    {

        /*  ⁡⁣⁢⁢Instructions⁡:
         * 
            Write PizzaOrder and MamaPizza so that the code below results in the following output:
            PizzaOrder [orderNumber=1, size=LARGE, toppings=[CHEESE, PINEAPPLE, ONIONS]]
                3
                2
         */
        PizzaOrder p1 = new PizzaOrder(Size.LARGE);
        p1.addTopping(ToppingType.CHEESE);
        p1.addTopping(ToppingType.PINEAPPLE);
        p1.addTopping(ToppingType.ROASTEDTOMATOS);
        p1.addTopping(ToppingType.ONIONS);
        PizzaOrder p2 = new PizzaOrder(Size.LARGE);
        p2.addTopping(ToppingType.CHEESE);
        p2.addTopping(ToppingType.PINEAPPLE);
        p2.addTopping(ToppingType.ONIONS);
        PizzaOrder p3 = new PizzaOrder(Size.LARGE);
        p3.addTopping(ToppingType.CHEESE);
        p3.addTopping(ToppingType.PINEAPPLE);

        MamasPizza mamas = new MamasPizza();
        mamas.addOrder(p1);
        mamas.addOrder(p2);
        mamas.addOrder(p3);

        System.out.println(mamas.getOrderByOrderNumber(1));

        //For Supersmartypants only!  Can you write a method to return how many times a particular ToppingType has been ordered?
        System.out.println("SuperSmartyPantsOnly");
        // System.out.println(mamas.howManyToppingsOrdered(ToppingType.PINEAPPLE));
        // System.out.println(mamas.howManyToppingsOrdered(ToppingType.ONIONS));

    }
}
