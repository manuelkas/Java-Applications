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
public class CommissionEmployee extends Employee {
private double grossSales;    //weekly sales
    private double commissionRate;  //commission percentage
    
    //constructor
    public CommissionEmployee (String firstName, String lastName, 
        String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
            
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {  //validate
            throw new IllegalArgumentException (
                "Commission rate must be > 0.0 and < 1.0");
        } 
        
        if(grossSales < 0.0) {
            throw new IllegalArgumentException ("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSales( double grossSales) {    //set gross sales amount
        if (grossSales < 0.0) {             
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    } 
    
    //return gross sales amount
    public double getGrossSales () {
        return grossSales;
    }
    
    public void setCommissionRate (double commissionRate) { //set commision rate 
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException (
                "Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate; 
    }
    
    //return commission rate 
    public double getCommissionRate() {
        return commissionRate; 
    }
    
    //calculate earnings; override abstract method earning in Employee @Override
    @Override
    public double getPaymentAmount()  {
        return getCommissionRate() * getGrossSales(); 
    }
    
    //return String representation of CommissionEmployee object @Override
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%, .2f; %s: %.2f", "commission employee",
                super.toString(), "gross sales", getGrossSales(), "commission rate",
                getCommissionRate());
    }
    
}
