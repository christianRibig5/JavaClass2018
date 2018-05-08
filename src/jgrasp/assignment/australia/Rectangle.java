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
public class Rectangle extends GeometricObject{
    private double width;
    private double length;
    public Rectangle(String colorIn, boolean filledInIn, double widthIn, double lengthIn) {
        super(colorIn, filledInIn);
        width=widthIn;
        length= lengthIn;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double widthIn) {
        width = widthIn;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lengthIn) {
        length = lengthIn;
    }

    @Override
    public double findArea() {
        double area =(length*width);
        return area;
    }

    @Override
    public double findPerimeter() {
       double perimeter =2*(length +width);
       return perimeter; 
    }
    public String toString(){
        String toScreen ="\n\n"+color+"\t"+filledIn+"\t"+width+"\t"+length;
        
        return toScreen;
    }
    
}
