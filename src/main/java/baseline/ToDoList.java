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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ToDoList {

    @FXML
    private DatePicker InputDate;

    @FXML
    private Button addItemButton;

    @FXML
    private Button deleteItemButton;

    @FXML
    private TableColumn<?, ?> descriptionColumn;

    @FXML
    private TableColumn<?, ?> dueDateColumn;

    @FXML
    private Button editItemButton;

    @FXML
    private TableColumn<?, ?> eventColumn;

    @FXML
    private TextField inputDescription;

    @FXML
    private TextField inputEvent;

    @FXML
    private ToggleGroup listGroup;

    @FXML
    private RadioButton rbComplete;

    @FXML
    private RadioButton rbIncomplete;

    @FXML
    private RadioButton rbShowAll;

    @FXML
    private RadioButton rbShowComplete;

    @FXML
    private RadioButton rbShowIncomplete;

    @FXML
    private Button saveAndCloseButton;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private ToggleGroup statusGroup;

    @FXML
    private TableView<?> toDoListTable;

    @FXML
    void onAddItemPressed(ActionEvent event) {
        //  Checks if 3 fields are filled out (inputEvent, inputDescription, inputDate
        //  checks if either rbComplete or rbIncomplete selected)
        //      If they are all properly filled out, add item to table and to the List object
        //          which should be storing all the elements of the list
        //      If they are not properly filled out (empty input)
        //          Simply add nothing (maybe send message to let user what they are doing wrong)
    }

    @FXML
    void onDeleteItemPressed(ActionEvent event) {
        //  Checks if an element is selected on the table
        //      If an element is selected, remove that element and the table and the list accordingly
        //      If an element is not selected, simply do nothing
    }

    @FXML
    void onEditItemPressed(ActionEvent event) {
        //  Checks if an element is selected on the table
        //      Opens a new scene that allows them to change the content and confirms the changes
        //      Update the list after the user is done making changes
    }

    @FXML
    void onSaveAndClosePressed(ActionEvent event) {
        //  Saves list and goes back to the initial scene
    }

    @FXML
    void listGroupAction(ActionEvent action){
        // Checks which of the 3 radio buttons is selected
        // Updates the list accordingly to whichever radio button is selected
        // (Show all, show incomplete, show complete)
    }

}