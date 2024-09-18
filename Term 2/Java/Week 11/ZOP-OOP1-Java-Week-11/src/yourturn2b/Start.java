package yourturn2b;

public class Start {
    public static void main(String[] args)
    {
        EchoHandler e1 =new EchoHandler();
        System.out.println(e1.echo("Hello"));

        InnerEchoHandler e2 = new InnerEchoHandler();
        System.out.println(e2.echo("null"));
        EchoMaker e3 = new EchoMaker() {
            public String echo(String phrase) {
                return phrase+"..."+phrase+"..."+phrase;
            }
        };
        System.out.println(e3.echo("Pizza"));

        EchoMaker e4 = (phrase) -> phrase+"..."+phrase+"..."+phrase;
        System.out.println(e4.echo("Lol"));

        /*  Instructions :
         * 
         * Part A:  Build a class called EchoHandler that implements EchoMaker.  The method 'echo' should accept a String and return a String containing the original String 3 times.  For example, "Hello" becomes "Hello...Hello...Hello".  Test your code
         * 
         * Part B:  Now, write an inner class called InnerEchoHandler that does the exact same thing.  Test your code
         * 
         * Part C:  Now, write an inner anonymous class that does the same thing and prove that it works!
         * 
         * Part C:  Finally, Build a Lambda expression to do the same thing and show that it works
         * 
         */

    }
    public static class InnerEchoHandler implements EchoMaker{

        @Override
        public String echo(String phrase) {
            return phrase+"..."+phrase+"..."+phrase;
        }

    }
}
