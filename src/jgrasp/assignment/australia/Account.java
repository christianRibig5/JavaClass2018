/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrasp.assignment.australia;

import java.text.NumberFormat;
import java.util.Currency;

/**
 *
 * @author ECRConsultant
 */
public abstract class Account {
    protected String firstName;
    protected String familyName;
    protected static int accountNo = 12345;
    protected double balance;
    protected NumberFormat formatter= NumberFormat.getCurrencyInstance(java.util.Locale.US);
    protected Currency usd = Currency.getInstance("USD");
    
    
    
    

    public Account(String firstNameIn, String familyNameIn, double initialBalance) {
        firstName = firstNameIn;
        familyName = familyNameIn;
        if(initialBalance<0.0)
        balance = 0.00;
        else balance=initialBalance;
    }

    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstNameIn) {
        firstName = firstNameIn;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyNameIn) {
        familyName = familyNameIn;
    }

    public static int getAccountNo() {
        return accountNo;
    }

    public static void setAccountNo(int accountNoIn) {
        accountNo = accountNoIn +1;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double initialBalance) {
        if(initialBalance<0.00)
        balance = 0.00;
        else balance=initialBalance;
    }
   

    
    public String toString(){
        // formatter.setCurrency(usd);
        String toScreen ="\n\nAccount owner:\t"+firstName+" \t"+familyName;
        toScreen+="\naccountNo: \t"+accountNo+"\t Acount Balance:\t"+formatter.format(balance);
        return toScreen;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null)return false;
        if(this==obj)return true;
        if(obj instanceof Account){
           Account that = (Account)obj;
           if((this.firstName==that.firstName)&&(this.familyName==that.familyName)){
               return true;
           }
        }
        return false;
    }

   public abstract void withraw(double amount);
   public abstract void deposit(double amount);
   public abstract void addInterest(double numOfYear);
   
   
}
