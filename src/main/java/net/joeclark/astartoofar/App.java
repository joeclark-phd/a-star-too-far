package net.joeclark.astartoofar;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

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



        Label label = new Label("Hello world!");
        label.setStyle("-fx-text-fill: #ff0000");



        Sphere star = new Sphere(45);
        Sphere earth = new Sphere(25);
        Sphere moon = new Sphere(10);

        Ellipse ellipseEarth = new Ellipse();
        ellipseEarth.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 250);
        ellipseEarth.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 125);

        PathTransition transitionEarth = new PathTransition();
        transitionEarth.setPath(ellipseEarth);
        transitionEarth.setNode(earth);
        transitionEarth.setInterpolator(Interpolator.LINEAR);
        transitionEarth.setDuration(Duration.seconds(13));
        transitionEarth.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionEarth.setCycleCount(Timeline.INDEFINITE);
        transitionEarth.play();

        Ellipse ellipseMoon = new Ellipse();
        ellipseMoon.setRadiusX(earth.getBoundsInLocal().getWidth()/2+25);
        ellipseMoon.setRadiusY(earth.getBoundsInLocal().getHeight()/2+25);

        PathTransition transitionMoon = new PathTransition();
        transitionMoon.setPath(ellipseMoon);
        transitionMoon.setNode(moon);
        transitionMoon.setInterpolator(Interpolator.LINEAR);
        transitionMoon.setDuration(Duration.seconds(1));
        transitionMoon.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionMoon.setCycleCount(Timeline.INDEFINITE);
        transitionMoon.play();

        ellipseEarth.setVisible(false);
        ellipseMoon.setVisible(false);



        StackPane root = new StackPane();
        StackPane moonPane = new StackPane();
        moonPane.translateXProperty().bind(earth.translateXProperty());
        moonPane.translateYProperty().bind(earth.translateYProperty());
        moonPane.setMaxSize(100,100);

        root.setStyle("-fx-background-color: #000000");

        moonPane.getChildren().add(moon);
        root.getChildren().addAll(star,moonPane,ellipseEarth,earth,label);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }



}