package coolarraylistwithgenricscomplete;

public class CoolArrayList<T> {

    private int size;
    private Object[] objects = new Object[3];

    public void add(T object)
    {
        if (objects.length == size)
        {
            objects = buildLargerArray();
        }
        objects[size] = object;
        size++;
    }

    private Object[] buildLargerArray()
    {
        Object[] tempElement = new Object[size + 3];
        for (int i = 0; i < size; i++)
        {
            tempElement[i] = objects[i];
        }
        return tempElement;
    }

    public int size()
    {
        return size;
    }

    public T get(int index)
    {
        return ((T) objects[index]);
    }

    public int indexOf(T element)
    {
        for (int i = 0; i < size; i++)
        {
            if (element.equals(objects[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element)
    {
        return !(indexOf(element) == -1);
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

}
