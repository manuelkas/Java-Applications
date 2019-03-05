/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

//point class represents the points in each shape
/**
 *
 * @author ss3063
 */
public class Point {
    private final double x; 
    private final double y;
    
    //constructor
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;        
    }
    
    //accessor functions
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    //convert representation of Point object to string
    //Override because redeclaring a method
    @Override
    public String toString() {
        return String.format(" (%.1f, %.1f)", getX(), getY());
    }
}