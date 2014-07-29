package com.athaydes.automaton.tests.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 */
public class FXMLFxApp extends Application {


    @Override
    public void start( Stage primaryStage ) throws Exception {
        HBox root = FXMLLoader.load(this.getClass().getResource("/fxml/SimpleFxApp.fxml"));
        Scene scene = new Scene( root, 500, 400 );
        primaryStage.setScene( scene );
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main( String[] args ) {
        Application.launch( FXMLFxApp.class );
    }

}
