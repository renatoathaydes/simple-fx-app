package com.athaydes.automaton.tests.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 */
public class AppPanel extends HBox {

    @FXML Label status;
    @FXML TextField nameField;
    @FXML TextField emailField;
    @FXML TextArea commentsField;

    @FXML public void onOK() {
        status.setText(computeStatus());
    }

    @FXML public void onCancel() {
        status.setText("You cancelled");
    }

    private String computeStatus() {
        return "Name: " + nameField.getText() + ", Email: " + emailField.getText() +
                ", Comments: " + commentsField.getText();
    }

}
