/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usp;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/**
 *
 * @author shalm
 */
public class USP {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the name of the input file: ");
    String Reader = in.nextLine();
        
    System.out.println("Enter the name of the output file: ");
    String Writer = in.nextLine();
        
    try(BufferedReader input = Files.newBufferedReader(Paths.get(Reader))) {
        BufferedWriter output = Files.newBufferedWriter(Paths.get(Writer));
        String line = " ";
        while ((line = input.readLine()) != null) {
           String words[] = line.split(" ");
           if (words.length == 2) {
                    String newStr = words[0] + " " + words[words.length-1].toUpperCase();
                    output.write(newStr);
                    output.newLine();
                }
           if (words.length == 3) {
                    String newStr = words[0] + " " + words[1] + " " + words[words.length-1].toUpperCase();
                    output.write(newStr);
                    output.newLine();
                }
          if (words.length == 4) {
                    String newStr = words[0] + " " + words[1] + " " + words[2] + " " + words[words.length-1].toUpperCase();
                    output.write(newStr);
                    output.newLine();
                }
                
            }
            output.close();
        }
        
        catch (IOException | IllegalStateException e) {
        }
        catch (IllegalFormatException formatException) {
            System.err.println("Error with output");
            System.exit(1);
        }
        catch (NoSuchElementException elementException) {
            System.err.println("Invalid input from file");
            System.exit(1);
        }
    }
        }
   
    

