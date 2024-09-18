package yourturn2complete;

public class ParkingSpace {
    private String license;
    protected int numHoursParked;

    public ParkingSpace(String license) {
        this.license = license;
    }

    public String getLicense()
    {
        return license;
    }

    public int getNumHoursParked()
    {
        return numHoursParked;
    }

    public void setNumHoursParked(int numHoursParked)
    {
        this.numHoursParked = numHoursParked;
    }

    @Override
    public String toString()
    {
        return "License=" + license + "\t Hours Parked=" + numHoursParked;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((license == null) ? 0 : license.hashCode());
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
        ParkingSpace other = (ParkingSpace) obj;
        if (license == null)
        {
            if (other.license != null)
                return false;
        }
        else if (!license.equals(other.license))
            return false;
        return true;
    }

}
