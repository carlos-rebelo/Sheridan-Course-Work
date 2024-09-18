package yourturn2complete;

import java.util.ArrayList;

import javafx.scene.control.skin.TextInputControlSkin.Direction;

/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class WeatherStation {
    private String location;
    private WindMeasurementDevice windGuage;
    private ArrayList<WindData> windReadings = new ArrayList<>();

    public WeatherStation(String location, WindMeasurementDevice windGuage) {
        this.location = location;
        this.windGuage = windGuage;
    }

    public WindData getWindReading()
    {
        WindData wind = this.windGuage.getWindData();
        windReadings.add(wind);
        return wind;
    }

    public String getWindReport()
    {
        String report = "------Wind Report---------";
        report += "\nDirection       Speed\n";
        for (WindData windData : windReadings)
        {
            report += windData.getWindDirection() + "\t\t\t" + windData.getWindSpeed() + "\n";
        }
        return report;
    }

}
