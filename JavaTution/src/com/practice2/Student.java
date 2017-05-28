package com.practice2;

public class Student extends People {
	
	int age ; String name ; long mobno ; 
	
	Student(int age , String name  ){
		super("people");
		this.age = age ;
		this.name = name ;
	}
	
	Student(int age , String name , long mobno){//constructor overloading and constructor chainning
		
		this(age, name);
		//super("people"); // cannot call 2 constructor at same time super or this any one should be first inheritance and overrloading canot be done at same timme
		this.mobno = mobno;
	}

	void getData(int age , String name ,long mobno  ){
		this.age = age ;
		this.name = name ;
		this.mobno = mobno;
	}
	
	void showData(){
		System.out.println(age+name+mobno);
	}
	
}
