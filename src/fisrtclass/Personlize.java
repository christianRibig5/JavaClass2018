/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisrtclass;
import secondclass.Pearson;

/**
 *
 * @author ECRConsultant
 */
public class Personlize {
    public static void main(String[]arg){
        // create objecty of the person
        Person person1 = new Person();
        person1.setName("Bright Kingsley");
        person1.setPhone("08133193153");
        person1.setAddress("Umudike");
        System.out.println("The name is  :"+person1.getName());
        System.out.println("The Address is  :"+person1.getAddress());
        System.out.println("The Phone Number is  :"+person1.getPhone());
        
        Pearson ps1= new Pearson();
        Pearson ps= new Pearson("Chris", "070412937854","Aba");
        System.out.println("The name is  :"+ps.getName());
        System.out.println("The Address is  :"+ps.getAddress());
        System.out.println("The Phone Number is  :"+ps.getPhone());
        
    }
}
