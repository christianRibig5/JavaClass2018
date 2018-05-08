/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondclass;
import fisrtclass.Person;

/**
 *
 * @author ECRConsultant
 */
public class Pearson extends Person{

    public Pearson() {
        super();
    }
    public Pearson(String nam, String phone, String add ){
        
        this.name=nam;
        this.phoneNumber=phone;
        this.address=add;
    }  
}
