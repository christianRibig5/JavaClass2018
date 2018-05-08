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
public class Arithmetic {
   private int answer ; 
   public Arithmetic () {
      answer = 0 ;
   }
   public void add (int a, int b){
       if(a==Integer.MAX_VALUE || b==Integer.MAX_VALUE)throw new OverFlowException();
       if(a==Integer.MIN_VALUE || b==Integer.MIN_VALUE)throw new UnderFlowException();
       answer = a + b ;
       
     
   }
   public void divide(int a, int b)throws Exception{
       try{
       if(b==0)throw new DivideByZeroException();
        answer= a/b;
       }catch(ArithmeticException ex){
          System.out.println("Exception");
       }
   }
   public String toString (){ 
    String toScreen ;
     toScreen = "answer: " + answer ;
     return toScreen;
   }
}
