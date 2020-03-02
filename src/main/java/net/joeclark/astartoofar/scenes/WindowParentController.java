package net.joeclark.astartoofar.scenes;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import net.joeclark.astartoofar.App;

import java.net.URL;
import java.util.ResourceBundle;

public class WindowParentController implements Initializable {

    @FXML
    private HBox windowhandle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private double xOffset = 0;
    private double yOffset = 0;


    public void handlePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }
    public void handleDragged(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
        stage.setOpacity(0.8f);
    }
    public void handleReleased(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setOpacity(1.0f);
    }
    public void handleDragDone(MouseEvent event) {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setOpacity(1.0f);
    }
}
