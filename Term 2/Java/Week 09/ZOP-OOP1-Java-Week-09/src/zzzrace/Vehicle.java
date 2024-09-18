package zzzrace;

public abstract class Vehicle {
    protected int numTires;
    protected int speed;
    protected String licensePlate;

    public Vehicle(int numTires, int speed, String licensePlate) {
        this.numTires = numTires;
        this.speed = speed;
        this.licensePlate = licensePlate;
    }

    public abstract void honk();

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + numTires;
        result = prime * result + speed;
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
        Vehicle other = (Vehicle) obj;
        if (numTires != other.numTires)
            return false;
        if (speed != other.speed)
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
