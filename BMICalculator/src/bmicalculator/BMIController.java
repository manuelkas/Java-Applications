/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

import javafx.event.ActionEvent;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author shalm
 */
public class BMIController {
    @FXML
    private JFXTextField weightTextField;

    @FXML
    private JFXTextField heightTextField;

    @FXML
    private JFXButton calculateButton;

    @FXML
    private JFXTextField totalvalue;

    @FXML
    private JFXRadioButton englishRadioButton;

    @FXML
    private JFXRadioButton metricRadioButton;
    
    //calculates and displays the tip and total amounts
    @FXML
    public void calculate(ActionEvent event) {
        double weight = Double.parseDouble(weightTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());
        
        double bmi;
        
        if (englishRadioButton.isSelected()) {
            bmi = (weight * 703) / (height * height);
        }
        
        else { //if metric
            bmi = weight / (height*height);
        }
        totalvalue.setText(String.format("%.2f", bmi));
    }
    public void initialize() {
        // TODO
        ToggleGroup group = new ToggleGroup();
        englishRadioButton.setToggleGroup(group);
        metricRadioButton.setToggleGroup(group);
    }    
    
}

