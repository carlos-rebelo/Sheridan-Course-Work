package yourturn4;

public class AlarmEvent {
    private AlarmEventType alarmEventType;

    public AlarmEvent(AlarmEventType alarmEventType) {
        this.alarmEventType = alarmEventType;
    }

    public AlarmEventType getAlarmEventType()
    {
        return alarmEventType;
    }

}