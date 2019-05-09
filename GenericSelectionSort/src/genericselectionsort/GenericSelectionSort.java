/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericselectionsort;

/**
 *
 * @author shalm
 */
public class GenericSelectionSort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //initialize Integar array
        Integer [] intArray = {9,3,6,4,8,10,1,7,5,2};
        
        //display intArray in original order
        System.out.println("Integer in the original order");
        displayArray(intArray);
        
        selectionSort(intArray);
        
        //display intArray in sorted order
        System.out.println("\nInteger data in ascending order");
        displayArray(intArray);
        System.out.println("\n");
        
        //initialize Double array 
        Double[] doubleArray = {9.9, 4.4, 5.5, 7.7, 1.1, 8.8, 3.3, 6.6, 2.2};
        
        //display doubleArray in original order
        System.out.println("Double data in original order");
        displayArray(doubleArray);
        
        selectionSort(doubleArray);
        
        //display sorted doubleArray
        System.out.println("\nDouble data items in ascending order");
        displayArray(doubleArray); 
    }
    
    //generic method sorts elements in array
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        int smallest;
        
        //loop over all elements
        for (int spot = 0; spot <array.length - 1; spot++) {
            smallest = spot;
            
            //loop to find the smalled
            for (int element = spot + 1; element <array.length; element++) {
                if (array[element].compareTo(array[smallest])<0){
                smallest = element;
            }
        }
        //swap smallest element into position
        swap(array, smallest, spot);
        }
    }
    
    //generic method that swaps elements in an array
    public static <T> void swap(T[] array, int first, int second) {
        T temp = array[first];
        array[first] = array[second];
        array[second]= temp;
    }
    
    //generic methos that displays array element
    public static <T> void displayArray(T[] array) {
        //display each element
        for (T element: array ) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}



















