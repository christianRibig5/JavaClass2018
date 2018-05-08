/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myscanner.packages;
import secondclass.Pearson;
/**
 *
 * @author ECRConsultant
 */
public class Student extends Pearson{
   private String regNo;
   private String department;
   public Student(){
       super();
   }
   public Student(String nam, String phon, String add, String reg, String dep){
       this.name=nam;
       this.phoneNumber=phon;
       this.address=add;
       this.department=dep;
       this.regNo=reg;
   }
   public void setReg(String reg){
       this.regNo=reg;
   }
   public String getReg(){
       return regNo;
   }
   public void setDep(String dep){
       this.department=dep;
   }
   public String getDep(){
       return department;
   }
   
}
