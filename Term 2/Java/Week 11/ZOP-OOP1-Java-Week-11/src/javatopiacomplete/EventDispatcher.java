package javatopiacomplete;

import java.util.ArrayList;

public class EventDispatcher {

    private ArrayList<BreadEventListener> registeredListners = new ArrayList<>();

    public void registerEventListener(BreadEventListener listener)
    {
        registeredListners.add(listener);
    }

    public void receiveTodaysBreadList()
    {
        System.out.println("The Little girl packages the breadlist into an orderform object");
        EventObject eventObject = new EventObject();

        System.out.println("The little girl sends an event to all registered listeners, telling them that the bread is ready, and including the orderform object");

        for (BreadEventListener breadEventListener : registeredListners)
        {
            breadEventListener.handleBreadEvent(eventObject);
        }
    }

}
