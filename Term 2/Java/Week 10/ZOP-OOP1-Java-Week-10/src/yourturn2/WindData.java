package yourturn2;

public class WindData{
    private int windSpeed;
    private int windDirection;
    public WindData(int windSpeed, int windDirection) throws Exception {
        setWindSpeed(windSpeed);
        this.windDirection = windDirection;
    }
    public int getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(int windSpeed) throws Exception{
        if (windSpeed > 80 || windSpeed < 0) {
            throw new Exception("Error: wind speed must be between 0 and 80");
        }
        else {
            this.windSpeed = windSpeed;
        }
    }
    public int getWindDirection() {
        return windDirection;
    }
    public void setWindDirection(int windDirection) throws Exception{
        if (windDirection > 360 || windDirection < 0) {
            throw new Exception("Error: wind direction must be between 0 and 360");
        }
        else {
            this.windDirection = windDirection;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + windSpeed;
        result = prime * result + windDirection;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WindData other = (WindData) obj;
        if (windSpeed != other.windSpeed)
            return false;
        if (windDirection != other.windDirection)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "WindData [windSpeed=" + windSpeed + ", windDirection=" + windDirection + "]";
    }
    
    
}
