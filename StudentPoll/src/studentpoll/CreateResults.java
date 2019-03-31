/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpoll;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author shalm
 */
public class CreateResults {
    private int getValue()
    {
        int result = -1;
        Scanner scanner = new Scanner( System.in );

        // prompt the user for input
        System.out.print( "Enter integer result (1 - 10), -1 to quit: " );

        try
        {
            result = scanner.nextInt();
        } 
        catch (NoSuchElementException noSuchElementException)
        {
            System.err.println( "Error with input." );
            System.exit( 1 );
        } 

        return result;
     } 
     private void outputData()
    {
        Formatter pollNumbers = null;

        try
        {
            // create the output stream
            pollNumbers = new Formatter( "numbers.txt" );
            int pollValue = getValue(); // get a number from the user
            // test for the sentinel value
            while ( pollValue != -1 )
            {
                // if the number is valid
                if ( pollValue > 0 && pollValue < 11 )
                // write the value
                pollNumbers.format( "%d\n", pollValue );
                pollValue = getValue(); // get another value
            } 
             pollNumbers.close(); 
        } 
        catch( SecurityException securityException )
        {
            System.err.println( "Error opening file." );
        } 
        catch( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Output file cannot be found." );
        } 
        catch( IllegalFormatException illegalFormatException )
        {
            System.err.println( "Error with the output's format." );
        } 
        catch( FormatterClosedException formatterClosedException )
         {
            System.err.println( "File has been closed." );
        } 
        finally
        {
            if ( pollNumbers != null )
            pollNumbers.close();
        }
    } 

 public static void main( String args[] )
 {
    CreateResults application = new CreateResults();
    application.outputData();
 } 
 } 

