package yourturn4;

import java.util.ArrayList;
import java.util.Random;

public class AlarmController extends Thread {

    private ArrayList<EventListener> listeners = new ArrayList<>();

    public void registerEventHandler(AlarmEventType alarmEventType, AlarmHandler alarmHandler)
    {
        listeners.add(new EventListener(alarmEventType, alarmHandler));
    }

    private void dispatchEvent(AlarmEventType alarmEventType)
    {
        System.out.println(alarmEventType + " detected - sending alarm event to all listeners for that alarm event type");
        AlarmEvent alarmEvent = new AlarmEvent(alarmEventType);
        for (EventListener eventListener : listeners)
        {
            if (eventListener.getAlarmEventType() == alarmEventType)
            {
                eventListener.getHandler().handleAlarm(alarmEvent);
            }
        }
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Random rnd = new Random();
            AlarmEventType alarmEventType = (AlarmEventType.values()[rnd.nextInt(AlarmEventType.values().length)]);
            dispatchEvent(alarmEventType);
        }
    }

    class EventListener {
        private AlarmEventType alarmEventType;
        private AlarmHandler handler;

        public EventListener(AlarmEventType alarmEventType, AlarmHandler handler) {
            this.alarmEventType = alarmEventType;
            this.handler = handler;
        }

        public AlarmEventType getAlarmEventType()
        {
            return alarmEventType;
        }

        public AlarmHandler getHandler()
        {
            return handler;
        }

    }
}
