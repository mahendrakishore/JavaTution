package com.pratice3;

public class SuperConstructorAndMethodAndVariableChild extends SuperConstructorAndMethodAndVariable{
	
	String name;

	SuperConstructorAndMethodAndVariableChild(String name){
		//super(name);
		super("parent");
		this.name = name ;		
	}
	
	void print(){
		super.print();
		System.out.println(super.name);
		System.out.println("child print");
		System.out.println(name);
	}

}
