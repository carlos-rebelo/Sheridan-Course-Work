package innerclasses;

public class Car {

    public void startEngine()
    {
        System.out.println("Vrrrrrooom!");
    }

    public static class Horn {

        public void honk()
        {
            System.out.println("honk");
        }
    }
}
