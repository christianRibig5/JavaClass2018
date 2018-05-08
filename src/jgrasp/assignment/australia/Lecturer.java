/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrasp.assignment.australia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ECRConsultant
 */
public class Lecturer {
    private String firstName;
    private String familyName;
    private String phoneNo;
    private String title;
    public Lecturer(String titleIn, String firstNameIn, String familyNameIn, String phoneNoIn){
            firstName= firstNameIn;
            familyName=familyNameIn;
            phoneNo= phoneNoIn;
            title= titleIn;
            
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNoIn) {
        phoneNo = phoneNoIn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleIn) {
        title = titleIn;
    }
    public String toString(){
        String toScreen;
        toScreen ="\n\n"+title+" \t"+firstName+" \t"+familyName;
        toScreen+="\nPhone \t"+phoneNo;
        return toScreen;
    }

    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 37^hash + Objects.hashCode(this.firstName);
//        hash = 37^ hash + Objects.hashCode(this.familyName);
//        hash = 37^ hash + Objects.hashCode(this.phoneNo);
//        hash = 37^hash + Objects.hashCode(this.title);
//        return hash;
//    }
    
    public boolean equals(Object obj){
        if(obj==null)return false;//default implementation of equals()for false value
        if(this==obj)return true; // default implementation of equals() for true value
        if(obj instanceof Lecturer){ // overriden implementation
            Lecturer that = (Lecturer)obj;
            if((this.title == that.title)&&(this.firstName == that.firstName)&&
                    (this.familyName == that.familyName)&&(this.phoneNo == that.phoneNo)){
                return true;
            }
            
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(firstName);
        hash = 41 * hash + Objects.hashCode(familyName);
        hash = 41 * hash + Objects.hashCode(phoneNo);
        hash = 41 * hash + Objects.hashCode(title);
        return hash;
    }
    public static void main(String[]args){
        Lecturer lecturer1 = new Lecturer("Ms","Grace","Tan","99191234");
        Lecturer lecturer2 = new Lecturer("Mr","Sunam","Pradhan","99191234");
        Lecturer lecturer3 = new Lecturer("Dr","Jacub","Szajman","99194286");
        Lecturer lecturer4 = new Lecturer("Professor","Yuan","Miao","99194605");
        Lecturer lecturer5 = new Lecturer("Curse cordinator","Hao","Shi","99194060");
        Lecturer[]staffList= new Lecturer[]{lecturer1,lecturer2,lecturer3,lecturer4,lecturer5};
        for(int i=0;i<staffList.length;i++){
            System.out.println(staffList[i].toString());
        }
        
        System.out.println("Only phon numbers");
         String[] phoneList = new String[]{lecturer1.getPhoneNo(),lecturer2.getPhoneNo(),lecturer3.getPhoneNo(),
             lecturer4.getPhoneNo(), lecturer5.getPhoneNo()} ;
             for(int i=0;i<phoneList.length;i++){
                 System.out.println(phoneList[i]);
             }
             
        
        System.out.println("A promotion for Grace");
        //lecturer1.setTitle("Professor");
       // System.out.println(staffList[0]);
        
        Lecturer anotherLecturer = new Lecturer("Ms","Grace","Tan","99191234");
        System.out.println(lecturer1.equals(anotherLecturer));
        
        
        
    }
}
