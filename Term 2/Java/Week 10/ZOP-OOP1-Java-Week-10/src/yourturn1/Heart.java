package yourturn1;

public class Heart {
    private int bpm;
    private HeartBeat heartBeat;

    public Heart(int bpm, HeartBeat heartBeat) {
        this.bpm = bpm;
        this.heartBeat = heartBeat;
    }
    public void pump() {
        for (int i = 0; i < bpm;i++) {
            System.out.println(heartBeat.getValue());
        }
    }
    public HeartBeat getHeartBeat() {
        return heartBeat;
    }
    public void setHeartBeat(HeartBeat heartBeat) {
        this.heartBeat = heartBeat;
    }
}
