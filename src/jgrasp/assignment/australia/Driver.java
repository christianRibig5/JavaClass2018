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
public class Driver {
    public static void main(String[]args){
       OnLineAccount driver1= new OnLineAccount("Alex","Dante",3000.00);
       OnLineAccount.setAccountNo(OnLineAccount.accountNo);
       driver1.withraw(4000);
       System.out.println();
       
       OnLineAccount driver2= new OnLineAccount("Grace","Schun",0.00);
       OnLineAccount.setAccountNo(OnLineAccount.accountNo);
       driver2.withraw(4400);
        System.out.println();
        
       OnLineAccount driver3= new OnLineAccount("Paul","Maxwell",2000.00);
       OnLineAccount.setAccountNo(OnLineAccount.accountNo);
       driver3.withraw(2000);
        System.out.println();
        
       SavingsAccount driver4= new SavingsAccount("Christian","Gibs",1000.00);
       SavingsAccount.setAccountNo(OnLineAccount.accountNo);
       driver4.withraw(2000);
        System.out.println();
       
       SavingsAccount driver5= new SavingsAccount("Braham","Tijani",1500.00);
       OnLineAccount.setAccountNo(OnLineAccount.accountNo);
       driver5.withraw(2000);
       
       
       SavingsAccount driver6= new SavingsAccount("Braham","Tijani",1500.00);
        System.out.println(driver5.equals(driver6));
       
       
       
   }
}
