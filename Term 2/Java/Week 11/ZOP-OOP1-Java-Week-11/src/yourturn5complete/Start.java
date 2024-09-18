package yourturn5complete;

public class Start {
    public static void main(String[] args)
    {
        ExternalEncryptor e1 = new ExternalEncryptor();
        String secretMessage = e1.encrypt("Have a great day!");
        System.out.println(secretMessage);

        ExternalDecryptor d1 = new ExternalDecryptor();
        secretMessage = d1.decrypt(secretMessage);
        System.out.println(secretMessage);

        //Write an inner anonymous class to do the same work as our ExternalEncryptor and another inner anonymous class to do the work of our ExternalDecyrptor.  Prove that your code works

        Encryptinator e2 = new Encryptinator() {

            @Override
            public String encrypt(String message)
            {
                String encryptedMessage = "";
                for (int i = 0; i < message.length(); i++)
                {
                    encryptedMessage += (char) (message.charAt(i) + 1);
                }
                return encryptedMessage;
            }
        };

        Decryptinator d2 = new Decryptinator() {

            @Override
            public String decrypt(String message)
            {
                String encryptedMessage = "";
                for (int i = 0; i < message.length(); i++)
                {
                    encryptedMessage += (char) (message.charAt(i) - 1);
                }
                return encryptedMessage;
            }
        };

        secretMessage = e2.encrypt(secretMessage);
        System.out.println(secretMessage);
        secretMessage = d2.decrypt(secretMessage);
        System.out.println(secretMessage);

        //Finally, write two lamba expressions to encryt and decrypt our message.  Be aware that our code will require more than one line!!!  We can make our lambda work with multiple lines!

        Encryptinator e3 = (secret) -> {
            String encryptedMessage = "";
            for (int i = 0; i < secret.length(); i++)
            {
                encryptedMessage += (char) (secret.charAt(i) + 1);
            }
            return encryptedMessage;
        };

        Decryptinator d3 = (secret) -> {
            String decryptedMessage = "";
            for (int i = 0; i < secret.length(); i++)
            {
                decryptedMessage += (char) (secret.charAt(i) - 1);
            }
            return decryptedMessage;
        };

        secretMessage = e3.encrypt(secretMessage);
        System.out.println(secretMessage);
        System.out.println(d3.decrypt(secretMessage));

    }
}
