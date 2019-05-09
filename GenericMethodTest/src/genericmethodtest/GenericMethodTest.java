/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethodtest;

/**
 *
 * @author shalm
 */
public class GenericMethodTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create arrays of Integer, Double and Character
        Integer[] integerArray = {1,2,3,4,5,6,7};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] characterArray = {'J', 'A', 'V', 'A', ' ', 'C', 'L', 'A', 'S', 'S'};
        String[] stringArray = {"Hi!", "How", "is", "your", "day", "going?"}; 
        
        System.out.println("Array integerArray has: ");
        printArray(integerArray);
        
        System.out.println("\nArray doubleArray has: ");
        printArray(doubleArray); 
        
        System.out.println("\nArray characterArray has: ");
        printArray(characterArray);
        
        System.out.println("\nArray stringArray has: ");
        printArray(stringArray);
    }
    
    //generic method printArray
    public static <E> void printArray(E[] inputArray) {
        //display array elements
        for (E element:inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    
    //method that print array of string in tabular format
    public static void printArray(String[] stringArray) {
        //display elements of array
        for (int i = 0;i <stringArray.length; i++) {
            System.out.printf("%-10s", stringArray[i]);
            
            //create rows
            if((i +1) % 4 == 0) {
            System.out.println();
        }
        }
    }
}
    

