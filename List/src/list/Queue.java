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
public class Queue<T> {
       private final List<T> queueList;
    
    //no-argument constructor
    public Queue() {
        queueList = new List<>("queue");
    }
    //add object to queue
    public void enqueue (T object) {
        queueList.insertAtBack(object);
    }
    //remove object from queue
    public T dequeue() throws NoSuchElementException {
        return queueList.removeFromFront();
    }
    //determine if queue is empty 
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    //output queue contents
    public void print() {
        queueList.print();
    }
}
