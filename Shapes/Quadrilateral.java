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
//Superclass
public class Quadrilateral {
     private Point p1; //first endpoint
    private Point p2;
    private Point p3;
    private Point p4; 
    
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) 
    {
     p1 = new Point(x1, y1);
     p2 = new Point(x2, y2);
     p3 = new Point(x3, y3);
     p4 = new Point(x4, y4);
    }
    
    //accessor functions:
    //return Point 1
    public Point getPoint1() {
        return p1;
    }
    
    //return point 2
    public Point getPoint2() {
        return p2;
    }
    
    public Point getPoint3() {
        return p3;
    }
    
    public Point getPoint4() {
        return p4;
    }
    
    //Convert Quadrilateral object into a string representation
    @Override
    public String toString() {
        return String.format("%s:\n%s", "Coordinates of Quadrilateral are", getCoordinatesAsString());
    }
    
    //return String containing coordinates as strings
    public String getCoordinatesAsString() {
        return String.format("%s, %s, %s, %s\n", p1, p2, p3, p4);
    }
}
