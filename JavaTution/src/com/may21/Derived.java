package com.may21;

public class Derived extends Base{
	
	
	Derived(){
		System.out.println("in derived class");
	}
	
	void display(){
		super.display();
		System.out.println("derived");
	}
}
