package com.example.week2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateBookController implements Initializable {

    @FXML
    private TextField authorTextField;

    @FXML
    private CheckBox availibilityCheckBox;

    @FXML
    private TextField bookNameTextField;

    @FXML
    private Label finalLabel;

    @FXML
    private ComboBox<String> genreComboBox;

    @FXML
    private Spinner<Double> priceSpinner;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        finalLabel.setVisible(false);
        genreComboBox.getItems().addAll(Book.findGenres());
    }

    @FXML
    void saveBook(ActionEvent event) {
        try {
            // System.out.println("I am here");
            String bookName = bookNameTextField.getText();
            String author = authorTextField.getText();
            String genre = genreComboBox.getSelectionModel().getSelectedItem();
            //double price = priceSpinner.getValue();
            boolean availability = availibilityCheckBox.isSelected();

            Book book1 = new Book(1, bookName, author, genre, 2.2, availability);
            finalLabel.setVisible(true);
            finalLabel.setText(book1.toString());
        } catch (Exception e){
            finalLabel.setVisible(true);
            finalLabel.setText(e.getMessage());
        }
    }
}
