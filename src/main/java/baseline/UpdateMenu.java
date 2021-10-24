/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class UpdateMenu {

    @FXML
    private TextField inputDescription;

    @FXML
    private DatePicker inputDueDate;

    @FXML
    private TextField inputEvent;

    @FXML
    private RadioButton rbCompleted;

    @FXML
    private RadioButton rbIncomplete;

    @FXML
    private ToggleGroup statusGroup;

    @FXML
    private Button updateItemButton;

    @FXML
    void onUpdateButtonPressed(ActionEvent event) {
        // Changes the elements in the list to the updated values
    }
}
