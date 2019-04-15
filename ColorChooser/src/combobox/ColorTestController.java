/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;

public class ColorTestController implements Initializable {
    
    private static final ColorChooser chooser = new ColorChooser();
    
    //properties
    @FXML ComboBox<String> combobox;    
    @FXML Pane colorPane;
    
    ObservableList<String> list = FXCollections.observableArrayList(chooser.getKeySet());
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.setItems(list);
        
        // when ListView selection changes, slow large cover in ImageView
        combobox.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> {
                colorPane.setBackground(new Background(
                    new BackgroundFill(chooser.getColor(newValue),
                        CornerRadii.EMPTY, Insets.EMPTY)));
            }
        );
    }
}
