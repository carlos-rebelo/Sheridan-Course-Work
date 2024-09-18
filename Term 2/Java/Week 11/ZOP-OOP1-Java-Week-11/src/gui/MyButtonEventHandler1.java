package gui;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

//We want out ButtonHandler to get notified if the button is clicked so we must implement EventHandler<MouseEvent>

public class MyButtonEventHandler1 implements EventHandler <MouseEvent> {

    @Override
    public void handle(MouseEvent event) {
        System.out.println("Yay! button 1 got clicked and was handled in the external class called MyButtonEventHandler1");
    }

    
    
}
