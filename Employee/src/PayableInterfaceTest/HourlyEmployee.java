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
//HourlyEmployee class extends Employee
public class HourlyEmployee extends Employee {
    private double wage;         //wage per hour 
    private double hours;        //hours worked for week
    
    
    //constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        
        if  (wage < 0.0) { 
            throw new IllegalArgumentException(
                "Hourly wage must be >= 0.0");
        }
        
        if((hours < 0.0) || (hours > 168.0)) {  //validate hours
            throw new IllegalArgumentException (
                "Hours worked must be >= 0.0 and <= 168.0");
        }
        
        this.wage = wage;
        this.hours = hours;
    }
    
    //set wage
    public void setWage(double wage) {
        if (wage < 0.0) {           
            throw new IllegalArgumentException (
                "Hourly wage must be >= 0.0");
        }
        
        this.wage = wage;
    }
    
    
    public double getWage() {
        return wage;         //return wage
    }
    
    public void setHours (double hours) {                   //set hours worked
        if ((hours < 0.0) || (hours > 168.0)) { 
            throw new IllegalArgumentException (
                "Hours worked must be >= 0.0 and <=168.0");
        }
        this.hours = hours;
    }
    
    public double getHours() {             //return hours worked
        return hours;
    }
    
    //calculate earnings;override abstract method earnings in Employee @Override
    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40) {
            return getWage() * getHours(); 
        }
        else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    
    //return String representation of HourlyEmplyeeObject @Override
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f, %s:, %,.2f",
                super.toString(), "hourly wage", getWage(), "hours worked", 
                getHours());
    }
}
