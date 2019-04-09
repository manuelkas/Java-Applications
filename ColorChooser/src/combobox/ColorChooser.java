/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.util.HashMap;
import java.util.Set;
import javafx.scene.paint.Color;

/**
 *
 * @author shalm
 */
class ColorChooser {
    
    private HashMap<String, Color> hashMap = new HashMap<> ();
    
    public ColorChooser() {
        // Add the 13 colors to the hashMap
        hashMap.put("black", Color.BLACK);
        hashMap.put("blue", Color.BLUE);
        hashMap.put("cyan", Color.CYAN);
        hashMap.put("darkGray", Color.DARKGRAY);
        hashMap.put("gray", Color.GRAY);
        hashMap.put("green", Color.GREEN);
        hashMap.put("lightGray", Color.LIGHTGRAY);
        hashMap.put("magenta", Color.MAGENTA);
        hashMap.put("orange", Color.ORANGE);
        hashMap.put("pink", Color.PINK);
        hashMap.put("red", Color.RED);
        hashMap.put("white", Color.WHITE);
        hashMap.put("yellow", Color.YELLOW);
        
    }
    
    // return the selected color
    public Color getColor(String name) {
        return hashMap.get(name);
    }
    
    // return all the color names
    public Set<String> getKeySet() {
        return hashMap.keySet();
    }
}

