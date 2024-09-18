package trycatch;

public class Start {

    public static void main(String[] args) throws Exception
    {
        LearnExceptions obj1 = new LearnExceptions();
        try {
            String record = obj1.riskyMethodCallingADatabase(); //hmmm..what if this method throws an Exception?  We need to protect this call!
            System.out.println(record);

        } catch(Exception a) {
            System.out.println(a.getLocalizedMessage());
        }
        

        //make sure you understand the flow of control within the try, the catch, and after the catch runs
    }
}
