/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author asus
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    //------------------------------------
    // Constructor: Sets up the rectangle.
    //------------------------------------
    
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }
    
    //--------------------------------------------
    // Returns the surface area of the rectangle.
    //--------------------------------------------
    
    public double area() {
        return length * width;
    }
    
    //------------------------------------
    // Returns the rectangle as a String.
    //------------------------------------
    
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
} 
