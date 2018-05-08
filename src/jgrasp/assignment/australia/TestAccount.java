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
public class TestAccount {
    public static void main(String[]args){
        int driver1Count =0;
        int driver2Count =0;
        int driver3Count =0;
        
       Account driver1= new OnLineAccount("Alex","Dante",3000.00);
       Account driver2= new OnLineAccount("Grace","Schun",0.00);
       Account driver3= new OnLineAccount("Paul","Maxwell",2000.00);
       Account driver4= new SavingsAccount("Grace","Schun",0.00);
       Account driver5= new SavingsAccount("Paul","Maxwell",2000.00);
       Account[] account = new Account[]{driver1,driver2,driver3,driver4,driver5};
       for(int i=0; i<account.length;i++){
           
           if(account[0].equals(account[i])){
               driver1Count++; 
           }
            else if(account[1].equals(account[i])){
               driver2Count++; 
           }
           else if(account[2].equals(account[i])){
               driver3Count++; 
           }
         
       }
       System.out.println(driver1Count+" acount owned by "+driver1.getFirstName());
       System.out.println(driver2Count+" acount owned by "+driver2.getFirstName());
       System.out.println(driver3Count+" acount owned by "+driver3.getFirstName());
        
       
    }
    
}
