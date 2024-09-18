package coolarraylist;

public class Car {
    private String colour;
    private String licensePlate;

    public Car(String colour, String licensePlate) {
        this.colour = colour;
        this.licensePlate = licensePlate;
    }

    public String getColour()
    {
        return colour;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }

    @Override
    public String toString()
    {
        return "Car [colour=" + colour + ", licensePlate=" + licensePlate + "]";
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((colour == null) ? 0 : colour.hashCode());
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
        if (colour == null)
        {
            if (other.colour != null)
                return false;
        }
        else if (!colour.equals(other.colour))
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
