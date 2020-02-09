package com.overlay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author thomsb
 */
public class App extends Application{
    @Override
    public void start(Stage stage) {
        
        stage.setTitle("JFX TEST");
        stage.setScene(new Scene(new Label("TEST ")));
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
