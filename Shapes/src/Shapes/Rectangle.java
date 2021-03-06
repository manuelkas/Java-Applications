/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author shalm
 */
public class Rectangle extends Parallelogram{
    //constructor
    public Rectangle(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    //Conver rectangle object to a string representation
    @Override
    public String toString() { 
        return String.format("\n%s: \n%s%s: %s\n%s: %s\n%s: %s\n", "Coordinates of Rectangle area", getCoordinatesAsString(), 
                "Width is", getWidth(), "Height is", getHeight(), "Area is", getArea());
    } 
   
}
