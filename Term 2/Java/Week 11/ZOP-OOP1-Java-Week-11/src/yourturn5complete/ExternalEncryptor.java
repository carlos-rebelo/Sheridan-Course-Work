package yourturn5complete;

public class ExternalEncryptor implements Encryptinator {

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

}
