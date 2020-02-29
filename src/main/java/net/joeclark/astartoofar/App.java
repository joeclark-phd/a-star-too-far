package net.joeclark.astartoofar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


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

        scene.setOnKeyReleased(keyEvent -> scene.setRoot(menu));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}