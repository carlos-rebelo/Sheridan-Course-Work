package yourturn1complete;

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
        Button panicButton = new Button("PANIC BUTTON");
        VBox layout = new VBox(20, panicButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        //⁡⁣⁢⁢PART A⁡ : 
        // Go ahead and run the code below and click on the Panic Button

        MyButtonEventHandler1 eventHandler1 = new MyButtonEventHandler1();
        panicButton.setOnMouseClicked(eventHandler1);

        //By looking at the two lines above and the MyButtonEventHandler1() class, can you build an anonymous inner class that will print out Don't Worry, Be Happy when we click on the button?

        // panicButton.setOnMouseClicked(new EventHandler<MouseEvent>() {

        //     @Override
        //     public void handle(MouseEvent event)
        //     {
        //         System.out.println("Don't Worry, Be HAPPY!");
        //     }
        // });

        //⁡⁣⁢⁢Part B:⁡ 
        //for the super-smartypants:  Can you turn that anonymous inner class into a one line lambda expression?

        // panicButton.setOnMouseClicked((e) -> System.out.println("Don't worry!  Be happy!"));

    }

}
