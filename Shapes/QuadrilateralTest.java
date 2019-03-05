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
//main driver class
public class QuadrilateralTest {
    public static void main(String[] args) {
        //Quadrilateral: four-sided polygon
        Quadrilateral quadrilateral = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        
        //Trapezoid: Quadrilateral with exactly two parallel sides
        Trapezoid trapezoid = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        
        //Parallelogram: quadrilateral with opposite sides parallel
        Parallelogram parallelogram = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
        
        //Rectangle: equiangular parallelogram
        Rectangle rectangle = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
        
        //Square: equiangular and equilateral parallelogram
        Square square = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
        
        System.out.printf("%s %s %s %s\n", quadrilateral, trapezoid, parallelogram, rectangle, square);
    }
}
