/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;
import javax.swing.JFrame;
/**
 *
 * @author shalm
 */
public class SMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SMSFrame smsFrame = new SMSFrame();
        smsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        smsFrame.setSize(425,200); //set frame size
        smsFrame.setVisible(true); //display frame
    }
    
}
