package gui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Start extends Application {
    public static void main(String[] args) throws Exception
    {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception
    {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        VBox layout = new VBox(20, button1, button2, button3, button4);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        //Let's build a MyButtonEventHandler1 class to handle button1 - Remember that we must implement EventHandler <MouseEvent> in order to register it.
        //the method to register an event handler (listener) for a button with JavaFX is setOnMouseClicked

        //OK, now let's hook it up!

        button1.setOnMouseClicked(new MyButtonEventHandler1());

        //Ok!  So that worked well!  Here's the problem:  What if we have 50 buttons in our app.  Do we need to write 50 separate Event handler classes?
        //Fortunately, there is an easier way.  Let's build an inner class called MyButtonEventHandler2 to handle button2 - remember that our inner class is package protected, not public
        /*Hint:
         * class MyButtonEventHandler2 implements EventHandler<MouseEvent> {
        
        @Override
        public void handle(MouseEvent event) {
            System.out
                    .println("Button 2 clicked and is being handled by by our innerclass called MyButtonEventHandler2");
        }
        }
         */

        //now, let's hook it up
        /*Hint:
        
         */
        button2.setOnMouseClicked(new MyButtonEventHandler2());
        //We can do even better...Next, we'll handle button3 with an inner-anonymous class
        /*Hint:
         
         */

        //Finally, let's use a lambda expression to handle button4 - Lambdas are powerful, but need to be respected
        /*Hint:
          button4.setOnMouseClicked((e) -> {
            System.out.println("Button 4 clicked and is being handled by our lambda expression");
        });
         */
        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Button 3 clicked and is being handled by  our anonymous inner class...");
            }
        });
    }
    public class MyButtonEventHandler2 implements EventHandler <MouseEvent>{

        @Override
        public void handle(MouseEvent event) {
            System.out.println("Yay! button 2 got clicked and was handled in the external class called MyButtonEventHandler2");
        }

    }
}
