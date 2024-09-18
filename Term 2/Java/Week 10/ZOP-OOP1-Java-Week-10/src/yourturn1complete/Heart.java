package yourturn1complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Heart
{
    private int bpm;
    private HeartBeat heartbeat;

    public Heart (int bpm, HeartBeat heartbeat)
    {
        this.bpm = bpm;
        this.heartbeat = heartbeat;
    }

    public int getBpm ()
    {
        return bpm;
    }

    public void setBpm (int bpm)
    {
        this.bpm = bpm;
    }

    public void pump ()
    {
        for (int beats = 0; beats < this.bpm; beats++) {
            System.out.print(this.heartbeat + "...");
        }
        System.out.println();
    }
}
