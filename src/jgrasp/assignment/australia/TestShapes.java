/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrasp.assignment.australia;


public class TestShapes {
    public static void main(String[]args){
        GeometricObject object1= new Circle("pink",true,4.5);
        GeometricObject object2 = new Circle("blue",false,3.1);
        GeometricObject object3= new Rectangle("cyan",true,2.0,3.4);
        GeometricObject object4= new Circle("green",true,3.6);
        GeometricObject object5= new Rectangle("orange",false,5.0,1.4);
        GeometricObject[]object= new GeometricObject[]{object1,object2,object3,object4,object5};
        System.out.println("Details for each object is");
        for(int i = 0;i<object.length;i++){
            System.out.println(object[i]);
        }
        System.out.println();
        System.out.println("Perimeter for each object is");
        for(int i = 0;i<object.length;i++){
           System.out.println("Object "+(i+1)+" is "+object[i].findPerimeter());
        }
        System.out.println();
        System.out.println("Area for each object is");
        for(int i = 0;i<object.length;i++){
           System.out.println("Object "+(i+1)+" is "+object[i].findArea());
        }
        
    }
}
