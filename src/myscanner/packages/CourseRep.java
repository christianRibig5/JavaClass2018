/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscanner.packages;

import java.util.Scanner;

/**
 *
 * @author ECRConsultant
 */
public class CourseRep {
    public static void main(String[]MOUAU){
        Student student= new Student();
        System.out.printf("%s\n%s\n%s\n","Course Rep enter the class",
                "He asks for submission of each persons data","He issues the paper to the each student");
        Scanner papper = new Scanner(System.in);
        for(int i=1;i<=2;i++){
            System.out.println("Student :"+i+" ");
            System.out.print("Name :");
            String name =papper.nextLine();
            System.out.println();
            System.out.print("Phone :");
            String phone= papper.nextLine();
            System.out.println();
            System.out.print("Address :");
            String address =papper.nextLine();
            System.out.println();
            System.out.print("Reg number :");
            String regNo= papper.nextLine();
            System.out.println();
            System.out.print("Department :");
            String department =papper.nextLine();
            System.out.println();
            student.setName(name);
            student.setPhone(phone);
            student.setAddress(address);
            student.setReg(regNo);
            student.setDep(department);
           
           System.out.println(i+"  "+student.getName()+"  "+student.getPhone()+"  "+student.getAddress()+"  "+
                    student.getReg()+"  "+student.getDep());
        }
        System.out.println();
        
        
    }
}
