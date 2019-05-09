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

//represent one node in a list
class ListNode<T> {
    //
    T data;
    ListNode<T> nextNode;
    
    //
    ListNode(T object) {
        this(object, null);
    }
    
    //constructor refers to object
    ListNode(T object, ListNode<T> node) {
        data = object;
        nextNode = node;
    }
    //return reference to data in node
    T getData() {
        return data;  //return item in this node
    }
    
    //return reference to next node in list
    ListNode<T> getNext() {
        return nextNode;
    }
}

//Class list definition 
public class List<T> {
    private ListNode<T> firstNode;
    private String name;     //string
    
    //constructor create empty List with "list" as the name 
    public List() {
        this("list");
    }
    //constructor creates empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = null;
    }
    
    //insert item at front of List
    public void insertAtFront (T insertItem) {
        if (isEmpty()) {
            firstNode = new ListNode<>(insertItem);
        }
        else {
            firstNode = new ListNode<>(insertItem, firstNode);
        }
    }
    //insert item at end of LIst
    public void insertAtBack(T insertItem) {
        if(isEmpty()) {
            firstNode = new ListNode<>(insertItem);
        }
        else{
            ListNode<T> current = firstNode;
            
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.nextNode = new ListNode<>(insertItem);
        }
    }
    //remove first node from List 
    public T removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {                  //throw exception
            throw new NoSuchElementException(name);
        }
        T removedItem = firstNode.data;       //retrieve data being removed
        
        //update reference firstNode
        firstNode = firstNode.nextNode;
        
        return removedItem;        //return removed node data
    }
    //remove last node from list
    public T removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name);
        }
        T removedItem;         //stores data being removed
        
        //update refernces firstNode and lastNode
        if (firstNode.getNext() == null) {    //list has only one node
            removedItem = firstNode.data;
            firstNode = null;
        }
        else {
            ListNode<T> current = firstNode;
            
           //loop while current node does not refer to lastNode
           while(current.getNext().getNext() != null) {
               current = current.getNext();
           }
           //extract data from last node
           removedItem = current.getNext().getData();
           current.nextNode = null;  //remove last node
        }
        return removedItem; 
        
    }
    //determine whether list is empty
    public boolean isEmpty() {
        return firstNode == null;      //return true if list is empty
    }
    //output list contents
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s\n", name);
            return;
        }
        System.out.printf("The %s is: ", name);
        ListNode<T> current = firstNode;
        
        //while not at end of list, output current node's data
        while (current != null ) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }
        System.out.println();
    }
}

