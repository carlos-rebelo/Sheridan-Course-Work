package yourturn2complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class WindData {
    private int windSpeed;
    private int windDirection;

    public WindData(int windSpeed, int windDirection) {
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public int getWindSpeed()
    {
        return windSpeed;
    }

    public int getWindDirection()
    {
        return windDirection;
    }

}
