/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author shalm
 */
public class ProcessInvoice {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice(74, "Electric Sander", 8, 57.98),
            new Invoice(24, "Power saw", 18, 99.99),
            new Invoice(7, "Sledge hammer", 11, 10.00),
            new Invoice(77, "Hammer", 76, 15.00),
            new Invoice(39, "Lawn mower", 3, 79.50), 
            new Invoice(68, "Screwdriver", 106, 6.99),
            new Invoice(21, "Jig saw", 21, 11.00),
            new Invoice(3, "Wrench", 34, 7.50)
            };
        //Function<Invoice, String> desc = Invoice::getPartDescription;
        //Comparator<Invoice> byPartDesc = Comparator.comparing(desc);

        
        
        System.out.println("Invoices Sorted by Part Description: ");
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPartDescription)).forEach(System.out::println);
        
        System.out.println("Invoices Sorted by Price: ");
         Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPrice)).forEach(System.out::println);
                      
        System.out.println("Invoice Sorted by Quantity:");
        Comparator<Invoice>desNumber = Comparator.comparing(Invoice::getQuantity).thenComparing(Invoice::getPartDescription);
        Arrays.stream(invoices).sorted(desNumber).map(Invoice::getPartDescription).forEach(System.out::println);
        
        System.out.println("Invoice Sorted by Invoice Value: ");
        Arrays.stream(invoices).sorted((a1,a2) -> (int)(a1.getPrice()*a1.getQuantity()
                -a2.getPrice()*a2.getQuantity()))
                .map(a->String.format("Description: %-15s Invoice value: %-4.2f",
                        a.getPartDescription(), a.getQuantity()*a.getPrice()))
                .forEach(a->System.out.println(a));
        
        System.out.println("Invoice Sorted by Invoice Value between $200 to $500: ");
         Arrays.stream(invoices).filter(a->a.getPrice()*a.getQuantity()>=200 && 
                 a.getPrice()*a.getQuantity()<=500)
        .sorted((a1,a2)->(int)(a1.getPrice()*a1.getQuantity()-a2.getPrice()*a2.getQuantity()))
        .map(a->String.format("Description: %-15s Invoice value: %-4.2f", 
                a.getPartDescription(),a.getQuantity()*a.getPrice()))
        .forEach(a->System.out.println(a));
        
         System.out.println("Invoice sorted by Descriptions with 'saw': ");             
         Arrays.stream(invoices).filter(a -> a.getPartDescription().endsWith("saw"))
                 .forEach(System.out::println); 
         
    }
    
}
