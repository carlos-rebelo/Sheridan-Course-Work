package yourturn5;

public class Start {
    public static void main(String[] args)
    {
        //You have been given ExternalEncryptor and ExternalDecryptor.  Mess around with it to see how it works
        ExternalEncryptor e1 = new ExternalEncryptor();
        String secretMessage = e1.encrypt("Have a great day!");
        System.out.println(secretMessage);

        ExternalDecryptor d1 = new ExternalDecryptor();
        secretMessage = d1.decrypt(secretMessage);
        System.out.println(secretMessage);

        //Write an inner anonymous class to do the same work as our ExternalEncryptor and another inner anonymous class to do the work of our ExternalDecyrptor.  Prove that your code works

        //Finally, write two lamba expressions to encryt and decrypt our message.  Be aware that our code will require more than one line!!!  We can make our lambda work with multiple lines!

    }
}
