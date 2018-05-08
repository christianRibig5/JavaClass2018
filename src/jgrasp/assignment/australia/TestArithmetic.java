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
public class TestArithmetic {
       public static void main ( String [] args) {
         Arithmetic maths = new Arithmetic() ;
         Arithmetic maths2 = new Arithmetic() ;
         Arithmetic maths3 = new Arithmetic() ;
         System.out.println (maths);
         
         
         try{
         maths.add (2147483647, 1);  
         maths2.add (-2147483648, -1);
         maths3.divide(7, 0);
         System.out.println (maths); 
         System.out.println (maths2); 
         System.out.println (maths3);
       }catch(OverFlowException ex){
             System.out.println("Number too big, out of range for integer");
         }catch(UnderFlowException ex){
             System.out.println("Number too small, out of range for integer exception");
         }catch(Exception es){
             System.out.println("You are dividing by zero, invalid division");
          }finally{
             System.out.println("Thank you for testing");
         }
     }
}
