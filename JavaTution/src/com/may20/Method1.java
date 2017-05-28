package com.may20;

public class Method1 {

	
	void print(){
		System.out.println("pritn method1");
	}
	
	void show(){
		this.print();
		System.out.println("show method1");
		Method2 m = new Method2();
		m.print();
		
	}
}
