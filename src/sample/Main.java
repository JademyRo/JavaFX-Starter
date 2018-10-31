package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Start method");

        BorderPane root = new BorderPane();
        primaryStage.setTitle("Hello World");

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    @Override
    public void init() {
        System.out.println("Init method");
    }

    @Override
    public void stop() {
        System.out.println("Stop method");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
