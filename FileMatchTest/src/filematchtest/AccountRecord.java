/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filematchtest;

/**
 *
 * @author ss3063
 */
public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    
    //no-argument constructor calls other constructor with default values
    public AccountRecord() {
        this(0,"", "", 0.0);       //call four-argument constructor
    }
    
    //initialize a record 
    public AccountRecord(int acct, String first, String last, double bal) {
        setAccount(acct);
        setFirstName(first);
        setLastName(last);
        setBalance(bal);
    }
    //add a transaction to an account record
    public void combine(TransactionRecord transaction) {
        balance = balance + transaction.getAmount();
    }
    
    //set account number
    public void setAccount(int acct) {
        account = acct;
    }
    
    //get account number 
    public int getAccount() {
        return account;
    }
    
    //set first name
    public void setFirstName(String first) {
        firstName = first;
    }
    
    //get first name
    public String getFirstName() {
        return firstName;
    }
    
    //set last name
    public void setLastName(String last) {
        lastName = last;
    }
    
    //get last name
    public String getLastName() {
        return lastName;
    }
    
    //set balance
    public void setBalance(double bal) {
        balance = bal;
    }
    
    //get balance 
    public double getBalance(){
        return balance;
    }
}