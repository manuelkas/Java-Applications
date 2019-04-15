/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomintstream;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.time.Duration;
import java.time.Instant;



/**
 *
 * @author shalm
 */
public class RandomIntStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        
         Instant start = Instant.now();//Start instant
         
        //roll a die 60,000 times and summarize the results
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        random.ints(60_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((face, frequency) ->
                    System.out.printf("%-6d%d%n", face, frequency));
        
         Instant end = Instant.now();//End instant
      
       //calculating duration
       long timeElapsed = Duration.between(start, end).toMillis();
      
       System.out.println("Time Taken: "+timeElapsed+" milliseconds");
    }
    
}
