/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author shalm
 */
public class SMSFrame extends JFrame implements ActionListener {
    //SMS abbreviations and translations 
    private static final String[] smsWords = {
        "imo", "idk", "jk", "lol", "np", "k", "gmab", "fyi", "sry", "plz", "btw", 
        "brb", "bbl", "'g2g", "nvm", "ttyl", "bff", "def", "nm", "bc", "ily"};
    
    private static final String[] englishWords = {
        "in my opinion", "I don't know", "just kidding", "laughing out loud", "no problem", 
        "ok", "give me a break", "for your information", "sorry", "please", "by the way", 
        " be right back", "be back later", "got to go", "nevermind", "talk to you later", 
        "best friend forever", "definitely", "not much", "because", "i love you"};
    private JTextArea inputArea;   // lets user input message
    private JButton convertButton; //clicked to translate from SMS
    private JTextArea outputArea;  //normal english output
    
    public SMSFrame() {
        super("SMS Translator");   // call JFrame's constructor to set title
        
        //create text ares 
        inputArea = new JTextArea(10, 15);
        outputArea = new JTextArea(10,15);
        outputArea.setEditable(false);    //disallow editing for output
        
        //create button
        convertButton = new JButton("Convert>>>");
        convertButton.addActionListener(this);
        
        //add components to box
        Box box = Box.createHorizontalBox();
        box.add(new JScrollPane(inputArea));
        box.add(convertButton);
        box.add(new JScrollPane(outputArea));
        
        add(box); //add box to frame 
    }
    
    //convert SMS language to normal English when button is clicked
    public void actionPerformed(ActionEvent event) {
        Scanner scanner = new Scanner(inputArea.getText());
        StringBuilder output = new StringBuilder();
        
        //translate words, one at a time
        while (scanner.hasNext()) {
            output.append(translateWord(scanner.next()));
            output.append(' ');
        }
        outputArea.setText(output.toString());   //show translated text
    }
    
    //translate a single word from SMS to English 
    private String translateWord(String word) {
        for (int i = 0; i <smsWords.length; i++) {
            if (word.toLowerCase().equals(smsWords[i])) {
                return englishWords[i]; //return translated word
            }
        }
        return word;    //no translation; return original word
    }
}
