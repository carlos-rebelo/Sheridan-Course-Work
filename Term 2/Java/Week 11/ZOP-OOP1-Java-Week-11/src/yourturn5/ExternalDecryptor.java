package yourturn5;

public class ExternalDecryptor implements Decryptinator {

    @Override
    public String decrypt(String message)
    {
        String decryptedMesage = "";
        for (int i = 0; i < message.length(); i++)
        {
            decryptedMesage += (char) (message.charAt(i) - 1);
        }
        return decryptedMesage;
    }

}
