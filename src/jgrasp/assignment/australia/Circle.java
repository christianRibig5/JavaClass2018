/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrasp.assignment.australia;

/**
 *
 * @author ECRConsultant
 */
public class Circle extends GeometricObject{
    private double radius;
    final double pi= (double)22/7;
    public Circle(String colorIn, boolean filledInIn, double radiusIn) {
        super(colorIn, filledInIn);
        radius = radiusIn;
    }
public double getRadius() {
        return radius;
    }

    public void setRadius(double radiusIn) {
        radius = radiusIn;
    }
    @Override
    public double findArea() {
      double area = (pi* radius*radius);
        return area;  
        
    }

    @Override
    public double findPerimeter() {
        double perimeter= (2*pi*radius);
        return perimeter;
    }
    public String toString(){
        String toScreen ="\n"+color+"\t"+filledIn+"\t"+radius;
        
        return toScreen;
    }
    
}
