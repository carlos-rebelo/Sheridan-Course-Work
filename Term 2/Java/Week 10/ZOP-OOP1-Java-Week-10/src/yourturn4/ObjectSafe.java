package yourturn4;

public class ObjectSafe <T> {
    private T storedObject;
    private int passwrd;

    public ObjectSafe(T storedObject, int passwrd) {
        this.storedObject = storedObject;
        this.passwrd = passwrd;
    }

    public T retrieveObject(int password) throws Exception{
        if (this.passwrd != password) {
            throw new Exception("Wrong Password");
        }
        return storedObject;
        
    }
}
