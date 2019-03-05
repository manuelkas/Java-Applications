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
//concrete class extends abstract class employee
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    //four-argument constructor
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first,last,ssn);            //pass to Employee constructor
        setWeeklySalary(salary);         //validate and store salary
    }
    
    //set salary
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }
    
    public double getWeeklySalary() {
        return weeklySalary;            //return salary 
    }
    
    //calculate earnings; implement interface Payable method that was 
    //abstract in superclass Emplyee @Override
    public double getPaymentAmount() {
        return getWeeklySalary(); 
    }
    
    //return String representation of SalariedEmployee object @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%, .2f", 
                super.toString(), "weekly salary", getWeeklySalary());
    }
    
}