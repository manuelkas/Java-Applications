/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactors;
import java.util.Scanner;
import java.util.HashSet;
/**
 *
 * @author shalm
 */
public class PrimeFactors {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);          //create scanner
        System.out.println("Please enter a number, -1 to terminate: ");
        int inputNumber = scanner.nextInt();              //get number 
        
        // process user input numbers
        while (inputNumber != -1) {
            HashSet<Integer> factorSet = new HashSet<Integer>();
            factorize(inputNumber, factorSet);
            
            if (factorSet.isEmpty ()) {
                System.out.println(" " + inputNumber + " is a prime number. ");
            }
            else {
                System.out.println( " Factors are: " + factorSet);
            }
            //get next number
            System.out.println("Please enter a number, -1 to terminate: ");
            inputNumber = scanner.nextInt();           //get number
        }
    }
    
    //find prime factors
    public static boolean factorize(int number, HashSet<Integer> set) {
        if (number == 0 || number == 1) {
            return false;
        }
        //loop through numbers that are less than or equal to number/2
        for (int factor =2 ; factor <= number /2; factor ++) {
            //has factor
            if (number % factor == 0) {
                set.add(factor);                      // save the factor
            
                // just look at what's left over for more factors
                if (!factorize((number / factor), set)) {
                    set.add(number / factor);
            }
                return true;
            }
        }
        return false;
    }
    
}
