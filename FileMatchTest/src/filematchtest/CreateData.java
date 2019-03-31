/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filematchtest;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;

/**
 *
 * @author Dell
 */
public class CreateData {
    public static void main(String [] args ) {
        Formatter outOldMaster = null;
        Formatter outTransaction = null;
        AccountRecord[] accounts = new AccountRecord[4];
        TransactionRecord[] transactions = new TransactionRecord[7];
        
        //create account recordsa
        accounts[0]= new AccountRecord(100, "Alan", "Jones", 348.17);
        accounts[1] = new AccountRecord(300, "Mary", "Smith", 27.19);
        accounts[2] = new AccountRecord(500, "Sam", "Sharp", 0.00);
        accounts[3] = new AccountRecord(700, "Suzy", "Green", -14.22);
        
        //create transactions
        transactions[0] = new TransactionRecord(100, 27.12);
        transactions[1] = new TransactionRecord(300, 62.11);
        transactions[2] = new TransactionRecord(300, 83.89);
        transactions[3] = new TransactionRecord(400, 100.56);
        transactions[4] = new TransactionRecord(700, 80.78);        
        transactions[5] = new TransactionRecord(700, 1.53);
        transactions[6] = new TransactionRecord(900, 82.17);        
        

        try {
            //file stream for output file
            outOldMaster = new Formatter("oldmast.txt");
            
            for(int i = 0; i <accounts.length; i++) {
                outOldMaster.format("%d %s %s %.2f\n", accounts[i].getAccount(),accounts[i].getFirstName(),
                        accounts[i].getLastName(), accounts[i].getBalance());
            }
            //file stream for output file
            outTransaction = new Formatter("trans.txt");
            
            for (int i = 0; i <transactions.length; i++) {
                outTransaction.format("%d %,2f\n", transactions[i].getAccount(), 
                        transactions[i].getAmount());
            }
        }
        catch (SecurityException securityException) {
            System.err.println("You do not have write access to this file.");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error creating file.");
            System.exit(1);
        }
        catch (FormatterClosedException closedException) {
            System.err.println("Error writing to file - file has been closed.");
            System.exit(1);
        }
        catch (IllegalFormatException formatException) {
            System.err.println("Error with output.");
            System.exit(1);
        }
        finally {
            if (outOldMaster != null) {
                outOldMaster.close();
            }
            if (outTransaction != null) {
                outTransaction.close();
            }
        }
                
    }
}