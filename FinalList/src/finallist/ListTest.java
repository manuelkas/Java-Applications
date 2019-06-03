/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallist;

/**
 *
 * @author shalm
 */
// Program allows insertion and deletion anywhere in a linked list.
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListTest {
   
    public static void main(String[] args) {
      FinalList<Integer> list = new FinalList<>();
      Random random = new Random();

      // create list
      for (int i = 0; i <10; ++i) {
         list.insertAtBack(random.nextInt(100));
      }

      // print list before insertion
      list.print();

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the index to insert a new element: ");
      int index = scanner.nextInt();
      System.out.print("Enter the value you want added: ");
      int value = scanner.nextInt();

      // insert value to list at index specified by the user
      if (list.insertAtLocation(value, index)) {
         list.print(); // display modified list if successful
      }
      else {
         System.out.print("Invalid index, no data added.\n\n");
      }

      System.out.print("Enter the index to remove an element: ");
      index = scanner.nextInt();

      // delete node at specified location
      if (list.removeFromLocation(index)) {
         list.print(); // display modified list if successful
      }
      else {
         System.out.print("Invalid index, no data removed.\n\n");
      }
   }
}

