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
public class PayableInterfaceTest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //create six-element Payable array 
        Payable[] payableObjects = new Payable [6];
        
        //populate array with ojbects that implemet Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new  Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "000-14-1456", 800.00);
        payableObjects[3] = new HourlyEmployee("Arianna", "Grande", "999-00-7413", 
                16.75, 40);
        payableObjects[4]= new CommissionEmployee("Tyler", "Mir", "098-77-4297", 10000, .06);
        payableObjects[5] = new BasePlusCommissionEmployee("Nicole", "Lewis", "777-00-1234", 5000, .04, 300);
        
        System.out.println("Invoices and Employees processed polymorphically: \n");
        
        //generically process each element in array payableObjects 
        for (Payable currentPayable: payableObjects) {
            //output currentPayable and its appropriate payment amount 
            System.out.printf("%s \n", currentPayable.toString());
            
            if (currentPayable instanceof BasePlusCommissionEmployee) {
                //downcast Payable reference to BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee = 
                        (BasePlusCommissionEmployee) currentPayable;
                
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(1.10 * oldBaseSalary);
                System.out.printf(
                "new base salary with 10%% increase is: $%, .2f\n", 
                        employee.getBaseSalary());
            }
            System.out.printf("%s: $%, .2f\n\n", "payment due", currentPayable.getPaymentAmount());
        }
    }
    
}

