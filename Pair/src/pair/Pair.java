/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

/**
 *
 * @author shalm
 * @param <F>
 * @param <S>
 */
public final class Pair <F, S> {
    private F first;
    private S second;
    
    // constructor
    public Pair(F firstElement, S secondElement) { 
        setFirst(firstElement);
        setSecond(secondElement);    
    }
    
    // get first
    public F getFirst() { 
        return first;
    }
    
    // get second
    public S getSecond() { 
        return second;
    }
    
    // set first
    public void setFirst(F firstElement) { 
        first = firstElement;
    }
    
    // set second
    public void setSecond(S secondElement) { 
        second = secondElement;
    }
    
}
