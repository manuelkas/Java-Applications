/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filematchtest;


/**
 *Exercise 15.4 from Java How to Program Edition 11 
 * @author shalm
 */
public class FileMatchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileMatch application = new FileMatch();
        
        application.openFiles();
        application.processFiles();
        application.closeFiles();
    }
    
}
