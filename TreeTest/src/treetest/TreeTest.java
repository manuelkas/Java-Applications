/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetest;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.StringTokenizer;
/**
 *
 * @author shalm
 */
public class TreeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //create scanner
        
        System.out.println("Please enter a line of text: ");
        String input = scanner.nextLine(); 
        
        TreeSet<String> tree = new TreeSet<String>();
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        //process input text
        while (tokenizer.hasMoreTokens()) {
            tree.add(tokenizer.nextToken());      //add text to tree
        }
        
        //print tree elements
        System.out.println("Elements in tree: " + tree);
    }   
}
