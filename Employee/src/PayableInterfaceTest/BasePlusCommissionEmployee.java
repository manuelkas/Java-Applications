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

    public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  //base salary per week
    
    //constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, 
        String socialSecurityNumber, double grossSales, double commissionRate, 
        double baseSalary)  {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException ("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    
    //set base salary
    public void setBaseSalary( double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary; 
    }
    
    public double getBaseSalary() {   //return base salary
        return baseSalary;
    }
    
    //calculate earnings; override method earnings in CommissionEmployee @override
    @Override
    public double getPaymentAmount() { 
        return getBaseSalary() + super.getPaymentAmount();
    }
    
    //return String representation of BasePlusCommissionEmployee object @override
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%, .2f", "base-salaried", super.toString(), 
                "base salary", getBaseSalary());
    }
}


