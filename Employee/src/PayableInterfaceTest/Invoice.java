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
public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;
    
    //constructor
    public Invoice(String partNumber, String partDescription, int quantity,
            double pricePerItem) {
        if (quantity < 0) { 
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        if (pricePerItem < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
        this.quantity = quantity; 
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
        
    }
    
    //get part number, description, quantity and price per item
    public String getPartNumber() {   
        return partNumber; 
    }
    public String getPartDescription() {   
        return partDescription;
    }
        public int getQuantity() {             
        return quantity; 
    }
        public double getPricePerItem () {     
        return pricePerItem; 
    } 
    //return String representation of Invoice object 
    @Override
    public String toString() {
        return String.format("%s:  \n%s: %s (%s) \n%s: %d \n%s: $%, .2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }
    
    //method required to carry out contract with interface Payable @Override
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();      //calculate total cost
    }
}
