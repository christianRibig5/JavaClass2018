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
public class SavingsAccount extends Account {
    private final int  overdraft=-1000;
    private static final String accountType = "SAVINGS";
    public SavingsAccount(String firstNameIn, String familyNameIn, double balanceIn){
        super(firstNameIn, familyNameIn, balanceIn);
    }

    @Override
    public void withraw(double amount) {
        
       if(((amount)>balance+1000)){
          System.out.println("Dear "+getFirstName()+" you have Insufficient fund in your "+accountType+" account "+Account.getAccountNo());
           System.out.println(getFirstName()+" you can withdraw maximum of "+formatter.format(balance+1000)+"  from your savings account");
       }else{
           balance-=amount;
       }
       
       if((balance<=0) || (balance<overdraft)){
          balance-=30;
          System.out.println(getFirstName()+" your "+accountType+" account is in overdraft and you have incurred a fee of $30");
        } 
       
    }

    @Override
    public void deposit(double amount) {
      if(amount<0)System.out.println("Deposit of "+formatter.format(amount)+" is not allowed");
      else
        balance+=amount;
    }
    @Override
    public void addInterest(double numOfYear){
        balance +=balance*0.05*numOfYear;
    }
    
}
