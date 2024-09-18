package zzzencryptor;

public class EnigmaMachine {
    protected Encryptor encryptorEngine;

    public EnigmaMachine(Encryptor encryptorEngine) {
        this.encryptorEngine = encryptorEngine;
    }

    public String encryptMessage(String message)
    {
        return encryptorEngine.encrypt(message);
    }

    public String decryptMessage(String message)
    {
        return encryptorEngine.decrypt(message);
    }

}
