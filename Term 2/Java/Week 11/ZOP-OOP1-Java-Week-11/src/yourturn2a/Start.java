package yourturn2a;

public class Start {
    public static void main(String[] args)
    {
        Horn h1 = new Horn();
        h1.honk();
        //Make Horn implement Honkable and show it working
        Honkable h2 = new Honkable() {
            public void honk() {
                System.out.println("Beep beep!");
            }
        };
        //use an inner-anonymous class to honk
        Honkable h3 = () -> {System.out.println("Meep meep!");};
        //Use  a lambda expression to honk
        h2.honk();
        h3.honk();

    }
}
