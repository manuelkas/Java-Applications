/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

/**
 *
 * @author shalm
 */
public class PairTest {
    public static void main(String[] args) { 
        // create pair of integers and string
        Pair<Integer, String> numberPair = new Pair<Integer, String> (1, "one");
        
        // display original numberPair
        System.out.printf("Original pair: <%d, %s>\n", numberPair.getFirst(),
                numberPair.getSecond());
        
        // modify pair
        numberPair.setFirst(2);
        numberPair.setSecond("Second");
        
        // display modified numberPair
        System.out.printf("Modified pair: <%d, %s>\n", numberPair.getFirst(),
                numberPair.getSecond());
    }
}
