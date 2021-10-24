/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Marc Palacio
 */

package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ListListMenu {
    private static Stage stage = new Stage();
    @FXML
    private Button addListButton;

    @FXML
    private Button deleteListButton;

    @FXML
    private Button editListButton;

    @FXML
    private TextField inputListName;

    @FXML
    private TableColumn<?, ?> listTable;

    @FXML
    private Button loadListButton;

    @FXML
    private Button saveListButton;

    @FXML
    private TableView<?> toDoListTable;

    @FXML
    void onAddListPressed(ActionEvent event) {
        //  Checks if the inputListName is less than 3 characters
        //      If it's less than 3 characters, it will not add element to the table
        //      If it's 3 characters are more, it will add the listName to the table
    }

    @FXML
    void onDeleteListPressed(ActionEvent event) {
        //  Checks if an element in the table is selected
        //      If an element is selected, it will delete that element
        //          from the table and update the list
        //      If an element isn't selected, it will simply do nothing
    }

    @FXML
    void onEditListPressed(ActionEvent event) {
        //  Checks if an element in the table is selected
        //      If an element is selected, it will change scenes to a screen
        //          where the user can edit the contents of the list
        //      If an element isn't selected, it will simply do nothing
    }

    @FXML
    void onLoadListPressed(ActionEvent event) {
        //  When pressed, open up a FileChooser to select a list and add the name to the
        //  list of lists (Contents of list will be able to viewed with editing the list)
        //  Then it will call scanInputFile from MyFileReader to get the data from the list
    }

    @FXML
    void onSavedListPressed(ActionEvent event) {
        //  When pressed, open up a FileChoose that should allow the user to save the list
        //  to a file, which will write it to file using writeToFile in MyFileWriter
        //  *Note, they can only save one list at a time
    }
}

