package yourturn4;

public class Car {
    private String model;
    private String licensePlate;

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((licensePlate == null) ? 0 : licensePlate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (model == null)
        {
            if (other.model != null)
                return false;
        }
        else if (!model.equals(other.model))
            return false;
        if (licensePlate == null)
        {
            if (other.licensePlate != null)
                return false;
        }
        else if (!licensePlate.equals(other.licensePlate))
            return false;
        return true;
    }

}