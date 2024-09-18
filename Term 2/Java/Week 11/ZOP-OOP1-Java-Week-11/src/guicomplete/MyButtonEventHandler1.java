package guicomplete;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MyButtonEventHandler1 implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent event)
    {
        System.out.println("Button 1 clicked and is being handled by the event handler in a it's own file");
    }
}
