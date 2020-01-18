package net.joeclark.astartoofar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("hello");
        stage.setHeight(500);
        stage.setWidth(500);

        VBox vBox = new VBox();
        Label label = new Label("Hello world!");
        vBox.getChildren().addAll(label);
        Scene scene = new Scene(vBox);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}