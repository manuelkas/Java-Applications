/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PayableInterfaceTest;

/**
 *
 * @author shalm
 */
//Employee abstract superclass
public abstract class Employee implements Payable {
        private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String first, String last, String ssn) {    //three-argument constructor
        firstName = first;
        lastName= last;
        socialSecurityNumber = ssn;
    }
    
    public void setFirstName(String first ) {   //set first name 
        firstName = first; //should validate 
    }
    
    public String getFirstName() {     //return first name
        return firstName; 
    }
    
    public void setLastName (String last) {    // set last name
        lastName = last; 
    }
    
    public String getLastName() {       //return last name
        return lastName; 
    }
    
    public void setSocialSecurityNumber(String ssn) {  //set social security number
        socialSecurityNumber = ssn;
    }
    
    public String getSocialSecurityNumber() {      //return ssn
        return socialSecurityNumber;
    }
    
    //return String representation of Employee object @Override
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s", 
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
        
}
