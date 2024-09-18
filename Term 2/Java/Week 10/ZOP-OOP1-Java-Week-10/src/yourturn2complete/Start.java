package yourturn2complete;

public class Start {

    /* ⁡⁣⁢⁢INSTRUCTIONS:  =>⁡
     * You have been asked to write code for a Weather Station
     * One of the instruments you've been asked to gather data from is a WindData instrument.  Unfortunately, the boffins in the hardward department haven't yet built a physical WindData instrument so we are going to have to simulate it in code.
     * 
     * However, once the WindData instrument is ready, we want to be able to swap out our simulated WindData instrument with the real thing with a minimum of effort.
     * 
     * hmmmm....sounds like the Dependency Inversion priniciple can help us!
     * 
     * 
     * ⁡⁢⁣⁢Part A:⁡
     * 
     * Our WindGauge instrument will return both wind speed and wind direction so we'll have to build a WindData class that contains windSpeed (0-80 kph), and WindDirecetion (0-360).  We should probably add a constructor so that we can use constructor injection (a fancy way of saying that we can use the constructor to add set both values in our object) and some getters and, while we're at it, let's add in a toString method and correctly override the equals method and the hashCode methods as well.  Finally, we should protect our object from receiving any bad data (ie, windspeed of -11 or wind direction of 454 degrees.) by throwing an exception for bad data.
     * 
     * ⁡⁢⁣⁢PART B:⁡
     * 
     * Next, we want to write a class called WindGaugeSimulator that will represent our physical WindGauge that isn't yet ready to deploy.  This way, we can write all of our other code without having to wait for the hardware guys to finish it.
     * 
     * In order to make sure we don't have to change much code, we're going to use Dependency Inverstion.
     * 
     * You have been given an Interface called WindMeasurementDevice that contains a method header called getWindData that accepts nothing and returns a WinData object.
     * 
     * Now, make our WindGaugeSimulator implement WindMeasurementDevice.
     * 
     * Go ahead and implement the getWindData method.  Since this is just a simulation of the real device, we'll return a WindData object with random but valid data. (ie, windSpeed between 0-80 and WindDirection between 0-360) Use the Random class to generate this data.
     * 
     *  ⁡⁢⁣⁢PART C:⁡
     * Next, let's write a WeatherStation Class that contains a String representing the location of the WeatherStation (for example, "Brampton"), and that holds a reference to the WindMeasurementDevice interface, along with an ArrayList <WindData> (callled windReadings) to store any readings we get from the WindMeasurementDevice.  Have the constructor accept both a location for the WeatherStation and a WindMeasurementDevice reference variable.
     * 
     * WeatherStation should have a method called getWindReading that will call the getWindData method of the WindGaugeSimulator and store the WindData object that comes back in the windReadings ArrayList. This method will accept nothing, will return a WindData object and will save that same WindData object bin the windReadings ArrayList
     * 
     * WeatherStation should also have a method called getWindReport that will return a String containing a report of all of the wind readings collected so far.
     * 
     * ⁡⁢⁣⁢PART D:⁡
     * 
     * Now, we just need to write a Start class with a main method that will instantiate a WindGaugeSimulator and pass it, along with a location to the constructor of the WeatherStation which you will instantiate.
     * Next, call the getWindReading from WeatherStation 10 times
     * 
     * Finally, ask the WeatherStation object to give you a wind report and print it out.  Here is a sample output
    ------Wind Report---------
    Direction       Speed
    57			            27
    92			            43
    173			            7
    271			            48
    359			            25
    137			            47
    248			            46
    231			            46
    145			            3
    97			            28
     * 
     */

    public static void main(String[] args)
    {
        WeatherStation station = new WeatherStation("Toronto", new WindGuageSimulator());
        for (int i = 0; i < 10; i++)
        {
            System.out.println(station.getWindReading().getWindSpeed());
        }
        System.out.println(station.getWindReport());
    }
}
