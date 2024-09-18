package yourturn4complete;

public class Start {
    public static void main(String[] args)
    {
        AlarmController alarm = new AlarmController();
        alarm.start();

        AlarmHandler handler = new AlarmHandler() {

            @Override
            public void handleAlarm(AlarmEvent alarmEvent)
            {
                System.out.println("***Handling:  " + alarmEvent.getAlarmEventType());
            }
        };

        alarm.registerEventHandler(AlarmEventType.COLDTEMPDETECTED, handler);

        alarm.registerEventHandler(AlarmEventType.RICHISHUNGRYDETECTED, e -> System.out.println("***Feeding Rich!"));

    }
}
