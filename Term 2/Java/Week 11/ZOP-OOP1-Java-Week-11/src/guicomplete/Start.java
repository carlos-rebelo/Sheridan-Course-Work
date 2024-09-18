package guicomplete;

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

        button1.setOnMouseClicked(new MyButtonEventHandler1());

        button2.setOnMouseClicked(new MyButtonEventHandler2());

        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event)
            {
                System.out.println("Button 3 clicked and is being handled by  our anonymous inner class...");
            }
        });

        button4.setOnMouseClicked((e) -> {
            System.out.println("Button 4 clicked and is being handled by our lambda expression");
        });

    }

    static class MyButtonEventHandler2 implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent event)
        {
            System.out
                    .println("Button 2 clicked and is being handled by by our innerclass called MyButtonEventHandler2");
        }
    }
}
