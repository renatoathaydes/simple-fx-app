package com.athaydes.automaton.tests;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 */
public class SimpleFxApp extends Application {

    Label status;

    @Override
    public void start( Stage primaryStage ) throws Exception {
        status = new Label();
        status.setId( "status-label" );
        VBox panel = new VBox( 20 );
        panel.getChildren().addAll(
                row( "Name", new TextField() ),
                row( "Email", new TextField() ),
                row( "Comments", new TextArea() ),
                row( "", buttons() ),
                status
        );
        HBox root = new HBox( 10 );
        root.getChildren().addAll( panel );
        HBox.setMargin( panel, new Insets( 10 ) );
        Scene scene = new Scene( root, 500, 500 );
        primaryStage.setScene( scene );
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public Node row( String labelText, Node field ) {
        HBox row = new HBox( 10 );
        Label label = new Label( labelText );
        label.setMinWidth( 120 );
        row.getChildren().addAll( label, field );
        return row;
    }

    public Node buttons() {
        HBox buttons = new HBox( 10 );
        Button cancel = new Button( "Cancel" );
        cancel.setOnAction( ( e ) -> status.setText( "You cancelled" ) );
        Button ok = new Button( "OK" );
        ok.setOnAction( ( e ) -> status.setText( "Completed!" ) );
        buttons.getChildren().addAll(
                cancel,
                ok
        );
        return buttons;
    }

    public static void main( String[] args ) {
        Application.launch( SimpleFxApp.class );
    }

}
