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
public abstract class GeometricObject {
    protected String color;
    protected boolean filledIn;
    public GeometricObject(String colorIn, boolean filledInIn) {
        color = colorIn;
        filledIn = filledInIn;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String colorIn) {
        color = colorIn;
    }

    public boolean isFilledIn() {
        return filledIn;
    }

    public void setFilledIn(boolean filledIn) {
        this.filledIn = filledIn;
    }
    public abstract double findArea();
    public abstract double findPerimeter();
    

    
}
