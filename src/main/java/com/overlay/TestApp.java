package com.overlay;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class TestApp extends Application{
    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        primaryStage.setTitle("Overlay");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);



        Button topL = new Button("TopL");
        root.setTop(topL);
        root.setAlignment(topL, Pos.TOP_LEFT);
        root.setMargin(topL, new Insets(20, 20, 20, 20));

        Button left = new Button("Left");
        root.setCenter(left);
        root.setAlignment(left, Pos.CENTER_LEFT);
        root.setMargin(left, new Insets(20, 20, 20, 20));

        Button bottomL = new Button("BottomL");
        root.setBottom(bottomL);
        root.setAlignment(bottomL, Pos.BOTTOM_LEFT);
        root.setMargin(bottomL, new Insets(20, 20, 20, 20));

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