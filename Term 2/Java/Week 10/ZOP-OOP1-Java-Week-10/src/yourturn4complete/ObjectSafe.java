package yourturn4complete;

public class ObjectSafe<T> {
    Object object;
    int password;

    public ObjectSafe(Object object, int password) {
        this.object = object;
        this.password = password;
    }

    public T retrieveObject(int code)
    {
        if (code == password)
        {
            return (T) object;
        }
        return null;
    }
}
