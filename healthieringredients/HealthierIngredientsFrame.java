/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthieringredients;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.util.Scanner; 
import javax.swing.Box; 
import javax.swing.JButton;
import javax.swing.JCheckBox; 
import javax.swing.JLabel; 
import javax.swing.JScrollPane;
import javax.swing.JTextArea; 
import javax.swing.JOptionPane; 
import javax.swing.JFrame;




/**
 *
 * @author shalm
 */
public class HealthierIngredientsFrame extends JFrame implements ActionListener {
        private JTextArea inputArea;
        private JButton convertButton; 
        private JTextArea outputArea; 
        
        
        //control what substitutions to make 
        private JCheckBox cholestrolCheckBox; 
        private JCheckBox weightLossCheckBox; 

        
        public HealthierIngredientsFrame() { 
            super("Recipe Converter");
            setLayout(new BorderLayout());
            
            //create text areas
            inputArea = new JTextArea(15, 15);
            outputArea = new JTextArea(10, 15); 
            outputArea.setEditable(false); //disallow editing for output 
             
            //create button
            convertButton = new JButton("Convert>>>"); 
            convertButton.addActionListener(this); 
            
            //create check boxes
            cholestrolCheckBox = new JCheckBox("High cholestrol");
            weightLossCheckBox = new JCheckBox("Weight loss"); 
            
            //components to the central box
            Box centerBox = Box.createVerticalBox();
            centerBox.add(convertButton);
            centerBox.add(cholestrolCheckBox);
            centerBox.add(weightLossCheckBox);
            
            //components to main box
            Box mainBox = Box.createHorizontalBox(); 
            mainBox.add(new JScrollPane(inputArea));
            mainBox.add(centerBox);
            mainBox.add(new JScrollPane(outputArea));
            
            add(mainBox); //add box to frame 
            
            //add warning label on mottom 
            add(new JLabel("Always consult your physician before making " + 
                    "significant changes to your diet"), BorderLayout.SOUTH); 
            
        }
        
        @Override
        //convert recipe to use healthier ingredients 
        public void actionPerformed(ActionEvent event) { 
            Scanner scanner = new Scanner(inputArea.getText());
            StringBuilder output = new StringBuilder();
            
            //translate recipe, out item at a time 
            while(scanner.hasNextLine()) { 
                try{
                    //attempt to translate line of recipe
                    output.append(convert(scanner.nextLine())); 
                    output.append('\n');
                    
                }
                catch (Exception exception) { 
                JOptionPane.showMessageDialog(this, "Could not parse recipe.",
                    "Error", JOptionPane.ERROR_MESSAGE); 
                return;
            }
            }
            outputArea.setText(output.toString()); //show translated text
        }
        
        //convert single recipe item 
       private String convert(String word) {
        //split out quantity, unit, and item 
        String[] tokens = word.split("\\s+", 3);
        double amount = readAmount(tokens[0]);
        String unit = tokens[1];  //unit of measure
        String item = tokens.length == 2 ? "" : tokens[2]; //type
        
        //do all necessary conversions
        //eggs don't have a unit, so typep is parsed as 
        if (unit.matches("eggs?") && cholestrolCheckBox.isSelected()) {
            return String.format("%.2f egg whites", amount *2);
        }
        else if (item.equals("milk") && cholestrolCheckBox.isSelected()) {
            return String.format("%.2f %s soy milk", amount, unit);
        }
        else if (item.equals("sugar") && weightLossCheckBox.isSelected()) {
            return String.format("%.2f %s molasses",amount, unit);
        }
        else if (item.equals("butter") && cholestrolCheckBox.isSelected()) {
            return String.format("%.2f %s margarine", amount, unit);
        }
        else if (item.equals("flour")) {
            return String.format("%.2f %s rye flour", amount, unit);
        }
        else if(item.equals("mayonnaise") && cholestrolCheckBox.isSelected()) {
            return String.format("%.2f %s cottage cheese", amount, unit);
        }
        else if (item.equals("oil") && weightLossCheckBox.isSelected()) {
            return String.format("%.2f %s applesauce",amount, unit);
        }
        else if (item.equals("lemon juice")) {
            return String.format("%.2f %s vinegar", amount / 2 , unit);
        }
        else if (item.equals ("sour cream") && cholestrolCheckBox.isSelected()) {
            return String.format("%.2f %s yogurt", amount, unit);
        }
        else {
            return word;   //no conversion; use original item 
        }
    }
    
    private double readAmount(String amount) {
        //attempt simple case first 
        if (amount.matches("\\d+(\\.\\d+)?")) {
            return Double.parseDouble(amount);
        }
        //deal with with fractions
        String [] tokens = amount.split("/");
        double numerator = Double.parseDouble(tokens[0]);
        double denominator = Double.parseDouble(tokens[1]);
        return numerator / denominator;
    }

    void setColor(Color blue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
