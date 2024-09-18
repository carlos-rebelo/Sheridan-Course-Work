package yourturn2complete;

import java.util.Random;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class WindGuageSimulator implements WindMeasurementDevice {

    public WindData getWindData()
    {
        Random rnd = new Random();
        WindData windInfo = new WindData(rnd.nextInt(50), rnd.nextInt(360));
        return windInfo;
    }
}
