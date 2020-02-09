package com.overlay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class TestApp extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setFullScreen(true);

        Button test = new Button("yes");
        root.getChildren().add(test);
        primaryStage.setOpacity(0.5);
        Scene primaryScene = new Scene(root, 300, 275);
        root.setBackground(Background.EMPTY);
        primaryScene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(primaryScene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}