/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisrtclass;

/**
 *
 * @author ECRConsultant
 */
public class Person{
	protected String name;
	protected String phoneNumber; 
	protected String address;
        
	public String getName(){
		return name;
	}
	public void setName( String nameOfPerson){
		name=nameOfPerson;
	}
	public String getPhone(){
		return phoneNumber;
	}
	public void setPhone( String phone){
		phoneNumber=phone;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress( String addr){
		address=addr;
	}
        
}
