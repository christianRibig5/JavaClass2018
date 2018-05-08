/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscanner.packages;

import secondclass.Control;

/**
 *
 * @author ECRConsultant
 */
public class TV implements Control{
    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void changeChannel(int number){
        System.out.println("channel "+number+" pressed");
    }
    public void increaseVolume(){
        
    }
    public void decreaseVolume(){
        
    }
}
