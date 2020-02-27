package net.joeclark.astartoofar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("A Star Too Far");
        stage.setHeight(480);
        stage.setWidth(640);
        stage.setMaximized(true);

        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: #000000");
        Label label = new Label("Hello world!");
        label.setStyle("-fx-text-fill: #FFFFFF");
        vBox.getChildren().addAll(label);
        Scene scene = new Scene(vBox);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}