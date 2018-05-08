/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrasp.assignment.australia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ECRConsultant
 */
public class User {
    public static void main(String[]args){
        Person user= new Person();
        Person user2= new Person();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter age : ");
        int age= input.nextInt();
        user.setAge(age);
        if(user.getAge()<12){
            System.out.println("You are very young");
        }else if(user.getAge()>12 && user.getAge()<20){
            System.out.println("You are a teenager");
        }else if(user.getAge()>20){
            System.out.println("WOW "+user.getAge()+" is old!");
        }else{
            System.out.println("Out of range");
        }
        
        System.out.println("Test with Exception Handling");
        System.out.print("Please enter age : ");
        try{
         int age2= input.nextInt();
        user.setAge(age2);
        if(user2.getAge()<12){
            System.out.println("You are very young");
        }else if(user2.getAge()>12 && user.getAge()<20){
            System.out.println("You are a teenager");
        }else if(user2.getAge()>20){
            System.out.println("WOW "+user2.getAge()+" is old!");
        }else{
            System.out.println("Out of range");
        } 
        }catch(InputMismatchException ex){
           System.out.println("Error in input, please enter a number");
        }
        
    }
}
