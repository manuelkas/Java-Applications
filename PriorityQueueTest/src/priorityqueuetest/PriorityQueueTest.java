/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuetest;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 *
 * @author shalm
 */
public class PriorityQueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //queue of capacity 5 and a new Comparator
        PriorityQueue<Double> queue = new PriorityQueue<Double>(5, new DoubleComparator());
        
        //insert elements to queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(8.2);
        
        System.out.println("Polling from queue:  ");
        
        //display elements in queue
        while (queue.size()>0)  {
            System.out.printf("%.1f ", queue.peek());          //view top element
            queue.poll();                                      //remove the top element
        }
        System.out.print("\n");
    }
    private static class DoubleComparator implements Comparator<Double> {
        public int compare( Double first, Double second) {
            return -Double.compare(first, second);
        }
    }
    
}
