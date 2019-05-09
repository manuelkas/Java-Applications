/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodisequaltotest;

import java.util.Scanner;
/**
 *
 * @author shalm
 */
public class MethodisEqualToTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Integers used for testing equality
        Integer a; 
        Integer b;
        
        //test if two intgers input by user are equal
        System.out.print("Enter two integer values: ");
        a = scanner.nextInt(); //get first intger
        b = scanner.nextInt(); //get second integer
        System.out.printf("%d and %d are %s\n", a, b, (isEqualTo(a,b) ? "equal" : "not equal"));
        
        String c;
        String d;            
        //test if two Strings input by user are equal
        System.out.print("\nEnter two string values: ");
        c = scanner.next();
        d = scanner.next();
        System.out.printf("%s and %s are %s\n", c, d, (isEqualTo(c,d) ? "equal" : "not equal"));
        
        Double e;
        Double f;
        //test if two strings input by user are equal
        System.out.print("\nEnter two double values: ");
        e = scanner.nextDouble(); //get first double
        f = scanner.nextDouble(); //get second double
        System.out.printf("%.1f and %.1f are %s\n", e, f, (isEqualTo(e,f) ? "equal" : "not equal"));
        
        //test if two objects are equal
        Object g = new Object();
        Object h = new Object();        
        System.out.printf("\n%s and %s are %s\n", g, h, (isEqualTo(g,h) ? "equal" : "not equal"));
    }
    
    
    //test whether two generic types are equal
    public static <T> boolean isEqualTo(T first, T second) { 
        return first.equals(second);
    }
}
