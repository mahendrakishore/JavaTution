package com.may20;

public class Student {
int age, id;
	String name ;
	Student(int id , int age){
		this.id = id;
		this.age = age;
	}
	
	Student(int id, int age, String name){
		//this.id = id;
		//this.age = age;
		this(id,age);
		this.name =name;
	}
	
	void show(){
		System.out.println(id+" "+age+" "+name);
	}
	
}
