/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;
import java.util.NoSuchElementException;
/**
 *
 * @author shalm
 */
public class QueueTest {
        public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        
        //use enqueue method
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();
        
        //remove objects from queue
        try {
            int removedItem;
            
            while (true) {
                removedItem = queue.dequeue();    //use dequeue method
                System.out.printf("\n%s dequeued\n", removedItem );
                queue.print();
            }
        }
        catch (NoSuchElementException NoSuchElementException) {
            NoSuchElementException.printStackTrace();
        }
    }
    
}
