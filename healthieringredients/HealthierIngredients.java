/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthieringredients;

import static java.awt.Color.blue;
import javax.swing.JFrame;
/**
 *
 * @author shalm
 */
public class HealthierIngredients {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HealthierIngredientsFrame healthierIngredientsFrame = new HealthierIngredientsFrame(); 
        healthierIngredientsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        healthierIngredientsFrame.setSize(600, 300);  //set frame size
        healthierIngredientsFrame.setVisible(true);  //display frame 
        healthierIngredientsFrame.setColor(blue);
    }
    
}
