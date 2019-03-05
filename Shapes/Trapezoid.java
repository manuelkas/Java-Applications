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
public class Trapezoid extends Quadrilateral {
    private double height; //height of trapezoid
    
    //public constructor
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
            super(x1, y1, x2, y2, x3, y3, x4, y4);           
    }
    
    
    public double getHeight() {
        if (getPoint1().getY() == getPoint2().getY())
        {
            return Math.abs(getPoint2().getY() - getPoint3().getY());
        }
        else {
            return Math.abs(getPoint1().getY() - getPoint2().getY());
        }
    }
    
    //return area
    public double getArea() {
        return getSumOfTwoSides() * getHeight()/2.0; 
    }
    
    //return the sum of the trapezoid's two sides
    public double getSumOfTwoSides() {
        if (getPoint1().getY() == getPoint2().getY()) {
            return Math.abs(getPoint2().getY() - getPoint3().getY());
        }
        else {
            return Math.abs(getPoint1().getY() - getPoint2().getY());
        }        
    }
    
    //convert Trapezoid object into a string representation
    @Override
    public String toString() {
        return String.format("\n%s: \n%s%s: %s\n%s: %s\n", "Coordinates of Trapezoid are", getCoordinatesAsString(),
                "Height is", getHeight(), "Area is", getArea());
    }
}