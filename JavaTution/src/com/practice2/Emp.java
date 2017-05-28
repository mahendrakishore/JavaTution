package com.practice2;

public class Emp {
	
	static int count; String name ; int age;
	Emp(){
		count++ ;
	}
	Emp(String name , int age){
		this.name = name;
		this.age = age;
		count++;
	}
	
	void getData(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	void show(){
		System.out.println(count);
	}
	
}
