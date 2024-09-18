package yourturn2;

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

}
