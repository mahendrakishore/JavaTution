package com.may14;

public class ParameterrizedConstructor {

	int a ; int b;
	
	ParameterrizedConstructor( int a1 , int b1){
		a = a1;
		b = b1;
		System.out.println("In parameterized constructor");
	}
	
	void show(){
		System.out.println(a+" "+b);
	}
	
}
