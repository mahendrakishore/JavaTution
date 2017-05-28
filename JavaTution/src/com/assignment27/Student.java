package com.assignment27;

public class Student {
	
	int id , age ; 
	String name;
	
	void getData(int id , int age ,	String name){
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	void show(){
		System.out.println("id name and age is ="+id+" "+name+" "+age);
	}

}
