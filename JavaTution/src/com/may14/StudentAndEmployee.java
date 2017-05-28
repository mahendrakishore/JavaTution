package com.may14;

public class StudentAndEmployee {
	
	String name ; int age;
	
	void getNameAndAge(String localname , int localage){
		
		name = localname;
		age = localage;
	}
	
	StudentAndEmployee NameAndAge(){
		
		return new StudentAndEmployee() ;
	} 

}
