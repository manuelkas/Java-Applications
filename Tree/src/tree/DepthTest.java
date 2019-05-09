/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import java.util.Random;
/**
 *
 * @author shalm
 */
public class DepthTest {
    
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        Random randomNo = new Random();
        System.out.println("Values: ");
        
        //create tree of random numbers
        for (int i = 0; i< 30; i++) {
            int number = randomNo.nextInt(100);
            System.out.print(number + " ");
            tree.insertNode(number);
        }
        System.out.println("\n\n*********************************************************************");
        
        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal();
        
        System.out.println("\n\n*********************************************************************");
        
        System.out.println("\n\nInvoice traversal");
        tree.inorderTraversal();
        
        System.out.println("\n\n*********************************************************************");
        
        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal();
       
        System.out.printf("\n\nTree has depth of: %d\n", tree.getDepth());
    }
}


