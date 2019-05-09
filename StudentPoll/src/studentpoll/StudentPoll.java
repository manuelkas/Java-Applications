/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpoll;

/**
 *Exercise 15.8 from Java How to Program 10th edition
 * Figure 7.8 contains an array of survey responses that is hard coded into the
 * program. Suppose we wish to process survey results that are stored in a file. This exercise requires
 * two separate programs. First, create an application that prompts the user for survey responses and
 * outputs each response to a file. Use a Formatter to create a file called numbers.txt. Each integer
 * should be written using method format. Then modify the program of Fig. 7.8 to read the survey
 * responses from numbers.txt. The responses should be read from the file by using a Scanner. Method nextInt should be used to input one integer at a time from the file. The program should continue to read responses until it reaches the end of file. The results should be output to the text file
 * "output.txt".
 * @author shalm
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPoll
{
    public void displayData()
    {
        int frequency[] = new int[ 15 ];
        Formatter writer = null;
        Scanner pollNumbers = null;
    try
    {
        pollNumbers = new Scanner(
        new File( "numbers.txt" ) );
        writer = new Formatter( "output.txt" );
        writer.format( "%-12s%-12s\n", "Rating", "Frequency" );
        // for each answer, use that value as subscript to
        // determine element to increment
        while ( pollNumbers.hasNext() ) 
        {
            ++frequency[ pollNumbers.nextInt() ];
        }
        // append frequencies to String output
        for (int rating = 1;rating < frequency.length; rating++)
        {
            writer.format( "%-12d%-12d\n",rating, frequency[rating]);
        }
     } 
    catch ( FileNotFoundException fileNotFoundException )
    {
        System.err.println( "Error: Files cannot be opened." );
    } 
    catch ( FormatterClosedException formatterClosedException )
    {
        System.err.println( "Error: Output file is closed." );
    } 
    catch ( SecurityException securityException )
    {
        System.err.println( "Error opening file for writing." );
    } 
    catch ( IllegalFormatException illegalFormatException )
    {
        System.err.println( "Error writing data to file." );
    } 
    catch ( NoSuchElementException noSuchElementException )
    {
        System.err.println( "Error reading from file." );
    } 
    catch ( IllegalStateException illegalStateException )
    {
        System.err.println( "Error: Input file is closed." );
    } 
    finally
    {
        if ( writer != null )
            writer.close();
        if ( pollNumbers != null )
            pollNumbers.close();
    } 
    } 
} 