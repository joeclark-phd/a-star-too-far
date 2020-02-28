package net.joeclark.astartoofar;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("A Star Too Far");
        stage.setHeight(480);
        stage.setWidth(640);
        stage.setMaximized(true);

        Parent root = FXMLLoader.load(getClass().getResource("/scenes/splashpage.fxml"));
        Scene scene = new Scene(root);

        Parent menu = FXMLLoader.load(getClass().getResource("/scenes/mainmenu.fxml"));
        Scene mainmenu = new Scene(menu);

        scene.setOnKeyReleased(keyEvent -> stage.setScene(mainmenu));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}