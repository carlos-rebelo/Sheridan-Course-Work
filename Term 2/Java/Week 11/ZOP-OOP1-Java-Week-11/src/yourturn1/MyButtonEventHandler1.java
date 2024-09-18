package yourturn1;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MyButtonEventHandler1 implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent event)
    {
        System.out.println("Can you build this as an anonymous class?");
    }
}