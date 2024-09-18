package yourturn4;

public class Start {
    public static void main(String[] args)
    {
        AlarmController alarm = new AlarmController();
        alarm.start();

        //Take a look at the code in this package and think through how it works.  This code contains an AlarmController which is receiving feedback from various sensors throughout the house.  AlarmController has a registerEventHandler method.  Notice this method requires both an AlarmEventHandler and also what kind of event to listen for.

        //your job is to register event handlers for COLDTEMPDETECTED and for RICHISHUNGYDETECTED

        //Below is some sample output.  Yours will be different as the events are generater randomly.  However, notice that cold temps and Rich is hungry events have been handled!

        /*      ⁡⁣⁢⁢Sample output⁡: 
        MOTIONDETECTED detected - sending alarm event to all listeners for that alarm event type
        MOTIONDETECTED detected - sending alarm event to all listeners for that alarm event type
        SMOKEDETECTED detected - sending alarm event to all listeners for that alarm event type
        WATERDETECTED detected - sending alarm event to all listeners for that alarm event type
        COLDTEMPDETECTED detected - sending alarm event to all listeners for that alarm event type
        ***Handling:  COLDTEMPDETECTED
        COLDTEMPDETECTED detected - sending alarm event to all listeners for that alarm event type
        ***Handling:  COLDTEMPDETECTED
        MOTIONDETECTED detected - sending alarm event to all listeners for that alarm event type
        RICHISHUNGRYDETECTED detected - sending alarm event to all listeners for that alarm event type
        ***Feeding Rich!
        SMOKEDETECTED detected - sending alarm event to all listeners for that alarm event type
        SMOKEDETECTED detected - sending alarm event to all listeners for that alarm event type
        
        */
    }
}
