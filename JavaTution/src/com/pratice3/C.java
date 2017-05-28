package com.pratice3;

public class C extends B {

	
	int age ; String name ;
	
	void cDetails(String name , int age){
		this.name = name ;
		this.age = age;
	}
	
	void show(){
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public String toString(){
		return name;
	}
}
