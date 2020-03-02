package net.joeclark.astartoofar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("A Star Too Far");
        stage.setHeight(480);
        stage.setWidth(640);

        // UI root nodes
        Parent splashpage = FXMLLoader.load(getClass().getResource("/scenes/splashpage.fxml"));
        Parent mainmenu = FXMLLoader.load(getClass().getResource("/scenes/mainmenu.fxml"));

        Scene scene = new Scene(splashpage);

        scene.setOnKeyReleased(keyEvent -> scene.setRoot(mainmenu));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}