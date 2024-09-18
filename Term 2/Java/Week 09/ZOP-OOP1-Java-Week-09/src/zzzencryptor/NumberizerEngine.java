package zzzencryptor;

public class NumberizerEngine implements Encryptor {

    @Override
    public String encrypt(String sentence)
    {
        String encryptedSentence = "";
        for (int i = 0; i < sentence.length(); i++)
        {
            encryptedSentence += (int) sentence.charAt(i) + ",";
        }
        return encryptedSentence;
    }

    @Override
    public String decrypt(String sentence)
    {
        String decryptedSentence = "";
        String[] tempSentence = sentence.split(",");
        for (int i = 0; i < tempSentence.length; i++)
        {
            decryptedSentence += (char) (Integer.parseInt(tempSentence[i]));
        }
        return decryptedSentence;
    }

}
