package com.overlay;

import com.overlay.engine.graphic.ImageContainer;
import com.overlay.engine.graphic.ImageManager;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author thomas
 */
public class App extends Application{
    @Override
    public void start(Stage stage) {
        
        stage.setTitle("JFX TEST");
        Group root = new Group();
        Scene sc = new Scene(root);
        stage.setScene(sc);
        root.getChildren().add(new Label("TEST "));
        ImageContainer image = new ImageContainer(new Point2D(0,0), 300, 300, "testWithAlpha.png");
        image.setClip(new Circle(0,0,200));
        image.setClipPosition(Pos.CENTER);
        image.load();
        root.getChildren().add(image.getNode());
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
