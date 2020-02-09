package com.overlay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;


public class TestApp extends Application{
    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        primaryStage.setTitle("Hello World");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);


        Button test = new Button("yes");
        root.getChildren().add(test);

        primaryStage.setOpacity(0.5);
        Scene primaryScene = new Scene(root);
        root.setBackground(Background.EMPTY);
        primaryScene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        //System.out.printf(String.valueOf(Screen.getPrimary().getVisualBounds()));

    }

    public static void main(String[] args) {
        launch(args);
    }
}