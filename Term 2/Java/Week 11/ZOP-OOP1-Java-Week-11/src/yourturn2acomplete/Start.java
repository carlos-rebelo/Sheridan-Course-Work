package yourturn2acomplete;

public class Start {
    public static void main(String[] args)
    {

        //Make Horn implement Honkable and show it working

        Horn horn = new Horn();
        horn.honk();

        //use an inner-anonymous class to honk

        Honkable h3 = new Honkable() {
            @Override
            public void honk()
            {
                System.out.println("beep beep");
            }
        };
        h3.honk();

        //Use  a lambda expression to honk

        Honkable h4 = () -> System.out.println("meep meep");
        h4.honk();

    }
}
