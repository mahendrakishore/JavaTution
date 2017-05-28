package com.pratice3;

public class Emp extends Person {
	
	String dept ;
	String name ;
	
	void empDetails(String dept, String name){
		this.dept = dept;
		this.name = name;
	}
	
	void show(){
		System.out.println("child name in case of same variable");
		System.out.println(age+"\t"+name+"\t"+dept);
		System.out.println("parent name using super");
		System.out.println(age+"\t"+super.name+"\t"+dept);
	}
	

}
