package coolarraylistcomplete;

public class CoolArrayList {

    private int size;
    private Car[] cars = new Car[3];

    public void add(Car car)
    {
        if (cars.length == size)
        {
            cars = buildLargerArray();
        }
        cars[size] = car;
        size++;
    }

    private Car[] buildLargerArray()
    {
        Car[] tempCars = new Car[size + 3];
        for (int i = 0; i < size; i++)
        {
            tempCars[i] = cars[i];
        }
        return tempCars;
    }

    public int size()
    {
        return size;
    }

    public Car get(int index)
    {
        return cars[index];
    }

    public int indexOf(Car car)
    {
        for (int i = 0; i < size; i++)
        {
            if (car.equals(cars[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Car car)
    {
        return !(indexOf(car) == -1);
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

}
