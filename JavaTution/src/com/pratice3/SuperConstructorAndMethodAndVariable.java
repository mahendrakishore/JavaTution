package com.pratice3;

public class SuperConstructorAndMethodAndVariable {
	String name ; 
	
	SuperConstructorAndMethodAndVariable(String name){
		this.name = name;
	}

	void print(){
		System.out.println("parent print");
		System.out.println(name);
	}
	
	
}
