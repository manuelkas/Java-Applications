/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TipCalculatorController {
    
   // formatters for currency and percentages
   private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
   private static final NumberFormat percent =  NumberFormat.getPercentInstance();
   
   
    private BigDecimal tipPercentage = new BigDecimal(0.15); // 15% default
    
    @FXML
    private Label tipPercentageLabel;

    @FXML
    private JFXTextField amountTextField;

    @FXML
    private JFXTextField tipTextField;

    @FXML
    private JFXTextField totalTextField;

    @FXML
    private JFXSlider tipPercentageSlider;

    // calculates and displays the tip and total amounts
   private void updateTipAndTotal() {
      try {
         BigDecimal amount = new BigDecimal(amountTextField.getText());
         BigDecimal tip = amount.multiply(tipPercentage);
         BigDecimal total = amount.add(tip);

         tipTextField.setText(currency.format(tip));
         totalTextField.setText(currency.format(total));
      }
      catch (NumberFormatException ex) {
         amountTextField.setText("Enter amount");
         amountTextField.selectAll();
         amountTextField.requestFocus();
      }
   }

   // called by FXMLLoader to initialize the controller
   public void initialize() {
      // 0-4 rounds down, 5-9 rounds up 
      currency.setRoundingMode(RoundingMode.HALF_UP);

      tipPercentageLabel.textProperty().bind(
         tipPercentageSlider.valueProperty().asString("%.0f"));

      // listener for changes to tipPercentageSlider's value
      tipPercentageSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, 
               Number oldValue, Number newValue) {
               // Note: Unlike the original example, we're using Math.round() to match the rounding 
               // of the property binding between the tipPercentageLabel and tipPercentageSlider
               tipPercentage = 
                  BigDecimal.valueOf(((int)Math.round(newValue.doubleValue())) / 100.0);
               updateTipAndTotal();
            }
         }
      );

      // listener for changes to amountTextField's text
      amountTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, 
               String oldValue, String newValue) {
               updateTipAndTotal();
            }
         }
      );
   }
}
