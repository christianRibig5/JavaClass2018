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
public class OnLineAccount extends Account {
    private final double minimumBalance = 500;
    private final String accountType="ONLINE";
    public OnLineAccount(String firstNameIn, String familyNameIn, double balanceIn){
        super(firstNameIn, familyNameIn, balanceIn);
        
    }

    @Override
    public void withraw(double amount) {
        if(balance<=0.00)System.out.println(getFirstName()+"! you have Insufficient fund your account "+Account.getAccountNo());
        else{
            balance-=amount;
        }
        if(balance<minimumBalance){
            balance-=25;
            System.out.println(getFirstName()+" $25 fee has been debited from your "+accountType+" account "+OnLineAccount.getAccountNo()+","
                    + " your minimum balance is below "+formatter.format(minimumBalance));
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
