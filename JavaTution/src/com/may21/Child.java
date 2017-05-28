package com.may21;

public class Child extends Parent {

	String fname ;
	int age ;
	
void getChildDetails(String fname , int age ){
	
	this.fname = fname ;
	this.age = age;
}
	
	void showChild(){
		System.out.println("Firstname "+" Middlename "+" Lastanme "+" Age");
		System.out.println("================================================");
		System.out.println(fname+"  "+mname+"  "+lname+"  "+age);
		System.out.println(super.fname+"   "+mname+"  "+lname+"  "+super.age);
		
	}
	
//	void showParent(){
//		System.out.println(super.fname+" "+super.mname+" "+super.lname+" "+super.age);
//	}

}
